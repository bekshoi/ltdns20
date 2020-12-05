/**
   Luokka Loppukoe3
   aliluokka luokalle TenttiArvostelu
   toteuttaa rajapinnan Arvioitava.
*/
public class Loppukoe3 extends TenttiArvostelu  
         implements Arvioitava
{
   private int kysymystenLkm;
   private double pisteetKysymyksesta;
   private int lkmVaarin;
   
   public Loppukoe3(int kysymyksia, int vaarin)
   {
      double pisteita;
      
      kysymystenLkm = kysymyksia;
      lkmVaarin = vaarin;
      
      pisteetKysymyksesta = 100.0 / kysymyksia;
      pisteita = 100.0 - (vaarin * pisteetKysymyksesta);
      
      // kutsutaan yliluokan metodia ja asetetaan yliluokassa määritelty kenttä
      setPisteet(pisteita);

   }
   
   public double getPisteetKysymyksesta()
   {
      return pisteetKysymyksesta;
   }
   
   public int getLkmVaarin()
   {
      return lkmVaarin;
   }
   
   // uusi metodi, jonka rajapinta vaatii.
   public boolean equals(TenttiArvostelu t)
   {
      boolean tila;
      
      if (this.getPisteet() == t.getPisteet())
         tila = true;
      else
         tila = false;
         
      return tila;      
   }
   
    // uusi metodi, jonka rajapinta vaatii.
   public boolean onSuurempiKuin(TenttiArvostelu t)
   {
      boolean tila;
      
      if (this.getPisteet() > t.getPisteet())
         tila = true;
      else
         tila = false;
         
      return tila;      
   }
   
       // uusi metodi, jonka rajapinta vaatii.
   public boolean onPienempiKuin(TenttiArvostelu t)
   {
      boolean tila;
      
      if (this.getPisteet() < t.getPisteet())
         tila = true;
      else
         tila = false;
         
      return tila;      
   }

}