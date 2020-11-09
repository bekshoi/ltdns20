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

public class Ase {
    private String a_type;
	private int a_damage;
    private double a_bonus;
    
    public Ase(String type, int damage, double bonus) {
    	a_type = type;
    	a_damage = damage;
    	a_bonus = bonus;
    }
        /** palauttaa aseen tyyppi */
        public String getType(){
            return a_type;
        }
        /** palauttaa aseen vahinko */
        public int getDamage(){
            return a_damage;
        }
        /** palauttaa aseen bonukset */
        public double getBonus(){
            return a_bonus;
        }
        /**toString - metodi */
        public String toString(){
            return "\n" +
        "*********************************** \n" + 
        "Aseen tyyppi : " + a_type + "\n" + 
        "Aseen vahinko : " + a_damage + "\n" + 
        "Aseen bonukset : " + a_bonus + "\n" + 
        "***********************************";
        }             
}