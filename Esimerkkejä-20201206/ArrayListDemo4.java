import java.util.ArrayList; // luokka tarvitsee tämän
/**
   Ohjelma esittelee ArrayList:n käyttöä
*/
public class ArrayListDemo4
{
   public static void main(String [] args)
   {
      // luodaan ArrayList nimille
      ArrayList<String> nimiLista = new ArrayList<String>();
      // tai Java 7 alkaen myös lyhyemmin: 
      //ArrayList<String> nimiLista = new ArrayList<>();      
      
      // lisätään nimiä
      nimiLista.add("Janne");
      nimiLista.add("Kaarina");
      nimiLista.add("Viljami");
      
      // näytetään listan alkiot
      for (int indeksi = 0; indeksi < nimiLista.size(); indeksi++)
         System.out.println("Paikassa: " + indeksi + " Nimi: " + nimiLista.get(indeksi));
         
      // lisätään alkio paikkaan 1
      nimiLista.add(1, "Marja");
      System.out.println("Lisättiin alkio Marja paikkaan 1. ");   
      
      // näytetään listan alkiot
      for (int indeksi = 0; indeksi < nimiLista.size(); indeksi++)
         System.out.println("Paikassa: " + indeksi + " Nimi: " + nimiLista.get(indeksi));
         
      
   }
}