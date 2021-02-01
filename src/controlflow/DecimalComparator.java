package controlflow;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {
        firstDouble = firstDouble * 1000;
        secondDouble = secondDouble * 1000;

        int firstInt = (int) firstDouble;
        int secondInt = (int) secondDouble;

        if (firstInt == secondInt) {
            System.out.println("First number is equal to Second Number to 3 decimal places: " + firstInt + "  " + secondInt);
            return true;
        }
        return false;
    }

}
