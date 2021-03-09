package brainfuck.commands;


import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

public abstract class Command {

    protected Input input;
    protected Output output;
    protected Memory memory;

    public Command(Input input, Output output,Memory memory){
        this.input = input;
        this.memory = memory;
        this.output = output;
    }

    public abstract void execute();

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
