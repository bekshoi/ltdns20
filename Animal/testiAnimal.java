package Animal;

/**
 * Luokka testiAnimal
 * 
 * @author bekshoi
 * @version 2.50 2020/11/23
 * @ltdns20 http://github.com/ltdns20
 * 
 * Versio 2.00 HUOMIO!!! Korjattu ilmeisesti virheellinen luokan perintö. 
 * Nyt super, final käytetään. En vielä ymmärrä, luodaanko objekti oikein.
 * 
 * Toteuta sopivaksi katsomasi luokkahierarkia seuraavan kuvauksen pohjalta (hyödynnä periytymistä):
 * 
 * Eläimellä on nimi ja se voi olla elossa tai kuollut. Eläimelle voi antaa nimen, jonka käyttäjä voi 
 * myös selvittää/tulostaa. Käyttäjä voi myös selvittää, onko eläin elossa vai kuollut, sekä asettaa 
 * eläimen tilan kuolleeksi. 
 * 
 * Kissa perii eläimen ominaisuudet. Lisäksi sillä on useita elämiä, jotka käyttäjä voi asettaa. 
 * Käyttäjä voi myös vähentää kissan elämiä, sekä selvittää niiden lukumäärän.
 * 
 * Myös papukaija perii eläimen ominaisuudet. Lisäksi sillä on merirosvoisäntä, jonka käyttäjä voi asettaa. 
 * Käyttäjä voi myös selvittää merirosvoisännän nimen.
 * 
 * Myös lammas perii eläimen ominaisuudet. Lisäksi se voi olla joko valkoinen tai musta lammas. 
 * Oletuksena lammas on valkoinen mutta käyttäjä voi muuttaa lampaan mustaksi ja takaisin valkoiseksi. 
 * Käyttäjä voi myös selvittää lampaan värin. 
 * 
 * Laadi lisäksi pääohjelma, jossa testaat luomiesi luokkien 
 * toiminnallisuuden.
 * 
 * Реализуйте иерархию классов, которую вы сочтете подходящей, на основе следующего описания 
 * (воспользуйтесь преимуществом наследования): 
 * 
 * У животного есть имя, и оно может быть живым или мертвым. Животному можно дать имя, которое пользователь 
 * также может узнать / распечатать. Пользователь также может определить, живое животное или мертвое, 
 * а также установить состояние животного как мертвое. 
 * 
 * Кошка наследует характеристики животного . Кроме того, у него есть несколько жизней, 
 * которые может задать пользователь. Пользователь также может уменьшить количество кошачьих жизней, 
 * а также определить их количество.
 *  
 * Попугай также наследует черты животного . Кроме того, у него есть пират, 
 * который может установить пользователь. Пользователь также может узнать имя пирата. 
 * 
 * Овца также наследует животное функции. Кроме того, это может быть как белая овца, так и черная овца. 
 * По умолчанию овца белая, но пользователь может изменить овцу на черную и обратно на белую. 
 * Пользователь также может узнать окрас овцы. 
 * 
 * Кроме того , создайте основную программу, в которой вы проверяете функциональность создаваемых вами категорий.
 * 
 */

// import java.util.*;

public class testiAnimal {
    public static void main(String[] args) {

        // Papukaija papukaija = new Papukaija("Papukaija", 1); //luoda olio papukaija
        // Kissa kissa = new Kissa("Kissa",1); // luoda olio Kissa
        Kissa kissa = new Kissa("Barsik",0,0);       
        // Lammas lammas = new Lammas("Lammas",1); // luoda olio lammas parametriton

        // System.out.println("Eläin <" + kissa.getName() + "> joka " + kissa.getStatus() + " ja jolla on " + kissa.getLives() + " elää");        
        // int l = 6; // muutaja kissan elää varten - testi
        // kissa.setLives(l);
        // System.out.println("Eläin <" + kissa.getName() + "> joka " + kissa.getStatus() + " ja jolla on " + kissa.getLives() + " elää");
        // kissa.LaskeLives(l);
        // System.out.println("Eläin <" + kissa.getName() + "> joka " + kissa.getStatus() + " ja jolla on " + kissa.getLives() + " elää");
        System.out.print(kissa);

        // System.out.print(papukaija);
        // papukaija.setMerirosvoisanta("Jack_Sparrow");
        // System.out.println("Uusi merirosvoisäntä on " + papukaija.getMerirosvoisantaNimi());

        // System.out.println("Lampaan vari on " + lammas.getVari());
        // lammas.setVari("musta");
        // System.out.println("Lampaan vari on " + lammas.getVari());
    }    
}