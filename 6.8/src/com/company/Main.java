package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Írj egy programot ami bekér egy karakterláncot,
        // majd törli minden páros helyen álló karakterét és kiírja a képernyőre.
        Scanner sc = new Scanner(System.in);
        String vegsoKarakterlanc = "";
        System.out.println("Adjon meg egy karakterláncot");
        String karakterlanc = sc.next();
        for (int i = 0; i <= karakterlanc.length()-1; i=i+2) {
//            if (i % 2 == 0) {
//                vegsoKarakterlanc = karakterlanc.substring(0, i-1) + karakterlanc.substring(i , karakterlanc.length());

//            }
            vegsoKarakterlanc = vegsoKarakterlanc + karakterlanc.charAt(i);

        }
     System.out.println(vegsoKarakterlanc);
    }
}
