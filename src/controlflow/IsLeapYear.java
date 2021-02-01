package controlflow;

public class IsLeapYear {

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) { //Step 1
                if (year % 100 == 0) { //Step 2
                    if (year % 400 == 0) { //Step 3
                        System.out.println("true: The year is a controlflow.LeapYear");
                        return true;
                    }
                    System.out.println("false: The year is a NOT controlflow.LeapYear");
                    return false;
                }
                System.out.println("true: The year is a controlflow.LeapYear");
                return true;
            }
        } else {
            System.out.println("false: year is not within 1 - 9999");
            return false;
        }
        System.out.println("false: The year is NOT a controlflow.LeapYear");
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12)) {
            return -1;
        } else if ((year < 1) || (year > 9999)) {
            return -1;
        } else {
            if ((isLeapYear(year)) && (month == 2)) {
                System.out.println("29 days");
                return 29;
            } else if ((!isLeapYear(year)) && (month == 2)) {
                System.out.println("28 days");
                return 28;
            } else if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
                System.out.println("31 days");
                return 31;
            } else {
                System.out.println("30 days");
                return 30;
            }
        }

    }
}
