package brainfuck.commands;


import brainfuck.data.Input;
import brainfuck.data.Memory;
import brainfuck.data.Output;

import java.util.Stack;

public abstract class Command {

    protected Input input;
    protected Output output;
    protected Memory memory;
    protected static Stack<Integer> pointersOnInstructions;

    public Command(Input input, Output output,Memory memory){
        this.input = input;
        this.memory = memory;
        this.output = output;
        pointersOnInstructions = new Stack<>();
    }

    public abstract void execute() throws Exception;

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
