/**
 * 
 * Tehtävä 4/3 3. Yrityksen liikevaihdon on huomattu vuosittain kertautuvan Fibonacci-sarjan 
 * mukaisesti: 1,1,2,3,5,8,13,21... Tee yrityksen budjetointiohjelmistoon ohjelma, joka näyttää
 *  liikevaihdon kertoimen, kun käyttäjä antaa lähtötiedoksi toimintavuoden järjestysnumeron.
 * 
 * @author  bekshoi
 * @version 1.00 2020/9/28
 * 
 */

import java.util.Scanner;
 
class LiikeVaihto {
    public static void main(String[] args) {
        Scanner rider = new Scanner(System.in);
        System.out.print("Anna lähtötiedoksi toimintavuoden järjestysnumeron : ");
        int n = rider.nextInt();
        int n0 = -1;     // Koko Fibonacci-alue alkaa nollasta
        int n1 = 1;     
        int n2 = 0;
        //System.out.print(n0 + " " + n1 + " ");
        for (int i = 0; i <= n; i++) {
            n2 = n0 + n1;
            n0 = n1;    
            n1 = n2;
                if (i == 0) { // Lukuun ottamatta nollajaksoa ja arvoa 0 Fibonacci-sarjassa
                continue;
                }
                else
                System.out.println("Toimintavuoden järjestysnumeron : "+ i + " liikevaihdon kertoimen on " + n2);
        }
        System.out.println("**************************************************************");
        System.out.println("Toimintavuoden syötetyn sarjanumeron liikevaihtosuhde on " + n2 + "\n");
        rider.close();
    }
}