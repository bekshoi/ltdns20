/**
 * @(#)YmpyraPoikkeuksella.java
 *
 *
 * @author
 * @version 1.00 2019/6/20
 */


public class YmpyraPoikkeuksella {
	/** Ympyr‰n s‰de */
	private double sade;

	/** Luotujen ympyrˆiden m‰‰r‰ */
	private static int olioidenMaara = 0;

	/** Luodaan ympyr‰ s‰teell‰ 1 */
    public YmpyraPoikkeuksella() {
    	this(1.0);
    }

    /** Luodaan ympyr‰ annetulla s‰teell‰ */
    public YmpyraPoikkeuksella(double uusiSade) {
    	setSade(uusiSade);
    	olioidenMaara++;
    }

    /** Palautetaan s‰de */
    public double getSade() {
    	return sade;
    }

    /** Asetetaan uusi s‰de */
    public void setSade(double uusiSade)
    	throws IllegalArgumentException { // tarkistamaton poikkeus, RuntimeException aliluokka
    	if (uusiSade >= 0)
    		sade = uusiSade;
    	else
    		throw new IllegalArgumentException (
    			"S‰de ei voi olla negatiivinen");
    }

    /** Palautetaan olioiden m‰‰r‰ */
    public static int getOlioidenMaara() {
    	return olioidenMaara;
    }

    /** Palautetaan ympyr‰n ala */
    public double palautaAla() {
    	return sade * sade * 3.14159;
    }


}