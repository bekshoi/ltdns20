/*********************************************
Nimi: TiedostojenKasittely3
Kuvaus: Esimerkki 3: tekstitiedostoon lisääminen.
*********************************************/

/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit
luokat. */
import java.util.*;
import java.io.*;

// Toteutettava luokka.
public class TiedostojenKasittely3 {
   
   // Pääohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String [ ] args) {
      
      // Esitellään ja alustetaan olio syötteiden lukemista varten.
      Scanner lukija;
		lukija = new Scanner(System.in);

		// Esitellään muuttuja tiedostonimen kysymistä varten.
      String tiedostonimi;

        // Yritetään kirjoittaa tiedostostoon ...
        try {
           
            // Pyydetään tiedostonimi käyttäjältä.
         System.out.print("Anna tiedostonimi: ");
         tiedostonimi = lukija.nextLine();
           
           // Luodaan tarvittavat oliot tiedostoon kirjoittamista varten ja annetaan kohdetiedosto sekä
           // tieto siitä, että ei haluta kirjoittaa aikaisemman tiedon yli vaan halutaan liittää tekstiä
           // loppuun.
            BufferedWriter tiedostoonkirjoittaja = new BufferedWriter(new FileWriter(tiedostonimi, true));

           // Kirjoitetaan ensimmäinen rivi tiedostoon.
            tiedostoonkirjoittaja.write("Tämä rivi tallentuu esimerkkitiedostoon.");
            tiedostoonkirjoittaja.newLine();

           // Kirjoitetaan toinen rivi tiedostoon.
            tiedostoonkirjoittaja.write("Kuten myös tämäkin rivi.");
            tiedostoonkirjoittaja.newLine();
            
        // Suljetaan lopuksi tiedostolukjan osoittama tiedosto.
         tiedostoonkirjoittaja.close();
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
