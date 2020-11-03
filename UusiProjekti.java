/**
 * Uusi projekti
 *
 * @author  bekshoi
 * @version 1.00 2020/9/8
 */
import java.util.Scanner;
public class UusiProjekti {
     public static void main (String [] args) {
       
      Scanner lukija = new Scanner(System.in);
      System.out.println("Anna kokonaisluku: "); 	// 
      int luku = lukija.nextInt();		// 

      if (luku<0)
      System.out.println("Luku on negativinen");
      else if (luku>0)
      System.out.println("Luku on positivinen");
      else
      System.out.println("Luku on nolla");
   }
}
