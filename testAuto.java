/**
 * Testi Auto luokka
 * Luokka Auto
 * @author  bekshoi
 * @version 1.00 2020/11/5
 * 
 */

public class testAuto {
    public static void main(String[] args) {
        Auto lada = new Auto("Lada","ABC-123");
        Auto mersu = new Auto("Mersu", "BBB-222");

        lada.kiihdyta();
        lada.kiihdyta();
        for(int i = 0; i < 20; i++)
            mersu.kiihdyta();

        System.out.println("Nopeus on " + lada.palautaNopeus());
        System.out.println("Nopeus on " + mersu.palautaNopeus());

        mersu.jarruta();
        System.out.println("Nopeus on " + mersu.palautaNopeus());

        System.out.println(lada);
        System.out.println(mersu);
    }
}
