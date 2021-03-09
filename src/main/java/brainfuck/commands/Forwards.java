package brainfuck.commands;

import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

public class Forwards extends Command {


    public Forwards(Input input, Output output, Memory memory) {
        super(input, output, memory);
    }

    @Override
    public void execute() {
        memory.setDataPointer(memory.getDataPointer()+1);
    }

}
