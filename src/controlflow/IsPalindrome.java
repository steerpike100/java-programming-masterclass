package controlflow;

public class IsPalindrome {

    static int originalNumber = 0;
    static int reversedNumber = 0;

    public static boolean isPalindrome(int number) {
        originalNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;  //last digit of original number
            reversedNumber = reversedNumber * 10 + lastDigit; //add last digit to reverse
            number /= 10; //remove last digit of number
        }
            if (originalNumber == reversedNumber) {
                System.out.println("number is a palindrome: original " + originalNumber +  " reversed " + reversedNumber);
                return true;
            } else {
                System.out.println("number is NOT a palindrome: original " + originalNumber + " reversed " + reversedNumber);
                return false;
            }

    }
}
