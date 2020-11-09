import java.util.*;

// Toteutettava luokka.
public class Tietokone {

   // attribuutit l. jäsenmuuttujat
		private String m_nimi; // prosessorin nimi
		private int m_muisti; // muisti
		private double m_taajuus; // Prosessorin kellotaajuus

   
	 Tietokone (String ni, int mu, double ta) { // konstruktori
		// viedään parametrien arvot attribuuttien arvoiksi
		this.m_nimi = ni;
		this.setMuisti (mu); // hyödynnetään luokan setteriä, jossa on rajatarkastukset
		setTaajuus (ta); // -"-
	 }
// Getterit
	 public String getNimi () {
		 
		 return m_nimi; // palautetaan tietokoneen nimi kutsujalle
	 }
	 public int getMuisti () {
		 
		 return m_muisti; // palautetaan muisti kutsujalle
	 }
	 public double getTaajuus () {
		 
		 return m_taajuus; // palautetaan taajuus kutsujalle
	 }
// Setterit
	 public void setNimi (String nimi) {
		 
		 m_nimi = nimi; // asetetaan tietokoneen nimi 
	 }
	 public void setMuisti (int muisti) {
		 if (muisti >= 512 && muisti <= 10096)
			m_muisti = muisti; // asetetaan muisti
		else
			m_muisti = 0; // arvo ei sallituissa rajoissa
		
	 }
	 public void setTaajuus (double taajuus) {
		 
		 if (taajuus > 1.0 && taajuus <= 10.0)
			m_taajuus = taajuus; // asetetaan taajuus 
		else
			m_taajuus = 0; // arvo ei sallituisssa rajoissa
	 }
	 public String toString () {
		 
		 return m_nimi + " " + m_muisti + " " + m_taajuus; // palautetaan tietokoneen nimi, muisti ja taajuus kutsujalle
	 }
	/* Returns a string representation of the object. 
	In general, the toString method returns a string that "textually represents" 
	this object. The result should be a concise but informative representation that 
	is easy for a person to read. It is recommended that all subclasses override 
	this method. */
 }