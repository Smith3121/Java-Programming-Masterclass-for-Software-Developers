package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Írj egy programot, ami beolvas 3 keresztnevet (feltételezhető, hogy amit beír a felhasználó, az keresztnév),
        // majd ezeket fordított sorrendben kiírja.
        Scanner sc = new Scanner(System.in);
        System.out.println("Első keresztnév");
        String elso = sc.next();
        System.out.println("Második keresztnév");
        String masodik = sc.next();
        System.out.println("Harmadik keresztnév");
        String harmadik = sc.next();
        String[] keresztnevek = {elso, masodik, harmadik};
        System.out.println(harmadik + " " + masodik + " " + elso);
        System.out.println(keresztnevek[2] + " " + keresztnevek[1] + " " + keresztnevek[0]);


    }
}
