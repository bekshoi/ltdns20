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

		double alatyhteensa = 0.0;		
		for(Kuvio k: kuviot) {
			alatyhteensa += k.getPintaala();
			System.out.println( k + "\n Luotujen kuvioiden pinta-ala on nyt: "
				+ String.format("%.2f\n", alatyhteensa));
		}	
		
		odotaEnter();
		clearScreen();
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
	
		odotaEnter();
		clearScreen();
		System.out.println("Kuvio-luokan Comparable -liittymän totetutuksen testaus\n");

		try {
			if(kuviot[0].compareTo(kuviot[3]) >= 1)
				System.out.println( kuviot[0] + "\n on pinta-alaltaan suurempi kuin\n" + kuviot[3]);
			else if(kuviot[0].compareTo(kuviot[3]) <= -1)
				System.out.println( kuviot[0] + "\n on pinta-alaltaan pienempi kuin\n" + kuviot[3]);
			else
				System.out.println( kuviot[0] + "\n on pinta-alaltaan yhtäsuuri kuin\n" + kuviot[3]);

			if(kuviot[0].compareTo(null) >= 1)
				System.out.println("Tätä ei pitäisi näkyä koskaan");
		} catch (NullPointerException n) {
			System.out.println("Vertailtavan kuvion viite on null");
			n.printStackTrace();
		} catch (ClassCastException c) {
			System.out.println("Vertailtavan kuvio ei kuulu Kuvio -perheeseen");
			c.printStackTrace();
		}

		odotaEnter();
		clearScreen();
		System.out.println("Kuvio-luokan Comparator -liittymän totetutuksen testaus\n");

		ArrayList<Kuvio> ku = new ArrayList<Kuvio>();
		for( int i = 0; i < kuviot.length; i++)
			ku.add(kuviot[i]);

		System.out.println("Lajittelematon:");
		for( int i = 0; i < ku.size(); i++)
			System.out.println(ku.get(i));
		
		Collections.sort(ku, new Pintaalanmukaan());
		System.out.println("Lajiteltu pinta-alan mukaan:");
		for( int i = 0; i < ku.size(); i++)
			System.out.println(ku.get(i) + " Pinta-ala: " + ku.get(i).getPintaala());
		
		Collections.sort(ku, new Tyypinmukaan());
		System.out.println("Lajiteltu tyypin mukaan:");
		for( int i = 0; i < ku.size(); i++)
			System.out.println(ku.get(i));
		
		
    }
	
	public static void clearScreen() {
		try {
			if(System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else 
				System.out.print("\033\143");
		} catch (IOException | InterruptedException ex) {}
	}
	
	public static void odotaEnter() {
			System.out.println("Paina <Enter> -näppäintä jatkaaksesi ...");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
	}
}