import java.util.ArrayList; // luokka tarvitsee t�m�n
/**
   Ohjelma esittelee ArrayList:n k�ytt��
*/
public class ArrayListDemo4
{
   public static void main(String [] args)
   {
      // luodaan ArrayList nimille
      ArrayList<String> nimiLista = new ArrayList<String>();
      // tai Java 7 alkaen my�s lyhyemmin: 
      //ArrayList<String> nimiLista = new ArrayList<>();      
      
      // lis�t��n nimi�
      nimiLista.add("Janne");
      nimiLista.add("Kaarina");
      nimiLista.add("Viljami");
      
      // n�ytet��n listan alkiot
      for (int indeksi = 0; indeksi < nimiLista.size(); indeksi++)
         System.out.println("Paikassa: " + indeksi + " Nimi: " + nimiLista.get(indeksi));
         
      // lis�t��n alkio paikkaan 1
      nimiLista.add(1, "Marja");
      System.out.println("Lis�ttiin alkio Marja paikkaan 1. ");   
      
      // n�ytet��n listan alkiot
      for (int indeksi = 0; indeksi < nimiLista.size(); indeksi++)
         System.out.println("Paikassa: " + indeksi + " Nimi: " + nimiLista.get(indeksi));
         
      
   }
}