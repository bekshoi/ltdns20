package teos.controller;
/**
 * Testi Teos luokka
 * Luokka Teos
 * @author  bekshoi
 * @version 1.00 2020/11/6
 * 
 */
import teos.model.Teos;
public class testiTeos {
    public static void main(String[] args) {

        Teos Book = new Teos("author", "name", "genre", "ISBN", 0, 0);
        Book.setBook("author", "name", "genre", "ISBN", 0, 0);
// Kirjan tietoa
        System.out.print(Book);
//Kirjan tilaa
        System.out.println("Kirja on " + Book.getStatus());
//Syote uuden kirjan tilaa
        int x=0;
        Book.setStatus(x);
// Mäyte uuden kirjan tilaa
        System.out.println("Uusi kirjan tila on " + Book.getStatus());
        }
}