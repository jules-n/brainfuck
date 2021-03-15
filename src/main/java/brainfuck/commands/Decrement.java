package brainfuck.commands;

import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

public class Decrement implements ICommand{

    @Override
    public void execute(Output output, Memory memory) {
        memory.setByDataPointer(memory.getByDataPointer()-1);
    }
}
