public class Calculator {

    public int Add(String numbers){

        if(numbers.isEmpty()) return 0;

        int pos = numbers.indexOf(",");

        if(pos==-1){
            return Integer.parseInt(numbers);
        }else{
            return Integer.parseInt(numbers.substring(0,pos)) + Integer.parseInt(numbers.substring(pos+1));
        }

    }
}
