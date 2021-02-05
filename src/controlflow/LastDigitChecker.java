package controlflow;

import java.sql.SQLOutput;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int digitOne, int digitTwo, int digitThree) {
        int lastNumber1;
        int lastNumber2;
        int lastNumber3;
        if ((digitOne < 10 || digitOne > 999) || (digitTwo < 10 || digitTwo > 999) || (digitThree < 10 || digitThree > 999)) {
            System.out.println("Please Enter The Valid Input Ranging 10-99 ");
            return false;
        }
        lastNumber1 = digitOne % 10;
        lastNumber2 = digitTwo % 10;
        lastNumber3 = digitThree % 10;
        if ((lastNumber1 == lastNumber2) && (lastNumber1 == lastNumber3)) {
            System.out.println("True " + lastNumber1 + " and " + lastNumber2 + "and " + lastNumber3 + " are all equal");
            return true;
        } else if ((lastNumber1 == lastNumber2)) {
            System.out.println("True " + lastNumber1 + " and " + lastNumber2 + " are equal");
            return true;
        } else if ((lastNumber1 == lastNumber3)) {
            System.out.println("True " + lastNumber1 + " and " + lastNumber3 + " are equal");
            return true;
        } else if ((lastNumber2 == lastNumber3)) {
            System.out.println("True " + lastNumber2 + " and " + lastNumber3 + " are equal");
            return true;
        }
        System.out.println("No same last digit found");
        return false;
    }

}

