/**
 * Luokka Auto
 * @author  bekshoi
 * @version 1.00 2020/11/5
 * 
 */
public class Auto {

    private String merkki; //atributti1
    private String reknro; //atributti2
    private int nopeus; // attribuutti2?

    /**
     * Luokan konstruktori
     * @param m merkijono
     * @param r merkijono
     */

public Auto (String m, String r){
    merkki=m;
    reknro = r;
    nopeus = 0;
}
    //getterit
    /**
     * Palautta nopeuden
     * @return auton nopeus
     */
    public int palautaNopeus() {
        return nopeus;
    }
    
    /**
    * Palauttaa auton tiedot
    * @return auton tiedot
    */
    @Override
    public String toString(){
        return merkki + " (" + reknro + ") - nopeus " + nopeus +"km/h";
    }

    //setterit
    /**
     * Kihdyttää 10 km/h
     */
    public void kiihdyta() {
        if (nopeus < 120)
        nopeus += 10;
    }

    /**
     * Jarutta nopeuden
     */
    public void jarruta() {
        nopeus = 0;
    }
}