// package peli.model;

/**
 * Luokka Pelihahmo
 * 
 * @author bekshoi
 * @version 1.00 2020/11/6
 * 
 * Laadi pelihahmo-luokka, joka sisältää ainakin seuraavat attribuutit: 
 * Nimi, hahmoluokka (esim. soturi, varas, velho, ..), sukupuoli, ikä ja ase. 
 * Toteuta hahmoluokka ja ase omina luokkinaan ja käytä niitä pelihahmo-luokan attribuutteina. 
 * Hahmoluokka sisältää ainakin seuraavat attribuutit:
 * Luokan nimi, hahmon taso ja erityistaidot.
 * Ase-luokka sisältää ainakin seuraavat attribuutit:
 * Tyyppi, vahinko ja bonukset.
 * Kaikissa toteutettavissa luokissa tulee olla metodit tietojen kyselemistä ja tulostamista varten. 
 * Attribuuttien tyypit voit valita parhaaksi katsomallasi tavalla. 
 * Laadi lisäksi pääohjelma, jossa testaat luomiesi luokkien toiminnallisuuden.
 * 
 * Создайте  игрового персонажа, которая включает как минимум следующие атрибуты: 
 * имя, класс персонажа (например, воин, вор, волшебник и т. Д.), Пол, возраст и оружие. 
 * Реализуйте класс персонажа и оружие как их собственные классы 
 * и используйте их как атрибуты класса игрового персонажа. Класс персонажа содержит как минимум 
 * следующие атрибуты: имя класса, уровень персонажа и особые навыки. 
 * класс «Оружие» содержит как минимум следующие атрибуты: Тип, Урон и Бонусы. 
 * Все классы, которые могут быть реализованы, должны иметь методы для запроса и печати данных. 
 * Вы можете выбирать типы атрибутов по своему усмотрению. 
 * Кроме того, создайте основную программу, в которой вы проверяете функциональность 
 * создаваемых вами классов.
 *  
 */

// import peli.model.Hahmo;
// import peli.model.Ase;

 public class Pelihahmo {
	private String name;
    private Hahmo Hahmo;
    private String gender;
    private int age;
    private Ase Ase;

        public Pelihahmo(String ph_name, String h_name, int h_level, double h_special, String ph_gender, int ph_age, String a_type, int a_damage, double a_bonus)
        {
            name = ph_name;
            gender = ph_gender;
            age = ph_age;
            Hahmo = new Hahmo(h_name, h_level, h_special);
            Ase = new Ase(a_type, a_damage, a_bonus);
    }

    /** palauttaa pelihahmon nimi */
    public String getName(){
        return name;
    }
    /** palauttaa pelihahmon sukupuoli */
    public String getGender(){
        return gender;
    }
    /** palauttaa pelihahmon ikä */
    public int getAge(){
        return age;
    }
    /** palauttaa pelihahmon hahmo-attribuutit */
    public Hahmo getHahmo(){
        return Hahmo;
    }
    /** palauttaa pelihahmon ase-attribuutit */
    public Ase getAse(){
            return Ase;
    }
    /**toString - metodi */
    public String toString(){
        return "\nPelihahmo \n" +
        "*********************************** \n" + 
        "Pelihahmo : " + name + "\n" + 
        "Sukupuoli : " + gender + "\n" + 
        "Ika : " + age + "\n" + 
        "Hahmon attribuutit : " + Hahmo + "\n" + 
        "Aseen attribuutit : " + Ase + "\n" + 
        "nyt on valmis" + "\n" +
        "*********************************** \n";
    }
 }