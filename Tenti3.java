
/**
 * Tehtävä Tee ohjelma, joka kysyy käyttäjältä, kuinka monta lukua hän haluaa syöttää 
 * ja luo (kokonaisluku)taulukko. Lue käyttäjältä (kokonaisluku)arvot taulukkoon. 
 * Vain kolmella (3) jaolliset luvut ovat sallittuja. Jos käyttäjän antama luku ei ole kolmella 
 * jaollinen, on luku kysyttävä uudelleen - tarvittaessa toistuvasti. Tulosta lopuksi syötetyt luvut, 
 * lukujen summa, pienin ja suurin luvuista sekä lukujen keskiarvo. 
 * Tulostusesimerkki:
 * Kuinka monta lukua haluat syöttää? 5<enter>
 * Anna 1. luku: 9<enter>
 * Anna 2. luku: 18<enter>
 * Anna 3. luku: 8<enter>
 * Luku ei ole jaollinen kolmella. Anna 3. luku: 3<enter>
 * Anna 4. luku: 6<enter>
 * Anna 5. luku: 3<enter>
 * Luvut ovat: 9 18 3 6 3
 * Pienin on 3
 * Suurin on 18
 * Summa on 39
 * Keskiarvo on 7 (vaihtoehtoinen tulostus 7.8, jos käytät desimaalilukumuuttujaa! )
 *  
 * @author  bekshoi
 * @version 1.00 2020/10/25
 */

import java.util.Arrays;
import java.util.Scanner;

public class Tenti3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kuinka monta lukua haluat syöttää? ");
        int LukijaTauluko = input.nextInt();
        int [] Lukuja = new int [LukijaTauluko];

        for (int i=0;i<LukijaTauluko;i++) {
            System.out.print("Anna kolmella jaettava luku " + (i+1) + " :");
            Lukuja[i] = input.nextInt();
                while (Lukuja[i] % 3 > 0){
                System.out.println ("Ei kelpaa. Vain kolmella (3) jaolliset luvut ovat sallittuja ");
                System.out.print("Anna kolmella jaettava luku " + (i+1) + " :");
				Lukuja[i] = input.nextInt();
                }       
        }
        System.out.print("*****************************\n");
           
        // tulosta taulukon alusta
        for (int i=0;i<LukijaTauluko;i++){
            System.out.print("Luku " + (i+1) + " on " + Lukuja[i] + "\n");
            System.out.println();
        }
        System.out.print("*****************************\n");
        Arrays.sort(Lukuja); // lajittele nousevassa järjestyksessä
        System.out.println("Pienin on " + Lukuja[0]);
        System.out.println("Suurin on " + Lukuja[LukijaTauluko-1]);

        System.out.print("*****************************\n");
        int summ = 0;
        for (int i=0;i<LukijaTauluko; i++) {
                summ += Lukuja[i];}
                System.out.println("Summa on " + summ);
        System.out.print("*****************************\n");
        double keskiarvo;
        keskiarvo = summ/LukijaTauluko;
        System.out.printf("Keskiarvo on " + keskiarvo);
        System.out.print("\n*****************************\n");
        input.close();
        }
    }