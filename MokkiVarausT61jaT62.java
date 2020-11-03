/**
 * Tehtävä 6/1. Tee mökkivarausjärjestelmään sovellus, jossa määrittelet 5-alkioisen merkkijonotaulukon.
 * Sovellus kysyy viiden palvelun nimen ja sijoittaa em. palveluiden nimet taulukkoon
 * taulukon alusta alkaen. Tulosta käyttämällä jotain silmukkaa palveluiden nimet
 * taulukosta sekä taulukon alusta että lopusta alkaen.
 * 
 * Tehtävä 6/2. Jatka edellistä ohjelmaa niin, että 2-vaiheessa haetaan tietoa palvelutaulukosta. Ohjelma kysyy:
 * "Anna haettava palvelu" , etsii haettavan arvon ja tulostaa monesko alkio se on taulukossa.
 * 
 * Version 1.0 Tulosta käyttämällä jotain silmukkaa palveluiden nimet
 * taulukosta sekä taulukon alusta että lopusta alkaen.
 * 
 * Version 2.0 Tulosta taulukko Arrays-luokan menetelmillä
 * ja lajittele taulukko
 * 
 * Version 3.0 Ohjelma kysyy: "Anna haettava palvelu" , etsii haettavan arvon 
 * ja tulostaa monesko alkio se on taulukossa. Haku suoritetaan kahdella tavalla
 *  - käyttäen Arrays-menetelmiä ja erillistä lineaarista hakumenetelmää.
 * 
 * Versio 4.0 Ei valmis. Tarvitaan tarkastuksen jota käyttäjä ei voi syötte 2 palvelyja
 * jolla on samalainen nimi.
 * 
 * @author  bekshoi
 * @version 3.00 2020/10/19
 */
import java.util.*;
public class MokkiVarausT61jaT62 {
    public static void main(String[] args) {
        Scanner rider = new Scanner(System.in);
        System.out.print("HUOMIO!!! TASSA ON TEHTAVA 6/1 ja 6/2. PAINAVA ENTERI");
        rider.nextLine(); // odotetaan enteria
        System.out.print("Kuinka monta palveluja oli: ");
        int PalvelujaTauluko = rider.nextInt();
        // int PalvelujaTauluko = 5; debug
        String [] Palveluja = new String [PalvelujaTauluko];
        for (int i=0;i<PalvelujaTauluko;i++) {
            System.out.print("Anna palvelun nimi: " + (i+1) + " ");
            Palveluja[i] = rider.next();
        }
        System.out.print("*****************************\n");
        // tulosta taulukon alusta
        for (int i=0;i<PalvelujaTauluko;i++){
            System.out.print("Palvelu " + (i+1) + " nimi " + Palveluja[i] + "\n");
            System.out.println();
        }

        System.out.print("*****************************\n");

        // tulostetaan taulukon lopusta alkaen
        for (int i = Palveluja.length - 1; i >= 0; i--){
            System.out.print("Palvelu " + (i+1) + " nimi " + Palveluja[i] + "\n");
            System.out.println();
        }        
        
        System.out.print("*****************************\n");

        // 2 vaihetta Ohjelma kysyy: "Anna haettava palvelu" , etsii 
        // haettavan arvon ja tulostaa monesko alkio se on taulukossa.
        // Käytö lineaarinenHaku menetelmia
        System.out.print("Toisen vaiheen!!! Haku tietoa!!!");
        System.out.print("\nAnna haettava palvelu: ");
        String c = rider.next();
            
        if (lineaarinenHaku(Palveluja, c) == -1) //tarkista virheita
        {
            do{
            System.out.println("\nSyötit virheellisen palvelun nimen");
            System.out.println("Taulukossa on seuraavat palvelut ");
            for (int i=0;i<PalvelujaTauluko;i++){
                System.out.print(Palveluja[i] + " ");
            }
            System.out.println("\nYrita viella kerran\n");
            System.out.print("Anna haettava palvelu: ");
            c = rider.next();}
            while (lineaarinenHaku(Palveluja, c) == -1);
        }
        else{}
        System.out.print("Taulukon arvon indeksi on " + lineaarinenHaku(Palveluja, c) + "\n");
        System.out.print("Taulukon arvon alkio on " + (lineaarinenHaku(Palveluja, c)+1) + "\n");
        System.out.println();
        System.out.print("*****************************\n");

// Tulosta taulukko Arrays-luokan menetelmilla
        
        System.out.print("SAMA PROSESSI Arrays-luokan menetelmillä mukana!!!!\n");
        System.out.print("Tulosta taulukko Arrays-luokan menetelmillä\n");
        System.out.print("ja lajittele taulukko\n");
        System.out.print("HUOMIO!!! Tulokset eivät ole samat, koska taulukko on lajiteltu käytettäessä Arrays-menetelmiä\n");
        System.out.print("*****************************\n");
        // lajittele taulukko aakkosjärjestyksessä
        Arrays.sort(Palveluja); // lajittele nousevassa järjestyksessä
        System.out.print("Tulosta nousevassa jarjestyksessa\n");
        System.out.println(Arrays.toString(Palveluja)); // tulosta

        Arrays.sort(Palveluja, Collections.reverseOrder()); //lajittele laskevassa järjestyksessä
        System.out.print("Tulosta laskevassa jarjestyksessa\n");
        System.out.println(Arrays.toString(Palveluja)); // tulosta
        System.out.print("*****************************\n");

        // 2 vaihetta Ohjelma kysyy: "Anna haettava palvelu" , etsii 
        // haettavan arvon ja tulostaa monesko alkio se on taulukossa.
        
        System.out.print("Anna haettava palvelu: ");
        String b = rider.next();
        if (Arrays.asList(Palveluja).indexOf(b) == -1) //tarkista virheita
        {
            do{
            System.out.println("\nSyötit virheellisen palvelun nimen");
            System.out.println("Taulukossa on seuraavat palvelut ");
            System.out.println(Arrays.toString(Palveluja));
            System.out.println("Yrita viella kerran\n");
            System.out.print("Anna haettava palvelu: ");
            b = rider.next();}
            while (Arrays.asList(Palveluja).indexOf(b) == -1);
        }
        else{}
        System.out.println("Taulukon arvon indeksi on " + Arrays.asList(Palveluja).indexOf(b));
        System.out.println("Taulukon arvon alkio on " + (Arrays.asList(Palveluja).indexOf(b)+1));
        rider.close();
    }    
    public static int lineaarinenHaku(String[] lista, String avain) { //metodi etsii tietoa
        for (int i=0; i < lista.length; i++)
            if (avain.equals(lista[i]))
            return i;
        return -1;
        }
}