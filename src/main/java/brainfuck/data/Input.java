package brainfuck.data;

public class Input {

    private String instructions;
    private int indexPointer;


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

    public int getIndexPointer() {
        return indexPointer;
    }

    public void setIndexPointer(int indexPointer) {
        this.indexPointer = indexPointer;
    }

    public int getConcreteInstruction(int index){
        return instructions.charAt(index);
    }
}
