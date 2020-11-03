/**
 * Tehtävä 5/4 4. Kirjoita taloushallinnon ohjelmistoon funktio, joka laskee tuloja: .
 * 1*3*5*7*...*pariton_luku ja
 * 2*4*6*...*parillinen_luku.
 * Funktion parametrina annetaan tulon viimeinen (suurin) tekijä, joka siis on joko 
 * parillinen tai pariton kokonaisluku. Funktion paluuarvo on lukusarjan tulo. 
 * (Mieti tarkoin, mikä on tulon lasketaan sopiva toistorakenne? (toiston askellus!))
 * Kirjoita myös koodin osa, josta kutsut laatimiasi funktioita ja testaat niiden toimintaa.
 * 
 * Versio 1.0 Rekursio
 * Versio 2.0 Rekursio + Toistorakenne
 * 
 * @author  bekshoi
 * @version 2.00 2020/10/11
 * 
 */

import java.util.*;

public class KertomaLuku {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("Anna luku : ");
        int luku = input.nextInt();
        System.out.println("Kertoma on " + Kertoma(luku) + " käytö rekursio");
        System.out.println("Kertoma on " + Kertoma1(luku) + " käytö toistorakenne");
        input.close();
        }
 
        public static int Kertoma(int a){ //rekursio
               int result;
                    if (a == 1)
                        return 1;
                    else if (a == 2)
                        return 2;
                    result = Kertoma(a - 2) * a;
                    return result;}

        public static int Kertoma1(int a){ //toistorakente
            if (a == 1)
            return 1;
            else if (a == 2)
            return 2;

            int i = a; int a1 = a-2; int a2=0;
            do {
            a2 = a1 * a;
            a = a2;
            a1 = a1 - 2;  
            i=i-2;
        }
            while (i != 1 && i != 2);
            return a;
        } 
}