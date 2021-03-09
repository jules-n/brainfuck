package brainfuck;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrainfuckCompilerTest {

    private String withoutBrackets;
    private String withBrackets;
    @BeforeEach
    void setUp() {
        withBrackets = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.";
        withoutBrackets = "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+++++++++++++++++++++++++++++.+++++++..+++.-------------------"+
                "------------------------------------------------------------.+++++++++++++++++++++++++++++"+
                "++++++++++++++++++++++++++.++++++++++++++++++++++++.+++.------.--------.-------------------------------------------------------------------.-----------------------.";
    }

    @Test
    void compileWithBracketsShouldReturnHelloWorld() {
        assertEquals("Hello World!",new BrainfuckCompiler(withBrackets).compile());
    }

    @Test
    void compileWithoutBracketsShouldReturnHelloWorld() {
        assertEquals("Hello World!",new BrainfuckCompiler(withoutBrackets).compile());
    }
}