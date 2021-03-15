package brainfuck;

import brainfuck.commands.*;
import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BrainfuckCompiler {

    private Input input;
    private Output output;
    private Memory memory;
    private final HashMap<Character,ICommand> commands;

    private class Analyzer implements ICommand{
        private Input input;
        public Analyzer(Input input){
            this.input = input;
        }

        @Override
        public void execute(Output output, Memory memory) throws Exception {
            List<ICommand> list = new ArrayList<>();

            int nesting = 1;
            while (nesting>0) {
                char current = input.next();
                if (current == '[') nesting++;
                else if (current == ']') nesting--;
                if(current != ']')
                list.add(commands.get(current));
            }
            new Cycle(list).execute(output,memory);
        }
    }

    public BrainfuckCompiler(String instructions){
        input = new Input(instructions);
        output = new Output();
        memory = new Memory(instructions.length());
        commands = new HashMap()
        {{
            put('>', new Forwards());
            put('<', new Backwards());
            put('+', new Increment());
            put('-', new Decrement());
            put('.', new ToOutput());
            put('[', new Analyzer(input));
        }};
    }

    public String compile()  {
        while (input.hasNext()) {
            try {
                commands.get(input.next()).execute(output, memory);
            } catch (Exception e) {
                System.err.println("No such command");
            }
        }
        return output.getASCIIOutput();
    }

}
