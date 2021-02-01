package controlflow;

public class SwitchChallenge {

    char charValue = 'A';
    String month = "JAnuary";

    public static void switchOnChar(char charValue) {
        switch (charValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println(charValue + " was NOT found");

        }
    }

    public static void switchOnMonth(String month) {
        switch (month.toLowerCase()) {
            case "january":
            case "february":
            case "march":
                System.out.println(month + " was found");
                break;
            default:
                System.out.println(month + " was NOT found");

        }
    }

}
