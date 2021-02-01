package controlflow;

public class IsEvenNumber {

    static int number = 4;
    static int finishNumber = 20;
    static int countEvenNumbers = 0;

    public static void isNumberEven(){
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            countEvenNumbers++;
            if(countEvenNumbers == 5){
                System.out.println("Count of all Even numbers " + countEvenNumbers);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
