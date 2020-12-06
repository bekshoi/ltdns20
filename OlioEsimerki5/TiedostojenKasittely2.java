/*********************************************
Nimi: TiedostojenKasittely2
Kuvaus: Esimerkki 2: tekstitiedostoon kirjoittaminen.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sis�lt�v�t tarvittavat valmiit
luokat. */
import java.util.*;
import java.io.*;

// Toteutettava luokka.
public class TiedostojenKasittely2 {
   
   // P��ohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {
      
      // Esitell��n ja alustetaan olio sy�tteiden lukemista varten.
      Scanner lukija;
		lukija = new Scanner(System.in);

		// Esitell��n muuttuja tiedostonimen kysymist� varten.
      String tiedostonimi;

        // Yritet��n kirjoittaa tiedostostoon ...
        try {
           
            // Pyydet��n tiedostonimi k�ytt�j�lt�.
         System.out.print("Anna tiedostonimi: ");
         tiedostonimi = lukija.nextLine();
           
           //Luodaan tarvittavat oliot tiedostoon kirjoittamista varten ja annetaan kohdetiedosto.
            BufferedWriter tiedostoonkirjoittaja = new BufferedWriter(new FileWriter(tiedostonimi));

           // Kirjoitetaan ensimm�inen rivi tiedostoon.
            tiedostoonkirjoittaja.write("T�m� rivi tallentuu esimerkkitiedostoon.");
            tiedostoonkirjoittaja.newLine();

           // Kirjoitetaan toinen rivi tiedostoon.
            tiedostoonkirjoittaja.write("Kuten my�s t�m�kin rivi.");
            tiedostoonkirjoittaja.newLine();
            
        // Suljetaan lopuksi tiedostolukjan osoittama tiedosto.
         tiedostoonkirjoittaja.close();
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
