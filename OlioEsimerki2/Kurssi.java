/**
 * Luokka m‰‰rittelee yksinkertaisen kurssin,
 * joka muodostuu kurssin nimest‰, opiskelijoista
 * ja opiskelijoiden m‰‰r‰st‰.
 *
 */
public class Kurssi {
	private String kurssiNimi;
	private String[] opiskelijat = new String[100];
	private int opiskelijaMaara;

/** Luodaan kurssi, jolla on tietty nimi.
 *  @param kurssiNimi kurssin nimi.
 */
    public Kurssi(String kurssiNimi) {
    	this.kurssiNimi = kurssiNimi;
    }

/** Lis‰t‰‰n opiskelija kurssille.
 *  Kurssilla voi olla enint‰‰n 100 opiskelijaa.
 *  @param opiskelija opiskelijan nimi.
 */
    public void lisaaOpiskelija(String opiskelija) {
    	opiskelijat[opiskelijaMaara] = opiskelija;
    	opiskelijaMaara++;
    }

/** Palauttaa kurssin opiskelijoiden nimet
 *  merkkijonotaulukkona.
 *  @return kurssin opiskelijoiden nimet.
 */
    public String[] palautaOpiskelijat() {
    	return opiskelijat;
    }

/** Palauttaa kurssin opiskelijam‰‰r‰n.
 *  @return kurssin opiskelijam‰‰r‰.
 */
    public int palautaOpiskelijaMaara() {
    	return opiskelijaMaara;
    }

/** Palauttaa kurssin nimen.
 *  @return kurssin nimi.
 */
    public String palautaKurssiNimi() {
    	return kurssiNimi;
    }

/** Poistaa opiskelijan kurssilta.
 *  @param opiskelija opiskelijan nimi.
 */
    public void poistaOpiskelija(String opiskelija) {
    	// j‰‰ harjoitukseksi
    }


}