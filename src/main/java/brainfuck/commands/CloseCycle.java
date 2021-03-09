package brainfuck.commands;

import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

public class CloseCycle extends Command{
    public CloseCycle(Input input, Output output, Memory memory) {
        super(input, output, memory);
    }

    @Override
    public void execute() {
        if(memory.getByDataPointer()!=0){
            input.setIndexPointer(pointersOnInstructions.peek());
        }
        else {
            pointersOnInstructions.pop();
        }

    }
}
