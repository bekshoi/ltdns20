import javax.swing.JOptionPane;
/**
   TenttiArvosteluDemo.java
*/
public class TenttiArvosteluDemo
{
   public static void main(String [] args)
   {
      String input;
      double tenttipisteet;
      
      TenttiArvostelu arvosana = new TenttiArvostelu();
      
      input = JOptionPane.showInputDialog("Anna tenttipisteet: ");
      tenttipisteet = Double.parseDouble(input);
      
      arvosana.setPisteet(tenttipisteet);
      
      JOptionPane.showMessageDialog(null, "Tenttisi arvosana on " + arvosana.getArvosana());
      
      System.exit(0);
   }
   
}
