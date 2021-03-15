import brainfuck.BrainfuckCompiler;

import java.util.Scanner;

public class Program {

    public static void main(String ...args) throws Exception {
        System.out.print("Instructions: ");
        Scanner scanner = new Scanner(System.in);
        BrainfuckCompiler brainfuckCompiler = new BrainfuckCompiler(scanner.next());
        System.out.println(brainfuckCompiler.compile());
    }
}
