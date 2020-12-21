/*********************************************
Nimi: Kokoelmat4
Kuvaus: Esimerkkiohjelma kokoelmista: joukko.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sis‰lt‰v‰t tarvittavat valmiit
luokat. */
import java.util.*;

// Toteutettava luokka.
public class Kokoelmat4 {

   // P‰‰ohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {
      
        // Luodaan joukko
		// Set on rajapinta, joka toteutetaan HashSet, LinkedHashSet or TreeSet -luokan avulla
        Set<Character> joukko = new HashSet<Character>();
        
        // Lis‰t‰‰n alkioita joukkooon.
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
        
        // Joukon jo sis‰lt‰m‰n alkion lis‰‰misell‰ ei ole vaikutusta.
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

        // Selvitet‰‰n sis‰ltyykˆ haluttu elementti jo joukkoon.
        boolean joukossa = joukko.contains('a');
        System.out.println(joukossa);
        
        // Selvitet‰‰n sis‰ltyykˆ haluttu elementti jo joukkoon.
        joukossa = joukko.contains('c');
        System.out.println(joukossa);

        // Selvitet‰‰n, onko joukko tyhj‰.
        boolean tyhja = joukko.isEmpty();
        System.out.println(tyhja);
        
        // Tulostetaan joukon alkiot.
        i = joukko.iterator();
        while(i.hasNext()) {
            char alkio = i.next();
            System.out.print(alkio + " ");
        }
        System.out.println();
        
        // Tyhjennet‰‰n joukko.
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