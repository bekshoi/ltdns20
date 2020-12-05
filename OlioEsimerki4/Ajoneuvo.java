/**
 * Luokka Ajoneuvo esittelee yksinkertaisen perusmallin
 * ajoneuvoen piirteille. Näiden avulla
 * esitellään periytymisen toimintaa.
 */
import java.util.*;

public abstract class Ajoneuvo {
	protected String m_erkki; // ajoneuvon merkki
	protected int m_renkaita; // renkaiden lkm
	
	public abstract String toString ();
	public abstract String getMoottorinTyyppi ();	


    /** Luodaan Ajoneuvo-olio tietyllä parametreilla
     */
    public Ajoneuvo(String erkki, int rlkm) {
    	this.m_erkki = erkki;
    	this.m_renkaita = rlkm;
    }

    /** Palautetaan merkki
     * @return olion merkki merkkijonona.*/
    public String getMerkki() {
    	return m_erkki;
    }

    /** Asetetaan merkki
     *  @param merkki  merkkijonona.
     */
    public void setMerkki(String erkki) {
    	this.m_erkki = erkki;
    }

    /** Palautetaan renkaiden lkm
     */
    public int getRenkaita() {
    	return m_renkaita;
    }

    /** Asetetaan renkaiden lkm
     */
    public void setRenkaita(int rlkm) {
    	this.m_renkaita = rlkm;
    }

}