/**
 * @(#)KokonaisAla.java
 *
 *
 * @author
 * @version 1.00 2019/6/12
 */


public class KokonaisAla {
	/** main metodi */
	public static void main(String[] args) {
		// M��ritell��n ympyraTaulukko
		Ympyra3[] ympyraTaulukko;

		// Luodaan ympyraTaulukko
		ympyraTaulukko = luoYmpyraTaulukko();

		// Tulostetaan ympyraTaulukko ja ympyr�iden kokonaisala
		tulostaYmpyraTaulukko(ympyraTaulukko);
	}

	/** Luodaan Ympyra olioiden taulukko */
	public static Ympyra3[] luoYmpyraTaulukko() {
		Ympyra3[] ympyraTaulukko = new Ympyra3[5];

		for (int i = 0; i < ympyraTaulukko.length; i++) {
			ympyraTaulukko[i] = new Ympyra3(Math.random() * 100);
		}

		// Palautetaan Ympyra taulukko
		return ympyraTaulukko;
	}

	/** Tulostetaan ympyraTaulukko ja ympyr�iden kokonaisala */
	public static void tulostaYmpyraTaulukko(Ympyra3[] ympyraTaulukko) {
		System.out.printf("%-30s%-15s\n", "S�de", "Ala");
		for (int i = 0; i < ympyraTaulukko.length; i++) {
			System.out.printf("%-30f%-15f\n", ympyraTaulukko[i].palautaSade(),
			ympyraTaulukko[i].palautaAla());
		}

		System.out.println("----------------------------------------------------");

		// Lasketaan ja tulostetaan tulos
		System.out.printf("%-30s%-15f\n", "Ympyr�iden kokonaisala on", summa(ympyraTaulukko));

	}

    public static double summa(Ympyra3[] ympyraTaulukko) {
    	// Alustetaan summa
    	double summa =0;

    	// Lis�t��n alat summaan
    	for (int i = 0; i < ympyraTaulukko.length; i++)
    		summa += ympyraTaulukko[i].palautaAla();

    	return summa;
    }


}