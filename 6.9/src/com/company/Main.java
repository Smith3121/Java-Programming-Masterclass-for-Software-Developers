package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Írj egy programot ami bekér egy szöveget. Ezt a szöveget vesszők mentén feldarabolja,
        // majd kiírja az összes előforduló szót, de csak egyszer.
        // Pl.: „alma, körte, alma, kukorica” bemenetre „alma, körte, kukorica” íródik a képernyőre.
        Scanner sc= new Scanner(System.in);
        System.out.println("Írjon be egy szöveget");
        String szoveg = sc.nextLine();
        String vegsoSzoveg ="";
        String vegsoUtani ="";
        String szovegAtalakitva =szoveg.replaceAll("\\s","");
        for (int i = 0; i < szovegAtalakitva.length()-1; i++) {
            if (szovegAtalakitva.charAt(i) ==','){
               vegsoSzoveg =szovegAtalakitva.substring(0,i)+" ";
               vegsoUtani=vegsoUtani + vegsoSzoveg ;
               szovegAtalakitva = szovegAtalakitva.substring(i+1);
            }
        }
        System.out.println(vegsoUtani);
    }
}
