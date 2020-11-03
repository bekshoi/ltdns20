/**
 * Tehtävä 5/2 Tee asiakastarrojen tulostamista varten metodi nimeltään Tulosta, joka tulostaa:
 * Asiaa!
 * Asiaa!
 * kutsulla:
 * Tulosta("Asiaa!",2); eli metodi on muotoa Tulosta(merkkijono, lkm_joka_tulostetaan)
 * 
 * Versio 1.0 Tulosta("Asiaa!",2); eli metodi on muotoa Tulosta(merkkijono, lkm_joka_tulostetaan)
 * Versio 2.0 pyytää käyttäjältä tarron nimi ja tulostetava rivia lukumäärä 
 * 
 * @author  bekshoi
 * @version 2.00 2020/10/11
 */

 import java.util.*;
 public class AsiakasTarro {
    public static void main(String [] args) {
        
        // versio 2.0 pyytää käyttäjältä tarron nimi ja tulostetava rivia lukumäärä 
        Scanner input = new Scanner(System.in);
        System.out.println ("Anna tarro nimi: "); // Kysyy merkijono
        String nimi = input.nextLine();
        System.out.println ("Anna tarron lukumaare: "); // Kysyy lukumaare
        int lkm = input.nextInt();
        Tulosta(nimi,lkm);
        
        // versio 1.0 tulosteita määriteltyjen ehtojen mukaisesti
        Tulosta("Asiaa!",2); 

        input.close();
     }
        public static void Tulosta (String merkijono, int lkm_joka_tulostetaan){

                for (int i=0; i < lkm_joka_tulostetaan; i++)
                    System.out.print(merkijono + "\n");
                    System.out.println();
        }      
 }