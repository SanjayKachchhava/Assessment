public class Calculator {

    public int Add(String numbers){

        int ans = 0;

        String[] arrayOfNumbers = numbers.split(",",0);

        for (String number : arrayOfNumbers){
            if(!number.isEmpty())
                ans += Integer.parseInt(number);
        }
        
        return ans;

    }
}
