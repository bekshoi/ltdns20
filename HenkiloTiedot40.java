
/**
 * Tehtävä 1. 1. Tee ohjelma, joka kysyy käyttäjältä asiakkaan ID:n, nimen, 
 * sähköpostiosoitteen ja puhelinnumeron. Tämän jälkeen ohjelma kirjoittaa 
 * asiakkaan tiedot tekstitiedostoon. Kaikkien asiakkaiden  tiedot talletetaan 
 * samaan tekstitiedostoon. Alla on esimerkki tiedoston sisällöstä:
 * Data for customer #1
 * Name: Tino Torni
 * E-mail: TT@gmail.com
 * Phone number: 12345
 * Data for customer #2
 * Name: Andy Ant
 * E-mail: AA@luukku.com
 * Phone number: 56789
 * 
 * Version 1.0 Ohjelma kysyy asiakkaan tiedot ja kirjoittaa tekstitiedostoon.
 * Version 2.0 Kirjoitetaan tekstitiedostoon toisella muodella
 * 
 * @author  bekshoi
 * @version 2.00 2020/10/23
 */

import java.util.Scanner;
import java.io.*;

public class HenkiloTiedot40 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        char jatketaan;

        // kysyy asiakkaan tiedot
        do {
            System.out.print("Anna asiakkaan ID: "); //
            String ID = input.next(); //
            System.out.print("Anna asiakkaan nimi: "); //
            String nimi = input.next(); //
            System.out.print("Anna asiakkaan sukunimi: "); //
            String sukunimi = input.next(); //
            System.out.print("Anna asiakkaan Email: "); //
            String email = input.next(); //
            System.out.print("Anna asiakkaan puhelinnumero: "); //
            String puhelinnumero = input.next(); //

            // kirjoittaa tekstitiedostoon ehdotetussa muodossa
            try (FileWriter writer = new FileWriter("hnkti40.txt", true)) {
                writer.write("Data for customer #" + ID);
                writer.append('\n');
                writer.write("Name: " + nimi + " " + sukunimi);
                writer.append('\n');
                writer.write("E-mail: " + email);
                writer.append('\n');
                writer.write("Phonenumber: " + puhelinnumero);
                writer.append('\n');
                writer.flush();
            } catch (IOException ex) {

                System.out.print(ex.getMessage());
            }
            System.out.print("Haluatko jatka K/E: ");
            jatketaan = input.next().charAt(0);

        } while (jatketaan == 'k' || jatketaan == 'K');

        System.out.print("Anna asiakkaan ID: ");
        String ID = input.next();
        readFromFile(ID);

        input.close();
    }

    public static void readFromFile(String searchID) throws IOException {
        BufferedReader filereader = new BufferedReader(new FileReader("hnkti40.txt"));
        String line;    
        while ((line = filereader.readLine()) != null) {
                if (line.contains(searchID))
                System.out.println(line);

            }
         filereader.close();   
    }
   }