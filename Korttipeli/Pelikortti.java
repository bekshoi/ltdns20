/*********************************************
Nimi:Pelikortti
Tekija:
Pvm:
Kuvaus: Luokka yksitt�ist� pelikorttia varten.
Riippuvuudet: -
*********************************************/
/* Otetaan mukaan kirjastot, jotka sis�lt�v�t tarvittavat valmiit luokat. */
import java.util.*;
// Luokka yksitt�ist� pelikorttia varten.
public class Pelikortti {
private String maa;
// Attribuutti, joka ilmaisee, onko kortti hertta, ruutu, pata vai risti.
private int silmaluku;
// Attribuutti, joka ilmaisee kortin silm�luvun. �ss� lasketaan luvuksi 14.
// Konstruktori, jossa asetetaan kortille alkuarvot.
Pelikortti(String ma, int si) {
	maa = ma;
	silmaluku = si;
}
// Metodi, joka kertoo pelikortin maan.
public String kerroMaa() {
	return maa;
}
// Metodi, joka kertoo pelikortin silm�luvun.
public int kerroSilmaluku() {
	return silmaluku;
}
// Metodi, joka asettaa pelikortin maan.
public void asetaMaa(String uusimaa) {
	maa = uusimaa;
}
// Metodi, joka asettaa pelikorttin silm�luvun.
public void  setaSilmaluku(int uusisilmaluku) {
	silmaluku = uusisilmaluku;
}
}