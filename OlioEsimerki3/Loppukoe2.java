/**
   Luokka Loppukoe2
   aliluokka luokalle TenttiArvostelu2.
*/
public class Loppukoe2 extends TenttiArvostelu2
{
   private int kysymystenLkm;
   private double pisteetKysymyksesta;
   private int lkmVaarin;
   
   public Loppukoe2(int kysymyksia, int vaarin)
   {
      double pisteita;
      
      kysymystenLkm = kysymyksia;
      lkmVaarin = vaarin;
      
      pisteetKysymyksesta = 100.0 / kysymyksia;
      pisteita = 100.0 - (vaarin * pisteetKysymyksesta);
      
      // kutsutaan yliluokan metodia ja asetetaan yliluokassa määritelty kenttä
      setPisteet(pisteita);
      // kutsutaan uutta pyöristys metodia
      saadaPisteet();
   }
   
   public double getPisteetKysymyksesta()
   {
      return pisteetKysymyksesta;
   }
   
   public int getLkmVaarin()
   {
      return lkmVaarin;
   }
   
   // uusi metodi, joka hyödyntää protected määrittelyä yliluokassa
   private void saadaPisteet()
   {
      double osuus; 
      
      osuus  = pisteet - (int) pisteet;
      // pyöristys ylöspäin
      if (osuus >= 0.5)
         pisteet = pisteet + (1.0 - osuus);
   }
}