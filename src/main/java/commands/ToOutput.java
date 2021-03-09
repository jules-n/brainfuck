package commands;

import data.Input;
import data.Memory;
import data.Output;

public class ToOutput extends Command {


    public ToOutput(Input input, Output output, Memory memory) {
        super(input, output, memory);
    }

    @Override
    public void execute() {
        output.append(memory.getByDataPointer());
    }
}
