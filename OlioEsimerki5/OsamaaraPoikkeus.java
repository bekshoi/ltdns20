/**
 * @(#)OsamaaraPoikkeus.java
 *
 *
 * @author
 * @version 1.00 2019/6/20
 */

import java.util.Scanner;

public class OsamaaraPoikkeus {

    public static void main (String [] args) {
    	Scanner input = new Scanner(System.in);

    	// pyydet‰‰n kaksi kokonaislukua
    	System.out.print("Anna kaksi kokonaislukua: ");
    	int luku1 = input.nextInt();
    	int luku2 = input.nextInt();

    	try {
    		if (luku2 == 0)
    			throw new ArithmeticException("Jakaja ei voi olla nolla");
    		System.out.println(luku1 + " / " + luku2 + " on " +
    			(luku1 / luku2));
    	}
    	catch (ArithmeticException ex) {
    		System.out.println("Poikkeus: lukua ei voi jakaa nollalla");
    	}

    	System.out.println("Suoritus jatkuu...");
    }
}
