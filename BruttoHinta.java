/**
 * Tehtävä 3. Tee yrityksen taloushallinnon järjestelmään ohjelma, 
 * joka kysyy käyttäjältä kustannuksen nettohinnan ja alv-prosentin. 
 * Tietojen perusteella ohjelma laskee ja tulostaa kustannuksen bruttohinnan.
 * 
 * Ohjelma kysyy käyttäjältä kustannuksen nettohinnan ja alv-prosentin. 
 * Tietojen perusteella ohjelma laskee ja tulostaa kustannuksen bruttohinnan.
 * 
 * HUOMIO! Lisäsin myös kuittin muodostuksen ja sen tuotoksen tekstitiedostoon.
 * Esimerki on otettu osoitteesta https://metanit.com/java/tutorial/6.8.php 
 *
 * @author  bekshoi
 * @version 1.00 2020/9/8
 */

import java.util.*;
import java.io.*;

public class BruttoHinta {     
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cost = 0; // tavaran nettohinta
        double rate = 0; // ALV prosentti
        double tax = 0; // ALV euroina
        double totalCost = 0; // tavaran bruttohinta
        System.out.print("Anna tavaran nettohinta: "); //  
        cost = input.nextDouble(); // Täällä on myös harkittava tietojen syöttamisen tarkistamista käytetyn muuttujatyypin mukaiseksi.
        System.out.print("Anna tavaran ALV prosentti: "); // 
        rate = input.nextDouble(); // Täällä on myös harkittava tietojen syöttamisen tarkistamista käytetyn muuttujatyypin mukaiseksi.
        tax = rate * cost / 100.0;

        totalCost = cost + tax; // Laske kokonaishinta.

        System.out.println("Tavaran bruttohinta on " + totalCost);

        try(FileWriter writer = new FileWriter("kuitti.txt", false))
        {
            writer.write("Tavaran nettohinta: " + cost + " euroa");
            writer.append('\n');
            writer.write("Tavaran ALV prosentti: " + rate + " %");
            writer.append('\n');
            writer.write("Tavaran bruttohinta: " + totalCost + " euroa");
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
    }
}