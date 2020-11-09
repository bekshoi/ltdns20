import java.util.*;

// Toteutettava luokka.
public class Kurssi {

   // attribuutit l. jäsenmuuttujat
		public String m_nimi;
		public int m_opiskelijaLkm;
		public String [] m_opiskelijat = new String [100]; 

   
	 Kurssi (String ni) { // konstruktori
		// viedään parametrien arvot attribuuttien arvoiksi
		m_nimi = ni;
		m_opiskelijaLkm = 0;// alussa opiskelijoita ei ole
	 }
	 public int LisaaOpiskelija (String opiskelijanNimi) {
		 // lisätään parametrina välitetyn opiskelijan nimi taulukkoon
         if (m_opiskelijaLkm < 100) {
			 m_opiskelijat[m_opiskelijaLkm] = opiskelijanNimi;
			 m_opiskelijaLkm++;
			 return 0; // operaatio ok
		 }
		 else {
			return -1; // palauttaa "virhekoodin"
		 }
		
	 }
	 public String PalautaNimi () {
		 
		 return m_nimi; // palautetaan kurssin nimi kutsujalle
	 }
	 public int PalautaOpiskelijaLkm () {
		 
		 return m_opiskelijaLkm; // palautetaan arvo kutsujalle
	 }
	 public String[] PalautaOpiskelijat () {
		 
		 return m_opiskelijat; // palautetaan taulukko kutsujalle
	 }
 }