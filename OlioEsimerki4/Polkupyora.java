/**
 * Luokka Polkupyora 
 */
import java.util.*;

public  class Polkupyora extends Ajoneuvo {
	// ei lisätä mitään

    /** Luodaan Polkupyora-olio tietyllä parametreilla
     */
    public Polkupyora(String erkki, int rlkm) {
    	super (erkki, rlkm);
    }


    /** 
     */
    public String getMoottorinTyyppi() {
    	return "Ei moottoria";
    }

    /** Palautetaan koko oliota kuvaava merkkijono
     *  @return olion tiedot merkkijonona.
     */
    public String toString() { // Object
    	return "Cykel " + m_erkki + " renkaita: " + m_renkaita;
    }



}