package commands;

public class Increment implements ICommand{

    private static int dataPointer;

    @Override
    public void execute() {
        dataPointer++;
    }

    public static int getDataPointer() {
        return dataPointer;
    }

    public static void setDataPointer(int dataPointer) {
        Increment.dataPointer = dataPointer;
    }
}
