/**
 * Ohjelma testaa luokan Kurssi käyttöä.
 *
 *
 *
 * @version 1.00 2019/6/14
 */


public class TestiKurssi {

    public static void main(String[] args) {
    	Kurssi kurssi1 = new Kurssi("Johdatus ohjelmointiin");
    	Kurssi kurssi2 = new Kurssi("Olio-ohjelmointi");

    	kurssi1.lisaaOpiskelija("Linus Thorvalds");
    	kurssi1.lisaaOpiskelija("Tatu Ylönen");
    	kurssi1.lisaaOpiskelija("Petteri Järvinen");

    	kurssi2.lisaaOpiskelija("Simo Salminen");
    	kurssi2.lisaaOpiskelija("Pertti Pasanen");

    	System.out.println("Opiskelijamäärä kurssilla 1 on: "
    		+ kurssi1.palautaOpiskelijaMaara());
    	String[] opiskelijat = kurssi1.palautaOpiskelijat();
    	for (int i = 0; i < kurssi1.palautaOpiskelijaMaara(); i++)
    		System.out.print(opiskelijat[i] + ", ");

    	System.out.println();
    	System.out.print("Opiskelijamäärä kurssilla 2 on: "
    		+ kurssi2.palautaOpiskelijaMaara());
    }


}