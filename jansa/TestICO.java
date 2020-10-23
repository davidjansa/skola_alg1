package jansa;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class TestICO {

    private static final Scanner sc = new Scanner(System.in);
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Zadejte ICO");
        
        int ico = sc.nextInt();
        
        // 1
        int x0 = (ico/10000000)*8;
        int x1 = ((ico%10000000)/1000000)*7;
        int x2 = ((ico%1000000)/100000)*6;
        int x3 = ((ico%100000)/10000)*5;
        int x4 = ((ico%10000)/1000)*4;
        int x5 = ((ico%1000)/100)*3;
        int x6 = ((ico%100)/10)*2;
        
        int soucet = x0 + x1 + x2 + x3 + x4 + x5 + x6;
        
        // 2
        int zbytek = soucet % 11;
        
        //3
        int poslednicislice = ico % 10;
        int kontrolnicislice;
        
        if (zbytek == 0) {
            kontrolnicislice = 1;
        } else if (zbytek == 1) {
            kontrolnicislice = 0; 
        } else {
            kontrolnicislice = 11 - zbytek;
        }
        
        if (poslednicislice == kontrolnicislice) {
            System.out.println("Cislo ICO je spravne.");
        } else {
            System.out.println("Cislo ICO je chybne");
        }
        
        
    }
    
}
