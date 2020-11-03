/**
 * Tehtävä 3/2
 * 
 * Versio 1.0 
 * Tee mökkivarausjärjestelmään apuohjelma, jossa luetaan merkkijonona euromääriä. 
 * Syöte puretaan indexOf()  ja substring() metodeja käyttäen euroiksi ja senteiksi ja 
 * näytetään käyttäjälle. Esim. Anna euromäärä: 245,65 Määrä on 245 euroa ja 65 senttiä.
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/20
 */

import java.util.*;

public class Hinta {
    public static void main(String[] args) {
        
    Scanner rider = new Scanner(System.in);
    String hinta;
    char[] taulu;	// merkkitaulukko
   
    try { 
    System.out.print("Mika on hinta : ");
    hinta = rider.nextLine();
    taulu = hinta.toCharArray();

    for (int i = 0; i < taulu.length; i++){
            if (Character.isLetter(taulu[i])) 
            { System.out.println("\nKäytetty virheelliset merkit  a - z");
              System.exit (0); }
            else if (Character.isWhitespace(taulu[i]))
            { System.out.println("\nKäytetty virheelliset merkit Välilyönti");
              System.exit (0);}
            else if (Character.isDigit(taulu[i]))
            {} }
                
                int x = hinta.length() - hinta.replaceAll("[;:.?!-'\"/(){}]", "").length();
                if (x >= 1)
                { System.out.println("\nKäytetty virheelliset merkit [;:.?!-'\"/(){}]");
                  System.exit (0);}
                else {}
                        
                        int index = hinta.indexOf(',');
                        if (index == -1)
                        { System.out.println("\nMerkkijonossa ei ole erotinta kokonaisluku- ja murto-osille, kuten pisteelle tai pilkulle");
                          System.exit (0);}
                        else if (hinta.length()-index >= 4 || hinta.length()-index <= 2)
                        { System.out.println("\nMurto-osa, enemmän tai vähemmän kuin 2 merkkiä");
                          System.exit (0);}
                        else 
                        { String hintaeuroa = hinta.substring(0,index);
                          String hintasenttiä = hinta.substring(index + 1,hinta.length());
                          System.out.println("\nMäärä on " + hintaeuroa + " euroa ja " + hintasenttiä + " senttiä.");} 
         }        

        catch(java.lang.Exception e) 
        { System.out.println(e.getMessage());
          System.out.println("\nHUOMIO! Poikkeus java.lang.Exception");} 
        
        rider.close();
    }
}