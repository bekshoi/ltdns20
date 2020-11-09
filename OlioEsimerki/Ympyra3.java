/**
 * @(#)Ympyra3.java
 *
 *
 * @author
 * @version 1.00 2019/6/12
 */


public class Ympyra3 {

	/** Ympyrän säde */
	private  double sade = 1;

	/** Luotujen olioiden määrä */
	private static int olioidenMaara = 0;

	/** Luodaan ympyra, jonka säde on 1 */
    public Ympyra3() {
    	sade = 1;
    	olioidenMaara++;
    }

    /** Luodaan ympyrä jolla on tietty säde */
    public Ympyra3(double uusiSade) {
    	sade = uusiSade;
    	olioidenMaara++;
    }

    /** Palautetaan säde */
    public double palautaSade() {
    	return sade;
    }

    /** Asetetaan uusi säde */
    public void asetaSade(double uusiSade) {
    	sade = (uusiSade >= 0) ? uusiSade : 0;
    }

    /** Palautetaan olioidenMaara */
    public static int palautaOlioidenMaara() {
    	return olioidenMaara;
    }

    /** Palautetaan ympyrän ala */
    public double palautaAla() {
    	return sade * sade * Math.PI;
    }

    public static void main (String[] args) {
    	// Luodaan ympyrä, jonka säde on 5.0
    	Ympyra3 mylpyra = new Ympyra3();
    	Ympyra3 omaYmpyra = new Ympyra3(5.0);
    	System.out.println("Kun ympyrän säde on " +
    		omaYmpyra.palautaSade() + " sen ala on " +
    			omaYmpyra.palautaAla());

    	// Kasvatetaan omaYmpyra:n sädettä 10%
    	omaYmpyra.asetaSade(omaYmpyra.palautaSade() * 1.1);
    	System.out.println("Kun ympyrän säde on " +
    		omaYmpyra.palautaSade() + " sen ala on " +
    			omaYmpyra.palautaAla());
    	System.out.println(mylpyra.palautaSade());

    }


}