/**
 * @(#)BMI.java
 *
 * Luokka painoindeksin laskentaan
 *
 * @author
 * @version 1.00 2019/6/14
 */


public class BMI {
	private String nimi;
	private int ika;
	private double paino;
	private double pituus;

    public BMI(String nimi, int ika, double paino, double pituus) {
    	this.nimi = nimi;
    	this.ika = ika;
    	this.paino = paino;
    	this.pituus = pituus;
    }

    public BMI(String nimi, double paino, double pituus) {
    	this(nimi, 20, paino, pituus);
    }

    public double palautaBMI() {
    	double bmi = paino / (pituus * pituus);
    	return Math.round(bmi * 100) / 100.0;
    }

    public String palautaTila() {
    	double bmi = palautaBMI();
    	if (bmi < 16)
    		return("Olet vakavasti alipainoinen.");
    	else if (bmi < 18)
    		return("Olet alipainoinen");
    	else if (bmi < 24)
    		return("Olet normaalipainoinen");
    	else if (bmi < 29)
    		return("Olet ylipainoinen");
    	else if (bmi < 35)
    		return("Olet selvästi ylipainoinen");
    	else
    		return("Olet vakavasti ylipainoinen");
    }

    public String palautaNimi() {
    	return nimi;
    }

    public int palautaIka() {
    	return ika;
    }

    public double palautaPaino() {
    	return paino;
    }

    public double palautaPituus() {
    	return pituus;
    }



}