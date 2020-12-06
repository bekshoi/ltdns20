package HenkiloTiedot;

/**
 * Laadi asiakas-luokka, joka sisältää asiakkaan ID:n, nimen, sähköpostiosoitteen ja puhelinnumeron. 
 * Toteuta luokkaan metodi tietojen kysymistä varten. Laadi tämän jälkeen luokkaan metodi, joka kirjoittaa 
 * luokan mukaisen olion sisältämät tiedot talteen tekstitiedostoon. Toteuta metodi siten, että kaikkien 
 * asiakkaiden (kyseisestä luokasta luotujen olioiden) tiedot talletetaan samaan tekstitiedostoon. 
 * Alla on esimerkki tiedoston sisällöstä:
 * Data for customer #1
 * Name: Tino Torni
 * E-mail: TT@gmail.com
 * Phone number: 12345
 * Data for customer #2
 * Name: Andy Ant
 * E-mail: AA@luukku.com
 * Phone number: 56789
 * 
 * @author  bekshoi
 * @version 6.00 2020/12/06
 * @ltdns20 http://github.com/bekshoi/ltdns20
 * 
 */

import java.util.Scanner;
import java.io.*;

public class HenkiloTiedot {
    
    /** Attribuutit */
    public static String id;
    public static String name;
    public static String email;
    public static String phonenumber;

    /** Oletuskonstruktori */
    HenkiloTiedot() {
        id = "#1";
        name = "Oleg Beksh";
        email = "bekshoi@gmail.com";
        phonenumber = "0417032993";
    }

    /** Konstruktori */
    /**
     * Luokan konstruktori
     * 
     * @param id          merkijono
     * @param name        merkijono
     * @param email       merkijono
     * @param phonenumber merkijono
     */
    HenkiloTiedot(String id, String name, String email, String phonenumber) {
        HenkiloTiedot.id = id;
        HenkiloTiedot.name = name;
        HenkiloTiedot.email = email;
        HenkiloTiedot.phonenumber = phonenumber;
    }

    /**
     * Metodi palautetaan asiakkaan ID
     * 
     * @return ID merkijono
     */
    public String getID() {
        return id;
    }

    /**
     * Metodi asennettan asiakkaan ID
     * 
     * @param id merkijono
     */
    public void setID(String id) {
        this.id = id;
    }

    /**
     * Metodi palautetaan asiakkaan nimi
     * 
     * @return nimi merkijono
     */
    public String getName() {
        return name;
    }

    /**
     * Metodi asennettan asiakkaan nimi
     * 
     * @param nimi merkijono
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodi palautetaan asiakkaan email
     * 
     * @return email merkijono
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodi asennettan asiakkaan email
     * 
     * @param email merkijono
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodi palautetaan asiakkaan phonenumber
     * 
     * @return phonenumber merkijono
     */
    public String getPhone() {
        return phonenumber;
    }

