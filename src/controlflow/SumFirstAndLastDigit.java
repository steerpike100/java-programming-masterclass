package controlflow;

public class SumFirstAndLastDigit {

    static int sumDigits = 0;
    static int firstDigit = 0;
    static int lastDigit = 0;

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number < 10) {
            sumDigits = number + number;
        } else {
            lastDigit = number % 10;
            firstDigit = number;
            while (firstDigit >= 10) {
                firstDigit = firstDigit / 10;
            }
            sumDigits = firstDigit + lastDigit;
        }
        System.out.println("Sum is: " + sumDigits);
        return sumDigits;
    }
}

