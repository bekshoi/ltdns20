/**
 * @(#)YmpyraSadePoikkeus.java
 *
 * Luokka käyttää oman HuonoSadePoikkeus-luokan poikkeusta
 * @author
 * @version 1.00 2019/6/20
 */


public class YmpyraSadePoikkeus {
	/** ympyrän säde */
	private double sade;

	/** Luotujen olioiden määrä */
	private static int olioidenMaara = 0;

    /** Luodaan ympyrä säteellä 1 */
    public YmpyraSadePoikkeus() {
    	this(1.0);
    }

    /** Luodaan ympyrä tietyllä säteellä */
    public YmpyraSadePoikkeus(double uusiSade) {
    	try {
    		setSade(uusiSade);
    		olioidenMaara++;
    	}
    	catch (HuonoSadePoikkeus ex) { // poimii
    		ex.printStackTrace();
    	}
    }

    /** Palautetaan säde */
    public double getSade() {
    	return sade;
    }

    /** Asetetaan uusi säde */
    public void setSade(double uusiSade)
    	throws HuonoSadePoikkeus {   // voi heittää
    	if (uusiSade >= 0)
    		sade = uusiSade;
    	else
    		throw new HuonoSadePoikkeus(uusiSade); // heittää
    	}

    /** Palautetaan olioiden määrä */
    public static int getOlioidenMaara() {
    	return olioidenMaara;
    }

    /** Palautetaan ympyrän ala */
    public double annaAla() {
    	return sade * sade * 3.14159;
    }



}