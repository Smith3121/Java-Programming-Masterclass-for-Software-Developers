package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
       int result = 1;
        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2-1 = " + result);

        result += 2;
       System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien!");
            System.out.println("And i am scared of aliens");
        }
        int topscore = 80;
        if (topscore < 100) {
            System.out.println("You got the highhest score!");
        }
        int secondTopscore = 95;
        if ((topscore> secondTopscore) && (topscore < 100)) {
            System.out.println("Greater than second top score and less than 100");

        }
        if ((topscore > 90) || (secondTopscore <= 90)) {
            System.out.println("Either or both of the conditions are true!");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an true");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not suppposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }





	// write your code here
    }
}
