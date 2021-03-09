package brainfuck.commands;

import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

public class Increment extends Command{

    public Increment(Input input, Output output, Memory memory) {
        super(input, output, memory);
    }

    @Override
    public void execute() {
        memory.setByDataPointer(memory.getByDataPointer()+1);
    }
}