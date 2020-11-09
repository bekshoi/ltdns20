public class TestaaPorssiOsake {
    public static void main(String[] args) {
		//Luo osake-olio
		PorssiOsake osake = new PorssiOsake( "OO - Olio-ohjelmointia Oyj", 33.50);
		
		// Aseta edell. päätöskurssi
		osake.setPaatosKurssi(34.5);

		// Aseta hinta
		osake.setHinta(34.56);

		// Tulosta tiedot
		System.out.println("Osakkeen nimi: " + osake.getNimi());
		System.out.println("Osakkeen paatoskurssi: " + osake.getPaatosKurssi());
		System.out.println("Osakkeen nykyinen kurssi: " + osake.getHinta());
		System.out.println("Hinnan muutos: " + osake.getMuutosProsentti() * 100 + "%");
		// Tulosta tiedot toString -metodin avulla
		System.out.println(osake);
	}
  }
