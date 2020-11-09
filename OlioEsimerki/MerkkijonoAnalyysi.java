import java.util.*;
/**
 * @(#)MerkkijonoAnalyysi.java
 * Ohjelmassa lasketaan merkkijonossa olevat merkit, numerot ja välilyönnit. 
 *
 * @author
 * @version 1.00 2019/3/25
 */

public class MerkkijonoAnalyysi
{
   public static void main(String [] args)
   {
		Scanner lukija = new Scanner (System.in);
		String input;
		char[] taulu;	// merkkitaulukko
		int kirjaimet = 0;
		int numerot = 0;
		int tyhjat = 0;
      
		System.out.print("Anna merkkijono: ");
		input = lukija.nextLine (); // luetaan merkkijono
		taulu = input.toCharArray(); // merkkijonoa voidaan käsitellä taulukkona, jonka alkiona on yksi merkki
		for (int i = 0; i < taulu.length; i++)
		{
			if (Character.isLetter(taulu[i]))
				kirjaimet++;
			else if (Character.isDigit(taulu[i]))
				numerot++;
			else if (Character.isWhitespace(taulu[i]))
				tyhjat++;      
		}
      
      System.out.println ("Merkkijonossa on kirjaimia " + kirjaimet + " numeroita " + numerot + " ja tyhjiä " + tyhjat);
       
   }
}