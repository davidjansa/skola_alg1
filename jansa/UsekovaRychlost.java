package jansa;

import java.util.Scanner;

public class UsekovaRychlost {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        //vstup
        System.out.print("Zadejte maximální povolenou rychlost v úseku [km/h]: ");
        int max = sc.nextInt();
        System.out.print("Zadejte délku úseku [m]: ");
        int s = sc.nextInt();
        System.out.print("Zadejte čas vjezdu vozidla do úseku (h m s): ");
        int hodi = sc.nextInt();
        int mini = sc.nextInt();
        int seci = sc.nextInt();
        System.out.print("Zadejte čas výjezdu vozidla z úseku (h m s): ");
        int hodo = sc.nextInt();
        int mino = sc.nextInt();
        int seco = sc.nextInt();
        
        //vypocet
        int time = (hodo * 3600 + mino * 60 + seco) - (hodi * 3600 + mini * 60 + seci);
        double v = (double) s / (double) time;
        double vh = (v * 3.6);
        double maxp = vh - max;
        
        //Výstup
        System.out.println("Dosažená průměrná rychlost je: " + vh + " km/h");
        if (vh>max) {
        System.out.println("Maximální povolená rychlost byla překročena o: " + maxp + " km/h");}
        else { 
        System.out.println("Maximální povolená rychlost nebyla překročena.");}
        
        // + cv. 10
        String a = "Blokové řížení: až 1 000 Kč\nSprávní řízení: 1 500 - 2 500Kč\nTrestné body: 0\nZákaz řízení: NE ";
        String b = "Blokové řížení: až 1 000 Kč\nSprávní řízení: 1 500 - 2 500Kč\nTrestné body: 2\nZákaz řízení: NE ";
        String c = "Blokové řížení: až 2 500 Kč\nSprávní řízení: 2 500 - 5 000Kč\nTrestné body: 3\nZákaz řízení: NE ";
        String d = "Blokové řížení: automaticky se přesouvá do správního\nSprávní řízení: 5 000 - 10 000Kč\nTrestné body: 5\nZákaz řízení: ANO, na 6 - 12 měsíců ";
       
        String vystup = maxp >= 40 ? d : maxp >= 20 ? c : maxp >= 6 ? b : maxp >= 1 ? a : "Bez Pokuty";
        
        System.out.print(vystup);
        
    }
    
}
