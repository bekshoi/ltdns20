/**
   Luokka opiskelija, abstrakti luokka.
*/
public abstract class Opiskelija
{
   private String nimi;
   private String opNro;
   private int aloitusVuosi;
   
   public Opiskelija(String n, String nro, int vuosi)
   {
      nimi = n; 
      opNro = nro; 
      aloitusVuosi = vuosi;
   }
   
   public String toString()
   {
      String str = nimi + " " + opNro + " " + aloitusVuosi;
      return str;
   }
   
   public abstract int getPuuttuvatTunnit();
}
