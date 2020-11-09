/*******************************************
Nimi:Korttipakka
Tekija:
Pvm:
Kuvaus: Luokka korttipakkaa varten.
Riippuvuudet: -
*********************************************/
/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat. */
import java.util.*;
// Luokka korttipakkaa varten.
public  class Korttipakka {
// Taulukkoattribuutti, johon talletetaan pakan kortit.
	private Pelikortti[] kortit = new Pelikortti[52];
// Metodi, joka alustaa pakan kortit.
	public void alustaPakka() {
		for (int i = 0; i < 13; i++)
			kortit[i] = new Pelikortti("hertta", i+2);
		for(int i = 13; i < 26; i++)
			kortit[i] = new Pelikortti("ruutu", i-11);
		for(int i = 26; i < 39; i++)
			kortit[i] =new Pelikortti("pata", i-24);
		for(int i = 39; i < 52; i++)
			kortit[i] =new Pelikortti("risti", i-37);
	}
// Metodi, joka sekoittaa korttipakan.
	public void sekoitaPakka() {
// Korttimuuttuja, jota käytetään avuksi sekoitettaessa pakkaa.
		Pelikortti apukortti;
// Kaksi indeksimuuttujaa, joita käytetään avuksi sekoitettaessa pakkaa.
		int apuindeksi1, apuindeksi2;
// Satunnaislukugeneraattori.
		Random generator = new Random();
// Tehdään 52 sekoitusta ...
		for ( int i = 1; i <= 52; i++) {
// ... valitaan kaksi satunnaista korttipakan indeksiä ...
			apuindeksi1 = generator.nextInt(52);
			apuindeksi2 = generator.nextInt(52);
// ... ja vaihdetaan niissä olevien korttien paikkaa.
			apukortti = kortit[apuindeksi1];
			kortit[apuindeksi1] = kortit[apuindeksi2];
			kortit[apuindeksi2] = apukortti;
		}
	}
// Metodi, joka kertoo pakan ensimmäisen kortin värin ja silmäluvun.
	public Pelikortti paljastaPaallimmainenKortti() {
		return kortit[0];
	}
}