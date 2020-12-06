/*
   TiedostoDemo.java
*/

import java.util.Scanner;  // Scanner luokka
import java.io.*;          // I/O luokat

public class TiedostoDemo
{
   public static void main(String [] args) throws IOException // poikkeus tiedostojen k‰sittelyss‰
   {
      String tiedostonNimi;
      String ystavanNimi;
      int ystavienMaara;
      
      Scanner nappis = new Scanner(System.in);
      
      System.out.print("Montako yst‰v‰‰ sinulla on? ");
      ystavienMaara = nappis.nextInt();
      
      nappis.nextLine(); // luetaan rivinvaihtomerkki pois
      System.out.println("Anna tiedoston nimi: ");
      tiedostonNimi = nappis.nextLine();
      
      PrintWriter tiedosto = new PrintWriter(tiedostonNimi);
      
      for (int i = 1; i <= ystavienMaara; i ++) 
      {
         System.out.println("Anna yst‰v‰n numero " + i + " nimi: ");
         ystavanNimi = nappis.nextLine();
         
         tiedosto.println(ystavanNimi);
      }
      
      tiedosto.close();
      System.out.println("Tiedot kirjoitettiin tiedostoon. ");
   }
}         
   