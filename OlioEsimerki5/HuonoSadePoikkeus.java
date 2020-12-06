/**
 * @(#)HuonoSadePoikkeus.java
 * Oma poikkeusaliluokka luokalle Exception
 *
 * @author
 * @version 1.00 2019/6/20
 */


public class HuonoSadePoikkeus extends Exception {
	private double sade;

	/** Luodaan keskeytys */
    public HuonoSadePoikkeus(double sade) {
    	super("Huono s�de " + sade); // kutsutaan luokan Exception alustajaa
    	this.sade = sade;
    }

    /** palautetaan s�de */
    public double getSade() {
     	return sade;
     }

}