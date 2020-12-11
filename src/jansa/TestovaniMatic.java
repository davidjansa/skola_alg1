package jansa;

import java.util.Scanner;

/**
 * Program pro testovani symetrie a cisel matic
 * @author David Jansa
 */
public class TestovaniMatic {

    private static final Scanner sc = new Scanner(System.in);
    private static int[][] mat = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean konecProgramu = false;
        while (!konecProgramu) {
            vypisMenu();
            int volba = nactiVolbu();
            switch(volba) {
                case 0 : konecProgramu = true; break;
                case 1 : mat = nacteniMatice(); break;
                case 2 : vypisMatice(mat); break;
                case 3 : testSymetrie(mat); break;
                case 4 : testCisel(mat); break;
                default :
                    System.out.println("Neznama volba");
            }
            System.out.println("");
        }
        System.out.println("Ukoncuji program");
    }
    
    private static void vypisMenu() {
        System.out.println("matice");
        System.out.println("1. nacteni matice");
        System.out.println("2. vypis matice");
        System.out.println("3. test symetrie");
        System.out.println("4. test cisel");
        System.out.println("0. konec");
    }
    
    private static int nactiVolbu() {
        System.out.println("");
        System.out.println("Zvolte volbu");
        int volba = sc.nextInt();
        return volba;
    }
        
    private static int[][] nacteniMatice() {
        System.out.println("Zadej velikost ctvercove matice");
        int v = sc.nextInt();
        int[][] mat = new int [v][v];
        System.out.println("Zadej hodnoty matice po radcich");
        for (int r = 0 ; r < v ; r++) {
            for (int s = 0 ; s < v ; s++) {
                // mat[v][v]
                mat[r][s] = sc.nextInt();
            }
        }
        return mat;
    }

    private static void vypisMatice(int[][] mat) {
        System.out.println("Vypis ulozene matice");
        for (int r = 0 ; r < mat.length ; r++) {
            for (int s = 0 ; s < mat[r].length ; s++) {
                System.out.format("%d ", mat[r][s]);
            }
            System.out.println("");
        }    
    }
    
    private static void testSymetrie(int[][] mat) {
        boolean vysl = true;
        for (int r = 0 ; r < mat.length ; r++) {
            for (int s = 0 ; s < mat[r].length ; s++) {
                if (r != s) {
                    if (mat[r][s] != mat[s][r]) {
                        vysl = false;
                    }
                }
            }
        }
        if (vysl == true)
            System.out.println("Ulozena matice je symetricka");
        else
            System.out.println("Ulozena matice neni symetricka");
    }
    
    private static void testCisel(int[][] mat) {
        int vysl1 = 0;
        int vysl2 = 0;
        for (int r = 0 ; r < mat.length ; r++) {
            for (int s = 0 ; s < mat[r].length ; s++) {
                vysl1 += mat[r][s];
            }
        }
        for (int i = 1 ; i <= ((mat.length) * (mat.length)) ; i++) {
            vysl2 += i;
        }
        if (vysl1 == vysl2)
            System.out.println("Ulozena matice(NxN) obsahuje vsechny hodnoty od 1 do N^2");
        else
            System.out.println("Ulozena matice(NxN) neobsahuje vsechny hodnoty od 1 do N^2");
    }
    
    private static void testSouctu(int[][] mat) {
        
    }
    
}
