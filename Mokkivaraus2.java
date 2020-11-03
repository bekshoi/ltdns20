/**
 * Tehtävä 2/3
 * 
 * Versio 1.00 Tee matkailuyrityksen mökkivarausjärjestelmään apuohjelma, joka kysyy käyttäjältä numeron 1-12 
 * ja tulostaa se perusteella kuukauden (1 =tammikuu, 2 = helmikuu jne...). Sovelluksen on annettava 
 * virheilmoitus, jos käyttäjä syöttää väärän kuukauden (esim. 13). 
 * 
 * Versio 2.00 "Switch - case" - rakenne korvataan taulukolla. Tarkistetaan syötevirheitä ja poikkeuksia,
 * käytetään myös "If - else" -rakennetta ja "do - while" -silmukkaa
 *  
 *  
 * 
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/8
 */

import java.util.*;
public class Mokkivaraus2 {
    public static void main(String[] args) {
        Kuukausi[] shelf = new Kuukausi[12];
        shelf[0] = new Kuukausi("Tammikuu");
        shelf[1] = new Kuukausi("Helmikuu");
        shelf[2] = new Kuukausi("Maaliskuu");
        shelf[3] = new Kuukausi("Huuhtikuu");
        shelf[4] = new Kuukausi("Toukokuu");
        shelf[5] = new Kuukausi("Kesakuu");
        shelf[6] = new Kuukausi("Heinakuu");
        shelf[7] = new Kuukausi("Elokuu");
        shelf[8] = new Kuukausi("Syyskuu");
        shelf[9] = new Kuukausi("Lokakuu");
        shelf[10] = new Kuukausi("Marraskuu");
        shelf[11] = new Kuukausi("Joulukuu - JOOHOOO");
        
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
        
        System.out.println(shelf[numero-1].title);
    }
        catch (InputMismatchException e) 
        {
        System.out.println("Syotetty virheellinen arvo, sallittu vain kokonaisluku, ohjelma paattyi virheella InputMismatchException");
        }
        
        input.close();
    }
}
 
class Kuukausi {
    String title;
    Kuukausi(String title) {
        this.title = title;
    }
}