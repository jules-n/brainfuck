package brainfuck.commands;

import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;


public class OpenCycle extends Command{


    public OpenCycle(Input input, Output output, Memory memory) {
        super(input, output, memory);
    }

    @Override
    public void execute() {

        if (memory.getByDataPointer() == 0)
        {
            int nesting = 1;
            while (nesting>0) {
                char current = input.next();
                if (current == '[') nesting++;
                else if (current == ']') nesting--;
            }
        }
        else {
            pointersOnInstructions.push(input.getIndexPointer());
        }
    }
}
