package controlflow;

public class DigitSumChallenge {

    static  int sumDigits = 0;

    public static int sumDigits(int number){
        if(number <10){
            return -1;
        }
        while(number > 0) {
            int digit =  number % 10;
            sumDigits+= digit;
            number /=10;
        }
        System.out.println("Sum is: " + sumDigits);
        return sumDigits;
    }
}
