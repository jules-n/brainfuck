package brainfuck.commands;

import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

import java.util.List;


public class Cycle implements ICommand{

    private List<ICommand> commands;

    public Cycle(List<ICommand> commands){
        this.commands = commands;
    }

    @Override
    public void execute(Output output, Memory memory) throws Exception {



            while (memory.getByDataPointer() != 0){
                for(ICommand c:commands)
                    c.execute(output,memory);
            }
    }
}
