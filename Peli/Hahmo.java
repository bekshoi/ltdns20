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

public class Hahmo {
    private String h_name;
	private int h_level;
    private double h_special_skills;
    
    public Hahmo(String name, int level, double special_skills) {
    	h_name = name;
    	h_level = level;
    	h_special_skills = special_skills;
    }
        /** palauttaa hahmon nimi */
        public String getName(){
            return h_name;
        }
        /** palauttaa hahmon nimi */
        public int getLevel(){
            return h_level;
        }
        /** palauttaa hahmon nimi */
        public double getSkills(){
            return h_special_skills;
        }
        /**toString - metodi */
        public String toString(){
            return "\n" +
        "*********************************** \n" + 
        "Hahmon luokka nimi : " + h_name + "\n" + 
        "Hahmon luokka taso : " + h_level + "\n" + 
        "Hahmon luokka erityistaidot : " + h_special_skills + "\n" + 
        "***********************************";
        }             
}