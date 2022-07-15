public class Calculator {

    public int Add(String numbers){
        if(numbers.isEmpty()) return 0;
        int ans = 0;
        String delimiter = "[\n,]";

        if(numbers.length()>1 && numbers.charAt(0)=='/' && numbers.charAt(1)=='/'){
            int pos = numbers.indexOf("\n");

            delimiter = numbers.substring(2,pos);
            numbers = numbers.substring(pos+1);

            // System.out.println(delimiter+" : " +numbers);
        }
        String[] arrayOfNumbers = numbers.split(delimiter);

        String negativeNumbers = "";

        for (String number : arrayOfNumbers){
            // System.out.println(number);
            if(!number.isEmpty()){
                int currentNumber = Integer.parseInt(number);
                if(currentNumber<0){
                    negativeNumbers += number + ", ";
                }
                ans += currentNumber;
            }

        }

        if(negativeNumbers.length()>0){
            throw new IllegalArgumentException("negatives not allowed : "+ negativeNumbers);
        }
        return ans;
    }
}
