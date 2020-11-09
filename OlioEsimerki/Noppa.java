
import java.util.Random;
/**
 * Luokka simuloi 6-sivuista noppaa
 * @author 
 */
public class Noppa {
    private int sivut;
    private int arvo;

    /**
     * Alustaja heittaa ensimmaisen kerran noppaa.
     * @param sivut Nopan sivujen maara.
     */
    public Noppa(int sivut) {
        this.sivut = sivut;
        heita();
    }
    /**
     * Metodi simuloi nopan heittamista.
     */
    public void heita() {
        Random rand = new Random();
        arvo = rand.nextInt(sivut) + 1;
    }
/**
 * getSivut metodi
 * @return Nopan sivujen maara.
 */
    public int getSivut() {
        return sivut;
    }
/**
 * getArvo metodi
 * @return Nopan heiton arvo.
 */
    public int getArvo() {
        return arvo;
    }
    
}