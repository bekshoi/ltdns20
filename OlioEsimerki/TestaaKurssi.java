import java.util.*;

// Toteutettava luokka.
public class TestaaKurssi {

   // Pääohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String[] args) {

		Kurssi eka = new Kurssi ("Ohjelmointi III");
		eka.LisaaOpiskelija("erkki"); // lisätään 1. opiskelija
		eka.LisaaOpiskelija("terttu"); // lisätään 2. opiskelija 
		eka.LisaaOpiskelija("keijo"); // lisätään 3. opiskelija 
		eka.LisaaOpiskelija("kyllikki"); // lisätään 4. opiskelija 
		// tulostetaan olion laskettuja bmi-tietoja, jotka palautuvat luokan metodeista
		System.out.println("Kurssilla " + eka.PalautaNimi() + " on " + eka.PalautaOpiskelijaLkm () + " opiskelijaa");
		// pyydetään kurssioliolta opiskelijat (taulukko)
		String [] opisk = eka.PalautaOpiskelijat();
		// listataan kaikki opiskelijat
		for (int i = 0;i < eka.PalautaOpiskelijaLkm ();i++) {
			System.out.println(opisk [i]);
		}
   }
 }