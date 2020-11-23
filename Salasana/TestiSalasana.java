package Salasana;
/**
 * Luokka Salasana
 * 
 * @author bekshoi
 * @version 1.00 2020/11/15
 * 
 * Suunnittele ja toteuta ohjelma, joka tarkastaa täyttääkö sille annettu salasana seuraavat ehdot:
 * salasana on ainakin 10 merkkiä pitkä
 * salasanassa on ainakin yksi iso kirjain ja yksi pieni kirjan
 * salasanassa on ainakin yksi numero
 * Ohjelma koostuu luokasta Salasana ja luokkaa käyttävästä ja testaavasta pääohjelmasta. 
 * Luokalla Salasana on kenttänä merkkijono sana. Sillä on alustaja, joka saa parametrina merkkijonon 
 * sana olion muodostamista varten. Luokalla on metodi kelpaa, joka tutkii täyttääkö sana salasanalle 
 * yllä asetetut kriteerit. Metodi palauttaa arvon true jos kriteerit täyttyvät, muutoin se palauttaa 
 * arvon false.
 * Pääohjelmassa kerrotaan salasanan kriteerit ja kysytään käyttäjältä toistuvasti uutta salasanaa, 
 * kunnes käyttäjä antaa kelvollisen salasana. Käyttäjän antamasta sanasta muodostetaan luokan Salasana olio, 
 * jonka kelvollisuutta testataan metodilla kelpaa. (YDINASIAA)
 * 
 */

 import java.util.*;
 // import Salasana.Salasana;

public class TestiSalasana {
    public static void main(String[] args) {
        String p; // julista muuttuja
        Scanner input = new Scanner(System.in); // avoin syöttö
        // Käyttäjä antaa salasanan, kunnes hän täyttää kriteerit, siksi sykli
        do {
        System.out.print("\nSalasanan on täytettävä seuraavat ehdot: ");
        System.out.print("\non ainakin 10 merkkiä pitkä");
        System.out.print("\non ainakin yksi iso kirjain ja yksi pieni kirjan");
        System.out.print("\non ainakin yksi numero");
        System.out.print("\nSyöte salasana : ");
        p = input.nextLine();
        if (Salasana.passwordOk(p) == true)
        System.out.print("\nSalasana <" + p + "> on " + " - " + Salasana.passwordOk(p) + " - sopii muodo\n");
        else System.out.print("\nSalasana <" + p + "> on " + " - " + Salasana.passwordOk(p) + " - kelpaa muodo\n");
        } while (Salasana.passwordOk(p) != true);   
        input.close(); // sulje syöttö
    }      
}