/**
   Luokka Loppukoe
   aliluokka luokalle TenttiArvostelu.
*/
public class Loppukoe extends TenttiArvostelu{
   private int kysymystenLkm;
   private double pisteetKysymyksesta;
   private int lkmVaarin;
   
   public Loppukoe(int kysymyksia, int vaarin){
      double pisteita;
      
      kysymystenLkm = kysymyksia;
      lkmVaarin = vaarin;
      
      pisteetKysymyksesta = 100.0 / kysymyksia;
      pisteita = 100.0 - (vaarin * pisteetKysymyksesta);
      
      // kutsutaan yliluokan metodia ja asetetaan yliluokassa m‰‰ritelty kentt‰
      setPisteet(pisteita);      
   }
   
   public double getPisteetKysymyksesta(){
      return pisteetKysymyksesta;
   }
   
   @Override
   public String toString(){//overriding the toString() method  
		return kysymystenLkm+" "+pisteetKysymyksesta+" "+lkmVaarin;  
   } 
}