package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Írj egy programot ami véletlenszerűen egyenletesen
        // választ egy hossz értéket 5 és 10 között (5 és 10 is lehet),
        // majd generál egy olyan véletlen karakterláncot, aminek hossza ez a szám.
        // A karakterei pedig kizárólag kis betűk, nagy betűk, vagy számok. Pl: hossz 7, karakterlánc: aFst5Gw.
        Scanner sc = new Scanner(System.in);
        int randomHosszErtek = 5 + (int) (Math.random() * ((10 - 5) + 1));
        String szamNagybetuKisbetu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(randomHosszErtek);
        for (int i = 0; i < randomHosszErtek; i++) {
            int index = (int) (szamNagybetuKisbetu.length() * Math.random());

            sb.append(szamNagybetuKisbetu.charAt(index));

        }
        System.out.println(sb);
    }
}

