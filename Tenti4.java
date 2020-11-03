/**
 * Tee ohjelma, joka laskee pankkisiirroista tutun viitenumeron. Viitenumero koostuu 
 * runko-osasta ja tarkistenumerosta. Seuraavassa on esimerkki tarkistenumeron laskemisesta.
 * Lasketaan viitteen runko-osalle 12345 tarkistenumero. Kerrotaan oikealta alkaen runko-osan 
 * numerot vuorollaan painokertoimilla 7, 3, 1, 7, 3, 1, 7, jne. ja lasketaan saatujen tulojen summa. 
 *
 *                      runko-osa                             1     2     3     4     5
 *
 *                        painokertoimet                      3     7     1     3     7
 *
 *                                                            ---------------------------
 *
 *                     tulot                                   3    14    3    12    35 
 *
 * Yllä olevassa esimerkissä tulojen summa on 67. Tarkistenumero on tulojen summa vähennettynä 
 * seuraavasta täydestä kymmenestä (jos summa on tasakymmeniä, on tarkiste nolla).
 * Esimerkin tapauksessa tarkiste on 3. 
 * Alkuperäinen runko-osa ja tarkiste tulostetaan ruudulle.
 * Ohjelma kysyy käyttäjältä viitteen runko-osan ja sen jälkeen laskee tarkistenumeron 
 * ja tulostaa viitenumeron. 
 * Esim: 
 * Anna viitteen runko-osa : 325308000102798049011<enter> 
 * Viitenumero : 3253080001027980490117
 * 
 * @author  bekshoi
 * @version 1.00 2020/10/25
 */

import java.util.Scanner;

public class Tenti4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Merkijono; // tai Long?
        System.out.print("Anna viitteen runko-osa : ");
        Merkijono = input.nextLine();
        input.close();
        
        String[] words = Merkijono.split("");
        int[] s = {7, 3, 1};
        
        

    } 
}
