package Animal2;

/**
 * Luokka Papukaija2
 * 
 * @author bekshoi
 * @version 3.00 2020/11/28
 * @ltdns20 http://github.com/bekshoi/ltdns20
 */

public class Papukaija2 extends Animal2{
        
    /**ATTRIBUUTTI*/
    private String merirosvoisanta;

    /**LUOKAKONSTRKTORI*/
    /**
     * Luokan konstruktori
     * @param name merkijono
     * @param status kokonaisluku
     * @param merirosvoisanta merkijono, papukaija merirosvoisäntän nimi 
     */
    public Papukaija2(String name, int status) {
        super(name, status);
        this.merirosvoisanta = "John Silver";
    }
    public Papukaija2(String name, int status, String merirosvoisanta) {
        super(name, status);
        this.merirosvoisanta = merirosvoisanta;
    }
    
    /** METODI PALAUTTA PAPUKAIJAN MERIROSVOISÄNTÄ NIMI */
    /**
    * Palauttaa papukaijan merirosvoisäntä nimi
    * @return papukaijan merirosvoisäntä nimi
    */
    public final String getMerirosvoisantaNimi() {
        return merirosvoisanta;
    }

    /** metodi asettaa eläimen nimi */
    /**
     * Asetta papukaijan merirosvoisäntä nimi
     * 
     * @param merirosvoisanta merkijono metodissa on tarkastuus, nimi ei voi asetta tyhja
     * @return viesti virheista jos nimi on tyhja 
     */
    public void setMerirosvoisanta(String merirosvoisanta) {
        if (merirosvoisanta.length() > 0) {
            this.merirosvoisanta = merirosvoisanta;
        }
            else {
                System.out.println("Epäkelpoa arvoa, nimi ei voi olla tyhjä");
        }
    }
    
    /** METODI PALAUTTA PAPUKAIJAN TIEDOT */
    /**
    * Palauttaa papukaijan tiedot
    * @return papukaijan tiedot ja tila
    */
    @Override
    public String toString(){
        return "\nEläin \n" +
        "*********************************** \n" + 
        "Papukaijan nimi : " + super.getName() + "\n" + 
        "Papukaijan merirosvoisäntä nimi : " + merirosvoisanta + "\n" + 
        "*********************************** \n" +
        "Tila : " + super.getStatus() + "\n" +
        "*********************************** \n";
    }

    @Override
    public void Talk() {
        System.out.print("Piastereita!!!\n");
    }
}