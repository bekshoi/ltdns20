import java.util.ArrayList; // luokka tarvitsee t‰m‰n
/**
   Ohjelma esittelee for-each rakenteen k‰yttˆ‰
   ArrayList:n yhteydess‰.
*/
public class ArrayListDemo2
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
      for (String nimi : nimiLista)
         System.out.println(nimi);
   }
}