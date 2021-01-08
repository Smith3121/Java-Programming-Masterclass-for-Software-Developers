public class numberPalindrome {
    public static boolean isPalindrome(int number) {
        int n = number;
        int reverse = 0;
        while(n != 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            n = n / 10;
        } if (number == reverse) {
            return true;
        } return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(778864));
    }
}