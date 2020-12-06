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
    	super("Huono säde " + sade); // kutsutaan luokan Exception alustajaa
    	this.sade = sade;
    }

    /** palautetaan säde */
    public double getSade() {
     	return sade;
     }

}