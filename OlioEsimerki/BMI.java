import java.util.*;

// Toteutettava luokka.
public class BMI {

   // attribuutit l. jäsenmuuttujat
		public String m_nimi;
		public int m_ika;
		public double m_pituus; // metriä
		public double m_paino; // kg

   
	 BMI (String ni, int ika, double pit, double pa) { // konstruktori
		// viedään parametrien arvot attribuuttien arvoiksi
		m_nimi = ni;
		m_ika = ika;
		m_pituus = pit;
		m_paino = pa;
	 }
	 public double LaskeBmi () {
		 // lasketaan bmi attribuuteissa olevien arvojen perusteella
         double bmi;
         bmi = m_paino / (m_pituus * m_pituus);
		 return bmi; // palautetaan laskettu bmi-arvo
		 //return m_paino / (m_pituus * m_pituus);
	 }
	 public String PalautaBmiArvio () {
		 
		 String teksti = ""; // bmi-arvioteksti
         double dblBMI;			// laskettu bmi
         dblBMI = LaskeBmi (); // kutsutaan metodia, joka laskee ja palauttaa bmi-arvon
		
		// tehdään sanallinen arvio bmi:n perusteella
		if (dblBMI < 16.0)
        {
			teksti = "vakavasti alipainoinen ";
        }
		
        if (dblBMI >= 16.0 && dblBMI < 18.0)
        {
			teksti = "alipainoinen ";
        }
		
		if (dblBMI >= 18.0 && dblBMI < 24.0)
        {
			teksti = "normaalipainoinen ";
        }
		
		if (dblBMI >= 24.0 && dblBMI < 29.0)
        {
			teksti = "ylipainoinen ";
        }
		
		if (dblBMI >= 29.0 && dblBMI < 35.0)
        {
			teksti = "vakavasti ylipainoinen ";
        }
		
        if (dblBMI >= 35.0)
        {
			teksti = "hirveän ylipainoinen ";
        }
		 return teksti; // palautetaan arvio kutsujalle
	 }
 }