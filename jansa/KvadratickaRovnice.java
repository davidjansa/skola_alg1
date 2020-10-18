
package jansa;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class KvadratickaRovnice {

    private static final Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Reseni kvadraticke rovnice");
    System.out.println("Zadej koeficienty a, b, c");
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();
        
    if (a==0) {
        // neni kva rovnice
        if (b==0) {
            //neni to rovnice
            //vypis informace uzivateli  
            System.out.println("Nejedna se o rovnici");
        } else {
            //lin rovnice bx + c = 0
            // reseni vypis
            double x = - c / b;
            System.out.println("Linearni rovnice");
            System.out.format("Resenim je x = %.5f %n", x);
        }
    } else {
        // resim kva rovnici
        double d = b * b - 4 * a * c;
        if (d<0) {
            // reseni v oboru komplexnich cisel
            // dva komplexne sdruzene koreny
            // re
            // im
            // vypis dvou korenu 
            double komplexd = Math.abs(d);
            double re = ((-1)*b)/(2*a);
            double im = (Math.sqrt(komplexd)/(2*a));
            System.out.println("Kvadraticka rovnice v oboru komplenich cisel");
            System.out.format("Resenim je %n x1 = %.3f + %.3f * i %n x2 = %.3f - %.3f * i", re,im,re,im );
        
        } else {
            //realne koreny
            // vypocet x1, x2
            // vypis dvou korenu
            double x1 = (( (-1)*b + Math.sqrt(d) )/(2*a));
            double x2 = (( (-1)*b - Math.sqrt(d) )/(2*a));
            System.out.println("Kvadraticka rovnice");
            System.out.format("Resenim je %n x1 = %.3f %n x2 = %.3f ", x1, x2);
                       
        }
    }
    
    }
    
}
