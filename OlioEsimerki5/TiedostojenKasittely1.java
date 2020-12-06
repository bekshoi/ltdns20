/*********************************************
Nimi: TiedostojenKasittely1
Kuvaus: Esimerkki 1: tekstitiedostosta lukeminen.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit
luokat. */
import java.util.*;
import java.io.*;

// Toteutettava luokka.
public class TiedostojenKasittely1 {
   
   // Pääohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {
      
      // Esitellään ja alustetaan olio syötteiden lukemista varten.
      Scanner lukija;
		lukija = new Scanner(System.in);
		
		// Esitellään muuttuja tiedostonimen kysymistä varten.
      String tiedostonimi;

      // Yritetään lukea tiedostosta ...
      try {

         // Pyydetään tiedostonimi käyttäjältä.
         System.out.print("Anna tiedostonimi: ");
         tiedostonimi = lukija.nextLine();

         //Luodaan tarvittavat oliot tiedoston lukua varten ja annetaan luettava tiedosto.
         BufferedReader tiedostolukija = new BufferedReader(new FileReader(tiedostonimi));
   
         // Esitellään muuttuja, johon tekstitiedoston
         // sisältämät rivit luetaan yksi kerrallaan.
         String luetturivi;
   
         // Luetaan rivejä tiedostosta niin kauan, kun tekstitiedostossa on rivejä jäljellä.
         while ((luetturivi = tiedostolukija.readLine()) != null) {
            // Tulostetaan tiedostosta luettu rivi.
            System.out.println(luetturivi);
         }

         // Suljetaan lopuksi tiedostolukjan osoittama tiedosto.
         tiedostolukija.close();
      // Mikäli tiedostoa ei löydy, ilmoitetaan asiasta ja lopetetaan ohjelma.
      } catch (FileNotFoundException e) {
         System.out.println("Tiedostoa ei löytynyt. Lopetan ");
         System.exit(1);
      }
      // Otetaan kiinni syöte- ja tulostevirtoihin liittyvät poikkeukset, tulostetaan ilmoitus ja lopetetaan ohjelma.
      catch(IOException e) {
            System.out.println(" Syöte- ja tulostevirtojen käsittely epäonnistui. Lopetan.");
            System.exit(1);
      }
      // Otetaan kiinni kaikki muut poikkeukset, tulostetaan yleispätevä ilmoitus ja lopetetaan ohjelma.
		catch (Exception e) {
			System.out.println(" Jotain meni pieleen. Lopetan.");
			System.exit(1);
		}
   }
}