package Laivat;

/**
 * Luokka Tankeri
 * @author bekshoi
 * @version 1.00 2020/11/24
 */

public class Tankeri extends Laiva{
    private int cargo; // lasti (kokonaisluku)

    public Tankeri(){
//        this.name = "Knock Nevis";
//        this.year = "1985";
          this.cargo = 600000;
    }

    /**
     * Luokan konstruktori
     * @param name merkijono
     * @param year merkijono
     * @param cargo kokonaisluku, lastin maksimimäärän tonneina (kokonaisluku)
     */
    public Tankeri(String name, String year, int cargo) {
        super(name,year);
        this.cargo=cargo;
    }
    /** metodi palauttaa tankerin lasti 
    * @return kokonaisluku, palauttaa tankerin lasti 
    */    
    public int getCargo() {
        return cargo;
    }
    
    /** metodi asettaa tankerin lasti
     * @param maxnumpsngr kokonaisluku, metodissa on tarkastuus, parametri ei voi olla negativinen
     * @return viesti virheista, jos parametri on negativinen
     */
    public void setCargo(int cargo) {
        if (cargo >= 0) {
            this.cargo = cargo;
        }
            else {
                System.out.println("Epäkelpoa arvoa, parametri ei voi olla negativinen");
        }
    }
     /**
     * Palauttaa tankerin tiedot
     * @return tankerin tiedot
     */
    @Override
    public String toString(){
        return "\nTietoa tankerista: \n" +
        "*********************************** \n" + 
        "Tankerin nimi : " + super.getName() + "\n" + 
        "Tankerin lasti : " + cargo + "\n" +
        "*********************************** \n";
    }
}