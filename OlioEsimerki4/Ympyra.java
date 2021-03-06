/**
 * Ympyra.java kuvaa yksinkertaista ympyrää
 * joka sisältää myös geometrisen olion yleisen ominaisuudet.
 *
 */
public class Ympyra extends GeometrinenOlio {

	/** Ympyran säde */
	private double m_sade;

    /** Luodaan nollan kokoinen ympyra */
    public Ympyra() {
			m_sade = 0.0;
    }

    /** Luodaan tietyn kokoinen ympyrä
     *  @param sade
     */
    public Ympyra(double sade) {
    	this.m_sade = sade;
    }

    /** Luodaan ympyrä jolla on tietty koko, väri ja täytetty
     *  @param sade
     *  @param vari
     *  @param taytetty
     */
    public Ympyra(double sade, String vari, boolean taytetty) {
		super(vari, taytetty);
    	this.m_sade = sade;
    }

    /** Palautetaan sade
     *  @return sade*/
    public double getSade() {
    	return m_sade;
    }

    /** Asetetaan uusi leveys
     *  @param leveys
     */
    public void setSade(double sade) {
    	this.m_sade = sade;
    }

   
    /** Palautetaan ala
     *  @return ympyran ala*/
    public double getAla() {
    	return m_sade * m_sade * Math.PI;
    }

    /** Palautetaan halkaisija
     *  @return ympyran keha
     */
   public double getKeha() {
    	return 2 * m_sade * Math.PI;
    }
	 /** Palautetaan halkaisija
     *  @return ympyran halkaisija
     */
    public double getHalkaisija() {
    	return 2 * m_sade;
    }
	 /** Palautetaan koko oliota kuvaava merkkijono
     *  @return olion tiedot merkkijonona.
     */
    public String toString() { // Object
    	return "Ympyra " + super.toString () + ", jonka sade on " + m_sade;
    }

}