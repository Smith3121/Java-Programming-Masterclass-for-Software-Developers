import java.util.Scanner;

public class ReaInpUseCha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
//      while(counter < 10){
        while(true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
//                if(counter == 10){
//                    break;
//                }
                if(counter == 10){
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
            }
        System.out.println("sum = " + sum);
        scanner.close();
        }



/*        if(hasNextInt) {
            System.out.println("Enter the first number ");
            int firstNumber = scanner.nextInt();
            scanner.nextLine();
        }else {
            System.out.println("Unable to parse number");
        }
        if(hasNextInt) {
            System.out.println("Enter the second number ");
            int secondNumber = scanner.nextInt();
            scanner.nextLine();
        }else {
            System.out.println("Unable to parse number");
        }
        if(hasNextInt) {
            System.out.println("Enter the third number ");
            int thirdNumber = scanner.nextInt();
        }else {
            System.out.println("Unable to parse number");
        }
            if(hasNextInt) {
                System.out.println("Enter the fourth number ");
                int fourthNumber = scanner.nextInt();
                scanner.nextLine();
            }else {
                System.out.println("Unable to parse number");
            }
        if(hasNextInt) {
            System.out.println("Enter the fifth number ");
            int fifthNumber = scanner.nextInt();
            scanner.nextLine();
        }else {
            System.out.println("Unable to parse number");
        }
        if(hasNextInt) {
            System.out.println("Enter the sixth number ");
            int sixthNumber = scanner.nextInt();
            scanner.nextLine();
        }else {
            System.out.println("Unable to parse number");
        }
        if(hasNextInt) {
            System.out.println("Enter the seventh number ");
            int seventhNumber = scanner.nextInt();
            scanner.nextLine();
        }else {
            System.out.println("Unable to parse number");
        }
        if(hasNextInt) {
            System.out.println("Enter the eighth number ");
            int eighthNumber = scanner.nextInt();
            scanner.nextLine();
        }else {
            System.out.println("Unable to parse number");
        }
        if(hasNextInt) {
            System.out.println("Enter the ninth number ");
            int ninthNumber = scanner.nextInt();
            scanner.nextLine();
        }else {
            System.out.println("Unable to parse number");
        }
        if(hasNextInt) {
            System.out.println("Enter the tenth number ");
            int tenthNumber = scanner.nextInt();
        } else {
            System.out.println("Unable to parse number");
        }

    } */
    }

