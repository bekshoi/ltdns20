/**
 * ArvaaPaiva.java
 * Palauttaa k�ytt�j�n antamien tietojen perusteella
 * tietyn joukon tietyn p�iv�n.
 *
 *
 * @author
 * @version 1.00 2019/6/14
 */
public class ArvaaPaiva {
	private final static int[][][] paivat = {
	{{ 1,  3,  5,  7},
	 { 9, 11, 13, 15},
	 {17, 19, 21, 23},
	 {25, 27, 29, 31}},
	{{ 2,  3,  6,  7},
	 {10, 11, 14, 15},
	 {18, 19, 22, 23},
	 {26, 27, 30, 31}},
	{{ 4,  5,  6,  7},
	 {12, 13, 14, 15},
	 {20, 21, 22, 23},
	 {28, 29, 30, 31}},
	{{ 8,  9, 10, 11},
	 {12, 13, 14, 15},
	 {24, 25, 26, 27},
	 {28, 29, 30, 31}},
	{{16, 17, 18, 19},
	 {20, 21, 22, 23},
	 {24, 25, 26, 27},
	 {28, 29, 30, 31}}};

    private ArvaaPaiva() {
    }

/** Palauttaa tietyn p�iv�joukon tietyn p�iv�n.
 * @param joukko p�iv�joukko (1-5).
 * @param k rivi (1-4).
 * @param j sarake (1-4).
 * @return p�iv�
 */
    public static int palautaArvo(int joukko, int k, int j){
    	return paivat[joukko][k][j];
    }
}