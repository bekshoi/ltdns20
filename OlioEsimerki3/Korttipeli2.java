/*******************************************
Nimi:Korttipeli2
Tekija:
Pvm:
Kuvaus: Monimuotoisten korttien peli.
Riippuvuudet: -
*********************************************/
/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat. */
import java.util.*;
public class Korttipeli2 {
// Pääohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
	public static void main(String [ ] args) {
		// Luodaan olio syötteiden lukemista varten
		Scanner lukija;
		Locale.setDefault(Locale.ENGLISH);
		lukija = new Scanner(System.in);
		int uusiSilmaluku;
		// luodaan kolme korttia
		Pelikortti Kortti = new Pelikortti ();
		Risti Ristiseiska = new Risti (7);
		Hertta Herttaakka = new Hertta (12);
		// muutetaan korttien tietoja
		System.out.println("Anna pelikortille silmäluku");
		uusiSilmaluku = lukija.nextInt();
		Kortti.asetaSilmaluku(uusiSilmaluku);
		System.out.println("Anna Ristille uusi silmäluku");
		uusiSilmaluku = lukija.nextInt();
		Ristiseiska.asetaSilmaluku(uusiSilmaluku);
		System.out.println("Anna Hertalle uusi silmäluku");
		uusiSilmaluku = lukija.nextInt();
		Herttaakka.asetaSilmaluku(uusiSilmaluku);
		
		Pelikortti kortit[] = new Pelikortti[3]; // kolme korttia taulukkoon
		kortit[0] = Kortti;
		kortit[1] = Ristiseiska;
		kortit[2] = Herttaakka;

     // tulostetaan korttien tiedot taulukosta
		for (int i = 0; i <= 2; i++) {
			System.out.println(kortit[i].kerroMaa() + " " + kortit[i].kerroSilmaluku() + " sanoo: " + kortit[i].valttiHuuto());
		}
		
	}
}