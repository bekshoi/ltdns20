package Animal;

/**
 * Luokka Animal
 * @author bekshoi
 * @version 2.50 2020/11/22
 */

public class Animal {

    /**ATTRIBUUTTI*/
    public String name;
    public int status; // 1 - eläin on elossa, 0 - eläin on kuollut

    /**LUOKAKONSTRKTORI*/
    /**
     * Luokan konstruktori
     * @param name merkijono, eläimen nimi ei voi olla tyhjä 
     * @param status kokonaisluvut - 0 tai 1, eläin on elossa - 1, eläin on kuollut - 0, 
     * oletusarvoisesti eläin on elossa (tila on 1)
     */

    public Animal() {
        this.name = "Eläin";
        this.status = 1; //asetta eläimen tila oletusarvoisesti kuin eläin on elossa 
    }
    
    public Animal(String name, int status) {
        this.name = name;
        this.status = status;
    }

    /** METODI PALAUTTA ELÄIMEN NIMI */
    /**
    * Palauttaa eläimen nimi
    * @return eläimen nimi
    */
    public String getName() {
        return name;
    }

    /** metodi asettaa eläimen nimi */
    /**
     * Asetta eläimen nimi
     * 
     * @param name merkijono metodissa on tarkastuus, eläimen nimi ei voi asetta tyhja
     * @return viesti virheista jos nimi on tyhja 
     */
    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
            else {
                System.out.println("Epäkelpoa arvoa, eläimen nimi ei voi olla tyhjä");
        }
    }

    /** METODI PALAUTTA ELÄIN TILA */
    /**
    * Palauttaa eläin tila, metodi konvertoida luku viestiksi 
    * @return eläin tila kuten merkijono
    */
    public String getStatus() {
        String x = "";
        switch (status){
            case 0:
            x = "on kuollut";
            break;
            case 1:
            x = "on elossa";
            break;}
        return x;
    }

    /** metodi asettaa eläimen tila */
    /**
     * Asetta eläimen tila
     * @param name kokonaisluku
     * metodissa on tarkastuus, eläimen tila voidaan asettaa vain arvoon 0 - eläin on kuollut
     * @return viesti virheista jos käyttäjä yritää asettamaan epäkelpoa arvoa 
     */
    public void setStatus(int status) {
        if (status == 0) {
            this.status = status;
        }
            else {
                System.out.println("Epäkelpoa arvoa, voidaan asettaa vain arvoon 0 - eläin on kuollut");
       }
    }
    /** METODI PALAUTTA KISSAN TIEDOT */
    /**
    * Palauttaa kissan tiedot
    * @return kissan tiedot ja tila
    */
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
        "Eläin nimi : " + name + "\n" + 
        "*********************************** \n" +
        "Tila : " + status + " - " + x + "\n" +
        "*********************************** \n";
    }
}