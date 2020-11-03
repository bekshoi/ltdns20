/**
 * Tehtävä 1. Tee ohjelmistoon ohjelma, joka kysyy asiakkaan etunimen, 
 * sukunimen ja iän vuosina. Sovellus kuittaa tiedot: ”Syötetty tiedot 
 * asiakkaasta <etunimi sukunimi> , joka on <asiakkaan ikä> vuotta vanha”.
 * 
 * Ohjelma kysyy asiakkaan etunimen, sukunimen ja iän vuosina. Sovellus 
 * kuittaa tiedot: ”Syötetty tiedot asiakkaasta <etunimi sukunimi> , 
 * joka on <asiakkaan ikä> vuotta vanha”.
 * 
 *
 * @author  bekshoi
 * @version 1.00 2020/9/8
 */
import java.util.Scanner;
public class HenkiloTiedot {
     public static void main (String [] args) {
       
      Scanner input = new Scanner(System.in);
      System.out.print("Anna nimesi: "); 	// 
      String nimi = input.nextLine();		// 
      System.out.print("Anna ikasi: ");		// 
      int ika = input.nextInt();			// 
      System.out.print("Anna palkkasi (muodossa X,XX tai X): ");	// Tässä tarvitse mietiä tietojen syöttämisen oikeellisuuden tarkistamisesta
      double palkka = input.nextDouble();	// 
	   System.out.println("Nimeni on " + nimi + ", ikani on " + ika + " ja toivon etta palkkani olisi " + palkka);
   

   }
}
