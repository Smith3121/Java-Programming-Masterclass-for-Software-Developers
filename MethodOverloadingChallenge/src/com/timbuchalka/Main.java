package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6, -10);
        calcFeetAndInchesToCentimeters(44);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && ((inches >=0) && (inches <=12))) {

            double inchesToCm = inches * 2.54;
            double feetToCm = feet * 30.48;
            double totalCm = inchesToCm + feetToCm;
            System.out.println(feet + " feet " + inches + " inches = " + totalCm + " cm ");
            return totalCm;

        }
        System.out.println("Invalid feet or inches parameters");
        return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if(inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches ");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
