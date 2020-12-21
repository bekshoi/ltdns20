/*********************************************
Nimi: Kokoelmat3
Kuvaus: Esimerkkiohjelma kokoelmista: jono.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sis‰lt‰v‰t tarvittavat valmiit
luokat. */
import java.util.*;

// Toteutettava luokka.
public class Kokoelmat3 {

   // P‰‰ohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {
      
        // Luodaan jono.
		/* Koska Queue on rajapinta tarvitaan m‰‰rittelyss‰ konkreettinen luokka. 
		 * Yleisimmin k‰ytet‰‰n PriorityQueue ja LinkedList luokkia */
        Queue<Character> jono = new LinkedList<Character>();

        // Lis‰t‰‰n jonoon tavaraa.
        jono.offer('J');
        jono.offer('a');
        jono.offer('a');
        jono.offer('v');
        jono.offer('a');
        
        // Tulostetaan jono.
        while(jono.peek() != null)
        {
            char alkio = jono.poll(); // poll-metodi hakee ja poistaa alkion jonosta.
            System.out.print(alkio + " ");
        }
        System.out.println();

        // Lis‰t‰‰n jonoon tavaraa.
        jono.add('a');
        jono.add('a');
        jono.add('v');
        jono.add('a');

         // Tulostetaan jono ja poistetaan samalla jonossa olevia alkioita..
        while(jono.peek() != null)
        {
            char alkio = jono.element(); // element-metodi hakee mutta ei poista alkiota jonosta.
            System.out.print(alkio + " ");
            jono.remove(); // remove-metodi poistaa alkion jonosta.
        }
        System.out.println();
    }
}