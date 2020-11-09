// package peli.controller;

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
// import peli.model.Pelihahmo;

public class testiPeli {
    public static void main(String[] args) {

        Pelihahmo warrior = new Pelihahmo("Jhon", "Warrior", 99, 0.15, "Man", 46, "Sword", 80, 0.2);
        // Tulosta tiedot toString -metodin avulla
        System.out.println("Tulosta tiedot toString-metodin avulla");
        System.out.println(warrior);
        System.out.println("\n");
        // Tulosta tiedot
        System.out.println("Tulosta tiedot getterit-metodin avulla");
        System.out.println("\nPelihahmo \n" +
        "*********************************** \n" + 
        "Pelihahmo : " + warrior.getName() + "\n" + 
        "Sukupuoli : " + warrior.getGender() + "\n" + 
        "Ika : " + warrior.getAge() + "\n" + 
        "Hahmon attribuutit : " + warrior.getHahmo() + "\n" + 
        "Aseen attribuutit : " + warrior.getAse() + "\n" + 
        "nyt on valmis" + "\n" +
        "*********************************** \n");
    }
}