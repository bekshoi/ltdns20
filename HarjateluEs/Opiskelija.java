package HarjateluEs;

import java.util.*;
import java.io.*;

/** 
 * Luokka Opiskelija, jolla on attribuutteja: <b>opiskelija_id</b>, <b>etunimi</b>, <b>sukunimi</b>, 
 * <b>lahiosoite</b>, <b>postitoimipaikka</b>, <b>postinro</b>, <b>email</b>, <b>puhelinnro</b>.
 * Luokka on suunniteltu tekemään harjoitus työtä Olioohjelmointi-kurssin varten. Lähdemateriaalina @author Eero Mönkkönen.
 * <p>
 * Tehtävien sisältö: Toteutus tehdään olio-ohjelmoinnin periaatteita noudattaen. Harjoitustyö dokumentoidaan JavaDoc:lla.
 * Dokumentin palautukseksi riittää kuvakaappaus ensimmäisestä avautuvasta sivusta. Palautettavissa 
 * lähdekooditiedostoissa on oltava kommentit siinä muodossa ja kunnossa, että niistä pystyy tarvittaessa 
 * luomaan vastaavan JavaDoc-dokumentin. Luokat on tarkoituksenmukaista tehdä käyttöliittymäriippumattomiksi 
 * ja muutoinkin sitä silmällä pitäen, että harjoitustyötä jatketaan Käyttöliittymäohjelmoinnissa. 
 * Käyttöliittymäohjelmoinnissa opiskelijoiden, suoritusten ja kurssien tiedot on tallennettuna tietokantaan. 
 * Tässä harjoitustyössä voit valintasi mukaan hakea tiedot itse perustamistasi tiedostoista, kysyä 
 * käyttäjältä tai toteuttaa millä tahansa tavalla, jolla luokkien toiminnallisuus tulee testattua.
 * Toteutettavat metodit/toiminnot:
 * <ul>
 * <li> get ja set-metodit kaikille attribuuteille kaikkiin luokkiin
 * <li> Opiskelija-luokkaan getOpiskelijanSuoritukset, joka palauttaa kokoelman opiskelijan suorituksista (Suoritus-olioista)
 * <li> Kurssi-luokkaan getKurssinSuoritukset, joka palauttaa kokoelman kurssin suorituksista (Suoritus-olioista) 
 *   ja getKurssinOpiskelijat, joka palauttaa kokoelman (Opiskelija-olioita) kurssilla olevista opiskelijoista
 * <li> Main metodi, jolla testataan luokkia:
 * </ul>
 *      <ul>
 *      <li> olioiden luominen
 *      <li> tietyn opiskelijan suoritusten listaus
 *      <li> tietyn kurssin suoritusten listaus
 *      <li> tietyn kurssin opiskelijoiden ja arvosanojen listaus.
 *      </ul>
 * @author bekshoi
 * @version 1.00 2020/12/21
 */

public class Opiskelija implements Serializable {

    /* Declare a static final serialVersionUID field of type long for Serializable */
	private static final long serialVersionUID = 1L;

	/* Attribuutteja */
    public int opiskelija_id;
    public String etunimi;
    public String sukunimi;
    public String lahiosoite;
    public String postitoimipaikka;
    public String postinro;
    public String email;
    public String puhelinnro;

	/* Linkeja */
	LinkedList<Suoritus> suoritukset = new LinkedList<Suoritus>();

    /**
     * Oliokonstruktori - parametritton
     * @see Opiskelija#Opiskelija(int, String, String, String, String, String, String, String)
     */
    public Opiskelija() {
    }

    /**
     * Oliokonstruktori - parametrillinen, lyhyt MainMetodin varten
     * @param opiskelija_id     kokonaisluku, opiskelijan tunnusnumero 
     * @param etunimi           merkijono, opiskelijan etunimi
     * @param sukunimi          merkijono, opiskelijan sukunimi 
     * @see Opiskelija#Opiskelija(int, String, String, String, String, String, String, String)
     */
    public Opiskelija(int opiskelija_id, String etunimi, String sukunimi) {
        this.opiskelija_id=opiskelija_id;
        this.etunimi=etunimi;
        this.sukunimi=sukunimi;
        suoritukset=new LinkedList<Suoritus>();
    }

