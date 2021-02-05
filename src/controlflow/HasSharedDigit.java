package controlflow;

public class HasSharedDigit {

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {

        int firstNumber1, lastNumber1, firstNumber2, lastNumber2;

        if ((numberOne < 10 || numberOne > 99) || (numberTwo < 10 || numberTwo > 99)) {
            System.out.println("Please Enter The Valid Input Ranging 10-99 ");
            return false;
        }
        lastNumber1 = numberOne % 10;
        firstNumber1 = numberOne / 10;
        lastNumber2 = numberTwo % 10;
        firstNumber2 = numberTwo / 10;

        if ((lastNumber1 == lastNumber2) || (lastNumber1 == firstNumber2) || (firstNumber1 == firstNumber2) || (firstNumber1 == lastNumber2)) {
            System.out.println("Numbers have a shared digit");
            return true;
        }

        System.out.println("Numbers have NO shared digit");
        return true;
    }
}

