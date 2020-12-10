/*********************************************
Nimi: Kokoelmat2
Kuvaus: Esimerkkiohjelma kokoelmista: vektori.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sis‰lt‰v‰t tarvittavat valmiit
luokat. */
import java.util.*;

// Toteutettava luokka.
public class Kokoelmat2 {

   // P‰‰ohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {

        //Luodaan vektori
        Vector<Character> vektori = new Vector<Character>();
        
        // Apumuuttuja kokoelman elementtien tulostamista varten.
        char alkio;
        
        // lis‰t‰‰n elementtej‰ vektorin loppuun.
        vektori.add('a');
        vektori.add('n');
        vektori.add('k');
        vektori.add('e');
        vektori.add('r');
        vektori.add('i');
        vektori.add('a');
        vektori.add('s');
        
        // Tulostetaan vektori.
        Iterator<Character> i = vektori.iterator();
        while(i.hasNext()) {
                alkio = i.next();
                System.out.print(alkio + " ");
        }
        System.out.println();

        // Haetaan ja tulostetaan vektorin kapasiteetti.
        int kapasiteetti = vektori.capacity();

        // Varmistetaan vektorille riitt‰v‰ kapasiteetti.
        vektori.ensureCapacity(14);
        
        // Lis‰t‰‰n elementtej‰ haluttuun kohtaan vektorissa.
        vektori.add(0, 'k');
        vektori.add(5, 'a');
        vektori.add(6, ' ');
        vektori.add(7, 't');
        vektori.add(8, 'u');
        vektori.add(11, 'l');
        
        // Tulostetaan vektori.
        i = vektori.iterator();
        while(i.hasNext()) {
                alkio = i.next();
                System.out.print(alkio + " ");
        }
        System.out.println();
        
        // Haetaan ja tulostetaan vektorin ensimm‰inen alkio.
        alkio = vektori.get(0);
        System.out.println(alkio);

        // Haetaan ja tulostetaan vektorin kahdeksas alkio.
        alkio = vektori.get(7);
        System.out.println(alkio);

        // Haetaan ja tulostetaan vektorin viimeinen alkio
        alkio = vektori.get(vektori.size()-1);
        System.out.println(alkio);

        // Poistetaan vektorin ensimm‰inen alkio
        vektori.remove(0);

        // Haetaan ja tulostetaan vektorin koko.
        int koko = vektori.size();
        System.out.println(koko);

        // Haetaan ja tulostetaan vektorin ensimm‰isen l-kirjaimen indeksi.
        int indeksi = vektori.indexOf('l');
        System.out.println(indeksi);

        // Tulostetaan vektori.
        i = vektori.iterator();
        while(i.hasNext()) {
                alkio = i.next();
                System.out.print(alkio + " ");
        }
        System.out.println();
        
        // Testataan ja tulostetaan, onko vektori tyhj‰.
        boolean tyhja = vektori.isEmpty();
        System.out.println(tyhja);

        // Tyhjennet‰‰n vektori.
        vektori.clear();

        // Testataan ja tulostetaan uudelleen, onko lista tyhj‰.
        tyhja = vektori.isEmpty();
        System.out.println(tyhja);
    }
}