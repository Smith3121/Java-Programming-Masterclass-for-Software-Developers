package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        
        double myValue = 20.00;
        double myOtherValue = 80.00;
        double Sum =(myValue + myOtherValue) * 100.00;
        System.out.println("TotalValue = " + Sum);
        double Remainder = Sum % 40.00;
        System.out.println("The remainder = " + Remainder);
        boolean Boolean = (Remainder == 0) ? true : false;
        System.out.println(Boolean);
        if (!Boolean) {
            System.out.println("Got some remainder");

        }

	// write your code here
    }
}
