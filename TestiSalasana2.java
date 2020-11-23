/**
 * Luokka TestiSalasana2
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
 // import Salasana2;

public class TestiSalasana2 {
    public static void main(String[] args) {
        
        Salasana2 p = new Salasana2();

        String q; // julista muuttuja
        Scanner input = new Scanner(System.in); // avoin syöttö
        // Käyttäjä antaa salasanan, kunnes hän täyttää kriteerit, siksi sykli
        do {
        System.out.print("\nSalasanan on taytettava seuraavat ehdot: ");
        System.out.print("\non ainakin 10 merkkia pitka");
        System.out.print("\non ainakin yksi iso kirjain ja yksi pieni kirjan");
        System.out.print("\non ainakin yksi numero");
        System.out.print("\nSyote salasana : ");
        q = input.nextLine();
        p.initialize(q);
        if (Salasana2.passwordOk(q) == true)
        System.out.print("\nSalasana <" + q + "> on " + " - " + Salasana2.passwordOk(q) + " - sopii muoto\n");
        else System.out.print("\nSalasana <" + q + "> on " + " - " + Salasana2.passwordOk(q) + " - kelpaa muoto\n");
        } while (Salasana2.passwordOk(q) != true);   
         input.close(); // sulje syöttö
    }      
}