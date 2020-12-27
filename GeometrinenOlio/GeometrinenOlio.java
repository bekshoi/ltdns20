/**
Kirjoita abstrakti luokka GeometrinenOlio, joka toimii geometristen kuvioiden kantaluokkana 
ja sisältää seuraavat asiat:
a) yksityisiä kenttinä(=attribuutti) väri (String) ja boolean-tyyppinen tieto siitä, 
onko ao. kuvio täytetty värillä sekä kuvion luontiaika (Date)
b) Kirjoita luokalle konstruktorit, joista toinen on parametriton ja asettaa ainoastaan kuvion
luontiajan ja toinen saa parametreina värin ja täytetty-tiedon, jotka asettaa luontiajan lisäksi kuvion attribuuttien
arvoiksi.
c) Kirjoita luokkaan julkiset metodit, joiden avulla voi asettaa attribuuteille arvot.
d) Kirjoita luokkaan julkiset metodit, joiden avulla voi palauttaa attribuuttien arvon.
e) Ylikirjoita toString-metodi.
f) kirjoita luokkaan abstraktit metodit getAla, jonka on tarkoitus laskea ja palauttaa kuvion 
ala ja getKeha, jonka tarkoitus on laskea ja palauttaa kuvion piiri. Metodit palauttavat 
desimaalilukuarvon

 * Luokka GeometrinenOlio esittelee yksinkertaisen perusmallin
 * geometristen olioiden piirteille. Näiden avulla
 * esitellään periytymisen toimintaa.
 */
import java.util.*;

public abstract class GeometrinenOlio implements Comparable <GeometrinenOlio>{
	protected String m_vari = "valkoinen";
	protected boolean m_taytetty = true;
	protected Date m_luontiPaiva; // java.util.Date
	
	
	// abstraktit metodit
	public abstract double getAla ();
	public abstract double getKeha ();

/** Luodaan yleinen geometrinen olio oletusalustajalla
 *  värinä valkoinen, tyyppinä täytetty ja luotu nyt.
 */

	
    public GeometrinenOlio() {
    	this.m_luontiPaiva = new Date();
    }

    /** Luodaan yleinen geometrinen olio tietyllä värillä ja täytettynä
     * @param vari Olion väri
     * @param taytetty - totuusarvo onko olio täytetty vai ei.
     */
    public GeometrinenOlio(String vari, boolean taytetty) {
    	this.m_luontiPaiva = new Date();
    	this.m_vari = vari;
    	this.m_taytetty = taytetty;
    }

    /** Palautetaan väri
     * @return olion väri merkkijonona.*/
    public String getVari() {
    	return m_vari;
    }

    /** Asetetaan väri
     *  @param vari Väri merkkijonona.
     */
    public void setVari(String vari) {
    	this.m_vari = vari;
    }

    /** Palautetaan tieto onko olio täytetty.
     * @return true jos on täytetty.
     */
    public boolean onTaytetty() {
    	return m_taytetty;
    }

    /** Asetetaan olion täytetty tieto.
     *  @param taytetty asetetaanko olio täytetyksi vai ei.
     */
    public void setTaytetty(boolean taytetty) {
    	this.m_taytetty = taytetty;
    }

    /** Palautetaan luontipäivä
     *  @return olion luontipäivä.
     */
    public Date getLuontiPaiva() {
    	return m_luontiPaiva;
    }

    /** Palautetaan koko oliota kuvaava merkkijono
     *  @return olion tiedot merkkijonona.
     */
    public String toString() { // Object
    	return "luotu " + m_luontiPaiva + "\nvari: " + m_vari +
    		" ja taytetty: " + m_taytetty;
    }
	public int compareTo (GeometrinenOlio verrokki) {
		if (this.getAla () > verrokki.getAla ()) {
			return 1;
		}
		else {
				if (this.getAla () < verrokki.getAla ()) {
					return -1;
				}
				else {
					return 0;
				}
		
		}
		
	}

}