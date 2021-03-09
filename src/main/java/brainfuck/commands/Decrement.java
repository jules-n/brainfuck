package brainfuck.commands;

import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

public class Decrement extends Command{


    public Decrement(Input input, Output output, Memory memory) {
        super(input, output, memory);
    }

    @Override
    public void execute() {
        if(memory.getByDataPointer()>0)
        memory.setByDataPointer(memory.getByDataPointer()-1);
    }
}
