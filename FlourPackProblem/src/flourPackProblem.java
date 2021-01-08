public class flourPackProblem {
        public static boolean canPack(int bigCount, int smallCount, int Goal){
               int n = bigCount * 5;
            if(n < 0 || smallCount < 0 || Goal < 0){
                return false;
            }
            if((n + smallCount) < Goal) {
                    return false;
            }
            if((n + smallCount) == Goal){
                    return true;
                }
            if((n + smallCount) > Goal){
                    if(n > 0) {
                        if (((Goal % n) == 0 || (n % Goal) == 0) || ((Goal % n) < smallCount) || ((n + smallCount) % Goal ==0)  ) {
                            for(int i = 1; i != bigCount; i++){
                                if((i * 5) + smallCount == Goal){
                                    return true;
                                }
                            }
                            return true;
                        }
                    } else return true;
                }       for(int i = 1; i != bigCount; i++){
                if((i * 5) + smallCount == Goal){
                    return true;
                }
            }
            return false;
            }

        public static void main(String[] args) {
            System.out.println(canPack(1, 0, 4));   // false
            System.out.println(canPack(1, 0, 5));   // true
            System.out.println(canPack(0, 5, 4));   // true
            System.out.println(canPack(2, 2, 11));  // true
            System.out.println(canPack(-3, 2, 12)); // false
            System.out.println(canPack(2, 1, 5));   // true
            System.out.println(canPack(4, 18, 19)); // true
            System.out.println(canPack(6, 2, 17));  // true




        }
    }


