public class shareDigit {
    public static boolean hasSharedDigit(int number1, int number2){
        if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99){
            return false;
        }
        int firstNumber1 = number1 / 10;
        int secondNumber1 = number1 % 10;
        int firstNumber2 = number2 / 10;
        int secondNumber2 = number2 % 10;
        if(firstNumber1 == firstNumber2 || firstNumber1 == secondNumber2 || secondNumber1 == firstNumber2 || secondNumber1 == secondNumber2){
            return true;
        } return false;
    }
}
