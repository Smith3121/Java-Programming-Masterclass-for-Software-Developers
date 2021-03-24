package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Írj programot, ami be kér egy számot 1 és 5 között,
        // majd pontosan ennyi keresztnevet kér be és ezeket kiírja fordított sorrendben.
        Scanner sc = new Scanner(System.in);
        String forditott = "";
        System.out.println("Adjon meg egy számot 1 és 5 között");
        int szam = sc.nextInt();
        int[] tomb = new int[szam];
        for (int i = 0; i <= szam-1; i++) {
            System.out.println("Adjon meg egy keresztnevet");
            String keresztnev = sc.next();
            forditott = keresztnev + " " + forditott;
        }
        System.out.println(forditott);

//        switch (szam) {
//            case 1:
//                System.out.println("Adjon meg egy keresztnevet");
//                String elso = sc.nextLine();
//                System.out.println(elso);
//                break;
//            case 2:
//                System.out.println("Adjon meg egy keresztnevet");
//                elso = sc.nextLine();
//                System.out.println("Adjon meg egy keresztnevet");
//                String masodik = sc.nextLine();
//                System.out.println(masodik + " " + elso);
//                break;
//            case 3:
//                System.out.println("Adjon meg egy keresztnevet");
//                elso = sc.nextLine();
//                System.out.println("Adjon meg egy keresztnevet");
//                masodik = sc.nextLine();
//                System.out.println("Adjon meg egy keresztnevet");
//                String harmadik = sc.nextLine();
//                System.out.println(harmadik + " " + masodik + " " + elso);
//                break;
//            case 4:
//                System.out.println("Adjon meg egy keresztnevet");
//                elso = sc.nextLine();
//                System.out.println("Adjon meg egy keresztnevet");
//                masodik = sc.nextLine();
//                System.out.println("Adjon meg egy keresztnevet");
//                harmadik = sc.nextLine();
//                System.out.println("Adjon meg egy keresztnevet");
//                String negyedik = sc.nextLine();
//                System.out.println(negyedik + " " + harmadik + " " + masodik + " " + elso);
//                break;
//            case 5:
//                System.out.println("Adjon meg egy keresztnevet");
//                elso = sc.nextLine();
//                System.out.println("Adjon meg egy keresztnevet");
//                masodik = sc.nextLine();
//                System.out.println("Adjon meg egy keresztnevet");
//                harmadik = sc.nextLine();
//                System.out.println("Adjon meg egy keresztnevet");
//                negyedik = sc.nextLine();
//                System.out.println("Adjon meg egy keresztnevet");
//                String otodik = sc.nextLine();
//                System.out.println(otodik + " " + negyedik + " " + harmadik + " " + masodik + " " + elso);
//                break;
//        }
    }
}
