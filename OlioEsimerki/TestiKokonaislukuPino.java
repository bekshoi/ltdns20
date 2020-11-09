/**
 * Luokan avulla tutkitaan luokan Kokonaislukupino toimintaa.
 *
 *
 *
 * @version 1.00 2019/6/12
 */


public class TestiKokonaislukuPino {

    public static void main(String[] args) {
    	KokonaislukuPino pino = new KokonaislukuPino();

    	for (int i = 0; i < 10; i++)
    		pino.lisaa(i);

    	while (!pino.tyhja())
    		System.out.print(pino.poista() + " ");
    }


}