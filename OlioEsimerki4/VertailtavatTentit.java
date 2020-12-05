/**
   VertailtavatTentit.java
*/
public class VertailtavatTentit
{
   public static void main(String [] args)
   {    
      // 100 kysymyst‰ joista meni 20 v‰‰rin
      Loppukoe3 tentti1 = new Loppukoe3(100, 20);
      // 100 kysymyst‰ joista meni 30 v‰‰rin
      Loppukoe3 tentti2 = new Loppukoe3(100, 30);
      
      // N‰ytet‰‰n pisteet
      System.out.println("Tentti 1: " + tentti1.getPisteet());
      System.out.println("Tentti 2: " + tentti2.getPisteet());
      
      // verrataan pisteit‰
      if (tentti1.equals(tentti2))
         System.out.println("Samat tenttipisteet");
      if (tentti1.onSuurempiKuin(tentti2))
         System.out.println("Tentin 1 pisteet suuremmat");
      if (tentti1.onPienempiKuin(tentti2))
         System.out.println("Tentin 1 pisteet ovat pienemm‰t");
   }
   
}
