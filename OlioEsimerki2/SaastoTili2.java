/**
 * @(#)SaastoTili.java
 *
 * @author
 * @version 1.00 2019/6/14
 */

import java.util.Scanner;
/**
 *  Luokka mallintaa Saastotilia tietylla vuosikorolla ja saldolla. 
 *
 */
public class SaastoTili2 {
    private double vuosiKorko;
    private double saldo;
/**
 * SaastoTili alkusaldolla. 
 * @param saldo 
 */
    public SaastoTili2(double saldo) {
        this.saldo = saldo;
    }
/**
 * SaastoTili toisen tilin alkusaldolla. 
 * @param Saastotili toinen tili, jonka saldolla alustetaan 
 */
    public SaastoTili2(SaastoTili2 tili) {
        this.saldo = tili.getSaldo();
    }
/**
 * Vuosikoron asetus
 * @param vuosiKorko 
 */
    public void setVuosiKorko(double vuosiKorko) {
        this.vuosiKorko = vuosiKorko;
    }

   /**
    * Summan talletus tilille.
    * @param summa 
    */
    public void talleta(double summa) {
        this.saldo += summa;
        System.out.println("Talletettiin " + summa);
    }
/**
 * Summan nosto tililta. 
 * @param summa 
 */
    public void nosta(double summa) {
        if (summa <= this.saldo) {
            this.saldo -= summa;
            System.out.println("Nostettiin " + summa);
        }
        else {
            System.out.println("Tililla ei ole riittavasti katetta.");
            System.out.println("Nostettiin " + this.saldo);
            this.saldo = 0;
            
        }
    }
    /**
     * Kuukausikoron lisays. 
     */
    public void lisaaKorko() {
        this.saldo += (this.saldo * this.vuosiKorko / 100.0) / 12;
    }
    /**
     * Saldon tarkistus. 
     * @return 
     */
     public double getSaldo() {
        return saldo;
    }
    /**
     * Testipaaohjelma. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tama ohjelma kasittelee saastotilia.");
		SaastoTili2 eka = new SaastoTili2(10000);
        SaastoTili2 toka = new SaastoTili2(eka);
        System.out.println("toisen tilin saldo on " + toka.getSaldo());
		/**
        System.out.println("Anna tilin alkusaldo: ");
        double saldo = input.nextDouble();
        SaastoTili tili = new SaastoTili(saldo);
        System.out.println("Anna tilin vuosikorko: ");
        double korko = input.nextDouble();
        tili.setVuosiKorko(korko);
        System.out.println("Kuinka monen kuukauden tapahtumat annat: ");
        int kk = input.nextInt();
        double raha;
        for (int i = 0; i < kk; i++) {
            System.out.println("Kuukausi " + (i+1));
            System.out.println("Anna talletettavan rahan maara: ");
            raha = input.nextDouble();
            tili.talleta(raha);
            System.out.println("Anna nostettavan rahan maara: ");
            raha = input.nextDouble();
            tili.nosta(raha);
            tili.lisaaKorko();
            System.out.printf("Tililla on rahaa %.2f",tili.getSaldo());
            System.out.println("\n");
        }
		*/
    }
    
}