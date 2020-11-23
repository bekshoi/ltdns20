/**
   Luokka Monimuotoisuus esittelee yliluokan k�ytt��
   aliluokan olioiden tyyppin�.
*/
public class Monimuotoisuus
{
   public static void main(String [] args)
   {
      TenttiArvostelu [] tentit = new TenttiArvostelu[2];
      
      tentit[0] = new TenttiArvostelu();
      tentit[0].setPisteet(95);
      
      tentit[1] = new Loppukoe(20, 5);
      
      for (int i = 0; i < tentit.length; i++)
      {
         System.out.println("Tentti " + (i+1) + ": pisteet " + 
               tentit[i].getPisteet() + ", arvosana " + 
               tentit[i].getArvosana());
      }
	  
	  //tentit[1].getLkmVaarin(); ei k��nny -> error: cannot find symbol
	  // Ei l�ydy metodia, koska on taulukon mukaisesti Tenttiarvostelu -luokan ilmentym�
      System.out.println(tentit[1]); // t�m� kuitenkin toimii, kun toString - peritty metodi - korvattu Loppukoe-luokassa 
	  
      if (tentit[1] instanceof TenttiArvostelu)
         System.out.println("Olen tenttiarvostelu");
	 if (tentit[1] instanceof Loppukoe)
         System.out.println("Olen my�s Loppukoe");
   }
}