/**
 * Tehtävä 6/3. Tee palveluiden käytön viikoittainen seurantasovellus. 
 * Sovelluksessa kysytään  viiden palvelun (teht. 2) käyttökerrat viikon 
 * jokaisena päivänä (5*7 matriisi). Tulosta jokaisen palvelun viikon käyttökerrat
 * yhteensä sekä päivittäiset palveluiden käyttökerrat yhteensä.
 *
 * Versio 1.0 Sovelluksessa kysytään  viiden palvelun (teht. 2) käyttökerrat viikon 
 * jokaisena päivänä (5*7 matriisi). Tulosta jokaisen palvelun viikon käyttökerrat
 * yhteensä sekä päivittäiset palveluiden käyttökerrat yhteensä.
 * 
 * @author  bekshoi
 * @version 1.00 2020/10/20
 */
import java.util.*;
public class KayttoKerrat {

   public static void main(String [] args)
   {
       Scanner rider = new Scanner(System.in);
       System.out.print("Syota palvelujen lukumaara: ");
       int PalvelujaLkm = rider.nextInt();
       String [] Palvelut = new String [PalvelujaLkm];
       int [][] Lukumaare = new int [PalvelujaLkm] [7];
        for (int i=0; i<PalvelujaLkm; i++) {
            System.out.print ("Syota Palvelu N" + (i+1) + " nimi: ");
            Palvelut[i]=rider.next();
        } 
        for (int i=0;i<PalvelujaLkm; i++) {
            System.out.println("Syota Palvelu N" + (i+1) + " " + Palvelut[i] + " : ");
            for (int j=0; j<7;j++) {
                System.out.print("kayttokertta lukumaara " + (j+1) +":ssa viikonpaivassa : ");
                Lukumaare[i][j]=rider.nextInt();
           }
        }
        // lasketaan päivittäiset palveluiden käyttökerrat yhteensä 
        for (int j=0;j<7; j++) {
        int summ2=0;
            for (int i=0; i<PalvelujaLkm;i++){ 
            summ2 += Lukumaare[i][j];
            }
        System.out.println("Kaytokertta lukumaara yhtensa " + (j+1) + ":ssa viikonpaivassa oli: " + summ2);
        }
        // lasketaan palvelun viikon käyttökerrat yhteensä
        for (int i=0;i<PalvelujaLkm; i++) {
        int summ=0;
            for (int j=0; j<7;j++){ 
            summ += Lukumaare[i][j];
            }
        System.out.println("Viikossa palvelu " + Palvelut[i] + " kayttokertta lukumaara oli: " + summ);
    }
    rider.close();		
   }
}