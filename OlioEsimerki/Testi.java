/**
 * @(#)Testi.java
 *
 * Satunnaislukujen testaaminen kahdella Random-luokan oliolla, kun "siemenluku" on sama
 * @author
 * @version 1.00 2011/3/5
 */

import java.util.*;

public class Testi {
       public static void main(String[] args) {
       	Random satu1 = new Random(3);
       	System.out.print ("Muuttujasta satu1: ");
       	for (int i = 0; i < 10; i++)
       		System.out.print(satu1.nextInt(1000) + " ");
       	Random satu2 = new Random(3);
       	System.out.print ("\nMuuttujasta satu2: ");
       	for (int i=0; i < 10; i++)
       		System.out.print(satu2.nextInt(1000) + " ");

   }
}
