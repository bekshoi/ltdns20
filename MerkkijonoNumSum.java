/**
 * Tehtävä 3/4
 * 
 * Versio 1.0 Tee ohjelma, joka laskee käyttäjältä pyydetyssä 
 * merkkijonossa olevien numeromerkkien summan. 
 * Oletetaan, että merkkijonon kaikki merkit ovat numeroita (0-9), 
 * joiden summa siis lasketaan.
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/20
 */

import java.util.*;

public class MerkkijonoNumSum {
    public static void main(String[] arg) {
        
        Scanner rider; // luoda olio
        rider = new Scanner(System.in);
        System.out.print("Anna merkkijono luvusta (0-9) : ");
        String merkkijono = rider.nextLine();
        char[] taulu;
        taulu = merkkijono.toCharArray();

    for (int i = 0; i < taulu.length; i++) 
    { if (Character.getNumericValue(taulu[i]) < 0)
            { System.out.println("\nKäytetty virheelliset merkit esim. @£$§½");
              System.exit (0); }
            else if (Character.isWhitespace(taulu[i]))
            { System.out.println("\nKäytetty virheelliset merkit Välilyönti");
              System.exit (0); }
            else if (Character.isLetter(taulu[i])) 
            { System.out.println("\nKäytetty virheelliset merkit  a - z");
              System.exit (0); } 
            else if (Character.isDigit(taulu[i]))
            { } }
                
                int x = merkkijono.length() - merkkijono.replaceAll("[;:.,?!-'\"/(§½){}]", "").length();
                if (x >= 1) 
                {   System.out.println("\nKäytetty virheelliset merkit [;:.,?!-'\"/(½){}]");
                    System.exit (0); } 
                else {} 

                int sum = 0;
                    for (int y = 0; y < taulu.length; y++) {
                    sum = sum + Character.getNumericValue(taulu[y]);}

                        System.out.print("\n" + sum);

        rider.close();    
    }
}