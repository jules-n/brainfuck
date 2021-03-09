package data;


public class Output {

        private StringBuilder stringBuilder;

        public Output(){
                stringBuilder = new StringBuilder();
        }

        public void append(int element){
                stringBuilder.append(element);
        }

        public String getOutput(){
                return stringBuilder.toString();
        }

        public String getASCIIOutput(){
                getOutput().chars().forEach(x -> System.out.println((char)x));
                 return null;
        }
}
