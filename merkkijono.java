/**
 * Tehtävä 1. Tee ohjelma, joka kysyy käyttäjältä merkkijonon: 
 * Ohjelma tulostaa merkkijonon pituuden ja viimeisen merkin.
 * 
 * HUOM! Tuotos tule tiedostoon txt-muodossa. 
 * Kun komentosarja on valmis, kutsutaan ulkoinen sovellus.
 *
 * @author  bekshoi
 * @version 1.00 2020/9/8
 */

import java.util.*;
import java.io.*;

public class merkkijono {     
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kirjoita merkkijono: "); //  
        String merkkijono = input.nextLine(); // 
        int pituus = merkkijono.length(); // Palauttaa merkijonon pituuden
        int position = pituus - 1;
        char viimeisenMerkki = merkkijono.charAt(position);
        System.out.println(merkkijono);
        System.out.println("Merkkijonon pituuden on " + pituus + " ja viimeisen merkin on " + viimeisenMerkki);

        try(FileWriter writer = new FileWriter("raporti.txt", false))
        {
            writer.write("Merkkijonon pituuden on " + pituus);
            writer.append('\n');
            writer.write("Viimeisen merkin on " + viimeisenMerkki);
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
        Runtime r = Runtime.getRuntime();
        // Process p = null;
        String cmd[]={"notepad","raporti.txt"};
        try
        {
        //p= 
        r.exec(cmd);
        }
        catch(java.lang.Exception e) {}
        input.close();
    }
}