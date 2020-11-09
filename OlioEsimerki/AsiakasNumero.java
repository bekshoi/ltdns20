import java.util.*;
/**
 * @(#)AsiakasNumero.java
 * Ohjelma testaa onko asiakasnumero oikeassa muodossa.
 *
 * @author
 * @version 1.00 2019/3/25
 */
public class AsiakasNumero
{
   public static void main(String [] args)
   {
		Scanner lukija = new Scanner (System.in);
		String asNumero;
	  
		System.out.print("Anna asiakasnumero muodossa KKKNNNN\n(KKK = kirjaimia, NNNN = numeroita)");
		asNumero = lukija.nextLine();
		// tarkastetaan numero
		boolean vielaKelvollinen = true; // lippu
		int i = 0;                        // ohjausmuuttuja
      
		// Testataan pituus
		if (asNumero.length() != 7)
			vielaKelvollinen = false;
         
		// testataan ensimmäiset kolme kirjainta
		while (vielaKelvollinen && i < 3)
		{
			if (!Character.isLetter(asNumero.charAt(i)))
				vielaKelvollinen = false;
			i++;
		}
      
		// Testataan neljä viimeistä merkkiä
		while (vielaKelvollinen && i < 7)
		{
			if (!Character.isDigit(asNumero.charAt(i)))
				vielaKelvollinen = false;
			i++;   
		}      
		if (vielaKelvollinen)
		{
			System.out.println ("Kelvollinen asiakasnumero");
		}
		else
		{  
			System.out.println ("Asiakasnumero ei ole kelvollinen. Tässä esimerkki: ABC1234. ");
		}
      
   }
   
}