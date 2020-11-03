/**
 * 
 * Tehtävä 4/2 Tee yrityksen taloushallinnon järjestelmään ohjelma, 
 * joka kysyy käyttäjältä kuinka monta kustannusta (desimaaliluku) 
 * syötetään sekä kysyy em. luvut. Ohjelma laskee syötettyjen kustannusten keskiarvon.
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/25
 * 
 */

import java.util.*;
public class KeskiArvo10 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Syoteta lukumaara : ") ;
        int lkm = input.nextInt();
        int i = 1;
        double summa = 0.0;
        double keskiarvo = 0.0;

        while (i <= lkm) {
            System.out.println("Syoteta kustannus " + i + " : "); 
            double kustannus = input.nextDouble();
            summa = summa + kustannus;
            // System.out.print(summa);
            i++;
        }
        System.out.printf("\nKustannusten summa on %.2f", summa);
        keskiarvo = summa/lkm;
        System.out.printf("\nKustannusten lukumaara on " + lkm + " ja keskiarvo on %.2f", keskiarvo);
        input.close();
     }
 }