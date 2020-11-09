/*******************************************
Nimi:Korttipeli
Tekija:
Pvm:
Kuvaus: Kahden pelaajan korttipeli.
Riippuvuudet: -
*********************************************/
/* Otetaan mukaan kirjastot, jotka sis�lt�v�t tarvittavat valmiit luokat. */
import java.util.*;
public class Korttipeli {
// P��ohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
	public static void main(String [ ] args) {
// K�ytett�v� korttipakka.
		Korttipakka Pakka = new Korttipakka();
// Pelaajille vedett�v�t kortit
		Pelikortti Kortti1, Kortti2;
// Alustetaan pakka.
		Pakka.alustaPakka();
// Sekoitetaan pakka ja vedet��n kortti ensimm�iselle pelaajalle.
		Pakka.sekoitaPakka();
		System.out.println("Vedet��n ensimm�iselle pelaajalle kortti.");
		Kortti1 = Pakka.paljastaPaallimmainenKortti();
		System.out.println("Ensimm�isen pelaajan kortti on " + Kortti1.kerroMaa() + " " + Kortti1.kerroSilmaluku() + ".");
// Sekoitetaan pakka ja vedet��n kortti toiselle pelaajalle.
		Pakka.sekoitaPakka();
		System.out.println("Vedet��n toiselle pelaajalle kortti." );
		Kortti2 = Pakka.paljastaPaallimmainenKortti();
		System.out.println("Toisen pelaajan kortti on " + Kortti2.kerroMaa() + " " + Kortti2.kerroSilmaluku() + ".");
// Katsotaan, kumpi pelaajista voitti.
		if (Kortti1.kerroSilmaluku() > Kortti2.kerroSilmaluku())
			System.out.println("Ensimm�inen pelaaja voitti.");
		else
		if (Kortti2.kerroSilmaluku() > Kortti1.kerroSilmaluku())
			System.out.println("Toinen pelaaja voitti.");
		else 
			System.out.println("Tasapeli.");
	}
}