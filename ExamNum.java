/**
 * Tehtävä 2/3
 * 
 * Versio 1.0 Tee ohjelma, joka kysyy käyttäjältä tenttinumeron ja kertoo numeroa vastaavan arvioinnin:
 * 0=hylatty, 1=välttävä, 2=tyydyttävä, 3=kohtalainen, 4=hyva, 5=erinomainen. Oletetaan, että ohjelmaa 
 * käyttää valveutunut arvioija, mutta voit myös koodata ohjelmaan tarkistuksen, että tenttinumero on 0-5.
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/8
 */

import java.util.*;



public class ExamNum {
    public static void main (String [] args) 
    {
        Scanner input = new Scanner(System.in);
        try 
        {  
            System.out.print("Anna tenttinumero (0 - 5): "); 
            int numero = input.nextInt();
         
            if (numero < 0 || numero > 5)
            {
                do 
                {
                System.out.println("Virheellinen syote. Ohjelma toimii, kunnes syotot arvon 0-5. Jos nappaimisto rikkoutuu etka voi syottaa vaadittua arvoa, syota vain mika tahansa merkki numeron sijaan. Tama lopettaa ohjelman suorittamisen");
                System.out.println("Yrita viela kerran. Anna tenttinumero (0 - 5): ");
                numero = input.nextInt();
                }
                while (numero < 0 || numero > 5);
            }
            else {}
            

            switch (numero) 
            {
            case 0: 
                System.out.println("Hylatty");
                break;
            case 1: 
                System.out.println("Valttava");
                break;
            case 2: 
                System.out.println("Tyydyttava");
                break;
            case 3: 
                System.out.println("Kohtalainen");
                break;
            case 4: 
                System.out.println("Hyva");
                break;
            case 5: 
                System.out.println("Erinomainen");
                break;
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
