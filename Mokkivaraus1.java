/**
 * Tehtävä 2/3
 * 
 * Versio 1.00 Tee matkailuyrityksen mökkivarausjärjestelmään apuohjelma, joka kysyy käyttäjältä numeron 1-12 
 * ja tulostaa se perusteella kuukauden (1 =tammikuu, 2 = helmikuu jne...). Sovelluksen on annettava 
 * virheilmoitus, jos käyttäjä syöttää väärän kuukauden (esim. 13). 
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/8
 */

import java.util.*;

public class Mokkivaraus1 {
    public static void main (String [] args) 
    {
        Scanner input = new Scanner(System.in);
        try 
        {  
            System.out.print("Syote kuukauden numero (1-12) "); 
            int numero = input.nextInt();
         
            if (numero < 1 || numero > 12)
            {
                do 
                {
                System.out.println("Virheellinen kuukauden numero. Ohjelma toimii, kunnes syotot arvon 1-12. Jos nappaimisto rikkoutuu etka voi syottaa vaadittua arvoa, syota vain mika tahansa merkki numeron sijaan. Tama lopettaa ohjelman suorittamisen");
                System.out.println("Yrita viela kerran. Syote kuukauden numero (1-12) ");
                numero = input.nextInt();
                }
                while (numero < 1 || numero > 12);
            }
            else {}
            
            switch (numero) 
            {
            case 1: 
                System.out.println("Tammikuu");
                break;
            case 2: 
                System.out.println("Helmikuu");
                break;
            case 3: 
                System.out.println("Maaliskuu");
                break;
            case 4: 
                System.out.println("Huuhtikuu");
                break;
            case 5: 
                System.out.println("Toukokuu");
                break;
            case 6: 
                System.out.println("Kesakuu");
                break;
            case 7: 
                System.out.println("Helmikuu");
                break;
            case 8: 
                System.out.println("Elokuu");
                break;
            case 9: 
                System.out.println("Syyskuu");
                break;
            case 10:
                System.out.println("Lokakuu");
            case 11:
                System.out.println("Marraskuu");
            case 12:
                System.out.println("JOLUKUU - JOHOOOO!!!"); // paasiaismuna :)
            default:
                break; 
            }
    }
       
    catch (InputMismatchException e) 
    {
    System.out.println("Syotetty virheellinen arvo, sallittu vain kokonaisluku, ohjelma paattyi virheella InputMismatchException");
    }
    input.close();

    }
}