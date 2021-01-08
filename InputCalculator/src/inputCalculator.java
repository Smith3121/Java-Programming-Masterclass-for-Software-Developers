import java.util.Scanner;

public class inputCalculator {
    public static void main(String[] args) {

    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 0;

        while(true){

            boolean isValid = scanner.hasNextInt();
            if(isValid){
                int number = scanner.nextInt();
                count++;
                sum += number;
                scanner.nextLine();
            } else {
                scanner.nextLine();
                break;
            }

        }
            avg = sum / count;
            int x =Math.round(avg);
            System.out.println("SUM = " + sum + " AVG = " + x);


    }
}
