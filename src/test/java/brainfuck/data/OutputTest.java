package brainfuck.data;

import brainfuck.BrainfuckCompiler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutputTest {
    private Output output;
    @BeforeEach
    void setUp() {
        output = new Output();
    }

    @Test
    void getASCIIOutputShouldReturnASCIISymbolByNumber() {
        output.append(72);
        assertEquals("H", output.getASCIIOutput());
    }
}
