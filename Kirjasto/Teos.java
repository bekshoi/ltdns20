package teos.model;

/**
 * Luokka Teos
 * 
 * @author bekshoi
 * @version 1.00 2020/11/6
 * 
 *          Toteuta Teos-luokka kirjastokäyttöön. Luokan tulee sisältää ainakin
 *          seuraavat attribuutit: Tekijä, teoksen nimi, genre, ISBN, sivumäärä
 *          ja tila. Tila-attribuutti kertoo, onko teos saatavilla, lainassa,
 *          hävinnyt tms.
 * 
 *          Luokan tulee sisältää ainakin seuraavan toiminnallisuuden
 *          mahdollistavat metodit: Teoksen tila täytyy voida muuttaa ja
 *          tarkistaa tai tulostaa. (ts. tee attribuutille get- ja set metodit)
 *          Teoksen tiedot täytyy voida syöttää käyttäjän toimesta. Teoksen
 *          tiedot täytyy voida tulostaa käyttäjälle.
 * 
 *          Laadi lisäksi pääohjelma, jossa testaat luomasi luokan
 *          toiminnallisuuden. (YDINASIAA)
 */

 import java.util.*;

 public class Teos {
    /**ATTRIBUUTTI*/
    private String author; // attribuutti kirjalija
    private String name; // attribuutti nimi
    private String genre; // attribuutti 
    private String ISBN; // attribuutti ISBN
    private int pages; // attribuutti sivumääre
    private int status; // attribuutti tila

    /**OLETUSKONSTRUKTORI*/
    public Teos (){
    }

    /**LUOKAKONSTRKTORI angIps */
    /**
     * Luokan konstruktori
     * @param a merkijono
     * @param n merkijono
     * @param g merkijono
     * @param I merkijono
     * @param p kokonaisluku
     * @param s kokonaisluku !!!! tässä on pakko vielä miettia
     */
    public Teos (String a, String n, String g, String I, int p, int s) {
        author = a;
        name = n;
        genre = g;
        ISBN = I;
        pages = p;
        status = s;
    }
    /** METODI PALAUTTA KIRJAN TIEDOT */
    /**
    * Palauttaa kirjan tiedot
    * @return kirjan tiedot ja tila
    */
  
    @Override
    public String toString(){
        String x = " aaaaa ";
        switch (status){
            case 0:
            x = "saatavilla";
            break;
            case 1:
            x = "lainassa";
            break;
            case 2:
            x = "hävinnyt";
            break;}
             
        return "Kirja \n" +
        "*********************************** \n" + 
        "Kirjalia : " + author + "\n" + 
        "Kirjan nimi : " + name + "\n" + 
        "Kirjan genre : " + genre + "\n" + 
        "ISBN koode : " + ISBN + "\n" + 
        "Sivuut määre : " + pages + "\n" + 
        "*********************************** \n" +
        "Tila : " + status + " - " + x + "\n" +
        "*********************************** \n";
    }

    /** metodi palauttaa kirjan status */
    /**
    * Palauttaa kirjan tila
    * @return kirjan tila
    */
    public String getStatus() {
        String x = " aaaaa ";
        switch (status){
            case 0:
            x = "saatavilla";
            break;
            case 1:
            x = "lainassa";
            break;
            case 2:
            x = "hävinnyt";
            break;}
        return x;
    }

    /** metodi asettaa koodi kirjatila */
    /**
     * metodin parametri
     * @param s kokonaisluku
     */
    public void setStatus(int s) {
        System.out.println("Syöte kirjan tilakode (esim. 0 - saatavilla, 1 - lainassa, 2 - hävinnyt): "); //
        Scanner input = new Scanner(System.in);
        int q = input.nextInt(); //
        status=q;
        // input.close();
        }
    
    /** metodi asettaa kiran tietoa */
    /**
     * metodi parametri
     * @param a merkijono
     * @param n merkijono
     * @param g merkijono
     * @param I merkijono
     * @param p kokonaisluku
     * @param s kokonaisluku !!!! tässä on pakko vielä miettia
     */
    public void setBook(String a, String n, String g, String I, int p, int s) {
        Scanner input = new Scanner(System.in);
        System.out.println("Syöte kirjan kirjalija: "); //
        a = input.next(); //
        author=a;
        System.out.println("Syöte kirjan nimi: "); //
        n = input.next(); //
        name=n;
        System.out.println("Syöte kirjan genre: "); //
        g = input.next(); //
        genre=g;
        System.out.println("Syöte kirjan ISBN koode: "); //
        I = input.next(); //
        ISBN=I;
        System.out.println("Syötä kirjan sivumäärä: "); //
        p = input.nextInt(); //
        pages=p;
        System.out.println("Syöte kirjan tilakode (esim. 0 - saatavilla, 1 - lainassa, 2 - hävinnyt): "); //
        s = input.nextInt(); //
        status=s;
        // Teos Book = new Teos(author, name, genre, ISBN, pages, status);
        // input.close();
    }
 }