    /**
     * Oliokonstruktori - parametrillinen
     * @param opiskelija_id     kokonaisluku, opiskelijan tunnusnumero 
     * @param etunimi           merkijono, opiskelijan etunimi
     * @param sukunimi          merkijono, opiskelijan sukunimi 
     * @param lahiosoite        merkijono, opiskelijan lahiosoite
     * @param postitoimipaikka  merkijono, opiskelijan postitoimipaikka
     * @param postinro          merkijono, opiskelijan postinro
     * @param email             merkijono, opiskelijan sähköpostiosoite
     * @param puhelinnro        merkijono, opikelijan puhelinnumero
     * @see Opiskelija#Opiskelija()
     */
    public Opiskelija(int opiskelija_id, String etunimi, String sukunimi, String lahiosoite, String postitoimipaikka, String postinro, String email, String puhelinnro) {
        this.setOpiskelijaId(opiskelija_id);
        this.setName(etunimi);
        this.setFamily(sukunimi);
        this.setAdress(lahiosoite);
        this.setPost(postitoimipaikka);
        this.setPostIndex(postinro);
        this.setEmail(email);
        this.setPhoneNumber(puhelinnro);
        suoritukset=null;
    }

	/**
     * Metodi asettaa opiskelijan tunnusnumero arvon {@link Opiskelija#opiskelija_id}
     * @param opiskelija_id kokonaisluku, opiskelijan tunnusnumero
     */
    public void setOpiskelijaId(int opiskelija_id) {
        this.opiskelija_id=opiskelija_id;
    }

    /**
     * Metodi palauttaa opiskelijan tunnusnumero arvon {@link Opiskelija#opiskelija_id}
     * @return palauttaa opiskelijan tunnusnumero arvon
     */
    public int getID(){
        return opiskelija_id;
    }
    
    /**
     * Metodi asettaa opiskelijan etunimi {@link Opiskelija#etunimi}
     * @param etunimi merkijono, opiskelijan etunimi
     */
    public void setName(String etunimi) {
        this.etunimi=etunimi;
    }

    /**
     * Metodi palauttaa opiskelijan etunimi {@link Opiskelija#etunimi}
     * @return palauttaa opiskelijan etunimi
     */
    public String getName(){
        return etunimi;
    }
        
    /**
     * Metodi asettaa opiskelijan sukunimi {@link Opiskelija#sukunimi}
     * @param sukunimi merkijono, opiskelijan sukunimi
     */
    public void setFamily(String sukunimi) {
        this.sukunimi=sukunimi;
    }

    /**
     * Metodi palauttaa opiskelijan sukunimi {@link Opiskelija#sukunimi}
     * @return palauttaa opiskelijan sukunimi
     */
    public String getFamily(){
        return sukunimi;
    }

    /**
     * Metodi asettaa opiskelijan lähiosoite {@link Opiskelija#lahiosoite}
     * @param lahiosoite merkijono, opiskelijan lähiosoite
     */
    public void setAdress(String lahiosoite) {
        this.lahiosoite=lahiosoite;
    }

    /**
     * Metodi palauttaa opiskelijan lähiosoite {@link Opiskelija#lahiosoite}
     * @return palauttaa opiskelijan lähiosoite
     */
    public String getAdress(){
        return lahiosoite;
    }

    /**
     * Metodi asettaa opiskelijan postitoimipaikka {@link Opiskelija#postitoimipaikka}
     * @param postitoimipaikka merkijono, opiskelijan postitoimipaikka
     */
    public void setPost(String postitoimipaikka) {
        this.postitoimipaikka=postitoimipaikka;
    }

    /**
     * Metodi palauttaa opiskelijan postitoimipaikka {@link Opiskelija#postitoimipaikka}
     * @return palauttaa opiskelijan postitoimipaikka
     */
    public String getPost(){
        return postitoimipaikka;
    }

    /**
     * Metodi asettaa opiskelijan postinumero {@link Opiskelija#postinro}
     * @param postinro merkijono, opiskelijan postinumero
     */
    public void setPostIndex(String postinro) {
        this.postinro=postinro;
    }

    /**
     * Metodi palauttaa opiskelijan postinumero {@link Opiskelija#postinro}
     * @return palauttaa opiskelijan postinumero
     */
    public String getPostIndex(){
        return postinro;
    }

    /**
     * Metodi asettaa opiskelijan sähköpostiosoite {@link Opiskelija#email}
     * @param email merkijono, opiskelijan sähköpostiosoite
     */
    public void setEmail(String email) {
        this.email=email;
    }

    /**
     * Metodi palauttaa opiskelijan sähköpostiosoite {@link Opiskelija#email}
     * @return palauttaa opiskelijan sähköpostiosoite
     */
    public String getEmail(){
        return email;
    }

    /**
     * Metodi asettaa opiskelijan puhelimen numero {@link Opiskelija#puhelinnro}
     * @param puhelinnro merkijono, opiskelijan puhelimen numero
     */
    public void setPhoneNumber(String puhelinnro) {
        this.puhelinnro=puhelinnro;
    }

    /**
     * Metodi palauttaa opiskelijan puhelimen numero {@link Opiskelija#puhelinnro}
     * @return palauttaa opiskelijan puhelimen numero 
     */
    public String getPhoneNumber(){
        return puhelinnro;
    }

