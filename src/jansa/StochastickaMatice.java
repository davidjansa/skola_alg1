package jansa;

import java.util.Scanner;

/**
 * Program na testovani matice
 * @author David Jansa
 */
public class StochastickaMatice {

    private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test matice");
        float[][] mat;
        int pr;
        int ps;
        System.out.println("Zadej pocet radku a sloupcu, program ukoncite zadanim 0 nebo zapornym");
        while (((pr = sc.nextInt()) > 0) && (ps = sc.nextInt()) > 0) {
            mat = new float[pr][ps];
            System.out.println("Zadej hodnoty matice po radcich");
            for (int r = 0; r < pr; r++) {
                for (int s = 0; s < ps; s++) {
                    // mat[r][s] / prvek matice na r-tem radku v s-tem sloupci
                    mat[r][s] = sc.nextInt();
                }
            }
            // test stochasticke matice
            boolean jeStochasticka = true;
            for (int r = 0; r < mat.length; r++) {
                float vysl = 0;
                for (int s = 0; s < mat[r].length; s++) {
                    vysl += mat[r][s];
                    if (mat[r][s] < 0) {
                        jeStochasticka = false;
                        break;
                    }
                    if (vysl != 1) {
                        jeStochasticka = false;
                        break;
                    }
                }
            }
        System.out.println("Matice je stochasticka: " + jeStochasticka); 
        System.out.println("");
        System.out.println("Zadej pocet radku a sloupcu, program ukoncite zadanim 0 nebo zapornym");
        }
        System.out.println("Ukoncuji program");
    }
}
