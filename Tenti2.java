/**
 * Tehtävä (b) Lue käyttäjältä teksti string -tyyppiseen muuttujaan. Poista tekstistä 
 * kaikki pienet ’a’-kirjaimet ja tulosta merkit yksi kerrallaan for-toistorakenteessa 
 * allekkain viimeisestä merkistä ensimmäiseen. HUOM! string -tyyppistä muuttujaa voi 
 * käsitellä kuten yksiulotteista taulukkoa, jolloin jokaisessa taulukon alkiossa on yksi 
 * merkkijonon kirjaimista. (merkkijonon pituus: mjono.length)
 * 
 * @author  bekshoi
 * @version 1.00 2020/10/25
 */

import java.util.Scanner;

public class Tenti2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Merkijono;
        System.out.print("Syota merkijono: ");
        Merkijono = input.nextLine();
        input.close();
        Merkijono = Merkijono.replaceAll("[a]","");
        String[] words = Merkijono.split("");
        int i= 0;
        for (i=Merkijono.length()-1; i > -1; i--)
            System.out.println(words[i]);
    } 
}