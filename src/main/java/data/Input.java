package data;

public class Input {

    private final String instructions;
    private static int indexPointer;

    public Input(String instructions) {
        this.instructions = instructions;
        indexPointer = 0;
    }
}
