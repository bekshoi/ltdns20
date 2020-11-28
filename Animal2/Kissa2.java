package Animal2;

/**
 * Luokka Kissa2
 * 
 * @author bekshoi
 * @version 3.00 2020/11/28
 * @ltdns20 http://github.com/bekshoi/ltdns20
 */

public class Kissa2 extends Animal2{

    /**ATTRIBUUTTI*/
    private int lives;

    /**LUOKAKONSTRKTORI*/
    /**
     * Luokan konstruktori
     * @param lives kokonaisluku, kissan elämä lukumääre 
     */
    public Kissa2(){
        // this.name = "Kissa";
        this.lives = 9;
    }

    public Kissa2(String name, int status) {
        super(name, status);
        this.lives = 9;
    }
    
    public Kissa2(String name, int status, int lives) {
        super(name, status);
        this.lives = lives;
    }
    /** METODI PALAUTTA KISSAN elämää LUKUMÄÄRE */
    /**
    * Palauttaa kissan elämää lukumääre
    * @return kissan elämää lukumääre
    */
    public final int getLives() {
        return lives;
    }

    /** metodi asettaa kissan elämää lukumääre */
    /**
     * Asetta kissan elämää lukumääre
     * 
     * @param lives kokonaisluku, metodissa on tarkastuus, kissan elämää ei voi > 9 ja < 0
     * @return viesti virheista jos käyttäjä yritää asettamaan kissan elämää lukumääre vähemmän kuin 1 tai enemään kuin 9
     */
    // On vielä tilaa ajatuksille, kun kissan elämää tulee nollaksi ehkä automatisesti muutii tilaksi "on kuollut" 
    public final void setLives(int lives) {
        // tarkista että kissalla on elämää enemään kuin 0 ja vähemään kuin 10
        // tarkista etta käyttäjä ei yrittää nosta kissan elämää lukumääre enemään kuin nykyinen (lives < this.lives)
        if (lives <= 9 && lives > 0 && lives < this.lives) {
            this.lives = lives;
        }
        else {
            System.out.println("Epäkelpoa arvoa, kisalla ei voi olla enemään kuin 9 elää");
            System.out.println("tai yritetään asettamaan elämää lukumääre enemään kuin nykyinen");
        }
    }

    /** metodi laskee kissan elämää lukumääre */
    /**
     * Laske kissan elämää lukumääre
     * 
     * @param lives kokonaisluku on tarkastuus, kissan elämää ei voi > 9 ja < 0
     * @return viesti virheista jos käyttäjä yritää asettamaan kissan elämää lukumääre vähemmän kuin 1 tai enemään kuin 9
     */

    // On vielä tilaa ajatuksille, kun kissan elämää tulee nollaksi ehkä automatisesti muutii tilaksi "on kuollut" 
    public final void LaskeLives(int lives) {

        // tarkista että kissalla on elämää enemään kuin 0 ja vähemään kuin 9 (koska lasketaan)
        if (lives <= 9 && lives > 0) {
            lives--;
            this.lives = lives;
        }
            else {
                System.out.println("Epäkelpoa arvoa, kisalla ei voi olla enemään kuin 9 elää");
        }
    }

    /** METODI PALAUTTA KISSAN TIEDOT */
    /**
    * Palauttaa kissan tiedot
    * @return kissan tiedot ja tila
    */
    @Override
    public String toString(){
        return "\nEläin \n" +
        "*********************************** \n" + 
        "Kissan nimi : " + super.getName() + "\n" + 
        "Kissan elämää lukumääre : " + lives + "\n" + 
        "*********************************** \n" +
        "Tila : " + super.getStatus() + "\n" +
        "*********************************** \n";
    }

    @Override
    public void Talk() {
        System.out.print("mau mau\n");
    }
}