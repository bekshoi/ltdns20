/**
 * Luokka Auto 
 */
import java.util.*;

public  class Auto extends Ajoneuvo {
	protected int m_cc;

    /** Luodaan Auto-olio tietyillä parametreilla
     */
    public Auto(String erkki, int rlkm, int cc) {
    	super (erkki, rlkm);
		m_cc = cc;
    }

	public int getCc() {
    	return m_cc;
    }
	public void setCc(int cc) {
    	m_cc = cc;
    }
    
    public String getMoottorinTyyppi() {
    	return "Polttomoottori";
    }

    /** Palautetaan koko oliota kuvaava merkkijono
     *  @return olion tiedot merkkijonona.
     */
    public String toString() { // Object
    	return "Auto " + m_erkki + " renkaita: " + m_renkaita + " kuutiotilavuus: " + m_cc;
    }



}