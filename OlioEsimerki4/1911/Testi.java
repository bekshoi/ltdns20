import java.util.*; 
import java.lang.*; 
import java.io.*; 

/**
 * Testi.java ohjelma Kuvio -luokkaperheen kokeiluun
 * @author Roope Ankka
 * @author Helppo Heikki
 */
public class Testi {
	/** Kuvio - olioperhettä testaava ohjelma
	 * @param args Käynnistyksen yhteydessä annettavat parametrit merkkijonona
	 * - näitä ei käsitellä mitenkään tässä ohjelmassa 
	 */
    public static void main(String [] args) {
		clearScreen();
		System.out.println("Monimuotoisuuden testaus abstraktin Kuvio-luokan kautta\n");

		Kuvio[] kuviot = new Kuvio[4];
		kuviot[0] = new Nelikulmio(10, 20, 1, "255255255");
		kuviot[1] = new Ympyra();
		kuviot[2] = new Ympyra(50, 1.5, "000255000");
		kuviot[3] = new Nelikulmio(50, 5, 2, "125125125");
		kuviot[1].setViivanLeveys(1.2);

		double alatYhteensa = 0.0;		
		for(Kuvio k: kuviot) {
			alatyhteensa += k.getAla();
			System.out.println( k + "\n Luotujen kuvioiden pinta-ala on nyt: "
				+ String.format("%.2f\n", alatyhteensa));
		}	
		
		System.out.println("Kuvio-luokan equals metodin testaus\n");
		
		if(kuviot[0].equals(kuviot[3]))
			System.out.println( kuviot[0] + "\n on samanlainen kuin\n" + kuviot[3]);
		else
			System.out.println( kuviot[0] + "\n on erilainen kuin\n" + kuviot[3]);
		
		Kuvio sama = new Nelikulmio(10, 20, 1, "255255255");
		if(kuviot[0].equals(sama))
			System.out.println( kuviot[0] + "\n on samanlainen kuin\n" + sama);
		else
			System.out.println( kuviot[0] + "\n on erilainen kuin\n" + sama);
	
    }
	
	public static void clearScreen() {
		try {
			if(System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else 
				System.out.print("\033\143");
		} catch (IOException | InterruptedException ex) {}
	}
}