import java.util.*;
/**
 * @(#)PaivayksenOsat.java
 * Ohjelmassa pilkotaan tietyn formaatin mukainen päiväys osikseen käyttäen StringTokenizer -luokkaa. 
 *
 * @author
 * @version 1.00 2019/3/25
 */
public class PaivayksenOsat
{
	public static void main(String [] args)
   {
		Scanner lukija = new Scanner (System.in);
		String paivays;
		String kuukausi;
		String paiva;
		String vuosi;
	
		System.out.print("Anna paivays muodossa MM/DD/YYYY: ");
		paivays = lukija.nextLine (); // luetaan merkkijono
    
		StringTokenizer strOsat = new StringTokenizer(paivays, "/");
		// erotellaan osat
		kuukausi = strOsat.nextToken();
		paiva = strOsat.nextToken();
		vuosi = strOsat.nextToken();   
		
		System.out.print("Paivays muodossa dd.mm.yyyy on " + paiva + "." + kuukausi + "." + vuosi);
   }
   
}