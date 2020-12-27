package HarjateluEs;

import java.io.*;
import java.util.*;

/** 
 * Luokka Kurssi jolla on attribuutteja: <b>kurssi_id</b>, <b>nimi</b>, <b>opintopistet</b>, 
 * <b>kuvaus</b>. Luokka on suunniteltu tekemään harjoitus työtä Olioohjelmointi-kurssin varten. 
 * Lähdemateriaalina kohteliaasti @author Eero Mönkkösesta.
 * Huomio. Luokkaan taytyy toimiva (tekeva) metodeja. 
 * @author bekshoi
 * @version 1.00 2020/12/21
 */

public class Kurssi implements Serializable{

    /* Declare a static final serialVersionUID field of type long for Serializable */
     private static final long serialVersionUID = 1L;

    /* Attribuutteja */
    public int kurssi_id;
    public String nimi;
    public int opintopisteet;
    public String kuvaus;

    /* Linkeja */
    ArrayList<Suoritus> suoritukset = new ArrayList<Suoritus>();

    /**
     * Oliokonstruktori - parametritton
     * @see Kurssi#Kurssi(int, String, int, String)
     */    
    public Kurssi() {
    }

    /**
     * Oliokonstruktori - parametrillinen
     * @param kurssi_id         kokonaisluku, kurssin tunnusnumero
     * @param nimi              merkijono, kurssin nimi
     * @param opintopisteet     kokonaisluku, kurssin opintopisteet
     * @param kuvaus            merkijono, kurssin kuvaus
     */
    public Kurssi(int kurssi_id, String nimi, int opintopisteet, String kuvaus) {
        this.kurssi_id=kurssi_id;
        this.nimi=nimi;
        this.opintopisteet=opintopisteet;
        this.kuvaus=kuvaus;
    }

    /**
     * Metodi asettaa kurssin tunnusnumero arvon {@link Kurssi#kurssi_id}
     * @param kurssi_id kokonaisluku, kurssin tunnusnumero
     */
    public void setKursiID(int kurssi_id){
        this.kurssi_id=kurssi_id;
    }

    /**
     * Metodi palauttaa kurssin tunnusnumero arvon {@link Kurssi#kurssi_id}
     * @return palauttaa kurssin tunnusnumero arvon
     */
    public int getKurssiID(){
        return kurssi_id;
    }

    /**
     * Metodi asettaa kurssin nimi {@link Kurssi#nimi}
     * @param nimi merkijono, kurssin nimi
     */
     public void setKurssiNimi(String nimi){
        this.nimi=nimi;
    }

    /**
     * Metodi palauttaa kurssin nimi {@link Kurssi#nimi}
     * @return kurssin nimi
     */
    public String getKurssiNimi(){
        return nimi;
    }
    
    /**
     * Metodi asettaa kurssin opintopisteet {@link Kurssi#opintopisteet}
     * @param opintopisteet kokonaisluku, kurssin opintopisteet
     */
    public void setCredit(int opintopisteet){
        this.opintopisteet=opintopisteet;
    }

    /**
     * Metodi palauttaa kurssin opintopisteet {@link Kurssi#opintopisteet}
     * @return kurssin opintopisteet
     */
    public int getCredit(){
        return opintopisteet;
    }

    /**
     * Metodi asettaa kurssin kuvaus {@link Kurssi#kuvaus}
     * @param kuvaus merkijono, kurssin kuvaus
     */
    public void setKuvaus(String kuvaus){
        this.kuvaus=kuvaus;
    }

    /**
     * Metodi palauttaa kurssin kuvaus {@link Kurssi#kuvaus}
     * @return kurssin kuvaus
     */
    public String getKuvaus(){
        return kuvaus;
    }

    /**
     * Metodi palauttaa kurssin tiedot
     * @return kurssin tiedot
     */
    @Override
    public String toString(){
        return "\nKurssi \n" +
        "*********************************** \n" + 
        getKurssiID() + "\n" + 
        getKurssiNimi() + "\n" +
        getCredit() + "\n" +
        getKuvaus() + "\n" +
        "*********************************** \n" +
        "Kurssin suoritukset : " + "\n" +
        "*********************************** \n" +
        getKurssinSuoritukset(getKurssiID()) + "\n" +
        "*********************************** \n";
    }

    /**
     * Metodi palauttaa 
     * @return
     */
    public ArrayList<Suoritus> getKurssinSuoritukset(int kur){
        ArrayList<Suoritus> kurList = new ArrayList<Suoritus>();
		FileInputStream suoritukset = null;
		ObjectInputStream suor_in = null;
		try {
            suoritukset = new FileInputStream("C:\\MyRepos\\ltdns20\\HarjateluEs\\suoritus.dat");
            suor_in = new ObjectInputStream(suoritukset);
            Suoritus suorOlio = null;
            for (int i = 0; i < 13; i++) {
                suorOlio = (Suoritus)suor_in.readObject();
				if (suorOlio.getKurssiId() == kur) {
					kurList.add(suorOlio);		
                }
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace ();
         }
         catch (Exception ex) {
             ex.printStackTrace ();
         }
        return kurList;
    }

    /**
     * Metodi ei toimii tällä hetkellä
     * @return
     */
    public String getKurssinOpiskelijat(){
        return null;
    }
}