    /**
     * Metodi palauttaa opiskelijan tiedot
     * @return opiskelijan tiedot
     */
	@Override
    public String toString(){
        return getID() + " " + getName() + " " + getFamily() + " " + getOpiskelijanSuoritukset();
    }

    /**
     * Metodi palauttaa opiskelijan suoritukset
     * @return palauttaa opiskelijan suoritukset
     */
    public LinkedList<Suoritus> getOpiskelijanSuoritukset(){
        return this.suoritukset;
    }
    
    /**
     * Metodi asettaa opiskelijan suoritukset
     * @param suoritukset LinkedList
     */
    public void setSuoritukset(LinkedList<Suoritus> suoritukset){
        suoritukset.addAll(this.suoritukset);
        this.suoritukset=suoritukset;
    }
	
	/**
	 * Metodi haetaan opiskelijan tiedot ja palautetaan opiskelijaolio kutsujalle.
	 * Staattinen metodi, ei vaadi fyysisen olion olemassaoloa.
	 * Tietokantaratkaisussa haetaan tietokannasta.
     * @return opiskelijan olio.
	 */
	public static Opiskelija haeOpiskelija (int opiskelija_id) throws Exception {	
		Opiskelija OpiskelijaOlio = new Opiskelija ();
		try {
				OpiskelijaOlio.setOpiskelijaId (0);
				OpiskelijaOlio.setName ("etunimi");
				OpiskelijaOlio.setFamily ("sukunimi");
				OpiskelijaOlio.setAdress ("lahiosoite");
				OpiskelijaOlio.setPost ("postitoimipaikka");
				OpiskelijaOlio.setPostIndex ("postinro");
				OpiskelijaOlio.setEmail ("email");
				OpiskelijaOlio.setPhoneNumber ("puhelinnro");
		}
		catch (Exception e) {
			throw e;
		}
			return OpiskelijaOlio;
	}

	/**
	 * Metodi ei toimii tällä hetkellä.
     * Lisätään opiskelijan tiedot säiliöön.
	 * Metodissa "Opiskelijaolio kirjoittaa tietonsa säiliöön (tietokanta, tiedosto ...)".
	 */
     public int lisaaOpiskelija () throws Exception
	 {
	// haetaan säiliöstä Opiskelijaa, jonka Opiskelija_id = olion id -> ei voi lisätä jos on jo olemassa
	try {
			
			if (true) { // Opiskelija loytyi
				throw new Exception("Opiskelija on jo olemassa");
			}
		} catch (Exception e) {
            //  virheet
                    throw e;
		}
		
		try {
			// suorita sql-lause
			int lkm = 0;	
		//	System.out.println("lkm " + lkm);
			if (lkm == 0) {
				throw new Exception("Opiskelijan lisaaminen ei onnistu");
			}
        } catch (Exception e) {
            // virheet
            throw e;
		}
		return 0;
	    }

	/**
	 * Metodi ei toimii tällä hetkellä.
     * Muutetaan opiskelijan tiedot säiliöön id-tietoa (avain) lukuunottamatta. 
	 * Metodissa "Opiskelijaolio muuttaa tietonsa säiliöön".
	 */
    public int muutaOpiskelija () throws Exception {  
		// haetaan  opiskelijaa, jonka opiskelija_id = olion id, virhe, jos ei löydy
		try {
			//
			if (false) { // Opiskelijata ei löytynyt
				throw new Exception("Opiskelijaa ei loydy tietokannasta");
			}
		} catch (Exception e) {
            // virheet
             throw e;
		}
            //
        
        try {
            // laitetaan olion attribuuttien arvot UPDATEen
			int lkm = 0;	
			if (lkm == 0) {
				throw new Exception("Opiskelijan muuttaminen ei onnistu");
			}
		} catch (Exception e) {
            // virheet
                throw e;
		}
		return 0; // toiminto ok
	}

	/**
	 * Metodi ei toimii tällä hetkellä.
     * Poistetaan opiskelijan tiedot säiliöstä. 
	 * Metodissa "Opiskelijaolio poistaa tietonsa säiliöstä".
	 */
	public int poistaOpiskelija () throws Exception { 
		// parsitaan DELETE
		try {
			// suorita poisto
			int lkm = 0;	
			if (lkm == 0) {
				throw new Exception("Opiskelijan poistaminen ei onnistu");
			}
		     } catch (Exception e) {
            // JDBC virheet
                throw e;
		}
		return 0; // toiminto ok
    }
    
	/**
	 * Metodi ei toimii tällä hetkellä.
     * Haetaan opiskelijan suoritukset.
	 */
	public void haeSuoritukset () { 
		// haetaan suoritukset		
	}
}