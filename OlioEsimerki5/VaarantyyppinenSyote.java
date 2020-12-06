/**
 * @(#)VaarantyyppinenSyote.java
 *
 *
 * @author
 * @version 1.00 2019/6/20
 */

import java.util.*;

public class VaarantyyppinenSyote {

    public static void main(String [] args) {
    	Scanner input = new Scanner(System.in);
    	boolean jatkaKysymista = true;

    	do {
    		try {
    			System.out.print("Anna kokonaisluku: ");
    			int luku = input.nextInt();

    			//Näytetään tulos
    			System.out.println("Antamasi luku oli " + luku);

    			jatkaKysymista = false;
    		}
    		catch (InputMismatchException ex) {
    			System.out.println("Yritä uudestaan. (" +
    				"Väärä syöte: tarvitaan kokonaisluku)");
    			input.nextLine(); // hylätään syöte
    		}
    	} while (jatkaKysymista);
    }


}