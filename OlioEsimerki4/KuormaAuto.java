/**
 * Luokka KuormaAuto 
 */
import java.util.*;

public  class KuormaAuto extends Auto {
	protected double m_lavanTilavuus; // lavan tilavuus m3

    /** Luodaan KuormaAuto-olio tietyillä parametreilla
     */
    public KuormaAuto(String erkki, int rlkm, int cc, double til) {
    	super (erkki, rlkm, cc);
		m_lavanTilavuus = til;
    }

	public double getLavanTilavuus() {
    	return m_lavanTilavuus;
    }
	public void setLavanTilavuus(int til) {
    	m_lavanTilavuus = til;
    }
    
    public String getMoottorinTyyppi() {
    	return "Dieselmoottori";
    }

    /** Palautetaan koko oliota kuvaava merkkijono
     *  @return olion tiedot merkkijonona.
     */
    public String toString() { // Object
    	return "Kuorma-" + super.toString() + " lavan til: " + m_lavanTilavuus;
    }



}