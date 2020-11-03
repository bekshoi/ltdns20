/**
 * Tehtävä 5/1 Kirjoita parametriton funktio Vastaus, jota käytetään apuna 
 * esim. asiakastietoja poistettaessa. Funktio pyytää käyttäjältä 
 * yhden merkin (esim. K/E) ja palauttaa sen kutsujalleen.
 * 
 * Versio 1.0 Funktio pyytää käyttäjältä merkin, tarkistaa syotetty merkki muodon mukaan  
 * ja palauttaa sen kutsujalleen.
 * 
 * @author  bekshoi
 * @version 1.00 2020/10/11
 */

 import java.util.*;
    public class KysymysVastaus {
    public static void main(String[] arg) {
        System.out.println("Käyttäjältä syöta " + Vastaus());} // kutsuu funktio samana aikana tulosta sen
        
        // Funktio pyytää käyttäjältä merkin, tarkistaa syotetty merkki muodon mukaan  
        // ja palauttaa sen kutsujalleen.
        
        public static char Vastaus() { 
            Scanner input = new Scanner(System.in);
            System.out.println ("Anna merki : K/E "); // Kysyy merki 
            char Merki = input.next().charAt(0);
            // tarkistaa symbolin, jos se on oikein - palauta, jos se ei ole oikea - pyydä korjaamaan
            while (Merki != 'K' && Merki != 'E'){
                if (Merki != 'K' && Merki != 'E')
                {System.out.println("Syötettu merkki ei ole oikeassa muodossa -" + Merki);
                System.out.println ("Anna merki : K/E ");
                Merki = input.next().charAt(0);}
                else {return Merki;}
            continue;}
            return Merki; 
        }
    }