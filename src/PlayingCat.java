public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer) {
            if (temperature > 24 && temperature < 36) {
                System.out.println("The cat is playing");
                return true;
            }
        } else {
            if (temperature > 24 && temperature < 46) {
                System.out.println("The cat is playing");
                return true;
            }
        }
        System.out.println("The cat is NOT playing");
        return false;
    }
}

