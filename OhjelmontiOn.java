/**
 * Harjoitelutehtävä 1. OhjelmontiOnKivaTaiEi
 *
 * @author  bekshoi
 * @version 1.00 2020/9/8
 */
import java.util.Scanner;
public class OhjelmontiOn {
     public static void main (String [] args) {
       
      Scanner lukija = new Scanner(System.in);
      System.out.print("Onko ohjelmonti kiva: (k/e) "); 	// 
      char vastaus = lukija.next().charAt(0);		// 

        switch (vastaus) {
            case 'k': 
            case 'K': 
                System.out.println("Hyvaa homma!");
                break;
            case 'e': 
            case 'E': 
                System.out.println("Harjoitele");
                break;
            default:
                System.out.println("Virheellinen syote - pita ola k tai e");
                break;
        }
   }
}
