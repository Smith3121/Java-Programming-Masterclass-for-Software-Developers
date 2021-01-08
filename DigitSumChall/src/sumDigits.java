public class sumDigits {

    private static int sumdigits(int number) {

        if (number < 10) {
            return -1;
        } else {
            int sum = 0;
            while (number > 0) {
                int remainder = number % 10;
                number = number / 10;
                sum += remainder;
            }
            System.out.println("The sum of the numbers is " + sum);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(sumdigits(300));
    }

}
