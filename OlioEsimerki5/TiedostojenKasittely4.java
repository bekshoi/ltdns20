/*********************************************
Nimi: TiedostojenKasittely4
Kuvaus: Esimerkki 4: bin��ritiedostosta lukeminen.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sis�lt�v�t tarvittavat valmiit
luokat. */
import java.util.*;
import java.io.*;

// Toteutettava luokka.
public class TiedostojenKasittely4 {
   
   // P��ohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {
      
      // Esitell��n ja alustetaan olio sy�tteiden lukemista varten.
      Scanner lukija;
		lukija = new Scanner(System.in);

		// Esitell��n muuttuja tiedostonimen kysymist� varten.
      String tiedostonimi;

      // Esitell��n muuttujat, joihin haluamme lukea dataa tiedostosta.
      int kokonaisluku = 0;
      double liukuluku = 0;

      // Olio tiedostosta lukemista varten.
      ObjectInputStream tiedostolukija = null;

      // Yritet��n lukea tiedostosta ...
      try {

         // Pyydet��n tiedostonimi k�ytt�j�lt�.
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
      // Ilmoitetaan k�ytt�j�lle, kun p��st��n tiedoston loppuun.
      } catch (EOFException eof) {
         System.out.println ("Tiedosto loppui");
         
         try {
            // Suljetaan lopuksi tiedostolukjan osoittama tiedosto.
            tiedostolukija.close();
         }
         // Otetaan kiinni sy�te- ja tulostevirtoihin liittyv�t poikkeukset, tulostetaan ilmoitus ja lopetetaan ohjelma.
         catch(IOException e) {
            System.out.println("Tiedoston sulkeminen ep�onnistui. Lopetan.");
            System.exit(1);
         }
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

      // Tulostetaan tiedostosta luetut arvot.
      System.out.println (kokonaisluku);
      System.out.println (liukuluku);

   }
}