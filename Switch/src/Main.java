import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args){
        int value = 1;
        if(value == 1){
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }
        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, or 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }
        char newSwitch = 'K';
        switch (newSwitch){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Value was A, B, C, D or E ");
                break;
            default:
                System.out.println("Value was not A, B, C, D or E");


        }
    }
}
