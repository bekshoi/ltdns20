/**
 * Tehtävä 2. Asiakkaan terveydentilan alkukartoitusta varten tarvitaan ohjelma, 
 * joka lukee syötteinä käyttäjän painon (kiloina) ja pituuden (metreinä). 
 * Näiden tietojen perusteella ohjelma laskee ja tulostaa painoindeksin, joka 
 * saadaan laskettua kaavalla paino / ( pituus * pituus ), sekä ilmoittaa 
 * ko. henkilön painoindeksin.
 * 
 * Ohjelma laskee ja tulostaa painoindeksin, joka 
 * saadaan laskettua kaavalla paino / ( pituus * pituus ), sekä ilmoittaa 
 * ko. henkilön painoindeksin.
 * 
 * HUOMIO! Lisättiin myös tietueiden peräkkäinen tuotos tiedostoon csv-muodossa.
 * Tietojen syötön oikeellisuuden tarkistamiseksi, kun komentosarja on valmis, 
 * kutsutaan ulkoinen sovellus.
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/8
 */

import java.util.*;
import java.io.*;
import java.text.*;


public class PainoIndeksin {
  
     public static void main (final String[] args) {
         Locale.setDefault(Locale.ENGLISH);
         final Scanner input = new Scanner(System.in);
         System.out.print("Anna asiakkaan paino (kg): "); //
         final Double paino = input.nextDouble(); // Täällä on myös harkittava tietojen syöttamisen tarkistamista
                                                  // käytetyn muuttujatyypin mukaiseksi.
         System.out.print("Anna asiakkaan pituus (m): "); //
         final Double pituus = input.nextDouble(); // Täällä on myös harkittava tietojen syöttamisen tarkistamista
                                                   // käytetyn muuttujatyypin mukaiseksi.
         final Double painoindeksin = paino / (pituus * pituus);
         String x;
         final DecimalFormat df = new DecimalFormat("#.##"); // Pyöristää arvo

         x = df.format(painoindeksin); // Pyöristää arvo
         System.out.print("Asiakkaan painoindeksin on " + x);

         try (FileWriter writer = new FileWriter("painoindeksin.csv", true)) {
             writer.write(paino + ";" + pituus + ";" + x + ";");
             writer.append('\n');
             writer.flush();
         } catch (final IOException ex) {

             System.out.println(ex.getMessage());
         }

         final Runtime r = Runtime.getRuntime();
         Process p = null;
         final String cmd[] = { "notepad", "painoindeksin.csv" };
         try {
             p = r.exec(cmd);
         } catch (final java.lang.Exception e) {
         }
   }
}
