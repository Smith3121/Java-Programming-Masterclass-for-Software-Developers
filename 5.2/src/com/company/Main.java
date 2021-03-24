package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Írj egy programot, ami beolvas 3 keresztnevet (feltételezhető, hogy amit beír a felhasználó, az keresztnév),
        // majd ezeket ábécé sorrendben kiírja. Ne használj beépített rendező függvényt.
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg három keresztnevet");
        System.out.println("Első");
        String elso = sc.nextLine();
        System.out.println("Második");
        String masodik = sc.nextLine();
        System.out.println("Harmadik");
        String harmadik = sc.nextLine();
        String[] keresztnevek = {elso, masodik, harmadik};
        Arrays.sort(keresztnevek);
        for (int i = 0; i < keresztnevek.length; i++) {
            System.out.println(keresztnevek[i]);
        }
    }
}
