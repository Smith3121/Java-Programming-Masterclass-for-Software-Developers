public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int n = 0;
        int k = 0;
        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            n = number % 10;
            number = number / 10;
            if (n % 2 == 0) {
                k = k + n;
            }

        }
        return k;
    }

}
