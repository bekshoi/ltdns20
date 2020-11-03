/**
 * Tehtävä 2/1
 * 
 * Versio 1.0 Ohjelma kysyy asiakkaan etunimen, sukunimen ja iän vuosina. Sovellus 
 * kuittaa tiedot: "Syötetty tiedot asiakkaasta <etunimi sukunimi> , 
 * joka on <asiakkaan ikä> vuotta vanha".
 * 
 * Versio 2.0 Paitsi nimi- ja ikätiedon lisäksi kysytään, onko henkilöllä ajokortti (K tai E). 
 * Jos vastataan K, kuittaa sovellus esim. "Syötetty tiedot asiakkaasta x , joka on y vuotta vanha 
 * ja jolla on ajokortti". Jos vastataan E, tulostaa sovellus esim. "Syötetty tiedot asiakkaasta x, 
 * joka on y vuotta vanha ja jolla ei ole ajokorttia".
 * 
 * HUOMIO! Lisättiin myös tietueiden peräkkäinen tuotos tiedostoon csv-muodossa.
 * Tietojen syötön oikeellisuuden tarkistamiseksi, kun komentosarja on valmis, 
 * kutsutaan ulkoinen sovellus.
 * 
 * @author  bekshoi
 * @version 2.00 2020/9/8
 */

import java.util.*;
import java.io.*;

public class HenkiloTiedot20 {
     public static void main (String [] args) {
       
      Scanner input = new Scanner(System.in);
      System.out.print("Anna asiakkaan etunimi: "); 	// 
      String etunimi = input.nextLine();		// 
      System.out.print("Anna asiakkaan sukunimi: "); 	// 
      String sukunimi = input.nextLine();		// 
      System.out.print("Anna asiakkaan ika: ");		// 
      String ika = input.nextLine();			// 
      

      System.out.print("Onko henkilöllä ajokortti (K tai E) "); 	// 
      char vastaus = input.next().charAt(0);		// 
      
        switch (vastaus) {
            case 'k': 
            case 'K':
                System.out.println("Syotetty tiedot asiakkaasta " + etunimi + " " + sukunimi +  " , joka on " + ika + " vuotta vanha ja jolla on ajakorti.");
                break;
            case 'e': 
            case 'E': 
                System.out.println("Syotetty tiedot asiakkaasta " + etunimi + " " + sukunimi +  " , joka on " + ika + " vuotta vanha ja jolla ei ole ajakorti.");
                break;
            default:
                System.out.println("Virheellinen syote - pita ola k tai e. korjaa tiedot manuaalisesti ulkoisessa editorissa.");
                break;
        }
            
       try(FileWriter writer = new FileWriter("asiakkaat.csv", true))
       {
        
        boolean vilka = true; // IF-rakenteella tehdään CharToBoolean
        if (vastaus == 'K' || vastaus == 'k') 
            vilka = true; 
        else 
            vilka = false;
        
           writer.write(etunimi + ";" + sukunimi + ";" + ika + ";" + vilka); // Tehdään tiedoston csv-muodossa
           writer.append('\n');                                                // tulevaisuudessa voimme käyttää tiedostoa vientiin ulkoisiin järjestelmiin
           writer.flush();
       }
       catch(IOException ex){
            
           System.out.println(ex.getMessage());
       }
       try
       {      
        Runtime r = Runtime.getRuntime();
        Process P = null;
        String cmd[]={"excel","asiakkaat.csv"};

        P=r.exec(cmd);
        }
        catch(java.lang.Exception e) {
            System.out.println(e.getMessage());
        }

        input.close();
  }
}