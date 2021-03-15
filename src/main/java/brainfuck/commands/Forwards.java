package brainfuck.commands;

import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

public class Forwards implements ICommand {


    @Override
    public void execute(Output output, Memory memory) {
        memory.setDataPointer(memory.getDataPointer()+1);
    }

}
