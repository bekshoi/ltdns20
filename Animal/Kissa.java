package Animal;

/**
 * Luokka Kissa
 * 
 * @author bekshoi
 * @version 2.50 2020/11/22
 * 
 */

public class Kissa extends Animal{

    /**ATTRIBUUTTI*/
    private int lives;

    /**LUOKAKONSTRKTORI*/
    /**
     * Luokan konstruktori
     * @param lives kokonaisluku, kissan elämä lukumääre 
     */
    public Kissa(){
        this.name = "Kissa";
        this.lives = 9;
    }

     public Kissa(String name, int status) {
        super(name, status);
        this.lives = 9;
    }
    
    public Kissa(String name, int status, int lives) {
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
        "Kissan nimi : " + name + "\n" + 
        "Kissan elämää lukumääre : " + lives + "\n" + 
        "*********************************** \n" +
        "Tila : " + status + " - " + x + "\n" +
        "*********************************** \n";
    }
}