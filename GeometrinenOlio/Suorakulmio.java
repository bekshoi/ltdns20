/**
 * Suorakulmio.java kuvaa yksinkertaista suorakulmiota
 * joka sisältää myäs geometrisen olion yleisen ominaisuudet.
 *
 */
public class Suorakulmio extends GeometrinenOlio {

	/** Suorakulmion leveys ja korkeus */
	private double m_leveys;
	private double m_korkeus;

    /** Luodaan nollan kokoinen suorakulmio */
    public Suorakulmio() {
    }

    /** Luodaan tietyn kokoinen suorakulmio
     *  @param leveys
     *  @param korkeus
     */
    public Suorakulmio(double leveys, double korkeus) {
    	this.m_leveys = leveys;
    	this.m_korkeus = korkeus;
    }

    /** Luodaan suorakulmio jolla on tietty koko, väri ja täytetty
     *  @param leveys
     *  @param korkeus
     *  @param vari
     *  @param taytetty
     */
    public Suorakulmio(double leveys, double korkeus, String vari,
    	    boolean taytetty) {
    	this.m_leveys = leveys;
    	this.m_korkeus = korkeus;
    	setVari(vari);
    	setTaytetty(taytetty);
    	// Tai: super(vari, taytetty); -> kutsutaan kantaluokan konstrukrotia!
    }

    /** Palautetaan leveys
     *  @return leveys*/
    public double getLeveys() {
    	return m_leveys;
    }

    /** Asetetaan uusi leveys
     *  @param leveys
     */
    public void setLeveys(double leveys) {
    	this.m_leveys = leveys;
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
    	return m_leveys * m_korkeus;
    }

    /** Palautetaan piiri
     *  @return suorakulmion piiri
     */
   
	public double getKeha() {
    	return 2 * (m_leveys + m_korkeus);
    }
	
}