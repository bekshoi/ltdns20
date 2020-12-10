/*
Ohjelmointi 1: Valikko.java
Ohjelmassa tulostetaan valikko ja testataan minkä valinnan käyttäjä syötti
Opittava asia: switch - case (default)
@author Marko Hassinen
@version 1.1
*/

// Otetaan käyttöön java.util pakkaus
import java.util.*; // Scanner

// luokka Kysy
public class Kysy
{

   public static int kluku()
   {
      // Luodaan Scanner -olio ja sijoitetaan viite muuttujaan lukija
      Scanner lukija = new Scanner(System.in);
      boolean bHyvaLuku=true;
      int iLuku=0;
      do
      {
         try
         {
            String sLuku = lukija.nextLine(); // Luetaan käyttäjän valinta
            iLuku = Integer.parseInt(sLuku);
            bHyvaLuku=true;
         }
         catch(Exception e)
         {
            System.out.println("Huono numero! Anna kokonaisluku");
            bHyvaLuku = false;
         }
      }while(!bHyvaLuku);
      return iLuku;
   }

   public static double dluku()
   {
      // Luodaan Scanner -olio ja sijoitetaan viite muuttujaan lukija
      Scanner lukija = new Scanner(System.in);
      boolean bHyvaLuku=true;
      double dLuku=0;
      do
      {
   	     try
         {
            String sLuku = lukija.nextLine(); // Luetaan käyttäjän valinta
            dLuku = Double.parseDouble(sLuku);
            bHyvaLuku=true;
         }
         catch(Exception e)
         {
         	System.out.println("Huono numero! Anna desimaaliluku");
         	bHyvaLuku = false;
         }
      }while(!bHyvaLuku);
      return dLuku;
   }

   public static char merkki()
   {
      // Luodaan Scanner -olio ja sijoitetaan viite muuttujaan lukija
      Scanner lukija = new Scanner(System.in);
      boolean bHyvaSyote=true;
      char cMerkki=0;
      do
      {
         try
         {
            String sSyote= lukija.nextLine(); // Luetaan käyttäjän valinta
            cMerkki = sSyote.charAt(0);
            bHyvaSyote=true;
         }
         catch(Exception e)
         {
            System.out.println("Huono syöte! Anna merkki");
            bHyvaSyote = false;
         }
      }while(!bHyvaSyote);
      return cMerkki;
   }

    public static boolean totuusarvo()
    {
      // Luodaan Scanner -olio ja sijoitetaan viite muuttujaan lukija
      Scanner lukija = new Scanner(System.in);
      boolean bHyvaSyote=true;
      char cMerkki = 'k';
      do
      {
         try
         {
            System.out.print("k/e ");
            String sSyote= lukija.nextLine(); // Luetaan käyttäjän valinta
            cMerkki = sSyote.charAt(0);
            if(cMerkki != 'k' & cMerkki != 'e')
               throw new Exception();
            bHyvaSyote=true;
         }
         catch(Exception e)
         {
            System.out.println("Huono syöte! Syötä k tai e");
            bHyvaSyote = false;
         }
   	  }while(!bHyvaSyote);
   	  if(cMerkki == 'k')
   	     return true;
   	  return false;
    }

    public static String mjono()
    {
      // Luodaan Scanner -olio ja sijoitetaan viite muuttujaan lukija
      Scanner lukija = new Scanner(System.in);
      String sSyote= lukija.nextLine();
      return sSyote;
    }
}