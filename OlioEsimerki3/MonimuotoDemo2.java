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
	//  parametrit käsitetään kantaluokan olioina -> laskennat eivät toimisi (esim. getAla)
    	System.out.println("Luotu " + olio.getLuontiPaiva()  +
    		". Väri on " + olio.getVari());
	//	olio.getAla (); // ei toimi
    }


}