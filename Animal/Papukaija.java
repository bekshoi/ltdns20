package Animal;

/**
 * Luokka Papukaija
 * 
 * @author bekshoi
 * @version 2.50 2020/11/22
 * 
 */

public class Papukaija extends Animal{
        
    /**ATTRIBUUTTI*/
    private String merirosvoisanta;

    /**LUOKAKONSTRKTORI*/
    /**
     * Luokan konstruktori
     * @param name merkijono
     * @param status kokonaisluku
     * @param merirosvoisanta merkijono, papukaija merirosvoisäntän nimi 
     */
    public Papukaija(String name, int status) {
        super(name, status);
        this.merirosvoisanta = "John_Silver";
    }
    public Papukaija(String name, int status, String merirosvoisanta) {
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
        String x = "";
        switch (status){
            case 0:
            x = "on kuollut";
            break;
            case 1:
            x = "on elossa";
            break;
            }
             
        return "\nEläin \n" +
        "*********************************** \n" + 
        "Papukaijan nimi : " + name + "\n" + 
        "Papukaijan merirosvoisäntä nimi : " + merirosvoisanta + "\n" + 
        "*********************************** \n" +
        "Tila : " + status + " - " + x + "\n" +
        "*********************************** \n";
    }

}