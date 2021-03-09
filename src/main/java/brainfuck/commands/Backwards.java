package brainfuck.commands;

import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

public class Backwards extends Command{


    public Backwards(Input input, Output output, Memory memory) {
        super(input, output, memory);
    }

    @Override
    public void execute() {
        if(memory.getDataPointer()>0)
        memory.setDataPointer(memory.getDataPointer()-1);
    }
}
