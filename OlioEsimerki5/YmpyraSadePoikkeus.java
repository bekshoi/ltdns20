/**
 * @(#)YmpyraSadePoikkeus.java
 *
 * Luokka k�ytt�� oman HuonoSadePoikkeus-luokan poikkeusta
 * @author
 * @version 1.00 2019/6/20
 */


public class YmpyraSadePoikkeus {
	/** ympyr�n s�de */
	private double sade;

	/** Luotujen olioiden m��r� */
	private static int olioidenMaara = 0;

    /** Luodaan ympyr� s�teell� 1 */
    public YmpyraSadePoikkeus() {
    	this(1.0);
    }

    /** Luodaan ympyr� tietyll� s�teell� */
    public YmpyraSadePoikkeus(double uusiSade) {
    	try {
    		setSade(uusiSade);
    		olioidenMaara++;
    	}
    	catch (HuonoSadePoikkeus ex) { // poimii
    		ex.printStackTrace();
    	}
    }

    /** Palautetaan s�de */
    public double getSade() {
    	return sade;
    }

    /** Asetetaan uusi s�de */
    public void setSade(double uusiSade)
    	throws HuonoSadePoikkeus {   // voi heitt��
    	if (uusiSade >= 0)
    		sade = uusiSade;
    	else
    		throw new HuonoSadePoikkeus(uusiSade); // heitt��
    	}

    /** Palautetaan olioiden m��r� */
    public static int getOlioidenMaara() {
    	return olioidenMaara;
    }

    /** Palautetaan ympyr�n ala */
    public double annaAla() {
    	return sade * sade * 3.14159;
    }



}