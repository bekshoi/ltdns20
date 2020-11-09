/*********************************************
Nimi:SuoraKulmio
Tekija:
Pvm:
Kuvaus: Luokka suorakulmiota varten.
Riippuvuudet: -
*********************************************/
/** Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat. */
import java.util.*;
/** Luokka suorakulmiota varten. */
class SuoraKulmio {
/** Attribuutit */
	double m_leveys = 1;
	double m_korkeus = 1;
  
/** Konstruktori */
  public SuoraKulmio() {
  }

/** Konstruktori */
  public SuoraKulmio(double uusiLeveys, double uusiKorkeus) {
    m_leveys = uusiLeveys;
    m_korkeus = uusiKorkeus;
  }
/** Lasketaan ja palautetaan suorakulmion ala */
  public double getAla() {
    return m_leveys * m_korkeus;
  }
/** Lasketaan ja palautetaan suorakulmion piiri */
  public double getPiiri() {
    return 2 * (m_leveys + m_korkeus);
  }
}