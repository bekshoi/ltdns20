/**
 * Tehtävä 6/4. Toteuta myös vastaava tuottojen seurantasovellus. Sovelluksessa kysytään  
 * ao. palveluista saadut tuotot viikon jokaisena päivänä (5*7 matriisi). Tulosta jokaisen
 *  yksittäisen palvelun viikon tuotto yhteensä sekä päivittäiset (kaikkien) palveluiden
 *  tuotot yhteensä. Tulosta lisäksi jokaiselle yksittäiselle palvelulle keskiarvotuotto / viikko 
 * sekä päiväkohtainen kaikkien palveluiden keskiarvotuotto.
 *
 * Versio 1.0 Sovelluksessa kysytään palveluista saadut tuotot viikon jokaisena päivänä (5*7 matriisi). 
 * Tulosta jokaisen  *  yksittäisen palvelun viikon tuotto yhteensä sekä päivittäiset (kaikkien) 
 * palveluiden  *  tuotot yhteensä. Tulosta lisäksi jokaiselle yksittäiselle palvelulle keskiarvotuotto
 * / viikko sekä päiväkohtainen kaikkien palveluiden keskiarvotuotto.
 * 
 * HUOMIO!!! Ajan säästämiseksi palvelujen nimiä ja tuloja koskevat tiedot on jo syötetty järjestelmään.
 * Tarvitaessa käyttäjän syötettä voidaan käyttää sama menetelmä kuin kolmasessa tehtävässä.
 * 
 * @author  bekshoi
 * @version 1.00 2020/10/20
 */
import java.util.*;
public class PalveluidenTuotot {

   public static void main(String [] args)
   {
    Scanner rider = new Scanner(System.in);
    System.out.println("Ajan saastamiseksi palvelujen nimia ja tuloja koskevat tiedot on jo syotetty jarjestelmaan.");
    System.out.println("Tarvitaessa käyttäjän syötettä voidaan käyttää sama menetelmä kuin kolmasessa tehtävässä.");
    System.out.println("Paina Enteri jatkaaksesi");
    rider.nextLine(); // odotaa Enteri
    // luo taulukko palvelujen nimillä
    String[] Palvelut = {"Palvelu N 1", "Palvelu N 2", "Palvelu N 3", "Palvelu N 4", "Palvelu N 5"};
    // aseta matriisin koko
    int PalvelujaLkm = 5; 
    int PaivaaLkm = 7;
    double [][] Lukumaare = new double [PalvelujaLkm] [PaivaaLkm];
        for (int i=0;i<PalvelujaLkm; i++) {
            System.out.println(Palvelut[i] + " : ");
            for (int j=0; j<PaivaaLkm;j++) {
                System.out.print("Tuotto " + (j+1) +":ssa viikonpaivassa : ");
                // täytä tuloarvojen taulukko satunnaisilla arvoilla
                Lukumaare [i] [j] = (double)(Math.floor (14 * Math.random () + 4));
                System.out.println(Lukumaare[i][j]);
           }
           System.out.print("******************************************\n"); 
        }

        // lasketaan päivittäiset palveluiden tuotot yhteensä 
        for (int j=0;j<7; j++) {
        double summ2 = 0.0;
        double keskiarvo2 = 0.0;
            for (int i=0; i<PalvelujaLkm;i++){ 
            summ2 += Lukumaare[i][j];
            keskiarvo2 = summ2/(i+1);
            }
        System.out.println("Palveluiden tuotto yhtensa " + (j+1) + ":ssa viikonpaivassa oli: " + summ2);
        System.out.printf("Palveluiden keskiarvotuotto" + (j+1) + " :ssa viikonpaivassa oli: %,10.2f\n", keskiarvo2);
        }
        System.out.print("******************************************\n");

        // lasketaan palvelun viikon tuotto yhteensä
        for (int i=0;i<PalvelujaLkm; i++) {
        double summ = 0.0;
        double keskiarvo = 0.0;
            for (int j=0; j<7;j++){ 
            summ += Lukumaare[i][j];
            keskiarvo = summ/(j+1);
            }
        System.out.println("Viikossa " + Palvelut[i] + " tuotto oli: " + summ);
        System.out.printf("Keskiarvotuotto viikossa " + Palvelut[i] + " oli: %,10.2f\n", keskiarvo);
        }

    System.out.println("******************************************\n");
    rider.close();		
   }
}