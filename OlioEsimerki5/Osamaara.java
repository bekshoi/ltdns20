/**
 * @(#)Osamaara.java
 *
 *
 * @author
 * @version 1.00 2019/6/20
 */

import java.util.Scanner;

public class Osamaara {

    public static void main (String [] args) {
    	Scanner input = new Scanner(System.in);

    	// pyydet‰‰n kaksi kokonaislukua
    	System.out.print("Anna kaksi kokonaislukua: ");
    	int luku1 = input.nextInt();
    	int luku2 = input.nextInt();

    	System.out.println(luku1 + " / " + luku2 + " on " +
    		(luku1 / luku2));
    }


}