package controlflow;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            System.out.println("Invalid parameter");
            return false;
        }
        bigCount *= 5;
        if (bigCount + smallCount >= goal) {
            if (smallCount >= goal % 5) {
                System.out.println("TRUE");
                return true;
            }
        }
        System.out.println("FALSE");
        return false;
    }
}
