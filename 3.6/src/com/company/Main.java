package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kérjen be egy karaktert és írja ki a nagybetűsített változatát
        // (ne használj beépített függvényeket, hanem a karakterek kódja alapján programozz).
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy karaktert");
        char karakter = sc.nextLine().charAt(0);
        if (karakter >= 97 && karakter <= 122){
            karakter =(char)((int)karakter - 32);
            System.out.println(karakter);
        } else
        if (karakter >= 65 && karakter <= 90) {
            System.out.println(karakter);
        }else
        System.out.println("A bevitt karakter nem kisbetű");
    }
}
