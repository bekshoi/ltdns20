package HarjateluEs;

import java.util.*;
import java.io.*;

/** 
 * Luokka MainMetodi
 * 
 * @author bekshoi
 * @version 1.00 2020/12/21
 * 
 */

public class MainMetodi {
	public static void main(String[] args) {
        
// Luodaan oliot ja tiedostot
		String fName = "C:\\MyRepos\\ltdns20\\HarjateluEs\\suoritus.dat";
        String fName2 = "C:\\MyRepos\\ltdns20\\HarjateluEs\\kurssi.dat";
        String fName3 = "C:\\MyRepos\\ltdns20\\HarjateluEs\\opsklija.dat";

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

        ObjectOutputStream opisk = null;
		FileOutputStream opiskFile = null;
		try {
			opiskFile = new FileOutputStream(fName3);
			opisk = new ObjectOutputStream(opiskFile);
			Opiskelija olioopisk = new Opiskelija(19001, "Pekka", "Kangas");
			opisk.writeObject(olioopisk);
            olioopisk = new Opiskelija (19013, "Kaija","Lavikainen");
            opisk.writeObject(olioopisk);
            olioopisk = new Opiskelija (19016, "Liisa", "Korjus");
            opisk.writeObject(olioopisk);
            olioopisk = new Opiskelija (19031,"Perttu","Hakkarainen");
            opisk.writeObject(olioopisk);
            olioopisk = new Opiskelija (19088,"Hannu","Vakkila");
            opisk.writeObject(olioopisk);
			opisk.close ();
		}
		catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}

// tietyn opiskelijan (19001) suoritusten listaus
        int op = 19001;
        int kur = 362447;
        ArrayList<Suoritus> suorList = new ArrayList<Suoritus>();
        ArrayList<Suoritus> kurList = new ArrayList<Suoritus>();
		FileInputStream suoritukset = null;
		ObjectInputStream suor_in = null;
		try {
            suoritukset = new FileInputStream(fName);
            suor_in = new ObjectInputStream(suoritukset);
            Suoritus suorOlio = null;
            // System.out.println("\nListaa kaikista olioita");
            for (int i = 0; i < 13; i++) {
                suorOlio = (Suoritus)suor_in.readObject();
                // System.out.println(suorOlio);
				if (suorOlio.getOpiskelijaId() == op) {
					suorList.add(suorOlio);		
                }
                if (suorOlio.getKurssiId() == kur) {
                    kurList.add(suorOlio);
                }
            }
		} 
        catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}

        System.out.println("\nTietyn (19001) opiskelijan suoritusten listaus");
		for (int i = 0; i < suorList.size(); i++) {
			Suoritus sOlio = suorList.get(i);
			System.out.println(sOlio.getOpiskelijaId() + " " + sOlio.getKurssiId());
        }

        System.out.println("\nTietyn (362447) kurssin suoritusten listaus");
		for (int i = 0; i < kurList.size(); i++) {
			Suoritus kOlio = kurList.get(i);
            System.out.println(kOlio.getKurssiId() + " " + kOlio.getOpiskelijaId());
        }

        System.out.println("\nTietyn (362447) kurssin opiskelijoiden ja arvosanojen listaus");
		for (int i = 0; i < kurList.size(); i++) {
			Suoritus kOlio = kurList.get(i);
			System.out.println(kOlio.getKurssiId() + " " + kOlio.getOpiskelijaId() + " " + kOlio.getArvosana());
        }

// testi  
        System.out.println("\nMetodi getKurssiSuoritukset testi");
        Kurssi oliokurssi = new Kurssi (362447, "Ohjelmoinnin perusteet", 5, "Opintojaksolla opiskellaan ohjelmoinnin peruskäsitteet");
        kur=oliokurssi.getKurssiID();
        System.out.println(oliokurssi.getKurssinSuoritukset(kur));

        /*
        LinkedList<Opiskelija> oList = new LinkedList<Opiskelija>();
        FileInputStream opiskelijat = null;
		ObjectInputStream opi_in = null;
		try {
            opiskelijat = new FileInputStream(fName3);
            opi_in = new ObjectInputStream(opiskelijat);
            Opiskelija opiOlio = null;
            System.out.println("\nTesti");
            for (int i = 0; i < 5; i++) {
                opiOlio = (Opiskelija)opi_in.readObject();
                System.out.println(opiOlio);
				if (opiOlio.getID() == op) {
					oList.add(opiOlio);		
                }
            }
		} 
        catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}

        System.out.println("\nTesti");
		for (int i = 0; i < oList.size(); i++) {
			Opiskelija opiOlio = oList.get(i);
			System.out.println(opiOlio.getID() + " " + opiOlio.toString());
        }
        */
    }  
}