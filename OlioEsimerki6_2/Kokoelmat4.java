/*********************************************
Nimi: Kokoelmat4
Kuvaus: Esimerkkiohjelma kokoelmista: joukko.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit
luokat. */
import java.util.*;

// Toteutettava luokka.
public class Kokoelmat4 {

   // Pääohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {
      
        // Luodaan joukko
		// Set on rajapinta, joka toteutetaan HashSet, LinkedHashSet or TreeSet -luokan avulla
        Set<Character> joukko = new HashSet<Character>();
        
        // Lisätään alkioita joukkooon.
        joukko.add('a');
        joukko.add('b');
        joukko.add('c');
        joukko.add('d');
        
        // Tulostetaan joukon alkiot.
        Iterator<Character> i = joukko.iterator();
        while(i.hasNext()) {
            char alkio = i.next();
            System.out.print(alkio + " ");
        }
        System.out.println();

        // Haetaan ja tulostetaan joukon koko.
        int koko = joukko.size();
        System.out.println(koko);

        // Poistetaan alkio joukosta.
        joukko.remove('c');

        // Tulostetaan joukon alkiot.
        i = joukko.iterator();
        while(i.hasNext()) {
            char alkio = i.next();
            System.out.print(alkio + " ");
        }
        System.out.println();

        // Haetaan ja tulostetaan joukon koko.
        koko = joukko.size();
        System.out.println(koko);
        
        // Joukon jo sisältämän alkion lisäämisellä ei ole vaikutusta.
        joukko.add('a');
        
        // Haetaan ja tulostetaan joukon koko.
        koko = joukko.size();
        System.out.println(koko);

        // Tulostetaan joukon alkiot.
        i = joukko.iterator();
        while(i.hasNext()) {
            char alkio = i.next();
            System.out.print(alkio + " ");
        }
        System.out.println();

        // Selvitetään sisältyykö haluttu elementti jo joukkoon.
        boolean joukossa = joukko.contains('a');
        System.out.println(joukossa);
        
        // Selvitetään sisältyykö haluttu elementti jo joukkoon.
        joukossa = joukko.contains('c');
        System.out.println(joukossa);

        // Selvitetään, onko joukko tyhjä.
        boolean tyhja = joukko.isEmpty();
        System.out.println(tyhja);
        
        // Tulostetaan joukon alkiot.
        i = joukko.iterator();
        while(i.hasNext()) {
            char alkio = i.next();
            System.out.print(alkio + " ");
        }
        System.out.println();
        
        // Tyhjennetään joukko.
        joukko.clear();
        
        // Tulostetaan joukon alkiot.
        i = joukko.iterator();
        while(i.hasNext()) {
            char alkio = i.next();
            System.out.print(alkio + " ");
        }
        System.out.println();
        
        // Haetaan joukon koko.
        koko = joukko.size();
        System.out.println(koko);
    }
}