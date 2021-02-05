package controlflow;

public class EvenDigitSum {

    static int sumEvenDigits = 0;

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                if (digit % 2 == 0) {
                    sumEvenDigits += digit;
                }
            }
        }
        System.out.println("Sum of the even digits is: " + sumEvenDigits);
        return sumEvenDigits;
    }
}
