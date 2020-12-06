/*********************************************
Nimi: TiedostojenKasittely5
Kuvaus: Esimerkki 5: binääritiedostoon kirjoittaminen.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit
luokat. */
import java.util.*;
import java.io.*;

// Toteutettava luokka.
public class TiedostojenKasittely5 {
   
   // Pääohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {
      
      // Esitellään ja alustetaan olio syötteiden lukemista varten.
      Scanner lukija;
		lukija = new Scanner(System.in);

		// Esitellään muuttuja tiedostonimen kysymistä varten.
      String tiedostonimi;

      // Esitellään muuttujat, jotka haluamme kirjoittaa tiedostoon.
      int kokonaisluku = 5;
      double liukuluku = 2.5;

      // Olio tiedostosta lukemista varten.
      ObjectInputStream tiedostolukija = null;

      // Yritetään lukea tiedostosta ...
      try {

         // Pyydetään tiedostonimi käyttäjältä.
         System.out.print("Anna tiedostonimi: ");
         tiedostonimi = lukija.nextLine();
         
         //Luodaan tarvittavat oliot tiedoston lukua varten ja annetaan luettava tiedosto.
         FileOutputStream tiedosto = new FileOutputStream(tiedostonimi);
         ObjectOutputStream Tiedostoonkirjoittaja = new ObjectOutputStream(tiedosto);

         //Kirjoitetaan data tiedostoon.
         Tiedostoonkirjoittaja.writeInt(kokonaisluku);
         Tiedostoonkirjoittaja.writeDouble(liukuluku);

         // Suljetaan lopuksi tiedostolukjan osoittama tiedosto.
         Tiedostoonkirjoittaja.close();

      // Ilmoitetaan käyttäjälle, kun päästään tiedoston loppuun.
      } catch (EOFException eof) {
         System.out.println ("Tiedosto loppui");
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
   }
}