/**
 * @(#)TestiOpiskelija.java
 *
 *
 * @author
 * @version 1.00 2019/6/12
 */


public class TestiOpiskelija {

    public static void main (String [] args) {
    	Opiskelija opiskelija = new Opiskelija(1234567, 1970, 5, 3);
    	System.out.println(opiskelija.palautaSyntAika());
    	SyntAika paivays = opiskelija.palautaSyntAika();
    	paivays.asetaVuosi(2010);
    	System.out.println(opiskelija.palautaSyntAika());

    }


}