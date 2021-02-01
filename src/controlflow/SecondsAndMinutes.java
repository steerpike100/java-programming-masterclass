package controlflow;

public class SecondsAndMinutes {

    public static boolean getDurationString(int minutes, int seconds){
        if((minutes <0) || (seconds <0) || (seconds>59)){
            System.out.println("An invalid value has been passed");
            return false;
        }else{
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            seconds = seconds % 60;
            System.out.println(hours + "h " + remainingMinutes + "m " + seconds + "s");
            return true;
        }
    }

    public static void getDurationString(int seconds){
        if(seconds <=0){
            System.out.println("Invalid number of seconds");
        }else{
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;

            getDurationString(minutes, remainingSeconds);
        }
    }
}
