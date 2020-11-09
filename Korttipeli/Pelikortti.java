/*********************************************
Nimi:Pelikortti
Tekija:
Pvm:
Kuvaus: Luokka yksittäistä pelikorttia varten.
Riippuvuudet: -
*********************************************/
/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat. */
import java.util.*;
// Luokka yksittäistä pelikorttia varten.
public class Pelikortti {
private String maa;
// Attribuutti, joka ilmaisee, onko kortti hertta, ruutu, pata vai risti.
private int silmaluku;
// Attribuutti, joka ilmaisee kortin silmäluvun. Ässä lasketaan luvuksi 14.
// Konstruktori, jossa asetetaan kortille alkuarvot.
Pelikortti(String ma, int si) {
	maa = ma;
	silmaluku = si;
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
public void  setaSilmaluku(int uusisilmaluku) {
	silmaluku = uusisilmaluku;
}
}