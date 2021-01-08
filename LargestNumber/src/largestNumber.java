public class largestNumber {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
 /*       if (number < 8) {
            if (number == 7) {
                return 7;
            }
            if (number == 5) {
                return 5;
            }
            if (number == 3) {
                return 3;
            }
            if (number == 2) {
                return 2;
            }

        }
        boolean flag = false;
        for(int i = 2; i <= number/2; ++i)
        {
            // condition for nonprime number
            if(number % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            return number; */
        int i = 0;
        int division = 0;
        for ( i = 2; i < number; i++) {
            if (number % i == 0) {
                number = number / i;
                i--;
            }
        }

        return i;
    }

            public static void main (String[]args){
                System.out.println(getLargestPrime(21));
                System.out.println(getLargestPrime(217));
                System.out.println(getLargestPrime(0));
                System.out.println(getLargestPrime(45));
                System.out.println(getLargestPrime(-1));
                System.out.println(getLargestPrime(31));
                System.out.println(getLargestPrime(2));
                System.out.println(getLargestPrime(16));


            }
    }



