/*********************************************
Nimi: TiedostojenKasittely5
Kuvaus: Esimerkki 5: bin��ritiedostoon kirjoittaminen.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sis�lt�v�t tarvittavat valmiit
luokat. */
import java.util.*;
import java.io.*;

// Toteutettava luokka.
public class TiedostojenKasittely5 {
   
   // P��ohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {
      
      // Esitell��n ja alustetaan olio sy�tteiden lukemista varten.
      Scanner lukija;
		lukija = new Scanner(System.in);

		// Esitell��n muuttuja tiedostonimen kysymist� varten.
      String tiedostonimi;

      // Esitell��n muuttujat, jotka haluamme kirjoittaa tiedostoon.
      int kokonaisluku = 5;
      double liukuluku = 2.5;

      // Olio tiedostosta lukemista varten.
      ObjectInputStream tiedostolukija = null;

      // Yritet��n lukea tiedostosta ...
      try {

         // Pyydet��n tiedostonimi k�ytt�j�lt�.
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

      // Ilmoitetaan k�ytt�j�lle, kun p��st��n tiedoston loppuun.
      } catch (EOFException eof) {
         System.out.println ("Tiedosto loppui");
      }
      // Mik�li tiedostoa ei l�ydy, ilmoitetaan asiasta ja lopetetaan ohjelma.
      catch (FileNotFoundException e) {
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