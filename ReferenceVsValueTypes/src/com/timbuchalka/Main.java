package com.timbuchalka;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray after change = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after change= " + Arrays.toString(anotherArray));

        int bb = 3;
        int cc = bb;

        System.out.println(bb);
        System.out.println(cc);

        cc = 4;
        System.out.println(bb);
        System.out.println(cc);

        int[] bbb = new int[3];
        int[] ccc= bbb;

        System.out.println(Arrays.toString(bbb));
        System.out.println(Arrays.toString(ccc));

        ccc[0] = 88;
        ccc[2] = 420;
        ccc[1] = 69;

        System.out.println(Arrays.toString(bbb));
        System.out.println(Arrays.toString(ccc));

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("myIntArray after modify = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after modify = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
