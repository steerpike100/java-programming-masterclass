package controlflow;

public class CalculateScore {

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " +score+ " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no score");
        return 0;
    }
}
