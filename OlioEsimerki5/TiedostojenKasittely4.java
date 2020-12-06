/*********************************************
Nimi: TiedostojenKasittely4
Kuvaus: Esimerkki 4: binääritiedostosta lukeminen.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit
luokat. */
import java.util.*;
import java.io.*;

// Toteutettava luokka.
public class TiedostojenKasittely4 {
   
   // Pääohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {
      
      // Esitellään ja alustetaan olio syötteiden lukemista varten.
      Scanner lukija;
		lukija = new Scanner(System.in);

		// Esitellään muuttuja tiedostonimen kysymistä varten.
      String tiedostonimi;

      // Esitellään muuttujat, joihin haluamme lukea dataa tiedostosta.
      int kokonaisluku = 0;
      double liukuluku = 0;

      // Olio tiedostosta lukemista varten.
      ObjectInputStream tiedostolukija = null;

      // Yritetään lukea tiedostosta ...
      try {

         // Pyydetään tiedostonimi käyttäjältä.
         System.out.print("Anna tiedostonimi: ");
         tiedostonimi = lukija.nextLine();
         
         //Luodaan tarvittavat oliot tiedoston lukua varten ja annetaan luettava tiedosto.
         FileInputStream  tiedosto = new FileInputStream (tiedostonimi);
         tiedostolukija = new ObjectInputStream (tiedosto);

         // Niin kauan kun tiedostossa on luettavaa
         while (true) {
            // Otetaan arvoja talteen
            kokonaisluku = tiedostolukija.readInt();
            liukuluku = tiedostolukija.readDouble();
         }
      // Ilmoitetaan käyttäjälle, kun päästään tiedoston loppuun.
      } catch (EOFException eof) {
         System.out.println ("Tiedosto loppui");
         
         try {
            // Suljetaan lopuksi tiedostolukjan osoittama tiedosto.
            tiedostolukija.close();
         }
         // Otetaan kiinni syöte- ja tulostevirtoihin liittyvät poikkeukset, tulostetaan ilmoitus ja lopetetaan ohjelma.
         catch(IOException e) {
            System.out.println("Tiedoston sulkeminen epäonnistui. Lopetan.");
            System.exit(1);
         }
      }
      // Mikäli tiedostoa ei löydy, ilmoitetaan asiasta ja lopetetaan ohjelma.
      catch (FileNotFoundException e) {
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

      // Tulostetaan tiedostosta luetut arvot.
      System.out.println (kokonaisluku);
      System.out.println (liukuluku);

   }
}