/**
 * Luokka Salasana2
 * 
 * @author bekshoi
 * @version 1.00 2020/11/15
 * 
 * Suunnittele ja toteuta ohjelma, joka tarkastaa täyttääkö sille annettu salasana seuraavat ehdot:
 * salasana on ainakin 10 merkkiä pitkä
 * salasanassa on ainakin yksi iso kirjain ja yksi pieni kirjan
 * salasanassa on ainakin yksi numero
 * Ohjelma koostuu luokasta Salasana ja luokkaa käyttävästä ja testaavasta pääohjelmasta. 
 * Luokalla Salasana on kenttänä merkkijono sana. Sillä on alustaja, joka saa parametrina merkkijonon 
 * sana olion muodostamista varten. Luokalla on metodi kelpaa, joka tutkii täyttääkö sana salasanalle 
 * yllä asetetut kriteerit. Metodi palauttaa arvon true jos kriteerit täyttyvät, muutoin se palauttaa 
 * arvon false.
 * Pääohjelmassa kerrotaan salasanan kriteerit ja kysytään käyttäjältä toistuvasti uutta salasanaa, 
 * kunnes käyttäjä antaa kelvollisen salasana. Käyttäjän antamasta sanasta muodostetaan luokan Salasana olio, 
 * jonka kelvollisuutta testataan metodilla kelpaa. (YDINASIAA)
 * 
 */
class Salasana2 {

    private String password = null;

    public void initialize (String p){
        this.password = p;
    }

    /** OLETUSKONSTRUKTORI */
    public Salasana2() {
    }

    /** LUOKAKONSTRKTORI */
    /**
     * Luokan konstruktori
     * 
     * @param p merkijono
     */
    public Salasana2(String p) {
    }
    
    /** METODI */
    /**
    * Metodi palauttaa arvon true jos kriteerit täyttyvät, 
    * muutoin se palauttaa arvon false.
    * @return TRUE or FALSE
    * @param containsUpperCase boolean salasanassa on ainakin yksi iso kirjain  
    * @param containsLowerCase boolean * yksi pieni kirjan
    * @param containsDigit boolean salasanassa on ainakin yksi numero
    */
    public static boolean passwordOk(String p){
        if (p == null) return false; // jos salasana on tyhjä, palauta virhe
        if (p.length() < 10) return false; // tarkista salasanan pituus
        boolean containsUpperCase = false; // tarkista onko iso kirjan
        boolean containsLowerCase = false; // tarkista onko pieni kirjan
        boolean containsDigit = false; // tarkista onko numero
        for(char ch: p.toCharArray()){
            if(Character.isUpperCase(ch)) containsUpperCase = true;
            if(Character.isLowerCase(ch)) containsLowerCase = true;
            if(Character.isDigit(ch)) containsDigit = true;
        }
        return containsUpperCase && containsLowerCase && containsDigit; // return TRUE or FALSE
 }
}