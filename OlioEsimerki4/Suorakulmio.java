/**
 * @(#)Suorakulmio.java
 *
 *
 * @author
 * @version 1.00 2011/4/5
 */


public class Suorakulmio extends GeometrinenOlio {
	private double leveys;
	private double korkeus;

    public Suorakulmio() {
    }

    public Suorakulmio(double leveys, double korkeus) {
    	this.leveys = leveys;
    	this.korkeus = korkeus;
    }

    public Suorakulmio(double leveys, double korkeus,
    	String vari, boolean taytetty){
    	super(vari, taytetty);
    	this.leveys = leveys;
    	this.korkeus = korkeus;
    }

    /** Palautetaan leveys */
    public double getLeveys() {
    	return leveys;
    }

    /** Asetetaan uusi leveys */
    public void setLeveys(double leveys) {
    	this.leveys = leveys;
    }

    /** Palautetaan korkeus */
    public double getKorkeus() {
    	return korkeus;
    }

    /** Asetetaan uusi korkeus */
    public void setKorkeus(double korkeus) {
    	this.korkeus = korkeus;
    }

    /** Palautetaan ala */
    public double getAla(){
    	return leveys * korkeus;
    }

    /** Palautetaan kehä */
    public double getKeha() {
    	return 2 * (leveys + korkeus);
    }


}