package commands;


import data.Input;
import data.Memory;
import data.Output;
import lombok.Data;

@Data
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
}
