public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if(number < 1){
            return false;
        }
        int n = 0;
      for(int i = 1; i < number; i++){
          if(number % i == 0){
              n = n + i;
          }
      } if (number == n){
          return true;
        }
      return false;
    }
}
