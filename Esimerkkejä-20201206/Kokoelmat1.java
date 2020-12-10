/*********************************************
Nimi: Kokoelmat1
Kuvaus: Esimerkkiohjelma kokoelmista: lista.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sis‰lt‰v‰t tarvittavat valmiit
luokat. */
import java.util.*;

// Toteutettava luokka.
public class Kokoelmat1 {

   // P‰‰ohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {

        // Luodaan lista
		// List -rajapinta toteutetaan ArrayList, LinkedList, Vector tai Stack luokan avulla.
        List<Character> lista = new LinkedList<Character>();

        // Apumuuttuja kokoelman elementtien tulostamista varten.
        char alkio;

        // lis‰t‰‰n elementtej‰ listan loppuun.
        lista.add(0, 'a');
        lista.add('n');
        lista.add('k');
        lista.add(lista.size(), 'e');
        lista.add(lista.size(), 'r');
        lista.add(lista.size(), 'i');
        lista.add(lista.size(), 'a');
        lista.add(lista.size(), 's');
        
        // Tulostetaan lista.
        ListIterator<Character> i = lista.listIterator();
        while(i.hasNext()) {
                alkio = i.next();
                System.out.print(alkio + " ");
        }
        System.out.println();

        // Lis‰t‰‰n elementtej‰ haluttuun kohtaan listassa.
        lista.add(0, 'k');
        lista.add(5, 'a');
        lista.add(6, ' ');
        lista.add(7, 't');
        lista.add(8, 'u');
        lista.add(11, 'l');
        
        // Tulostetaan lista.
        i = lista.listIterator();
        while(i.hasNext()) {
                alkio = i.next();
                System.out.print(alkio + " ");
        }
        System.out.println();

        // Haetaan ja tulostetaan listan koko.
        int koko = lista.size();
        System.out.println(koko);

        // Haetaan ja tulostetaan listan ensimm‰inen alkio.
        alkio = lista.get(0);
        System.out.println(alkio);

        // Haetaan ja tulostetaan listan kahdeksas alkio.
        alkio = lista.get(7);
        System.out.println(alkio);

        // Haetaan ja tulostetaan listan viimeinen alkio
        alkio = lista.get(lista.size()-1);
        System.out.println(alkio);

        // Poistetaan listan ensimm‰inen alkio
        lista.remove(0);
        
        // Haetaan ja tulostetaan listan koko.
        koko = lista.size();
        System.out.println(koko);

        // Haetaan ja tulostetaan listan ensimm‰isen u-kirjaimen indeksi.
        int indeksi = lista.indexOf('u');
        System.out.println(indeksi);

        // Tulostetaan lista.
        i = lista.listIterator();
        while(i.hasNext()) {
                alkio = i.next();
                System.out.print(alkio + " ");
        }
        System.out.println();
        
        // Testataan ja tulostetaan, onko lista tyhj‰.
        boolean tyhja = lista.isEmpty();
        System.out.println(tyhja);

        // Tyhjennet‰‰n lista.
        lista.clear();
        
        // Testataan ja tulostetaan uudelleen, onko lista tyhj‰.
        tyhja = lista.isEmpty();
        System.out.println(tyhja);
    }
}