/**
 * @(#)TestiOlioValitys.java
 *
 *
 * @author
 * @version 1.00 2019/6/12
 */


public class TestiOlioValitys {

    /** main metodi */
    public static void main(String[] args) {
    	// Luodaan Ympyra olio jonka säde on 1
    	Ympyra3 omaYmpyra = new Ympyra3();

    	// Tulostetaan ympyrän ala säteille 1, 2, 3, 4, ja 5.
    	int n = 5;
    	tulostaAlat(omaYmpyra, n);

    	// Katsotaan mikä on omaYmpyra.sade ja n
    	System.out.println("\n" + "Säde on " + omaYmpyra.palautaSade());
    	System.out.println("n on " + n);

    }

    /** Tulostetaan taulukko aloista eri säteillä */
    public static void tulostaAlat(Ympyra3 c, int kertaa) {
    	System.out.println("Säde \t\tAla");
    	while (kertaa >= 1) {
    		System.out.println(c.palautaSade() + "\t\t" + c. palautaAla());
    		c.asetaSade(c.palautaSade() + 1);
    		kertaa--;
    	}
    }

}