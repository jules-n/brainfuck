import brainfuck.BrainfuckCompiler;

public class Program {

    public static void main(String ...args){
      final String str = "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+++++++++++++++++" +
        "++++++++++++.+++++++..+++.-------------------"+
       "---------------------------------------------" +
       "---------------.+++++++++++++++++++++++++++++"+
       "++++++++++++++++++++++++++.++++++++++++++++++" +
       "++++++.+++.------.--------.------------------" +
       "---------------------------------------------" +
                "----.-----------------------.";
      BrainfuckCompiler brainfuckCompiler = new BrainfuckCompiler(str);
      System.out.println(brainfuckCompiler.compile());
    }
}
