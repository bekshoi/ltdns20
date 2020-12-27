package HarjateluEs;

import java.io.*;

/**
 * Luokka Suoritus. jolla on attribuutteja: <b>opiskelija_id</b>, <b>kurssi_id</b>, <b>arvosana</b>, 
 * <b>suotitus_pvm</b>. Luokka on suunniteltu tekemään harjoitus työtä Olioohjelmointi-kurssin varten. 
 * Lähdemateriaalina kohteliaasti @author Eero Mönkkönen.
 * @author bekshoi
 * @version 1.00 2020/12/21
 */

public class Suoritus implements Serializable{
    
    /* Declare a static final serialVersionUID field of type long for Serializable */
    private static final long serialVersionUID = 1L;

    /* Attribuutteja */
    public int opiskelija_id;
    public int kurssi_id;
    public int arvosana;
    public String suoritus_pvm; // vvvvkkpp
    
    /**
     * Oliokonstruktori - parametritton
     * @see Suoritus#Suoritus(int, int, int, String)
     */
    public Suoritus(){
    }

    /**
     * Oliokonstruktori - parametrillinen
     * @param opiskelija_id     kokonaisluku, opiskelijan tunnusnumero
     * @param kurssi_id         kokonaisluku, kurssin tunnusnumero
     * @param arvosana          kokonaisluku, opiskelijan arvosana
     * @param suoritus_pvm      merkijono, suoritus päivämäärä
     */
    public Suoritus(int opiskelija_id, int kurssi_id, int arvosana, String suoritus_pvm){
        this.opiskelija_id=opiskelija_id;
        this.kurssi_id=kurssi_id;
        this.arvosana=arvosana;
        this.suoritus_pvm=suoritus_pvm;
    }

    /**
     * Metodi asettaa opiskelijan tunnusnumero arvon {@link Suoritus#opiskelija_id}
     * @param opiskelija_id kokonaisluku, opiskelijan tunnusnumero
     */
    public void setOpiskelijaId(int opiskelija_id){
        this.opiskelija_id=opiskelija_id;
    }

    /**
     * Metodi palauttaa opiskelijan tunnusnumero arvon {@link Suoritus#opiskelija_id}
     * @return palauttaa opiskelijan tunnusnumero arvon
     */
    public int getOpiskelijaId(){
        return opiskelija_id;
    }

    /**
     * Metodi asettaa kurssin tunnusnumero arvon {@link Suoritus#kurssi_id}
     * @param kurssi_id kokonaisluku, kurssin tunnusnumero
     */
    public void setKurssiId(int kurssi_id){
        this.kurssi_id=kurssi_id;
    }    

    /**
     * Metodi palauttaa kurssin tunnusnumero arvon {@link Suoritus#kurssi_id}
     * @return palauttaa kurssin tunnusnumero arvon
     */
    public int getKurssiId(){
        return kurssi_id;
    }

    /**
     * Metodi asettaa opiskelijan arvosana arvon {@link Suoritus#arvosana}
     * @param arvosana kokonaisluku, opiskelijan arvosana
     */
    public void setArvosana(int arvosana){
        this.arvosana=arvosana;
    }    

    /**
     * Metodi palauttaa opiskelijan arvosana arvon {@link Suoritus#arvosana}
     * @return palauttaa opiskelijan arvosana
     */
    public int getArvosana() {
		return arvosana;
    }

    /**
     * Metodi asettaa kurssin suoritus päivämäärä {@link Suoritus#suoritus_pvm}
     * @param suoritus_pvm merkijono, kurssin suoritus päivämäärä
     */
    public void setSuoritusPVM(String suoritus_pvm){
        this.suoritus_pvm=suoritus_pvm;
    }    

    /**
     * Metodi palauttaa kurssin suoritus päivämäärä {@link Suoritus#suoritus_pvm}
     * @return kurssin suoritus päivämäärä
     */
    public String getSuoritusPVM() {
		return suoritus_pvm;
    }

    /**
     * Metodi palauttaa suorituksen tiedot
     * @return suorituksen tiedot
     */
    @Override
    public String toString(){
        return getOpiskelijaId() + " " + getKurssiId() + " " + getArvosana() + " " + getSuoritusPVM();
    }
}