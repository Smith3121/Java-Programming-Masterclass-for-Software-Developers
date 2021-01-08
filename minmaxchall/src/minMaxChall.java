import java.util.Scanner;

public class minMaxChall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int min = 2147483647;
//        int max = -2147483647;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

//        boolean first = true;
        while(true){
            System.out.println("Enter number:");

            boolean isValid = scanner.hasNextInt();
            if(isValid){
                int number = scanner.nextInt();
//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if(min > number){
                    min = number;
                }
                if(max < number){
                    max = number;
                }

            } else {
                System.out.println("The maximum number is " + max + " and the minimum number is " + min);
                break;
            }
        }
    }
}
