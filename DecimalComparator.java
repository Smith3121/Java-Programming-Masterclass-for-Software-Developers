public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        firstNumber =firstNumber * 1000;
        secondNumber =secondNumber * 1000;
        if ((int)firstNumber ==(int) secondNumber){
            return true;
        } return false;
    }
}
