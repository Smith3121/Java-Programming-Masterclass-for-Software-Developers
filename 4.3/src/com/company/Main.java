package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Írj programot ami beolvas két karakterláncot (vezetéknévnek és keresztnévnek), majd ebből kiír
        //egy szépen formázott nevet. A szépen formázott azt jelenti, hogy a vezetéknév és a keresztnév
        //első betűje nagy betű, a többi mind kicsi.
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a vezetéknevet");
        String vezeteknev = sc.next();
        System.out.println("Adja meg a keresztnevet");
        String keresztnev = sc.next();
        vezeteknev = vezeteknev.substring(0, 1).toUpperCase() + vezeteknev.substring(1).toLowerCase();
        keresztnev = keresztnev.substring(0, 1).toUpperCase() + keresztnev.substring(1).toLowerCase();
        System.out.println(vezeteknev + " " + keresztnev);
    }
}
