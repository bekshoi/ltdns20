package Laivat;

/**
 * Luokka Laiva
 * @author bekshoi
 * @version 1.00 2020/11/24
 * 
 * Tee luokka Laiva, joka koostuu seuraavista asioista:
 * kenttä laivan nimelle (merkkijono)
 * kenttä laivan rakennusvuodelle (merkkijono)
 * alustaja sekä set- ja get-metodit
 * toString-metodi joka palauttaa laivan nimen ja rakennusvuoden
 * 
 * Tee luokka RisteilyAlus, joka on luokan Laiva aliluokka. Se muodostuu seuraavista osista:
 * kenttä maksimimatkustajamäärälle (kokonaisluku)
 * alustaja sekä set- ja get-metodit
 * toString-metodi, joka ylikirjoittaa yliluokan toString-metodin, 
 * ja näyttää vain laivan nimet ja matkustajamäärän.
 * 
 * Tee luokka Tankkeri, joka on luokan Laiva aliluokka. Luokka muodostuu seuraavista osista:
 * kenttä lasti, joka kertoo lastin maksimimäärän tonneina (kokonaisluku)
 * alustaja sekä set- ja get-metodit, toString-metodi, joka ylikirjoittaa yliluokan toString-metodin. 
 * Se näyttää vain laivan nimen ja lastin maksimimäärän.
 * 
 * Tee pääohjelma, jossa käsittelet luokkien Laiva, RisteilyAlus ja Tankkeri olioita taulukossa. 
 * Luo taulukkoon ainakin yksi olio kustakin luokasta ja käy sitten taulukko läpi ja tulosta olioiden tiedot.
 * (YDINASIAA)
 * 
 */

public class Laiva {

    /**attribuutti*/
    private String name; // laivan nimi
    private String year; // rakennusvuosi
    
    /**luokakonstruktori
     * @param name merkijono, laivan nimi
     * @param year merkijono, rakennusvuosi
     */
    public Laiva(){
        this.name = "Avrora";
        this.year = "1917";
    }
    
    public Laiva(String name, String year) {
        this.name = name;
        this.year = year; 
    }

    /** metodi palauttaa laivan nimi
    * @return merkijono, laivan nimi
    */    
    public String getName() {
        return name;
    }

    /** metodi palauttaa laivan rakennusvuosi
    * @return merkijono, laivan rakennusvuosi
    */    
    public String getYear() {
        return year;
    }
    
    /** metodi asettaa laivan nimi
     * @param name merkijono metodissa on tarkastuus, nimi ei saa asetta tyhja
     * @return viesti virheista, jos nimi on tyhja 
     */
    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
            else {
                System.out.println("Epäkelpoa arvoa, nimi ei voi olla tyhjä");
        }
    }

     /** metodi asettaa laivan rakennusvuosi
     * @param year merkijono, metodissa on tarkastuus, merkijonon pituus on pakko olla 4 merkiä
     * @return viesti virheista, jos merkijonon pituus muu, kuin 4 merkkiä   
     */
    public void setYear(String year) {
        if (year.length() == 4) {
            this.year = year;
        }
            else {
                System.out.println("Epäkelpoa arvoa, vuosi on aina 4 merkkiä");
            }
        }

     /**
     * Palauttaa laivan tiedot
     * @return laivan tiedot
     */
     public String toString(){
        return "\nTietoa laivasta: \n" +
        "*********************************** \n" + 
        "Laivan nimi : " + name + "\n" + 
        "Laivan rakennusvuosi : " + year + "\n" +
        "*********************************** \n";
    }
}