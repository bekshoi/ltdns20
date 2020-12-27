package HarjateluEs;

import java.util.*;
import java.io.*;

/**
 * @(#)LuoSuoritusTiedosto.java - auttajaluokka
 * Lähdemateriaalina kohteliaasti @author Eero Mönkkösesta.
 */

public class LuoSuoritusTiedosto{

	public static void main(String[] args) {
		// Kirjoitetaan suorituksia tiedostoon
		String fName = "C:\\MyRepos\\ltdns20\\HarjateluEs\\suoritus.dat";
		ObjectOutputStream suor = null;
		FileOutputStream suorFile = null;
		try {
			suorFile = new FileOutputStream(fName);
			suor = new ObjectOutputStream(suorFile);
			Suoritus olio = new Suoritus (19001, 362447, 4, "20191114");
			suor.writeObject(olio);
			olio = new Suoritus (19001, 362566, 2, "20191004");
			suor.writeObject(olio);
			olio = new Suoritus (19001, 361234, 0, "20190912");
			suor.writeObject(olio);
			olio = new Suoritus (19031, 362447, 1, "20191114");
			suor.writeObject(olio);
			olio = new Suoritus (19031, 361234, 3, "20191004");
			suor.writeObject(olio);
			olio = new Suoritus (19013, 362447, 3, "20191114");
			suor.writeObject(olio);
			olio = new Suoritus (19013, 362566, 2, "20191004");
			suor.writeObject(olio);
			olio = new Suoritus (19013, 363663, 5, "20190912");
			suor.writeObject(olio);
			olio = new Suoritus (19016, 362447, 0, "20191114");
			suor.writeObject(olio);
			olio = new Suoritus (19088, 362447, 5, "20191114");
			suor.writeObject(olio);
			olio = new Suoritus (19088, 362566, 5, "20191004");
			suor.writeObject(olio);
			olio = new Suoritus (19088, 361663, 5, "20190912");
			suor.writeObject(olio);
			olio = new Suoritus (19088, 363663, 5, "20191114");
			suor.writeObject(olio);
			// suljetaan tiedosto
			suor.close ();
		}
		catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}
		// luetaan
		// luetaan yhden opiskelijan (19001) suoritukset listarakenteeseen
		ArrayList<Suoritus> suorList = new ArrayList<Suoritus>();
		// ja toisen (19088) suoritukset linkitetylle listalle
		LinkedList<Suoritus> linkedList = new LinkedList<Suoritus>();
		
		FileInputStream suoritukset = null;
		ObjectInputStream suor_in = null;
		try {
            suoritukset = new FileInputStream(fName);
            suor_in = new ObjectInputStream(suoritukset);
            Suoritus suorOlio = null;
			// luetaan 13 suoritusta
            for (int i = 0; i < 13; i++) {
				// luetaan olio ja castataan Suoritus-luokan olioksi
                suorOlio = (Suoritus)suor_in.readObject();
				// tulostetaan suorituksen tiedot 
                System.out.println(suorOlio);
				// onko halutun opiskelijan suoritus?
				if (suorOlio.getOpiskelijaId() == 19001) {
					// lis�t��n listalle (ArrayList)
					suorList.add(suorOlio);		
				}
				if (suorOlio.getOpiskelijaId() == 19088) {
					// lis�t��n alkio linkitetylle listalle
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

		// tulostetaan opiskelijan 19001 ArrayList:ilt�
		for (int i = 0; i < suorList.size(); i++) {
			Suoritus sOlio = suorList.get(i);
			System.out.println(sOlio.getOpiskelijaId() + " " + sOlio.getArvosana());
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