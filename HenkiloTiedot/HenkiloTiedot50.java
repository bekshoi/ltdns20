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
 * Version 5.0 ja paljon muuta, ja voit lisätä paljon enemmän
 * 
 * @author  bekshoi
 * @version 5.00 2020/10/24
 */

import java.util.Scanner;
import java.io.*;

public class HenkiloTiedot50 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        char jatketaan;
        System.out.print("\nSyötä 1, jos haluat etsiä asiakastietoja tunnuksen perusteella,");
        System.out.print("\ntai 2, jos haluat avata tiedoston ulkoisessa sovelluksessa,");
        System.out.print("\ntai 3, jos haluat syöttää tietoja uudesta asiakkaasta: ");
        jatketaan = input.next().charAt(0);
        if (jatketaan == '1'){
            System.out.print("\nAnna asiakkaan ID: ");
            String ID = "#" + input.next();
            System.out.print("\n******************************\n");
            readFromFile(ID);
            System.out.print("******************************\n");
            readFromFile2(ID);
            System.out.print("******************************\n");}
        else if (jatketaan == '2'){        
        try {      
            Runtime r = Runtime.getRuntime();
            Process P = null;
            String cmd[]={"notepad","hnkti40.txt"};
            P = r.exec(cmd); }
            catch(java.lang.Exception e) 
            {
                System.out.println(e.getMessage());
            }}
        else
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
                writer.flush();} 
                catch (IOException ex) {
                System.out.print(ex.getMessage());}

// kirjoittaa tekstitiedostoon toisessa muodossa
try(FileWriter writer = new FileWriter("hnkti40.csv", true)) {
           writer.write("#" + ID + ";" + nimi + ";" + sukunimi + ";" + email + ";" + puhelinnumero + ";");
           writer.append('\n');
           writer.flush();}
       catch(IOException ex){
           System.out.println(ex.getMessage());}

           System.out.print("\nHaluatko jatka K/E: ");
            jatketaan = input.next().charAt(0);
        } while (jatketaan == 'k' || jatketaan == 'K');
        input.close();
    }

    public static void readFromFile(String searchID) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new BufferedReader(new FileReader("hnkti40.txt")));
        boolean h = false;
        String line;
            do {
                  line = lnr.readLine();
                  if(line == null)
                  break;
                             
                   if(line.contains(searchID))
                   { int i = lnr.getLineNumber();
                     System.out.println(line);
                       while (lnr.getLineNumber() < i+3) {
                       System.out.println(lnr.readLine());}
                     h = true; 
                     break; }
        } while ((line = lnr.readLine()) != null);
        if (h == false)
        System.out.println("Asiakasta ei löydy");
        else {}
        lnr.close(); 
    }
// Toinen metodi
    public static void readFromFile2(String searchID) throws IOException {
        BufferedReader filereader = new BufferedReader(new FileReader("hnkti40.csv"));
        String line;
        boolean g = false;
        while ((line = filereader.readLine()) != null) {
                if (line.contains(searchID))
                {System.out.println(line);
                g = true;
                break; }
            } 
            if (g == false)
            System.out.println("Asiakasta ei löydy");
         filereader.close();   
    }
   } 