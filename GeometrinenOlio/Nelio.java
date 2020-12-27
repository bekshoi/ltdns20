/**
 * Nelio.java kuvaa yksinkertaista neliötä
 * joka sisältää myös geometrisen olion yleisen ominaisuudet.
 *
 */
public class Nelio extends GeometrinenOlio {

	/** neliön sivu */
	private double m_sivu;

    /** Luodaan nollan kokoinen neliö */
    public Nelio() {
			m_sivu = 0.0;
    }

    /** Luodaan tietyn kokoinen neliö
     */
    public Nelio(double sivu) {
    	this.m_sivu = sivu;
    }

   

    /** Palautetaan sivu
     *  @return sivu*/
    public double getSivu() {
    	return m_sivu;
    }

    /** Asetetaan uusi sivu
     *  @param sivu
     */
    public void setSivu(double sivu) {
    	this.m_sivu = sivu;
    }

  
    /** Palautetaan ala
     *  @return  ala*/
    public double getAla() {
    	return m_sivu * m_sivu;
    }

    /** Palautetaan keha
     *  @return  keha
     */
   public double getKeha() {
    	return 4 * m_sivu; // 
    }
	 
	 /** Palautetaan koko oliota kuvaava merkkijono
     *  @return olion tiedot merkkijonona.
     */
    public String toString() { // Object
    	return "nelio " + super.toString ();
    }
	
	
}