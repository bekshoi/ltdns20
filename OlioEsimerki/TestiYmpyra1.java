/**
 * @(#)TestiYmpyra1.java
 *
 * Testataan Ympyra1 -luokan olioita
 *
 * @author
 * @version 1.00 2019/6/14
 */


public class TestiYmpyra1 {

    public static void main (String [] args)  {
    	// Luodaan ympyrä, jonka säde on 5.0
    	Ympyra1 omaYmpyra = new Ympyra1(5.0);
    	System.out.println("Ympyrän säde on "
    		+ omaYmpyra.sade + " ja sen ala on "
    			+ omaYmpyra.palautaAla());

    	// Luodaan ympyrä, jonka säde on 1
    	Ympyra1 sinunYmpyra = new Ympyra1();
    	System.out.println("Ympyrän säde on "
    		+ sinunYmpyra.sade + " ja sen ala on "
    			+ sinunYmpyra.palautaAla());

    	// Palautetaan ympyrän pinta-ala
    	sinunYmpyra.sade = 100;
    	System.out.println("Ympyrän säde on "
    		+ sinunYmpyra.sade + " ja sen ala on "
    			+ sinunYmpyra.palautaAla());

    }



}