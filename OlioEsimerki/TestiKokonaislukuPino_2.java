/**
 * Luokan avulla tutkitaan luokan Kokonaislukupino toimintaa.
 *
 *
 *
 * @version 1.00 2019/6/12
 */


public class TestiKokonaislukuPino_2 {

    public static void main(String[] args) {
    	KokonaislukuPino pino = new KokonaislukuPino();

    	for (int i = 0; i < 10; i++)
    		pino.lisaa(i);
		System.out.println("Pinossa on " + pino.palautaKoko() + " alkiota.");
		pino.poista();
		System.out.println("Poistettin yksi. ");
		System.out.println("Pinossa on " + pino.palautaKoko() + " alkiota.");
		System.out.println("Päällä on " + pino.paallimmainen());
    	if (!pino.tyhja())
    		System.out.println("Poistetaan: " + pino.poista() + " ");
    	System.out.println("Pinossa on " + pino.palautaKoko() + " alkiota.");
    }


}