/*********************************************
Nimi: TiedostojenKasittely1
Kuvaus: Esimerkki 1: tekstitiedostosta lukeminen.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sis�lt�v�t tarvittavat valmiit
luokat. */
import java.util.*;
import java.io.*;

// Toteutettava luokka.
public class TiedostojenKasittely1 {
   
   // P��ohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {
      
      // Esitell��n ja alustetaan olio sy�tteiden lukemista varten.
      Scanner lukija;
		lukija = new Scanner(System.in);
		
		// Esitell��n muuttuja tiedostonimen kysymist� varten.
      String tiedostonimi;

      // Yritet��n lukea tiedostosta ...
      try {

         // Pyydet��n tiedostonimi k�ytt�j�lt�.
         System.out.print("Anna tiedostonimi: ");
         tiedostonimi = lukija.nextLine();

         //Luodaan tarvittavat oliot tiedoston lukua varten ja annetaan luettava tiedosto.
         BufferedReader tiedostolukija = new BufferedReader(new FileReader(tiedostonimi));
   
         // Esitell��n muuttuja, johon tekstitiedoston
         // sis�lt�m�t rivit luetaan yksi kerrallaan.
         String luetturivi;
   
         // Luetaan rivej� tiedostosta niin kauan, kun tekstitiedostossa on rivej� j�ljell�.
         while ((luetturivi = tiedostolukija.readLine()) != null) {
            // Tulostetaan tiedostosta luettu rivi.
            System.out.println(luetturivi);
         }

         // Suljetaan lopuksi tiedostolukjan osoittama tiedosto.
         tiedostolukija.close();
      // Mik�li tiedostoa ei l�ydy, ilmoitetaan asiasta ja lopetetaan ohjelma.
      } catch (FileNotFoundException e) {
         System.out.println("Tiedostoa ei l�ytynyt. Lopetan ");
         System.exit(1);
      }
      // Otetaan kiinni sy�te- ja tulostevirtoihin liittyv�t poikkeukset, tulostetaan ilmoitus ja lopetetaan ohjelma.
      catch(IOException e) {
            System.out.println(" Sy�te- ja tulostevirtojen k�sittely ep�onnistui. Lopetan.");
            System.exit(1);
      }
      // Otetaan kiinni kaikki muut poikkeukset, tulostetaan yleisp�tev� ilmoitus ja lopetetaan ohjelma.
		catch (Exception e) {
			System.out.println(" Jotain meni pieleen. Lopetan.");
			System.exit(1);
		}
   }
}