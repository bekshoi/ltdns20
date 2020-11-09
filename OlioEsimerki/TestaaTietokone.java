import java.util.*;

// Toteutettava luokka.
public class TestaaTietokone {

   // Pääohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String[] args) {

		Tietokone eka = new Tietokone ("PentiumX", 1200, 1.44);
		Tietokone toka = new Tietokone ("XentiumY", 120, 2.44);
		Tietokone kolmas = new Tietokone ("Tritium", 9200, 0.44);

		// tulostetaan olioiden tietoja, jotka palautuvat luokan metodeista
		System.out.println(eka.getNimi() + " " + eka.getMuisti () + " " + eka.getTaajuus ());
		System.out.println(toka.toString());
		System.out.println(kolmas.toString());

		// luodaan taulukko tietokoneolioille
		Tietokone [] koneet = new Tietokone [10];
		// kolme luotua oliota taulukkoon
		koneet[0] = eka;
		koneet[1] = toka;
		koneet[2] = kolmas;
		// muutetaan kahden jälkimmäsen tietoja kelpoisiksi
		koneet[1].setMuisti (3000);
		koneet[2].setTaajuus (3.66);
		
		// tulostetaan kaikki tietokoneet taulukosta
		for (int i = 0;i < 3;i++) {
			System.out.println(koneet[i].toString());
		}
   }
 }