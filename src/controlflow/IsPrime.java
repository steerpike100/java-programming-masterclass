package controlflow;

public class IsPrime {

    public static void printPrime() {
        int count = 0;
        for (int i = 10; i <50; i++) {
            if(isPrime(i)){
                count++;
                System.out.println("Number" + i + " is a Prime");
                if(count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
