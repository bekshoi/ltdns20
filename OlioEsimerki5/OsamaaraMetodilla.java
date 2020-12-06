/**
 * @(#)OsamaaraMetodilla.java
 *
 *
 * @author
 * @version 1.00 2019/6/20
 */

import java.util.Scanner;

public class OsamaaraMetodilla {

    public static int osamaara(int luku1, int luku2) {
    	if (luku2 == 0)
    		throw new ArithmeticException("Jakaja ei voi olla nolla");

    	return luku1 / luku2;
    }

    public static void main (String [] args) {
    	Scanner input = new Scanner(System.in);

    	// pyydet‰‰n kaksi lukua
    	System.out.print("Anna kaksi kokonaislukua: ");
    	int luku1 = input.nextInt();
    	int luku2 = input.nextInt();

    	try {
    		int tulos = osamaara(luku1, luku2);
    		System.out.println(luku1 + " / " + luku2 + " on "
    			+ tulos);
    	}
    	catch (Exception ex) {
    		System.out.println("Poikkeus: kokonaislukua " +
    			" ei voi jakaa nollalla ");
    	}

    	System.out.println("Suoritus jatkuu");
    }

}