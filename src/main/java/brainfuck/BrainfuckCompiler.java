package brainfuck;

import brainfuck.commands.*;
import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

import java.util.HashMap;
import java.util.Map;

public class BrainfuckCompiler {

    private Input input;
    private Output output;
    private Memory memory;
    private HashMap<Character,Command> commands;

    public BrainfuckCompiler(String instructions){
        input = new Input(instructions);
        output = new Output();
        memory = new Memory(instructions.length());
        commands = new HashMap()
        {{
            put('>', new Forwards(input,output,memory));
            put('<', new Backwards(input,output,memory));
            put('+', new Increment(input,output,memory));
            put('-', new Decrement(input,output,memory));
            put('.', new ToOutput(input,output,memory));
        }};
    }

    public String compile(){
        while (input.hasNext())
            commands.get(input.next()).execute();
        return output.getASCIIOutput();
    }
}
