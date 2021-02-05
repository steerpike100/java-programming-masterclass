package controlflow;

public class NumbersToWords {


    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if(number == 0) {
            System.out.println("Zero");
        }

        int reverserNumber = reverse(number);

            while(reverserNumber > 0){
                int compareNumber = reverserNumber % 10;
                switch (compareNumber) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
        }

        public static int reverse(int flipIt){

        int reversed = 0;
        int zeroCount;

        for(; flipIt!=0; flipIt/=10){
            int digit = flipIt % 10;
            reversed = reversed * 10 + digit;
        } return reversed;
    }

    public static int getDigitCount(int number) {

        int digitCount = getDigitCount(number);

        if (number < 0) {
            return -1;
        }
        else if (number == 0){
            return 1;
        }
        int count = 0;
        for (; number != 0; number /= 10) {
            count++;
        }
        return count;
    }
}

