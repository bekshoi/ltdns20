/**
 * Tehtävä 2/2
 * TEST TEST@
 * Versio 1.0 Tee ohjelma, joka pyytää käyttäjältä numeron ja toteaa
 * sopiva, jos 1-10 tai ei kelpaa, jos jotakin muuta.
 * 
 * Versio 2.0 Pasan ja tikkujen rakenne korvataan silmukalla, 
 * käyttäjällä on kolme yritystä, poikkeuskäsittely lisätään.
 * 
 * @author  bekshoi
 * @version 2.00 2020/9/8
 */

import java.io.*; 
import java.util.*;
public class ArvojenAlue2 {
    public static void main (final String [] args) throws IOException {
    
        int j = 3; // käytäjällä on kolme yrityksiä 
        Scanner input = new Scanner(System.in);

        try 
        { 
            while (j > 0)
            {
                    
                    System.out.print("Kirjoita numero: "); // pyytää käyttäjältä numeron
                    int numero = input.nextInt(); input.nextLine();// julista muuttuja
                    

                    if (numero >= 0 && numero <= 10 && j>0) 
                    {
                        System.out.println("Arvojen sopii!");
                    break;
                    } 
                    else if (j>1)
                    {
                        System.out.println("Ei kelpaa!, yrita viela kerran");
                        System.out.println("Sinulla on " + (j-1) + " yritysta jaljella");
                    }
                    else
                    {
                        System.out.println("Olet yrittanyt loppuun, ohjelma on paattynyt");
                    }
            j--; 
            }
        }
        catch (InputMismatchException e) 
        {
        System.out.println("Syotetty virheellinen arvo, sallittu vain kokonaisluku, ohjelma paattyi virheella InputMismatchException");
        }
        input.close();
    }
}