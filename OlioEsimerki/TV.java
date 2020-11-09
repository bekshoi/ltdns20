/**
 * @(#)TV.java
 *
 * Luokka simuloi television toimintaa
 *
 * @author
 * @version 1.00 2019/6/12
 */


public class TV {
	int kanava = 1;  // Oletuskanava on 1
	int aanenVoimakkuus = 1;  //  Oletus äänen voimakkuudelle on 1
	boolean auki = false;   // Oletuksena TV on suljettu.

    public TV() {
    }

    public void avaa() {
    	auki = true;
    }

    public void sulje() {
    	auki = false;
    }

    public void asetaKanava (int uusiKanava) {
    	if (auki && uusiKanava >= 1 && uusiKanava <= 120)
    		kanava = uusiKanava;
    }

    public void asetaAani (int uusiVoimakkuus) {
    	if (auki && uusiVoimakkuus >= 1 && uusiVoimakkuus <= 7)
    		aanenVoimakkuus = uusiVoimakkuus;
    }

    public void seuraavaKanava() {
    	if (auki && kanava < 120)
    		kanava++;
    }

    public void edellinenKanava() {
    	if (auki && kanava > 1)
    		kanava--;
    }

    public void aantaLisaa() {
    	if (auki && aanenVoimakkuus < 7)
    		aanenVoimakkuus++;
    }

    public void aantaVahemman() {
    	if (auki && aanenVoimakkuus > 1)
    		aanenVoimakkuus--;
    }


}