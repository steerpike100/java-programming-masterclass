public class LeapYear {

    public static boolean isLeapYear(int year){
        if(year >=1 && year <=9999) {
           if(year % 4 == 0){ //Step 1
               if(year % 100 == 0) { //Step 2
                   if(year % 400 == 0){ //Step 3
                       System.out.println("true: The year is a LeapYear");
                       return true;
                   }
                   System.out.println("false: The year is a NOT LeapYear");
                   return false;
               }
               System.out.println("true: The year is a LeapYear");
               return true;
            }
        }else{
            System.out.println("false: year is not within 1 - 9999");
            return false;
        }
        System.out.println("false: The year is NOT a LeapYear");
        return false;
    }
}
