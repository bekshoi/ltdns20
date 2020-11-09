/**
 * @(#)Ympyra3.java
 *
 *
 * @author
 * @version 1.00 2019/6/12
 */


public class Ympyra3 {

	/** Ympyr�n s�de */
	private  double sade = 1;

	/** Luotujen olioiden m��r� */
	private static int olioidenMaara = 0;

	/** Luodaan ympyra, jonka s�de on 1 */
    public Ympyra3() {
    	sade = 1;
    	olioidenMaara++;
    }

    /** Luodaan ympyr� jolla on tietty s�de */
    public Ympyra3(double uusiSade) {
    	sade = uusiSade;
    	olioidenMaara++;
    }

    /** Palautetaan s�de */
    public double palautaSade() {
    	return sade;
    }

    /** Asetetaan uusi s�de */
    public void asetaSade(double uusiSade) {
    	sade = (uusiSade >= 0) ? uusiSade : 0;
    }

    /** Palautetaan olioidenMaara */
    public static int palautaOlioidenMaara() {
    	return olioidenMaara;
    }

    /** Palautetaan ympyr�n ala */
    public double palautaAla() {
    	return sade * sade * Math.PI;
    }

    public static void main (String[] args) {
    	// Luodaan ympyr�, jonka s�de on 5.0
    	Ympyra3 mylpyra = new Ympyra3();
    	Ympyra3 omaYmpyra = new Ympyra3(5.0);
    	System.out.println("Kun ympyr�n s�de on " +
    		omaYmpyra.palautaSade() + " sen ala on " +
    			omaYmpyra.palautaAla());

    	// Kasvatetaan omaYmpyra:n s�dett� 10%
    	omaYmpyra.asetaSade(omaYmpyra.palautaSade() * 1.1);
    	System.out.println("Kun ympyr�n s�de on " +
    		omaYmpyra.palautaSade() + " sen ala on " +
    			omaYmpyra.palautaAla());
    	System.out.println(mylpyra.palautaSade());

    }


}