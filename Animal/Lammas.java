package Animal;

/**
 * Luokka Lammas
 * 
 * @author bekshoi
 * @version 2.50 2020/11/22
 * 
 */

 public class Lammas extends Animal{
    
    /**ATTRIBUUTTI*/
    private String vari;

    /**LUOKAKONSTRKTORI*/
    /**
     * Luokan konstruktori
     * @param vari merkijono, lampaan väri 
     */
    public Lammas(String name, int status) {
        super(name, status);
        this.vari = "valkoinen";
    }
    public Lammas(String name, int status, String vari) {
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
        "Lampaan nimi : " + name + "\n" + 
        "Lampaan vaari : " + vari + "\n" + 
        "*********************************** \n" +
        "Tila : " + status + " - " + x + "\n" +
        "*********************************** \n";
    }
}