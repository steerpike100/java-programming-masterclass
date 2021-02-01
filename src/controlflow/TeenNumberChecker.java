package controlflow;

public class TeenNumberChecker {

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        if (ageOne > 12 && ageOne < 20) {
            System.out.println("True, number is  in teen range");
            return true;

        } else if (ageTwo > 12 && ageTwo < 20) {
            System.out.println("True, number is  in teen range");
            return true;

        } else if (ageThree > 12 && ageThree < 20) {
            System.out.println("True, number is  in teen range");
            return true;

        }
        System.out.println("False, number is not in teen range");
        return false;

    }

    public static boolean isTeen(int age) {
        if (age > 12 && age < 20) {
            System.out.println("True, number is  in teen range");
            return true;
        }
        System.out.println("False, number is not in teen range");
        return false;
    }
}
