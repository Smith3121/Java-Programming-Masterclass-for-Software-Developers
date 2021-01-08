public class NumberToWords {
    public static void numberToWords(int number) {
        int reversedNumber = reverse(number);
        int digit = 0;
        int numberOfDigits = 0;
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        do {
            digit = reversedNumber % 10;
            reversedNumber = reversedNumber / 10;
            numberOfDigits++;

            if (digit == 0) {
                System.out.println("Zero");
            }if(digit == 1){
                System.out.println("One");
            }if(digit == 2){
                System.out.println("Two");
            }if(digit == 3){
                System.out.println("Three");
            }if(digit == 4){
                System.out.println("Four");
            }if(digit == 5){
                System.out.println("Five");
            }if(digit == 6){
                System.out.println("Six");
            }if(digit == 7){
                System.out.println("Seven");
            }if(digit == 8){
                System.out.println("Eight");
            }if(digit == 9){
                System.out.println("Nine");
            }
        }while (reversedNumber != 0) ;
        while (numberOfDigits < getDigitCount(number)){
            System.out.println("Zero");
            numberOfDigits++;
        }
    }
    public static int reverse (int number){
        int n = 0;
        int k = 0;
        while(number != 0){
            n = number % 10;
            k = (k * 10) + n;
            number = number / 10;
        }
        return k;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int count = 0;
        do {
            number = number / 10;
            count ++;
        }
        while(number != 0);
        return count;
    }
}
