import java.util.*;

// Toteutettava luokka.
public class TestaaBMI {

   // Pääohjelma, jota kutsutaan ohjelman suorituksen alkaessa.
   public static void main(String[] args) {

		BMI eka = new BMI ("erkki", 37, 1.70, 87.6); // luodaan olio 
		BMI toka = new BMI ("terttu", 29, 1.54, 48.6); // luodaan toinen olio 
		BMI kolmas = new BMI ("keijo", 59, 1.92, 147.6); // luodaan olio 
		BMI neljas = new BMI ("kyllikki", 57, 1.68, 47.6); // luodaan olio 
		// tulostetaan olion laskettuja bmi-tietoja, jotka palautuvat luokan metodeista
		System.out.println(eka.m_nimi + "n bmi on:" + eka.LaskeBmi () + ", joten erkki on " + eka.PalautaBmiArvio ());
		System.out.println(toka.m_nimi + "n bmi on:" + toka.LaskeBmi () + ", joten terttu on " + toka.PalautaBmiArvio ());
		System.out.println(kolmas.m_nimi + "n bmi on:" + kolmas.LaskeBmi () + ", joten keippa on " + kolmas.PalautaBmiArvio ());
		System.out.println(neljas.m_nimi + "n bmi on:" + neljas.LaskeBmi () + ", joten kylli on " + neljas.PalautaBmiArvio ());
		
   }
 }