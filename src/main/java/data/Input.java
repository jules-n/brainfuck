package data;

import lombok.Data;

@Data
public class Input {

    private static String instructions;
    private static int indexPointer;

    public Input(String instructions) {
        this.instructions = instructions;
        indexPointer = 0;
    }

    public boolean hasNext(){
        return indexPointer+1<instructions.length()?true:false;
    }

    public char next(){
        return instructions.charAt(indexPointer++);
    }

    public String getInstructions() {
        return instructions;
    }

    public int getIndexPointer() {
        return indexPointer;
    }

    public void setIndexPointer(int indexPointer) {
        Input.indexPointer = indexPointer;
    }
}
