/*
   Tiedoston lukujen summa
*/
import java.util.Scanner;
import java.io.*;

class TiedostonSumma 
{
   public static void main(String [] args) throws IOException
   {
      double summa = 0.0;
      double luku = 0.0;
      
      File tiedosto = new File("luvut.txt");
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
   