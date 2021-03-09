package brainfuck.data;

public class Memory {

    private int dataPointer;
    private int[] memory;

    public Memory(int maxLength){
        memory = new int[maxLength];
        dataPointer = 0;
    }

    public void setDataPointer(int index){
        dataPointer = index;
    }

    public int getDataPointer(){
        return dataPointer;
    }

    public int getByDataPointer(){
        return memory[dataPointer];
    }

    public void setByDataPointer(int data){
        memory[dataPointer] = data;
    }

    public int[] getMemory() {
        return memory;
    }
}
