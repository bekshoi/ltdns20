/**
   Luokka ObjectMetodit esittelee luokan Object metodien k‰yttˆ‰.
*/
public class ObjectMetodit
{
   public static void main(String [] args)
   {
      Loppukoe2 tentti1 = new Loppukoe2(15, 10);
      Loppukoe2 tentti2 = new Loppukoe2(15, 10);
      
      System.out.println(tentti1); // k‰ytet‰‰n Object luokasta peritty‰ toString -metodia
      System.out.println(tentti2); // k‰ytet‰‰n Object luokasta peritty‰ toString -metodia
      
      if (tentti1.equals(tentti2)) // k‰ytet‰‰n Object luokasta peritty‰ equals -metodia
         System.out.println("Tentit ovat samat");
      else
         System.out.println("Tentit eiv‰t ole samat");   
   }
}