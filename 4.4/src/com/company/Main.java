package com.company;

public class Main {

    public static void main(String[] args) {
        // Vizsgáld meg, hogy mi történik, ha a 20-at és a 30-at minden lehetséges típuskombinációban
        // összeadod (mindkettőt értelmezhetjük számként (int 20, double 20) vagy karakterláncként (“20”)).
        // Mely kombinációkat nem engedi a Java végrehajtani, mert nem tudja értelmezni?
        // Amit enged, azoknak mi az eredménye?
        int a = 20;
        int b = 30;
        double aa = 20;
        double bb = 30;
        String aaa = "20";
        String bbb = "30";
        System.out.println(a+b);
        System.out.println(a+bb);
        System.out.println(a+bbb);
        System.out.println(aa+bb);
        System.out.println(aa+bbb);
        System.out.println(aaa+bbb);
    }
}
