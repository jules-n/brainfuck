package brainfuck.commands;


import brainfuck.data.Memory;
import brainfuck.data.Output;

import java.util.Stack;

public interface ICommand {


     void execute(Output output,Memory memory) throws Exception;
}
