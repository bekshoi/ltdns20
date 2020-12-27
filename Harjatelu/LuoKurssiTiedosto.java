package HarjateluEs;

/**
 * @(#)LuoKurssiTiedosto.java - auttajaluokka
 * 
 */
import java.util.*;
import java.io.*;
public class LuoKurssiTiedosto{


	public static void main(String[] args) {
		// Kirjoitetaan suorituksia tiedostoon
		String fName2 = "C:\\MyRepos\\ltdns20\\HarjateluEs\\kurssi.dat";
		String fName = "C:\\MyRepos\\ltdns20\\HarjateluEs\\suoritus.dat";
		ObjectOutputStream kurssi = null;
		FileOutputStream kurssiFile = null;
		try {
			kurssiFile = new FileOutputStream(fName2);
			kurssi = new ObjectOutputStream(kurssiFile);
			Kurssi oliokurssi = new Kurssi (362447, "Ohjelmoinnin perusteet", 5, "Opintojaksolla opiskellaan ohjelmoinnin peruskäsitteet");
			kurssi.writeObject(oliokurssi);
			oliokurssi = new Kurssi (362566, "Olio-ohjelmointi", 5, "Opintojaksolla opiskellaan olio-ohjelmointi");
			kurssi.writeObject(oliokurssi);
			oliokurssi = new Kurssi (361234, "Johdatus tietojenkasittelyyn", 5, "Opintojaksolla opiskellaan perusjuttuja");
			kurssi.writeObject(oliokurssi);
			oliokurssi = new Kurssi (363663, "Käyttöliittymäohjelmointi", 5, "Opintojaksolla opiskellaan JavaFXaa");
			kurssi.writeObject(oliokurssi);
			kurssi.close ();
		}
		catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}

		// luetaan
		// luetaan yhden kurssin (362447) suoritukset listarakenteeseen
		ArrayList<Suoritus> suorList = new ArrayList<Suoritus>();
		// ja toisen (361234) suoritukset linkitetylle listalle
		LinkedList<Suoritus> linkedList = new LinkedList<Suoritus>();
		
		FileInputStream suoritukset = null;
		ObjectInputStream suor_in = null;
		try {
            suoritukset = new FileInputStream(fName);
            suor_in = new ObjectInputStream(suoritukset);
            Suoritus suorOlio = null;
            for (int i = 0; i < 13; i++) {
                suorOlio = (Suoritus)suor_in.readObject();
                System.out.println(suorOlio);
				if (suorOlio.getKurssiId() == 362447) {
					suorList.add(suorOlio);		
				}
				if (suorOlio.getKurssiId() == 361234) {
					linkedList.add(suorOlio);
				}
            }
		} 
       catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}

		// tulostetaan kurssin 362447 ArrayList:ilt�
		for (int i = 0; i < suorList.size(); i++) {
			Suoritus sOlio = suorList.get(i);
			System.out.println(sOlio.getKurssiId() + " " + sOlio.getOpiskelijaId());
		}
		
		System.out.println("Naytetaan LinkedList alusta loppuun:");
		// luodaan listIterator
		ListIterator<Suoritus> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next() + " ");
		}
		// tai
		System.out.println("*************************************"); 
		for (int i = 0; i < linkedList.size(); i++) {
			Suoritus sOlio = linkedList.get(i);
			System.out.println(sOlio);
		}

		System.out.println("Naytetaan LinkedList lopusta alkuun:");
		// asetaan listIterator osoittamaan viimeiseen alkioon
		listIterator = linkedList.listIterator(linkedList.size());
		// selataan lopusta alkuun
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous() + " ");
		}
    }  
}