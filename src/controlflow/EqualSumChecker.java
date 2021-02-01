package controlflow;

public class EqualSumChecker {

    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree) {
        int sumFirstTwo = numberOne + numberTwo;
        if (sumFirstTwo == numberThree) {
            System.out.println("True since: " + numberOne + " + " + numberTwo + " is equal to: " + numberThree);
            return true;
        }
        System.out.println("False since: " + numberOne + " + " + numberTwo + " is not equal to: " + numberThree);
        return false;
    }

}
