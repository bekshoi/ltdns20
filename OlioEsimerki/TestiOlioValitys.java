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
    	// Luodaan Ympyra olio jonka s�de on 1
    	Ympyra3 omaYmpyra = new Ympyra3();

    	// Tulostetaan ympyr�n ala s�teille 1, 2, 3, 4, ja 5.
    	int n = 5;
    	tulostaAlat(omaYmpyra, n);

    	// Katsotaan mik� on omaYmpyra.sade ja n
    	System.out.println("\n" + "S�de on " + omaYmpyra.palautaSade());
    	System.out.println("n on " + n);

    }

    /** Tulostetaan taulukko aloista eri s�teill� */
    public static void tulostaAlat(Ympyra3 c, int kertaa) {
    	System.out.println("S�de \t\tAla");
    	while (kertaa >= 1) {
    		System.out.println(c.palautaSade() + "\t\t" + c. palautaAla());
    		c.asetaSade(c.palautaSade() + 1);
    		kertaa--;
    	}
    }

}