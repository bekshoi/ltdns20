/**
 * Suorakulmio.java kuvaa yksinkertaista suorakulmiota
 * joka sisältää myäs geometrisen olion yleisen ominaisuudet.
 *
 */
public class Kolmio extends GeometrinenOlio {

	/** Suorakulmion leveys ja korkeus */
	private double m_kanta;
	private double m_korkeus;

    /** Luodaan nollan kokoinen suorakulmio */
    public Kolmio() {
    }

    /** Luodaan tietyn kokoinen suorakulmio
     *  @param leveys
     *  @param korkeus
     */
    public Kolmio(double kanta, double korkeus) {
    	this.m_kanta = kanta;
    	this.m_korkeus = korkeus;
    }

    /** Luodaan suorakulmio jolla on tietty koko, väri ja täytetty
     *  @param leveys
     *  @param korkeus
     *  @param vari
     *  @param taytetty
     */
    public Kolmio(double kanta, double korkeus, String vari,
    	    boolean taytetty) {
    	this.m_kanta = kanta;
    	this.m_korkeus = korkeus;
    	setVari(vari);
    	setTaytetty(taytetty);
    	// Tai: super(vari, taytetty); -> kutsutaan kantaluokan konstrukrotia!
    }

    /** Palautetaan leveys
     *  @return leveys*/
    public double getKanta() {
    	return m_kanta;
    }

    /** Asetetaan uusi leveys
     *  @param leveys
     */
    public void setKanta(double kanta) {
    	this.m_kanta = kanta;
    }

    /** Palautetaan korkeus
     *  @return korkeus*/
    public double getKorkeus() {
    	return m_korkeus;
    }

    /** Asetetaan uusi korkeus
     *  @return korkeus*/
    public void setKorkeus(double korkeus) {
    	this.m_korkeus = korkeus;
    }

    /** Palautetaan ala
     *  @return suorakulmion ala*/
    public double getAla() {
    	return m_kanta * m_korkeus / 2;
    }

    /** Palautetaan piiri
     *  @return suorakulmion piiri
     */
   
	public double getKeha() {
    	return 2 * (m_kanta + m_korkeus);
    }
	
}