package jansa;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.cbrt;
import static java.lang.Math.PI;

public class VypocetGeomTeles {

    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        //vstup
        System.out.println("Zadejte délky stran kvádru v cm [a b c]: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        //vypocet
        //kvadr
        double vkvadr = a*b*c;
        double skvadr = 2*(a*b + b*c + a*c);
        //krychle
        double avkrychle = cbrt(vkvadr);
        double askrychle = sqrt(skvadr/6);
        //koule
        double rvkoule = cbrt((3*vkvadr)/(4*PI));
        double rskoule = sqrt(skvadr/(4*PI));
        //pravidelny ctyrsten
        double avsten = cbrt((12*vkvadr)/sqrt(2));
        double assten = sqrt(skvadr/sqrt(3));
        
        //vystup
        System.out.println("Objem kvádru: " + vkvadr);
        System.out.println("Plocha pláště kvádru: " + skvadr);
        System.out.println("Strana krychle: " + avkrychle);
        System.out.println("Strana krychle: " + askrychle);
        System.out.println("Poloměr koule: " + rvkoule);
        System.out.println("Poloměr koule: " + rskoule);
        System.out.println("Strana pravidelného čtyřstěnu: " + avsten);
        System.out.println("Strana pravidelného čtyřstěnu: " + assten);
    }
    
}
