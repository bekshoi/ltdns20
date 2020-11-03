/**
 * Tehtävä 3/3
 * 
 * Versio 1.0 
 * Kuusikulmion ala lasketaan kaavalla: Ala =   (6 * s^2)/(4 *  tan(pii/6) )
 * Tee ohjelma, joka pyytää kuusikulmion sivun ja tulostaa kuvion alan. Esim.
 * Anna kuusikulmion sivun pituus: 5.5
 * Kuusikulmion ala on 78.59
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/20
 */

public class KuusikulmionAla {
    public static void main(String [] arg) {
   
    double sade = 5.5;
    double ala;
    ala = (6 * Math.pow(sade,2)) / (4 * Math.tan(Math.PI/6));
    System.out.printf("\nAla on %5.2f\n", ala);

    }
}