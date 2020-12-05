/**
   Luokka TktOpiskelijaDemo esittelee abstrakti luokan k‰yttˆ‰.
*/
public class TktOpiskelijaDemo
{
   public static void main(String [] args)
   {
      TktOpiskelija op1 = new TktOpiskelija("Viljami", "12345", 2012);
      // yll‰ oleva rivi voidaan korvata alla olevalla rivill‰
      // eli abstrakti luokka voi olla tyyppin‰, kunhan vain k‰ytet‰‰n
      // pelk‰st‰‰n abstraktin luokan metodeja. (eli setTktTunnit ei toimi, 
      // mutta getPuuttuvatTunnit toimii.
      //Opiskelija op1 = new TktOpiskelija("Viljami", "12345", 2012);
      
      op1.setTktTunnit(20);
      
      System.out.println(op1);
      
      System.out.println("Tunteja puuttuu: " + op1.getPuuttuvatTunnit());
      
   }
}