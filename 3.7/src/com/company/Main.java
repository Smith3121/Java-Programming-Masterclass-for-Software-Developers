package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kéjen be három számot, ami évszámot, hónap számot és nap számot jelent. Döntse el, hogy a
        //megadott adatok a 20. század valamelyik napját jelentik-e vagy sem.
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg három számot, ami évszámnak, hónapnak és napnak felel meg");
        int evszam = sc.nextInt();
        int honap = sc.nextInt();
        int nap = sc.nextInt();

//        if (honap/12 >= 1){
//            int honapokEvekben = honap / 12;
//            honap = honap % 12;
//            evszam = evszam + honapokEvekben;
//        }
//        if (nap/365 >= 1){
//            int napokEvekben = nap / 365;
//            nap = nap % 365;
//            evszam = evszam + napokEvekben;
//        }

        int mindentNapban = evszam * 365 + honap * 12 + nap + evszam /4;
        int szazadKezdet = 1901*365 + 1 + 1901/4;
        int szazadVege = 2000 * 365 + 31 + 2000 / 4;
        if (mindentNapban >= szazadKezdet && mindentNapban <= szazadVege ){
            System.out.println("A megadott adatok a 20. század valamely napját jelentik");
        } else System.out.println("A megadott adatok nem a 20. század valamely napját jelentik");


    }
}
