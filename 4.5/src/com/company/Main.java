package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Írj egy programot ami bekér egy karakterláncot,
        // majd kiírja ezt úgy, hogy az első és utolsó karaktert felcseréli.
        // Figyeljünk, hogy minden hosszúságú karakterláncra jól működjön a program.
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy karaktertláncot");
        String bevittKarakter = sc.next();
        char elsoKarakter = bevittKarakter.charAt(0);
        char utolsoKarakter = bevittKarakter.charAt(bevittKarakter.length()-1);
        String felcserelve =utolsoKarakter + bevittKarakter.substring(1, bevittKarakter.length()-1) + elsoKarakter;
        System.out.println(felcserelve);
    }
}
