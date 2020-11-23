/*********************************************
Nimi:Pelikortti2
Tekija:
Pvm:
Kuvaus: Luokka yksittäistä, perittyä pelikorttia varten.
Riippuvuudet: -
!HUOM! Tiedostonimi on eri kuin luokan nimi
*********************************************/
/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat. */
import java.util.*;
// Luokka yksittäistä pelikorttia varten.
class Pelikortti {
protected String maa;
// Attribuutti, joka ilmaisee, onko kortti hertta, ruutu, pata vai risti.
protected int silmaluku;
// Attribuutti, joka ilmaisee kortin silmäluvun. Ässä lasketaan luvuksi 14.
// Konstruktori, jossa asetetaan kortille alkuarvot.
Pelikortti() {
	maa = "tuntematon";
	silmaluku = 0;
}
// Metodi, joka kertoo pelikortin maan.
public String kerroMaa() {
	return maa;
}
// Metodi, joka kertoo pelikortin silmäluvun.
public int kerroSilmaluku() {
	return silmaluku;
}
// Metodi, joka asettaa pelikortin maan.
public void asetaMaa(String uusimaa) {
	maa = uusimaa;
}
// Metodi, joka asettaa pelikorttin silmäluvun.
public void  asetaSilmaluku(int uusisilmaluku) {
	silmaluku = uusisilmaluku;
}
public String valttiHuuto() {
	return "Tieto on valttia";
}
}
class Risti extends Pelikortti {
protected String vari;
// Attribuutti, joka ilmaisee, onko kortti punainen vai musta.

// Konstruktori, jossa asetetaan kortille alkuarvot.
Risti(int si) {
	maa = "Risti";
	vari = "musta";
	silmaluku = si;
}
// Metodi, joka kertoo valtin.
public String valttiHuuto() {
	return "Risti on valttia";
}

}
class Hertta extends Pelikortti {
protected String vari;

// Konstruktori, jossa asetetaan kortille alkuarvot.
Hertta(int si) {
	maa = "Hertta";
	vari = "punainen";
	silmaluku = si;
}
// Metodi, joka kertoo valtin.
public String valttiHuuto() {
	return "Hertta on valttia";
}

}