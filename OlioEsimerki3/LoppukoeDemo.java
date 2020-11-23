import javax.swing.JOptionPane;
/**
   Demo luokalle Loppukoe.
*/
public class LoppukoeDemo{

   public static void main(String [] args){
      String input;
      int kysymyksia;
      int vaarin;
      
      input = JOptionPane.showInputDialog("Kuinka monta kysymysta tentiss‰ on?");
      kysymyksia = Integer.parseInt(input);
      
      input = JOptionPane.showInputDialog("Montako vastausta oli v‰‰rin?");
      vaarin = Integer.parseInt(input);
      
      // luodaan Loppukoe olio
      Loppukoe koe = new Loppukoe(kysymyksia, vaarin);
      
      // Kutsutaan luokan Loppukoe ja luokan Tenttiarvostelu metodeja.
      JOptionPane.showMessageDialog(null, "Jokaisesta teht‰v‰st‰ saa " + 
               koe.getPisteetKysymyksesta() + 
               " pistett‰. \nTenttipisteet ovat " + koe.getPisteet() + 
               "\nTentin arvosana on " + 
               koe.getArvosana());
               
      System.exit(0);         
   }
}