/**
 * Ohjelma
 * @author  bekshoi
 * @version 1.00 2020/9/8
 **/
import java.util.Scanner;
public class VaestonMuutos {
     public static void main (String [] args) {
      
      int vuodenaika;
      vuodenaika = 365 * 24 * 60; // minuttia luku vuodessa
      
      Scanner input = new Scanner(System.in);
      System.out.print("Maan vakiluku: "); 	// 
      int vakiluku = input.nextInt();		// 
      System.out.print("Kuinka monen minuutin valein syntyy lapsi: ");		// 
      int syntyyluku = input.nextInt();			// 
      System.out.print("Kuinka monen minuutin valein joku kuolee:  ");	// 
      int kuoleeluku = input.nextInt();	// 
      System.out.print("Kuinka monen minuutin valein saapuu maahanmuuttaja:  ");	// 
      int maahanmuuttuluku = input.nextInt();	//
      
      int synt_laps = vuodenaika / syntyyluku; //
      int kuol_ihm = vuodenaika / kuoleeluku; //
      int maahan_muttu = vuodenaika / maahanmuuttuluku; //
      
      vakiluku = vakiluku + synt_laps - kuol_ihm + maahan_muttu;

      System.out.println("Minuttia vuodessa on:" + " " + vuodenaika + " Vuodessa " + "lapsia syntyy:" + " " + synt_laps + " " + "ihmisia kuolee:" + " " + kuol_ihm + " " + "saapuu maahanmuuttaja:" + maahan_muttu);
	   System.out.println("Ihmisia on vuoden kuluttua:" + " " + vakiluku);
   
   }
}
