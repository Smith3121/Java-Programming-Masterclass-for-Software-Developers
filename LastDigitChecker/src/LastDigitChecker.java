public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if(firstNumber < 10 || firstNumber > 1000 || secondNumber < 10 || secondNumber > 1000 || thirdNumber < 10 || thirdNumber > 1000){
            return false;
        }
        int one = firstNumber % 10;
        int two = secondNumber % 10;
        int three = thirdNumber % 10;
        if(one == two || two == three || one == three){
            return true;
        } return false;
    }
    public static boolean isValid(int numberNumber){
        if(numberNumber < 10 || numberNumber > 1000){
            return false;
        } else return true;
    }

}
