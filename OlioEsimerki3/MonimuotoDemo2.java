/**
 * @(#)MonimuotoDemo2.java
 *
 */


public class MonimuotoDemo2 {

    public static void main(String [] args) {
    	naytaOlio(new Ympyra(1, "punainen", false)); // luodaan parametrioliot kutsussa
    	naytaOlio(new Suorakulmio(1, 1, "musta", true));
    }

    public static void naytaOlio(GeometrinenOlio olio) { 
	//  parametrit k�sitet��n kantaluokan olioina -> laskennat eiv�t toimisi (esim. getAla)
    	System.out.println("Luotu " + olio.getLuontiPaiva()  +
    		". V�ri on " + olio.getVari());
	//	olio.getAla (); // ei toimi
    }


}