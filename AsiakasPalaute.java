/**
 * Tehtävä 2/2
 * 
 * Versio 1.00 Tee matkailuyrityksen asiakaspalautejarjestelmaan ohjelma, joka kysyy asiakkaan 
 * palveluista antamaa arvosanaa (0-5). Jos vastataan 0 ohjelma tulostaa: "Palaute oli huonoa", 
 * 1 "Palaute oli kohtalaista", 2 "Palaute oli tyydyttavaa", 3 "Palaute oli hyvaa", 
 * 4 "Palaute oli kiitettävaa", 5 "Palaute oli erinomaista"
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/8
 */

import java.util.*;
import java.io.*;

public class AsiakasPalaute {
    public static void main (String [] args) 
    {
        Scanner input = new Scanner(System.in);
        try 
        {  
            System.out.print("Anta palveluistamme arvosanaa (0-5) "); 
            int numero = input.nextInt();
         
            if (numero < 0 || numero > 5)
            {
                do 
                {
                System.out.println("Virheellinen arvosanaa. Ohjelma toimii, kunnes syotot arvon 0-5. Jos nappaimisto rikkoutuu etka voi syottaa vaadittua arvoa, syota vain mika tahansa merkki numeron sijaan. Tama lopettaa ohjelman suorittamisen");
                System.out.println("Yrita viela kerran. Anta palveluistamme arvosanaa (0-5) ");
                numero = input.nextInt();
                }
                while (numero < 0 || numero > 5);
            }
            else {}
            
            switch (numero) 
            {
            case 0: 
                System.out.println("Palaute oli huonoa");
                break;
            case 1: 
                System.out.println("Palaute oli kohtalaista");
                break;
            case 2: 
                System.out.println("Palaute oli tyydyttavaa");
                break;
            case 3: 
                System.out.println("Palaute oli hyvaa");
                break;
            case 4: 
                System.out.println("Palaute oli kiitettavaa");
                break;
            case 5: 
                System.out.println("Palaute oli erinomaista");
                break;
            default:
                break; 
            }
 
      try(FileWriter writer = new FileWriter("asiakaspalaute.csv", true))
      {       
          writer.write(numero + ";"); // Tehdään tiedoston csv-muodossa
          writer.append('\n'); // tulevaisuudessa voimme käyttää tiedostoa vientiin ulkoisiin järjestelmiin
          writer.flush();
      }
      catch(IOException ex){
           
          System.out.println(ex.getMessage());
      }
      try
      {      
       Runtime r = Runtime.getRuntime();
       Process P = null;
       String cmd[]={"excel","asiakaspalaute.csv"};

       P=r.exec(cmd);
       }
       catch(java.lang.Exception e) {
           System.out.println(e.getMessage());
       }
    }
       
    catch (InputMismatchException e) 
    {
    System.out.println("Syotetty virheellinen arvo, sallittu vain kokonaisluku, ohjelma paattyi virheella InputMismatchException");
    }
    input.close();

    }
}