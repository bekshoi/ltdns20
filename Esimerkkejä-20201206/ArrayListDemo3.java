import java.util.ArrayList; // luokka tarvitsee t‰m‰n
/**
   Ohjelma esittelee ArrayList:n k‰yttˆ‰
*/
public class ArrayListDemo3
{
   public static void main(String [] args)
   {
      // luodaan ArrayList nimille
      ArrayList<String> nimiLista = new ArrayList<String>();
      
      // lis‰t‰‰n nimi‰
      nimiLista.add("Janne");
      nimiLista.add("Kaarina");
      nimiLista.add("Viljami");
      
      // n‰ytet‰‰n listan alkiot
      for (int indeksi = 0; indeksi < nimiLista.size(); indeksi++)
         System.out.println("Paikassa: " + indeksi + " Nimi: " + nimiLista.get(indeksi));
         
      // poistetaan alkio paikasta 1
      nimiLista.remove(1);
      System.out.println("Poistettiin alkio paikasta 1. ");   
      
      // n‰ytet‰‰n listan alkiot
      for (int indeksi = 0; indeksi < nimiLista.size(); indeksi++)
         System.out.println("Paikassa: " + indeksi + " Nimi: " + nimiLista.get(indeksi));
         
      
   }
}