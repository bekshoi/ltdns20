package Harjatelu;
import java.util.*;

/**
 * Toteutus tehdään olio-ohjelmoinnin periaatteita noudattaen. Harjoitustyö dokumentoidaan JavaDoc:lla.
 * Dokumentin palautukseksi riittää kuvakaappaus ensimmäisestä avautuvasta sivusta. Palautettavissa 
 * lähdekooditiedostoissa on oltava kommentit siinä muodossa ja kunnossa, että niistä pystyy tarvittaessa 
 * luomaan vastaavan JavaDoc-dokumentin. Luokat on tarkoituksenmukaista tehdä käyttöliittymäriippumattomiksi 
 * ja muutoinkin sitä silmällä pitäen, että harjoitustyötä jatketaan Käyttöliittymäohjelmoinnissa. 
 * Käyttöliittymäohjelmoinnissa opiskelijoiden, suoritusten ja kurssien tiedot on tallennettuna tietokantaan. 
 * Tässä harjoitustyössä voit valintasi mukaan hakea tiedot itse perustamistasi tiedostoista, kysyä 
 * käyttäjältä tai toteuttaa millä tahansa tavalla, jolla luokkien toiminnallisuus tulee testattua.
 * Toteutettavat metodit/toiminnot:
 * - get ja set-metodit kaikille attribuuteille kaikkiin luokkiin
 * - Opiskelija-luokkaan getOpiskelijanSuoritukset, joka palauttaa kokoelman opiskelijan suorituksista (Suoritus-olioista)
 * - Kurssi-luokkaan getKurssinSuoritukset, joka palauttaa kokoelman kurssin suorituksista (Suoritus-olioista) 
 *   ja getKurssinOpiskelijat, joka palauttaa kokoelman (Opiskelija-olioita) kurssilla olevista opiskelijoista
 * - Main metodi, jolla testataan luokkia:
 *      olioiden luominen
 *      tietyn opiskelijan suoritusten listaus
 *      tietyn kurssin suoritusten listaus
 *      tietyn kurssin opiskelijoiden ja arvosanojen listaus
 * 
 * 
 * Реализация сделана по принципам объектно-ориентированного программирования. Назначение задокументировано 
 * в JavaDoc. Скриншота первой открывшейся страницы достаточно для восстановления документа. 
 * Возвращаемые файлы исходного кода должны иметь комментарии в формате и условиях, которые можно использовать
 * для создания соответствующего документа JavaDoc, если это необходимо. Целесообразно сделать классы независимыми
 * от пользовательского интерфейса или в противном случае с целью продолжения упражнений в программировании 
 * пользовательского интерфейса. При программировании пользовательского интерфейса информация об учениках, 
 * успеваемости и курсе хранится в базе данных. В этом упражнении вы можете выбрать получение информации 
 * из файлов, которые вы создали, спросить пользователя или реализовать любой способ проверки функциональности
 * классов. 
 * Реализуемые методы / функции:
 * - методы получения и установки для всех атрибутов во всех классах
 * - В классе Studyttttttttttt6ent getGet Student Performance, который возвращает коллекцию результатов учащихся (объекты производительности)
 * - В категории «Курс» getCourseCompletions, которая возвращает коллекцию исполнений курса (объекты производительности), 
 * и getCourseStudents, которая возвращает коллекцию (студенческие объекты) студентов в курсе.
 * - основной метод тестирования классов
 *      Создание объектов
 *      список достижений конкретного учащегося
 *      список выступлений по конкретному курсу
 *      Список студентов и оценок по конкретному курсу
*/

/** 
 * Luokka Opiskelija, jolla on attribuutteja: <b>opiskelija_id</b>, <b>etunimi</b>, <b>sukunimi</b>, 
 * <b>lahiosoite</b>, <b>postitoimipaikka</b>, <b>postinro</b>, <b>email</b>, <b>puhelinnro</b>.
 * 
 * @author bekshoi
 * @version 0.50 2020/12/21
 * @ltdns20 http://github.com/bekshoi/ltdns20
 * 
*/

public class Opiskelija {

    /** Attribuutteja */
    public int opiskelija_id;
    public String etunimi;
    public String sukunimi;
    public String lahiosoite;
    public String postitoimipaikka;
    public String postinro;
    public String email;
    public String puhelinnro;
    LinkedList<Suoritus> suoritukset = new LinkedList<Suoritus>();

    /**
     * Oliokonstruktori - parametritton
     * @see Opiskelija#Opiskelija(int, String, String, String, String, String, String, String)
     */
    public Opiskelija() {
    }

    /**
     * Oliokonstruktori - parametrillinen
     * @param opiskelija_id kokonaisluku, opiskelijan tunnusnumero 
     * @param etunimi merkijono, opiskelijan etunimi
     * @param sukunimi merkijono, opiskelijan sukunimi 
     * @param lahiosoite merkijono, opiskelijan lahiosoite
     * @param postitoimipaikka merkijono, opiskelijan postitoimipaikka
     * @param postinro merkijono, opiskelijan postinro
     * @param email merkijono, opiskelijan sähköpostiosoite
     * @param puhelinnro merkijono, opikelijan puhelinnumero
     * @param suoritukset
     * @see Opiskelija#Opiskelija()
     */
    public Opiskelija(int opiskelija_id, String etunimi, String sukunimi, String lahiosoite, String postitoimipaikka, String postinro, String email, String puhelinnro) {
        this.setID(opiskelija_id);
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
     * @param opiskelijan_id kokonaisluku, opiskelijan tunnusnumero
     */
    public void setID(int opiskelija_id) {
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
     * Metodi asettaa opiskelijan postinumero {@link Opiskelija#postinumero}
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
     * @see {@link Opiskelija#getID()}, {@link Opiskelija#getName()}, {@link Opiskelija#getFamily()},
     * @see {@link Opiskelija#getAdress()}, {@link Opiskelija#getPost()}, {@link Opiskelija#getPostIndex()},
     * @see {@link Opiskelija#getEmail()}, {@link Opiskelija#getPhoneNumber()}, {@link Opiskelija#getOpiskelijanSuoritukset()}
     */
    public String toString(){
        return "\nOpiskelija \n" +
        "*********************************** \n" + 
        getID() + "\n" + 
        getName() + "\n" +
        getFamily() + "\n" +
        getAdress() + "\n" +
        getPost() + "\n" +
        getPostIndex() + "\n" +
        getPhoneNumber() + "\n" +
        "*********************************** \n" +
        "Opiskelijan suoritukset : " + "\n" +
        "*********************************** \n" +
        getOpiskelijanSuoritukset() + "\n" +
        "*********************************** \n";
    }

    /**
     * Metodi palauttaa opiskelijan suoritukset
     * @return 
     */
    public LinkedList<Suoritus> getOpiskelijanSuoritukset(){
        return suoritukset;
    }
}