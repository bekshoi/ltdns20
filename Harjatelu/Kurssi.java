package Harjatelu;

import java.util.LinkedList;

/** 
 * Luokka Kurssi jolla on attribuutteja: <b>kurssi_id</b>, <b>nimi</b>, <b>opintopistet</b>, 
 * <b>kuvaus</b>.
 * 
 * @author bekshoi
 * @version 0.50 2020/12/21
 * @ltdns20 http://github.com/bekshoi/ltdns20
 * 
*/

public class Kurssi {

    /** Attribuutteja */
    public int kurssi_id;
    public String nimi;
    public int opintopisteet;
    public String kuvaus;
    LinkedList<Suoritus> suoritukset = new LinkedList<Suoritus>();

    public Kurssi() {

    }

    public Kurssi(int kurssi_id, String nimi, int opintopisteet, String kuvaus) {
        
    }

    public void setKursiID(int kurssi_id){
        this.kurssi_id=kurssi_id;
    }

    public int getKurssiID(){
        return kurssi_id;
    }

    public void setKurssiNimi(String nimi){
        this.nimi=nimi;
    }

    public String getKurssiNimi(){
        return nimi;
    }
    
    public void setCredit(int opintopisteet){
        this.opintopisteet=opintopisteet;
    }

    public int getCredit(){
        return opintopisteet;
    }

    public void setKuvaus(String kuvaus){
        this.kuvaus=kuvaus;
    }

    public String getKuvaus(){
        return kuvaus;
    }

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
        getKurssinSuoritukset() + "\n" +
        "*********************************** \n";
    }

    public LinkedList<Suoritus> getKurssinSuoritukset(){
        return suoritukset;
    }

    public String getKurssinOpiskelijat(){
        return null;
    }
}