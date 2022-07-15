public class Calculator {

    public int Add(String numbers){
        if(numbers.isEmpty()) return 0;
        int ans = 0;
        String delimiter = "[\n,]";

        if(numbers.length()>1 && numbers.charAt(0)=='/' && numbers.charAt(1)=='/'){
            int pos = numbers.indexOf("\n");

            delimiter = numbers.substring(2,pos);
            numbers = numbers.substring(pos+1);

        }
        String[] arrayOfNumbers = numbers.split(delimiter);

        for (String number : arrayOfNumbers){

            if(!number.isEmpty())
                ans += Integer.parseInt(number);
        }

        return ans;
    }
}
