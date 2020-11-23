/**
 * @(#)TestiLaina.java
 *
 * Ohjelma, jolla testataan Laina-luokan oliota
 *
 * @author
 * @version 1.00 2019/6/14
 */

import java.util.Scanner;

public class TestiLaina {

    public static void main(String [] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Anna vuosikorko, esim. 8,25: ");
    	double vuosiKorko = input.nextDouble();
    	System.out.print("Anna lainavuosien m‰‰r‰ kokonaislukuna: ");
    	int lainaVuodet = input.nextInt();
    	System.out.print("Anna lainan m‰‰r‰, esim. 10500,50: ");
    	double lainaMaara = input.nextDouble();

    	Laina laina = new Laina(vuosiKorko, lainaVuodet, lainaMaara);
    	System.out.printf("Laina luotiin %s\n" +
    		"Kuukausier‰ on %.2f\nKokomaksu on %.2f\n",
    		laina.palautaLainaPaiva().toString(), laina.palautaKuukausiEra(),
    		laina.palautaKokoMaksu());

    }


}