package brainfuck.data;


import java.util.ArrayList;
import java.util.List;

public class Output {

        private List<Integer> list;

        public Output(){
                list = new ArrayList<>();
        }

        public void append(int element){
                list.add(element);
        }

        public String getOutput(){
                return list.toString();
        }

        public String getASCIIOutput(){
                StringBuilder stringBuilder = new StringBuilder();
                list.forEach(x -> stringBuilder.append((char) x.intValue()));
                 return stringBuilder.toString();
        }
}
