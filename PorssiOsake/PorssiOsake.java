/*********************************************
Nimi: PorssiOsake
Tekija:
Pvm:
Kuvaus: Luokka pörssiosaketta varten.
Riippuvuudet: -
*********************************************/
/** Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat. */
import java.util.*;
/** Luokka pörssiosaketta varten. */

class PorssiOsake {
/** attribuutit */
  String m_nimi;
  double m_paatosKurssi;
  double m_hinta;
/** Oletuskonstruktori */
  public PorssiOsake() {
  }
/** Konstruktori */
  public PorssiOsake (String uusiNimi, double uusiKurssi) {
    m_nimi = uusiNimi;
    m_hinta = uusiKurssi;
  }
/** lasketaan ja palautetaan muutos% edell. päivän päätöskurssista nykykurssiin */
  public double getMuutosProsentti() {
    return (m_hinta - m_paatosKurssi) / m_paatosKurssi;
  }
/** palauttaa osakkeen nimen */
  public String getNimi() {
    return m_nimi;
  }
/** asettaa osakkeen nimen */
  public void setNimi(String uusiNimi) {
    m_nimi = uusiNimi;
  }  
/** palauttaa päätöskurssin */
  public double getPaatosKurssi() {
    return m_paatosKurssi;
  }
/** palauttaa hinnan */ 
  public double getHinta() {
    return m_hinta;
  }
/** asettaa osakkeelle uuden hinnan */  
  public void setHinta(double uusiHinta) {
    m_hinta = uusiHinta;
  }
/** asettaa osakkeelle uuden päätöskurssin */
  public void setPaatosKurssi (double uusiPaatosKurssi) {
    m_paatosKurssi = uusiPaatosKurssi;
  }
 /** toString-metodi */
  public String toString () {
	  return "Osakkeen nimi: " + getNimi()+ "\n" +
			"Osakkeen paatoskurssi: " + getPaatosKurssi() + "\n" +
			"Osakkeen nykyinen kurssi: " + getHinta() + "\n" +
			"Hinnan muutos: " + getMuutosProsentti() * 100 + "%";
  }
}
