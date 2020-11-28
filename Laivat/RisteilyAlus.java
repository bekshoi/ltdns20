package Laivat;

/**
 * Luokka RisteilyAlus
 * @author bekshoi
 * @version 1.00 2020/11/24
 */

public class RisteilyAlus extends Laiva {
    
    /**attribuutti*/
    private int maxmumpsngr; // maksimimatkustajamäärä (kokonaisluku)
    
    public RisteilyAlus(){
//        this.name = "Titanic";
//        this.year = "1911";
        this.maxmumpsngr = 2439;
    }

    /**
    * Luokan konstruktori
    * @param name merkijono
    * @param year merkijono
    * @param maxnumpsngr kokonaisluku, maksimimatkustajamäärä 
    */
    public RisteilyAlus(String name, String year, int maxnumpsngr) {
        super(name, year);
        this.maxmumpsngr = maxnumpsngr;
    }

    /** metodi palauttaa laivan maksimimatkustajamäärä 
    * @return kokonaisluku, palauttaa maksimimatkustajamäärä 
    */    
    public int getMaxnumpsngr() {
        return maxmumpsngr;
    }
    
    /** metodi asettaa maksimimatkustajamäärä
     * @param maxnumpsngr kokonaisluku, metodissa on tarkastuus, parametri ei voi olla negativinen
     * @return viesti virheista, jos parametri on negativinen
     */
    public void setMaxnumpsngr(int maxmumpsngr) {
        if (maxmumpsngr >= 0) {
            this.maxmumpsngr = maxmumpsngr;
        }
            else {
                System.out.println("Epäkelpoa arvoa, parametri ei voi olla negativinen");
        }
    }
     /**
     * Palauttaa laivan tiedot
     * @return laivan tiedot
     */
    @Override
    public String toString(){
        return "\nTietoa risteilyaluksesta: \n" +
        "*********************************** \n" + 
        "Laivan  nimi : " + super.getName() + "\n" + 
        "Laivan maksimimatkustajamäärä : " + maxmumpsngr + "\n" +
        "*********************************** \n";
    }
}