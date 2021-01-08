package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("mySring is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("mySring is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastSring = "10";
        int myInt = 50;
        lastSring = lastSring + myInt;
        System.out.println("LastString is equal to " + lastSring);
        double DoubleNumber = 120.47d;
        lastSring = lastSring + DoubleNumber;
        System.out.println("LastString is equal to " + lastSring);
	// write your code here
    }
}
