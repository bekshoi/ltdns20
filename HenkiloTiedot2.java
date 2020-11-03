/**
 * Tehtävä 1. Tee ohjelmistoon ohjelma, joka kysyy asiakkaan etunimen, 
 * sukunimen ja iän vuosina. Sovellus kuittaa tiedot: "Syötetty tiedot 
 * asiakkaasta <etunimi sukunimi> , joka on <asiakkaan ikä> vuotta vanha".
 * 
 * Version 1.0 Ohjelma kysyy asiakkaan etunimen, sukunimen ja iän vuosina. Sovellus 
 * kuittaa tiedot: "Syötetty tiedot asiakkaasta <etunimi sukunimi> , 
 * joka on <asiakkaan ikä> vuotta vanha".
 * 
 * Version 2.0. Lisättiin myös tietueiden peräkkäinen tuotos tiedostoon csv-muodossa.
 * Tietojen syötön oikeellisuuden tarkistamiseksi, kun komentosarja on valmis, 
 * kutsutaan ulkoinen sovellus.
 * 
 * @author  bekshoi
 * @version 2.00 2020/9/8
 */

import java.util.Scanner;
import java.io.*;

public class HenkiloTiedot2 {
     public static void main (String [] args) {
       
      Scanner input = new Scanner(System.in);
      System.out.print("Anna asiakkaan etunimi: "); 	// 
      String etunimi = input.nextLine();		// 
      System.out.print("Anna asiakkaan sukunimi: "); 	// 
      String sukunimi = input.nextLine();		// 
      System.out.print("Anna asiakkaan ika: ");		// 
      String ika = input.nextLine();			// Try catch ???

	   System.out.println("Syotetty tiedot asiakkaasta " + etunimi + " " + sukunimi +  " ,joka on " + ika + " vuotta vanha");
    
       try(FileWriter writer = new FileWriter("asiakkaat.csv", true))
       {
           writer.write(etunimi + ";" + sukunimi + ";" + ika + ";");
           writer.append('\n');
           writer.flush();
       }
       catch(IOException ex){
            
           System.out.println(ex.getMessage());
       }
       
        Runtime r = Runtime.getRuntime();
        Process p = null;
        String cmd[]={"excel","asiakkaat.csv"};
        try
        {
        p=r.exec(cmd);
        }
        catch(java.lang.Exception e) {}
   }
}
