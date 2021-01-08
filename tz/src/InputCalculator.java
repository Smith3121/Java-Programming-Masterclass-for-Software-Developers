import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avrg = 0;

        while (true){
            boolean isInt = sc.hasNextInt();
            if (isInt){
                sum += sc.nextInt();
                count++;
                sc.nextLine();
            }else {
                sc.nextLine();
                break;
            }
        }

        if(count > 0) {
            avrg = Math.round((double) sum/count);
        }
        System.out.println("SUM = " + sum + " AVG = " + avrg);
    }
}