    /**
     * Metodi asennettan asiakkaan puhelinnumero
     * 
     * @param phonenumber merkijono
     */
    public void setPhone(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * Metodi tietojen pyytämiseksi uudesta asiakkaasta
     * @param ID
     * @param name
     * @param email
     * @param phonenumber
     */
    public static void AskInfo(String id, String name, String email, String phonenumber) {
        Scanner input = new Scanner(System.in);
        System.out.print("Anna asiakkaan ID: ");
        id = input.nextLine();
        System.out.print("Anna asiakkaan nimi: ");
        name = input.nextLine();
        System.out.print("Anna asiakkaan Email: ");
        email = input.nextLine();
        System.out.print("Anna asiakkaan puhelinnumero: ");
        phonenumber = input.nextLine();
        HenkiloTiedot henkilotiedot = new HenkiloTiedot(id, name, email, phonenumber);
        } 

    /**
     * Metodi lukea halutun asiakkaan tiedot  tekstitiedostosta asiakkaan ID:n perusteella
     * @param searchID merkijono
     * @throws IOException
     */
    public static void readFromFile(String searchID) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new BufferedReader(new FileReader("hnktieto.txt")));
        boolean h = false;
        String line;
        do {
            line = lnr.readLine();
            if (line == null)
                break;
            if (line.contains(searchID)) {
                int i = lnr.getLineNumber();
                System.out.println(line);
                while (lnr.getLineNumber() < i + 3) {
                    System.out.println(lnr.readLine());
                }
                h = true;
                break;
            }
        } while ((line = lnr.readLine()) != null);
        if (h == false)
            System.out.println("Asiakasta ei löydy");
        else {
        }
        lnr.close();
    }

    /**
     * Metodi lukea halutun asiakkaan tiedot  tekstitiedostosta asiakkaan ID:n perusteella
     * @param searchID
     * @throws IOException
     */
    public static void readFromFile2(String searchID) throws IOException {
        BufferedReader filereader = new BufferedReader(new FileReader("hnktieto.csv"));
        String line;
        boolean g = false;
        while ((line = filereader.readLine()) != null) {
            if (line.contains(searchID)) {
                System.out.println(line);
                g = true;
                break;
            }
        }
        if (g == false)
            System.out.println("Asiakasta ei löydy");
        filereader.close();
    }

    /**
     * Metodi ulkoisen ohjelman kutsumiseksi tiedoston avaamiseksi
     * @throws java.lang.Exception
     */
    public static void Runtime() throws java.lang.Exception {
        try {      
            Runtime r = Runtime.getRuntime();
            Process P = null;
            String cmd[]={"notepad","hnktieto.txt"};
            P = r.exec(cmd); }
            catch(java.lang.Exception e) 
            {
                System.out.println(e.getMessage());
            }
    }

    /** Metodi kirjoittaa tietoja luokan objekteista tekstitiedostoon määritetyssä muodossa.*/
    public static void Writer() throws IOException {
    try (FileWriter writer = new FileWriter("hnktieto.txt", true)) {
        writer.write("Data for customer #" + id);
        writer.append('\n');
        writer.write("Name: " + name);
        writer.append('\n');
        writer.write("E-mail: " + email);
        writer.append('\n');
        writer.write("Phonenumber: " + phonenumber);
        writer.append('\n');
        writer.flush();
    } catch (IOException ex) {
        System.out.print(ex.getMessage());
    }}

    /** Metodi kirjoittaa tietoja luokan objekteista tekstitiedostoon CSV muodossa.*/
    public static void Writer2() throws IOException {
    try (FileWriter writer = new FileWriter("hnktieto.csv", true)) {
        writer.write("#" + id + ";" + name + ";" + email + ";" + phonenumber + ";");
        writer.append('\n');
        writer.flush();
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }} 

    public static void main(String[] args) throws Exception {
        char jatketaan = 'a';
        char jatketaan2 = 'a';
        Scanner input = new Scanner(System.in);
        do {
        System.out.print("\n   VALIKKO");
        System.out.print("\n1. Hakuminen asiakastietoja tunnuksen perusteella.");
        System.out.print("\n2. Ulkoisen ohjelman kutsumiseksi tiedoston avaamiseksi");
        System.out.print("\n3. Asiakastietojen syöttäminen");
        System.out.print("\n4. Poistuminen ohjelmasta");
        System.out.print("\n   Syötä valikkokohdan numero: ");
        jatketaan2 = input.next().charAt(0);
        input.nextLine();
        if (jatketaan2 == '1')
        {
            System.out.print("\nAnna asiakkaan ID: ");
            String ID = "#" + input.next();
            System.out.print("\n******************************\n");
            readFromFile(ID);
            System.out.print("******************************\n");
            readFromFile2(ID);
            System.out.print("******************************\n");
        }
        else if (jatketaan2 == '2')
        {
            Runtime();        
        }         
        else if (jatketaan2 == '3')
        {
            AskInfo(id, name, email, phonenumber);
            Writer();
            Writer2();
        }
        else if (jatketaan2 == '4')
        {System.exit(1);
        }
        else 
        {
            continue;
        }
        System.out.print("\nHaluatko jatka K/E: ");
        jatketaan = input.next().charAt(0);
        input.nextLine();
        } while (jatketaan == 'k' || jatketaan == 'K');
    input.close();
    }
}