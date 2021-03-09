package commands;

import data.Input;
import data.Memory;
import data.Output;

public class Forwards extends Command {


    public Forwards(Input input, Output output, Memory memory) {
        super(input, output, memory);
    }

    @Override
    public void execute() {
        memory.setDataPointer(memory.getDataPointer()+1);
    }

}
