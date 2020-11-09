/*******************************************
Nimi:Korttipeli
Tekija:
Pvm:
Kuvaus: Kahden pelaajan korttipeli.
Riippuvuudet: -
*********************************************/
/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat. */
import java.util.*;
public class Korttipeli {
// Pääohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
	public static void main(String [ ] args) {
// Käytettävä korttipakka.
		Korttipakka Pakka = new Korttipakka();
// Pelaajille vedettävät kortit
		Pelikortti Kortti1, Kortti2;
// Alustetaan pakka.
		Pakka.alustaPakka();
// Sekoitetaan pakka ja vedetään kortti ensimmäiselle pelaajalle.
		Pakka.sekoitaPakka();
		System.out.println("Vedetään ensimmäiselle pelaajalle kortti.");
		Kortti1 = Pakka.paljastaPaallimmainenKortti();
		System.out.println("Ensimmäisen pelaajan kortti on " + Kortti1.kerroMaa() + " " + Kortti1.kerroSilmaluku() + ".");
// Sekoitetaan pakka ja vedetään kortti toiselle pelaajalle.
		Pakka.sekoitaPakka();
		System.out.println("Vedetään toiselle pelaajalle kortti." );
		Kortti2 = Pakka.paljastaPaallimmainenKortti();
		System.out.println("Toisen pelaajan kortti on " + Kortti2.kerroMaa() + " " + Kortti2.kerroSilmaluku() + ".");
// Katsotaan, kumpi pelaajista voitti.
		if (Kortti1.kerroSilmaluku() > Kortti2.kerroSilmaluku())
			System.out.println("Ensimmäinen pelaaja voitti.");
		else
		if (Kortti2.kerroSilmaluku() > Kortti1.kerroSilmaluku())
			System.out.println("Toinen pelaaja voitti.");
		else 
			System.out.println("Tasapeli.");
	}
}