/*
   Tiedoston lukujen summa tarkistuksella
*/
import java.util.Scanner;
import java.io.*;

class TiedostonSummaTarkistuksella 
{
   public static void main(String [] args) throws IOException
   {
      double summa = 0.0;
      double luku = 0.0;
      
      File tiedosto = new File("luvut.txt");
      // tarkistetaan onko tiedosto olemassa
      if (!tiedosto.exists()) 
      {
         System.out.println("Tiedostoa ei ole olemassa. ");
         // lopetetaan ohjelman suoritus
         System.exit(0);
      }   
      
      Scanner input = new Scanner(tiedosto);
      
      while (input.hasNext())
      {
         luku = input.nextDouble();
         
         summa += luku;
      }
      
      input.close();
      
      System.out.println("Tiedoston lukujen summa on " + summa);
   }
}         
   