package Animal2;

/**
 * Luokka Lammas2
 * 
 * @author bekshoi
 * @version 3.00 2020/11/28
 * @ltdns20 http://github.com/bekshoi/ltdns20
 */

 public class Lammas2 extends Animal2{
    
    /**ATTRIBUUTTI*/
    private String vari;

    /**LUOKAKONSTRKTORI*/
    /**
     * Luokan konstruktori
     * @param vari merkijono, lampaan väri 
     */
    
    public Lammas2(String name, int status) {
        super(name, status);
        this.vari = "valkoinen";
    }
    public Lammas2(String name, int status, String vari) {
        super(name, status);
        this.vari = vari;
    }
    
    /**
     * metodi palauttaa lampaan väri
     * @return väri merkijono
     */
    public String getVari(){
        return vari;
    }

    /**
     * metodi asettaa lampaan väri
     * @param vari merkijono
     */
    public void setVari(String vari){
        this.vari = vari;
    }

    /** METODI PALAUTTA LAMPAAN TIEDOT */
    /**
    * Palauttaa lampaan tiedot
    * @return lamppan tiedot ja tila
    */
    @Override
    public String toString(){
        return "\nEläin \n" +
        "*********************************** \n" + 
        "Lampaan nimi : " + super.getName() + "\n" + 
        "Lampaan vaari : " + vari + "\n" + 
        "*********************************** \n" +
        "Tila : " + super.getStatus() + "\n" +
        "*********************************** \n";
    }
    /**METODI PALAUTAA ELÄIMEN ÄÄNI */
    @Override
    public void Talk() {
        System.out.print("bää bää\n");
    }
}