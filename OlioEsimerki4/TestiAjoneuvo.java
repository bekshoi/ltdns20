import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestiAjoneuvo {

    public static void main(String [] args) {
    	
		Scanner lukija;
		lukija = new Scanner(System.in);
		
    	Polkupyora pp1 = new Polkupyora("Helkama", 2);
    	System.out.println(pp1.toString() + " " + pp1.getMoottorinTyyppi ());
    	Polkupyora pp2 = new Polkupyora("Kolmipyora", 3);
    	System.out.println(pp2.toString() + " " + pp2.getMoottorinTyyppi ());
		Auto auto1 = new Auto("Nissan", 4, 1800);
    	System.out.println(auto1.toString() + " " + auto1.getMoottorinTyyppi ());
		auto1.setCc (3000);
		System.out.println(auto1.toString());
		KuormaAuto ka1 = new KuormaAuto("Scania vabis", 14, 8800, 14.8);
    	System.out.println(ka1.toString() + " " + ka1.getMoottorinTyyppi ());
		
		List<Ajoneuvo> ajon = new ArrayList<Ajoneuvo>();
		
		ajon.add (pp1);
		ajon.add (pp2);
		ajon.add (auto1);
		ajon.add (ka1);
		
		String haku = "";
		System.out.println("Anna hakuehto (vähintään kolme kirjainta): ");
		haku = lukija.nextLine ();
		while (haku.length () < 3) {
			System.out.println("Anna hakuehto (vähintään kolme kirjainta): ");
			haku = lukija.nextLine ();
		}
		Ajoneuvo alkio;
        //Iteroidaan vektorin läpi ja tulostetaan jokaisen kuvion tiedot
        ListIterator<Ajoneuvo> l = ajon.listIterator();
		// String substring(int beginIndex, int endIndex)
		// int compareToIgnoreCase(String str)
		
        while (l.hasNext()){
            alkio = l.next(); // seuraava alkio
			if (haku.compareToIgnoreCase (alkio.getMerkki().substring(0, haku.length ())) == 0) {
				System.out.println(alkio.toString()); // tulostetaan
			}
		}
    }


}