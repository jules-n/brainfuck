package brainfuck.commands;

import brainfuck.data.Memory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncrementTest {
    private Memory memory;
    private Increment increment;
    @BeforeEach
    void setUp() {
        memory = new Memory(1);
        increment = new Increment(null,null, memory);
    }

    @Test
    void executeShouldChangeMemoryByIncrementingValue() {
        increment.execute();
        assertEquals(1,increment.getMemory().getByDataPointer(0));
    }
}
