package commands;

import data.Input;
import data.Memory;
import data.Output;

public class Decrement extends Command {


    public Decrement(Input input, Output output, Memory memory) {
        super(input, output, memory);
    }

    @Override
    public void execute() {
        memory.setByDataPointer(memory.getByDataPointer()-1);
    }
}
