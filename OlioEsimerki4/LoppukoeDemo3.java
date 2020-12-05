import java.util.Scanner;
/**
   Demo luokalle Loppukoe3.
*/
public class LoppukoeDemo3{

   public static void main(String [] args){
      
      int kysymyksia;
      int vaarin;
	  Scanner input = new Scanner(System.in);
      
	  System.out.println("Kuinka monta kysymysta tentiss‰ on?");
      kysymyksia = input.nextInt();
      
	  System.out.println("Montako vastausta oli v‰‰rin?");
      vaarin = input.nextInt();
      
      // luodaan Loppukoe-olio
      Loppukoe3 koe = new Loppukoe3(kysymyksia, vaarin);
      
      // Kutsutaan luokan Loppukoe ja luokan Tenttiarvostelu metodeja.
      System.out.println("Jokaisesta teht‰v‰st‰ saa " + 
               koe.getPisteetKysymyksesta() + 
               " pistett‰. \nTenttipisteet ovat " + koe.getPisteet() + 
               "\nTentin arvosana on " + 
               koe.getArvosana());
      
   }
}