/**
 * Tehtävä 5/3 Kirjoita yrityksen  taloushallinnon ohjelmistoon funktio NelioSumma, 
 * joka palauttaa kahden desimaalilukuparametrinsa neliöiden summan.
 *  
 * Versio 1.0 funktio NelioSumma palauttaa kahden desimaalilukuparametrinsa neliöiden summan.
 * 
 * Versio 2.0 On välttämätöntä vahvistaa syötetiedot tai muuttaa tietotyyppi merkkijonoksi 
 * syötettäessä käyttäjän virheiden välttämiseksi. Käännä sitten tiedot vaadittuun muotoon. 
 * Parempi tehdä se käyttämällä Long-tyyppiä. EI VALMIS!!!! EI OLI TARPEKSI AIKAA!!!
 * 
 * @author  bekshoi
 * @version 1.00 2020/10/11
 */

import java.util.*;

public class DesimaliLukuNelioSumma {
    public static void main(String[]args) {
     
    try {
        Scanner input = new Scanner(System.in);
        System.out.print ("Anna desimalelukuluku1 : ");
        double luku1 = input.nextDouble();
        System.out.print ("Anna desimaleluku2 : ");
        double luku2 = input.nextDouble();
        System.out.print("Summa on " + NelioSumma(luku1,luku2));
        input.close();
        }
 
        catch(java.util.InputMismatchException e) 
        {
            System.out.println("Tietoja on syotetty vaarassa muodossa EXPTION!!!");}
        }

    public static double NelioSumma(double a, Double b){
        return a*a+b*b;
    }
}