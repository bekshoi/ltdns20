/**
 * bekshoi 18.9.2020
 *  
 */
 import java.util.*;

 public class merkkijono2 {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // kysytään kirjatumistiedot
        /* System.out.print("Anna salasana : ");
        String ktunnus = lukija.nextLine();
        System.out.print("Anna ktunnus : ");
        String salasana = lukija.nextLine();

        boolean onOikein = (ktunnus.equals("Joni") && salasana.equals("inoJ"));
        if (onOikein)
        System.out.println("Paasuu sallittu");
        else {
            System.out.println("Paasuu kielletty");
            System.exit (0); //lopettaa ohjelman suorituksen
        }

        /*if (ktunnus.equals("Joni") && salasana.equals("inoJ"))
            System.out.println("Paasuu sallittu");
        else {
            System.out.println("Paasuu kielletty");
            System.exit (0); //lopettaa ohjelman suorituksen
        }*/
        
        /* System.out.print("\n****\n");
        
        System.out.print("Mika on ikasi : ");
        int ika = lukija.nextInt();
        lukija.nextLine(); // read and insert line from bufer
        System.out.print("Anna nimesi : ");
        String nimi = lukija.nextLine();
        System.out.println("\nHei " + nimi + ", olet " + ika + "vuotta nuori");
        
        double x = Math.rint(3.5);
        System.out.print(x);*/

        char f = (char) ('a' + Math.random () * ('z' - 'a' + 1));
        System.out.print(f);

        /*kolikonheitto
        
        int satluku = (int)(Math.random()*2); // 0.0 <= x < 2.00   
        boolean onKruuna = satluku == 0;
        if (onKruuna)
        System.out.println("Kruuna");
        else
        System.out.println("Klaava");

        System.out.print("\n****\n");
*/
        lukija.close();
    
        }

}
