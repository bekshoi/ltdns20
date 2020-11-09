import java.util.*;

public class testiSL {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Syöte huoneen leveys: "); //
        double leveys = input.nextDouble(); //
        System.out.println("Syöte huoneen korkeus: "); //
        double korkeus = input.nextDouble(); //
        System.out.println("Syöte huoneen tapetin neliöhinta: "); //
        double hinta = input.nextDouble(); //  
        
        HuoneTapeti huoneTapeti = new HuoneTapeti(hinta, leveys, korkeus);
        System.out.println("Hinta on " + huoneTapeti.getHinta() + " euroa");
        input.close();
    }
}