/**
 * @(#)Laina.java
 *
 * Luokka, jolla hallitaan lainoja
 *
 * @author
 * @version 1.00 2019/6/14
 */


public class Laina {
	private double vuosiKorko;
	private int lainaVuodet;
	private double lainaMaara;
	private java.util.Date lainaPaiva;

    public Laina() {
    	this(2.5, 1, 1000);
    }

    public Laina(double vuosiKorko, int lainaVuodet,
    	double lainaMaara) {
    		this.vuosiKorko = vuosiKorko;
    		this.lainaVuodet = lainaVuodet;
    		this.lainaMaara = lainaMaara;
    		lainaPaiva = new java.util.Date();
    	}

    public double palautaVuosiKorko() {
    	return vuosiKorko;
    }

    public void asetaVuosiKorko(double vuosiKorko) {
    	this.vuosiKorko = vuosiKorko;
    }

    public int palautaLainaVuodet() {
    	return lainaVuodet;
    }

    public void asetaLainaVuodet( int lainaVuodet) {
    	this.lainaVuodet = lainaVuodet;
    }

    public double palautaLainaMaara() {
    	return lainaMaara;
    }

    public void asetaLainaMaara( double lainaMaara) {
    	this.lainaMaara = lainaMaara;
    }

    public double palautaKuukausiEra() {
    	double kuukausiKorko = vuosiKorko / 1200;
    	double kuukausiMaksu = lainaMaara * kuukausiKorko /
    		(1 - (Math.pow(1 / (1 + kuukausiKorko), lainaVuodet * 12)));
    	return kuukausiMaksu;
    }

    public double palautaKokoMaksu() {
    	double kokonaisMaksu = palautaKuukausiEra() * lainaVuodet * 12;
    	return kokonaisMaksu;
    }

    public java.util.Date palautaLainaPaiva() {
    	return lainaPaiva;
    }


}