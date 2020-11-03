/**
 * Tehtävä 3/1
 * 
 * Versio 1.0 
 * Ohjelma kysyy asiakkaan etunimen, sukunimen ja iän vuosina. Sovellus 
 * kuittaa tiedot: "Syötetty tiedot asiakkaasta <etunimi sukunimi> , 
 * joka on <asiakkaan ikä> vuotta vanha". Lisättiin myös tietueiden peräkkäinen tuotos tiedostoon csv-muodossa.
 * Tietojen syötön oikeellisuuden tarkistamiseksi, kun komentosarja on valmis, 
 * kutsutaan ulkoinen sovellus.
 * 
 * Versio 2.0 
 * Paitsi nimi- ja ikätiedon lisäksi kysytään, onko henkilöllä ajokortti (K tai E). 
 * Jos vastataan K, kuittaa sovellus esim. "Syötetty tiedot asiakkaasta x , joka on y vuotta vanha 
 * ja jolla on ajokortti". Jos vastataan E, tulostaa sovellus esim. "Syötetty tiedot asiakkaasta x, 
 * joka on y vuotta vanha ja jolla ei ole ajokorttia". Lisätty poikkeusten käsittely.
 * 
 * Versio 3.0 
 * Asiakastiedot syötetään puskuriin ja tulostetaan sitten merkkijonoon määritetyssä muodossa.
 * Merkkijonosta muodostetaan taulukko, jota käytetään tietojen tulostamiseen määritetyssä muodossa. 
 * Merkkijono tallennetaan tiedostoon, jota voidaan sitten käyttää vientiin ulkoisiin järjestelmiin. 
 * Poikkeusten käsittely käytössä. 
 * Se olisi edelleen hyvä: Näytetään informatiivinen viesti käsiteltäessä poikkeusta, 
 * lisää rivin numero ja yksilöllinen avain asiakkaalle, kun lisäät tietoja tiedostoon.
 * 
 * @author  bekshoi
 * @version 3.00 2020/9/18
 */

import java.util.*;
import java.io.*;

public class HenkiloTiedot30 {  // julistaa luokan
     public static void main (String [] args) { // julistaa menetelmään
      
    Scanner rider; // luoda olio
    rider = new Scanner(System.in);
    StringBuffer input = new StringBuffer();  
    System.out.print("Anna asiakkaan etunimi: "); 
    input.append(rider.nextLine());
    input.append(";");
    System.out.print("Anna asiakkaan sukunimi: ");
    input.append(rider.nextLine());
    input.append(";");
    System.out.print("Anna asiakkaan ika: ");
    input.append(rider.nextLine());
    input.append(";");
    System.out.print("Onko henkilöllä ajokortti (K tai E) "); 
    input.append(rider.nextLine());
    input.append(";");
    
    // Lyhyt tapa jäsentää merkkijono saada matriisi, josta sitten saamme elementtejä näytettäväksi käyttäjälle
    String ClientInfo = input.toString(); // Buffer to String
    ClientInfo = ClientInfo.toUpperCase(); // rivinsyöttö isoilla kirjaimilla
    // System.out.println("\n" + ClientInfo); // Debug
    String[] words = ClientInfo.split(";"); // String to Array
    // System.out.println("\n" + Arrays.toString(words)); // Debug
    // System.out.println("\nSyötetty tiedot asiakkaasta " + words[0] + " " + words[1] + ", joka on " + words[2] + " vuotta vanha ja jolla on ajokortti"); // Tulosta
    int pituus = ClientInfo.length(); // Palauttaa merkijonon pituuden
    int position = pituus - 2;
    char vastaus = ClientInfo.charAt(position);
    System.out.print(vastaus);

    // PITKA TAPA
    /*
    String ClientInfo2 = ClientInfo; 
    int count = ClientInfo.replaceAll("[^;]","").length(); // laske ";"
    int index = ClientInfo2.indexOf(';');
    ClientInfoClass[] words = new ClientInfoClass[count];
    int x = 0;

    for (int i = 0; i < count; i++)
		{ 
            String v = ClientInfo2.substring(0,index);
            // System.out.println(v); // Debag
            words[x]  = new ClientInfoClass(v);
            // System.out.println("\n" + words[x].title); // Debag
            x=x+1;
            ClientInfo2 = ClientInfo2.replace(v+";", "");
            //System.out.println(ClientInfo2);
            //a = index;
            //System.out.println(a);
            index = ClientInfo2.indexOf(';');
            //System.out.println(index);
        }

    // System.out.println("\n" + ClientInfo);
    // System.out.println("\n" + words[0].title + words[1].title + words[2].title + words[3].title + words[4].title);
        int pituus = ClientInfo.length(); // Palauttaa merkijonon pituuden
    int position = pituus - 2;
    char vastaus = ClientInfo.charAt(position);
    System.out.print(vastaus);

    class ClientInfoClass {
    String title;
    ClientInfoClass(String title) {
        this.title = title;
    }
}
    */

        switch (vastaus) 
        {
            case 'K':
                System.out.println("\nSyötetty tiedot asiakkaasta " + words[0] + " " + words[1] + ", joka on " + words[2] + " vuotta vanha ja jolla on ajokortti");
                break;
            case 'E': 
                System.out.println("\nSyötetty tiedot asiakkaasta " + words[0] + " " + words[1] + ", joka on " + words[2] + " vuotta vanha ja jolla ei ole ajakorti.");
                break;
            default:
                System.out.println("Virheellinen syote - pita ola k tai e. korjaa tiedot manuaalisesti ulkoisessa editorissa.");
                break;
        }
            
        try(FileWriter writer = new FileWriter("asiakkaat.csv", true))
        {
            boolean vilka = true; // IF-rakenteella tehdään CharToBoolean
        if (vastaus == 'K') 
            vilka = true; 
        else 
            vilka = false;
        
            writer.write(words[0] + ";" + words[1] + ";" + words[2] + ";" + vilka); // Tehdään tiedoston csv-muodossa
            writer.append('\n');                                                // tulevaisuudessa voimme käyttää tiedostoa vientiin ulkoisiin järjestelmiin
            writer.flush();
        }
       
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {      
            Runtime r = Runtime.getRuntime();
            Process P = null;
            String cmd[]={"excel","asiakkaat.csv"};
            P = r.exec(cmd);
        }

        catch(java.lang.Exception e) 
        {
            System.out.println(e.getMessage());
        } 

        rider.close();    
  }
}