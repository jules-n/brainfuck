package brainfuck.commands;

import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

public class ToOutput implements ICommand {


    @Override
    public void execute(Output output, Memory memory) {
        output.append(memory.getByDataPointer());
    }
}
