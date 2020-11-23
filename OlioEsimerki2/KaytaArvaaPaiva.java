import java.util.Scanner;

/**
 * Ohjelma selvitt‰‰ mik‰ on k‰ytt‰j‰n syntym‰p‰iv‰ (kuukaudenp‰iv‰).
 *
 * Ohjelma k‰ytt‰‰ apuna luokkaa ArvaaPaiva.java.
 * @see ArvaaPaiva.java
 *
 *
 * @author
 * @version 1.00 2019/6/14
 */
public class KaytaArvaaPaiva {

    public static void main(String[] args) {
    	int paiva = 0;
    	int vastaus;

    	Scanner input = new Scanner(System.in);

    	for (int i = 0; i < 5; i++) {
    		System.out.println("Onko syntym‰p‰iv‰si joukossa" +
    			(i + 1) + "?");
    		for ( int j = 0; j < 4; j++) {
    			for (int k = 0; k < 4; k++)
    				System.out.print(ArvaaPaiva.palautaArvo(i,j,k) + " ");
    			System.out.println();
    		}

    		System.out.print("\nAnna 0 jos EI ja 1 jos KYLLƒ");
    		vastaus = input.nextInt();

    		if (vastaus == 1)
    			paiva += ArvaaPaiva.palautaArvo(i,0,0);
    	}
    	System.out.println("Syntym‰p‰iv‰si on " + paiva);


    }


}