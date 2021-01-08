public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }
        int x = 0;
        int y = 0;
        int z = 0;
        for( x = 0; x < number; x++){
            for(y = 0; y < number; y++){
                z = number - x -1;
                if((x == y) || (x == 0) || (y == 0) || (x == number - 1) || (y == number - 1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        }
    }


