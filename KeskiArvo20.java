/**
 * 
 * Tehtävä 4/2 Tee yrityksen taloushallinnon järjestelmään ohjelma, 
 * joka kysyy käyttäjältä kuinka monta kustannusta (desimaaliluku) 
 * syötetään sekä kysyy em. luvut. Ohjelma laskee syötettyjen kustannusten keskiarvon.
 * 
 * Versio 2. Tiedot syötetään merkkijonotyypin muodossa, tarkistetaan tietojen syötön oikeellisuus,
 * muunnetaan Long-tyypiksi, jotta silmukan aritmeettiset virheet voidaan poistaa desimaalimuotoja 
 * käytettäessä. Tiedot myös tallennetaan ja tulostetaan tiedostoon vietäviksi ulkoisiin järjestelmiin.
 * 
 * @author  bekshoi
 * @version 2.00 2020/9/25
 * 
 */

import java.util.*;
import java.text.*;
import java.io.*;

public class KeskiArvo20 {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        StringBuffer input2 = new StringBuffer();
        Scanner input1 = new Scanner(System.in);
        String AllKustannus;
        double summa1 = 0.0;

        try {
        System.out.println("Syoteta lukumaara : ");
        int lkm = input.nextInt();
        int i = 1;
        long summa = 0;
        
        while (i <= lkm) {
            
            System.out.println("Syoteta kustannus ###,## muodossa " + i + " : ");  
            String kustannus = input1.nextLine(); // hyvaa tyyppi String tassa, small chanse to Exeption, helpo convertoida toLong
            // Tietojen tarkistuksen tarkistukset
                if 
                (kustannus.length() - kustannus.replaceAll("[,.]","").length() == 0 || // jos ei ole pilkku tai piste
                kustannus.length() - kustannus.replaceAll("[,.]","").length() > 1 || // jos lian paljon pisteet tai pilkkuut
                kustannus.length() - kustannus.replaceAll("[^\\d,.]","").length() > 1 || //jos merkijonnossa muita merkeja paitsi luvut tai pisteet tai pilkkut 
                (kustannus.length()-kustannus.indexOf(',') != 3 && kustannus.length()-kustannus.indexOf('.') != 3)) // jos piste tai pilkku on väärässä paikassa
                {
                System.out.print("\nTietoja on syotetty vaarassa muodossa tai joissa on virheellisia merkkeja");
                System.out.print("Tietoja ei tallennettu. Anna uudestaan ​​muodossa ###.##");
                continue;
                }
                else 
                {
                
                input2.append(kustannus); // talentaa syötettu tietojen 
                input2.append(";");
                String count = kustannus.replaceAll("[,.]","");
                long kustannusL = Long.parseLong(count); // Long hyvaa tassa, ei ole ei aritmeettisia virheitä
                summa = summa + kustannusL;
                i++; 
                }
        }
        
        AllKustannus = input2.toString();
        summa1 = (double)summa/100; // palauttaa tiedot desimaalimuodossa
        double keskiarvo1 = (double)summa1/lkm; // palauttaa tiedot desimaalimuodossa

        DecimalFormat myFormatter = new DecimalFormat("###,###.##"); //
        // DecimlFormat tulostettu
        System.out.printf("\nDecimlFormat tulostettu");
        System.out.printf("\n***********************");
        System.out.print("\nKaikki kustanukset " + AllKustannus);
        System.out.printf("\nKustannusten summa on " + myFormatter.format(summa1)); 
        System.out.printf("\nKustannusten lukumaara on " + lkm + " ja keskiarvo on " + myFormatter.format(keskiarvo1));
        // TavallinenFormat tulostettu
        System.out.printf("\nTavallinenFormat tulostettu");
        System.out.printf("\n***********************");
        System.out.print("\nKaikki kustanukset " + AllKustannus);
        System.out.printf("\nKustannusten summa on %,10.2f", summa1);
        System.out.printf("\nKustannusten lukumaara on " + lkm + " ja keskiarvo on %,10.2f", keskiarvo1);

        try(FileWriter writer = new FileWriter("kustannus.csv", true))
    {
        writer.write(AllKustannus + summa1 + ";"); // Tehdään tiedoston csv-muodossa
        writer.append('\n'); // tulevaisuudessa voimme käyttää tiedostoa vientiin ulkoisiin järjestelmiin
        writer.flush();
    }
   
    catch(IOException ex)
    {
        System.out.println(ex.getMessage());
    }

    try
    {      
        Runtime r = Runtime.getRuntime();
        Process P = null;
        String cmd[]={"notepad","kustannus.csv"};
        P=r.exec(cmd);
    }

    catch(java.lang.Exception e) 
    {
        System.out.println(e.getMessage());
    } 
}
        catch(java.util.InputMismatchException e) 
        {
            System.out.println("Tietoja on syotetty vaarassa muodossa EXPTION!!!");
        }
    input.close();       
    }
}