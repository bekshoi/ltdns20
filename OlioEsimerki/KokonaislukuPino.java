/**
 *
 * @(#)KokonaislukuPino.java
 *
 *
 * @author
 * @version 1.00 2019/6/12
 * Luokka k‰sittelee kokonaislukuja pinorakenteena.
 *
 *
 */
public class KokonaislukuPino {
	private int[] alkiot;
	private int koko;
	public static final int OLETUS_KOKO = 16;

/** Luo kokonaislukupinon, jonka koko on
 *  OLETUS_KOKO eli 16 lukua.
 */
	public KokonaislukuPino() {
		this(OLETUS_KOKO);
	}

/** Luo kokonaislukupinon, johon sopii parameterina
 *  annettu m‰‰r‰ kokonaislukuja.
 *  @param koko pinon alkioiden m‰‰r‰.
 */
    public KokonaislukuPino(int koko) {
    	alkiot = new int[koko];
    }

/** Lis‰‰ pinon p‰‰lle kokonaisluvun.
 *  @param arvo pinoon lis‰tt‰v‰ kokonaisluku.
 */
    public void lisaa(int arvo) {
    	if (koko >= alkiot.length) { // pinotaulukko tulisi t‰yteen
			// Luodaan taulukko, joka on kooltaan kaksinkertaienn
			// pinotaulukkoon n‰hden
    		int[] temp = new int[alkiot.length * 2];
			/* Java APIsta
			arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
			Copies an array from the specified source array, 
			beginning at the specified position, 
			to the specified position of the destination array. */
    		System.arraycopy(alkiot, 0, temp, 0, alkiot.length); // kopioidaan isompaan taulukkoon
    		alkiot = temp; // asetetaan "suurennettu" taulukko pinotaulukoksi
    	}
		// koko kertoo pinon alkioiden lukum‰‰r‰n ja
		// ensimm‰isen vapaan position pinossa
		// 1. Lis‰t‰‰n alkio taulukon positioon koko
		// 2. Kasvatetaan koko-muuttujan arvoa yhdell‰
		// alkiot[koko] = arvo;
		// koko = koko + 1;
    	alkiot[koko++] = arvo;
		
    }

/** Poistaa pinon p‰‰llimm‰isen alkion ja
 *  palauttaa sen.
 *  @return poistettu alkio.
 */
    public int poista() {
		// 1. v‰hennet‰‰n koko-muuttujan arvoa yhdell‰
		// -> muuttuja osoittaa positioon, jossa on pinon p‰‰llimm‰inen alkio ja
		// kertoo pinon alkioiden lukum‰‰r‰n poiston j‰lkeen
		// 2. Poistetaan alkio positiosta koko
		// koko = koko - 1;
		// return alkiot [koko];
    	return alkiot[--koko];
    }

/** Palauttaa pinon p‰‰llimm‰isen alkion.
 *  @return pinon p‰‰llimm‰inen alkio.
 */
    public int paallimmainen() {
	// koko osoittaa alkioiden lukum‰‰r‰n pinossa ja
	// koko - 1 p‰‰llim‰isen alkion position pinossa
	// (, koska aloitetaan positiosta nolla.)
    	return alkiot[koko - 1];
    }

/** Palauttaa tiedon onko pino tyhj‰.
 *  @return totuusarvo onko pino tyhj‰.
 */
    public boolean tyhja() {
		// palauttaa true, jos koko on 0, muutoin palauttaa false
    	return koko == 0;
    }

/** Palauttaa pinon alkioiden m‰‰r‰n.
 *  @return pinon alkioiden m‰‰r‰.
 */
    public int palautaKoko() {
    	return koko;
    }

}