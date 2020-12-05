/**
   tkt opiskelija perii abstraktin luokan Opiskelija
*/
public class TktOpiskelija extends Opiskelija
{
   private final int TKT_TUNNIT = 40;
   
   private int tkt_tunnit;
   
   public TktOpiskelija(String n, String nro, int vuosi)
   {
      super(n, nro, vuosi);
   }
   
   public void setTktTunnit(int tkt)
   {
      tkt_tunnit = tkt;
   }
   
   public int getTktTunnit()
   {
      return tkt_tunnit;
   }
   
   // korvataan abstrakti metodi
   public int getPuuttuvatTunnit()
   {
      int puuttuvatTunnit;
      
      puuttuvatTunnit = TKT_TUNNIT - tkt_tunnit;
      
      return puuttuvatTunnit;
   }
   
   public String toString()
   {
      String str;
      str = super.toString() + " " + tkt_tunnit;
      return str;
   }
}