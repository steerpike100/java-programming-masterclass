package controlflow;

import java.sql.SQLOutput;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){

        if((first <10) || (second <10)){
            System.out.println("Invalid values passed");
            return -1;
        }else{
            int i = 1;
            int divisor = 0;
            while(i<=first){
                if((first % i == 0) && (second % i ==0)) divisor = i;
                i++;
            }
            System.out.println("Divisor is: " + divisor);
            return divisor;
        }
    }


}
