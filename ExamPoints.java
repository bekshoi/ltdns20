/**
 * Tehtävä 2/4
 * 
 * Versio 1.0 Tee ohjelma, joka kysyy käyttäjältä tenttipisteet ja kertoo pisteitä vastaavan arvioinnin:
 * < 50 hylatty, 50-60 välttävä, 61-70 tyydyttävä, 71-80 kohtalainen, 81-90 hyva, >= 91 erinomainen
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/8
 */

import java.util.*;
public class ExamPoints 
{
    public static void main (String [] args) 
    {
        try 
        {  
            Scanner input = new Scanner(System.in);
            System.out.print("Syota tenttiin saatu pisteiden maara: "); 	// 
            int numero = input.nextInt();		// 
        
            if (numero >= 91)
            {
                System.out.println("Erinomainen");
            }
            else if (numero >= 81 && numero <= 90)
            {
                System.out.println("Hyva");
            }
            else if (numero >= 71 && numero <= 80) 
            {
                System.out.println("Kohtalainen");
            }
            else if (numero >= 61 && numero <= 70)
            {
                System.out.println("Tyydyttava");
            }
            else if (numero < 50)
            {
                System.out.println("Hylatty");
            }
            else
            {} 

            input.close(); 
        }
       
        catch (InputMismatchException e) 
        {
        System.out.println("Syotetty virheellinen arvo, sallittu vain kokonaisluku, ohjelma paattyi virheellä InputMismatchException");
        }
        
    }
}
