package brainfuck.commands;

import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

public class Backwards implements ICommand{


    @Override
    public void execute(Output output, Memory memory) {
        if(memory.getDataPointer()>0)
        memory.setDataPointer(memory.getDataPointer()-1);
    }
}
