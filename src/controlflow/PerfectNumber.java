package controlflow;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            System.out.println(number + " invalid parameter");
            return false;
        } else {
            int sumDivisors = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumDivisors += i;
                }
            }
            if (sumDivisors == number) {
                System.out.println(number + " is a perfect number because sum of divisors is " + sumDivisors + " which is equal to " + number);
                return true;
            }
        }
        System.out.println(number + " is NOT a perfect number");
        return false;
    }

}
