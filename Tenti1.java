/**
 * Tehtävä (a) Määrittele sellaiset muuttujat, joihin voit tallentaa käyttäjän syöttämän 
 * tilin saldon ja syntymävuoden. Lue niihin arvot itse nimeämiesi funktioiden avulla. 
 * Funktiot kysyvät käyttäjältä halutun arvon ja palauttavat pyydetyn arvon funktion paluuarvona, 
 * funktioille ei välitetä parametreja. Tulosta muuttujien arvot Tulosta-funktiossa, 
 * jolle välität tiedot (syntymävuosi ja tilin saldo) parametreina. Tulosta-funktio 
 * ei palauta mitään arvoa.
 * @author  bekshoi
 * @version 1.00 2020/10/25
 */

import java.util.Scanner;

public class Tenti1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double TilinSaldo;
        int SyntymaVuosi;
        System.out.print("Syota tilin saldo: ");
        TilinSaldo = input.nextDouble();
        System.out.print("Syota sinun syntymavuosi: ");
        SyntymaVuosi = input.nextInt();
        System.out.printf("Sinun syntymavuosi " + SyntymaVuosi + " ja sinun tilin saldo on %,10.2f", TilinSaldo);
        input.close();
    } 
}