import java.util.ArrayList; // luokka tarvitsee t‰m‰n
/**
   Ohjelma esittelee ArrayList:n k‰yttˆ‰
*/
public class ArrayListDemo1
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
         System.out.println(nimiLista.get(indeksi));
   }
}