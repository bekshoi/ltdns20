/**
 * Tehtävä 4/1
 * 
 * Versio 1.0 
 * Tee mökkivarausjärjestelmään apuohjelma, jolla lasketaan positiivisen kokonaisluvun kertoma. 
 * Esim. luvun 4 kertoma on 4 x 3 x 2 x 1 = 24.
 * 
 * Kaksi tapa
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/25
 */

import java.util.*;

public class KertoLasku {

    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       System.out.println("\nSyoteta luku :");
       System.out.println("*************");
       int z = input.nextInt();
       int x = z;
       int y = x;
       
       // Kertoma (factorial) ja rekursio, plus sisäkkäinen luokka
       Factorial f = new Factorial();
       System.out.println("\n************* - Kertoma (factorial), rekursio ja vielä luokka - menetelmä");
       System.out.println("Kertoma " + x + " on " + f.fact(x));

        // kertoma (factorial) silmukalla (toistorakenteella)
               for (int i = x; i > 1; i--)
               {
                   // System.out.print("\nIn " + x + " " + y + " " + i); Debug
                    y = y * (x-1);
                    x--;
                    // System.out.print("\nOut " + x + " " + y + " " + i); Debug
               }
       
        System.out.println("\n************* - For - toistorakenteella - menetelmä"); 
        System.out.println("Kertoma " + z  + " on " + y + "\n");      
               
        input.close();
    }
}
       // Kertoma (Factorial)
       // sisäkkäinen luokka
       class Factorial {
        // Rekursio
        int fact(int n) {
            int result;
    
            if (n == 1)
                return 1;
            result = fact(n - 1) * n;
            return result;
        }
    }