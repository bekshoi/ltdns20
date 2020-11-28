package Laivat;

/**
 * Luokka testiLaiva
 * @author bekshoi
 * @version 1.00 2020/11/24
 */

public class testiLaiva {
    public static void main(String[] args) {        
        
        Laiva laiva = new Laiva();
        RisteilyAlus alus = new RisteilyAlus();
        Tankeri tankeri = new Tankeri();

        Laiva laivat[] = new Laiva[3]; // luoda laivaseen taulukkoon
		laivat[0] = laiva;
		laivat[1] = alus;
        laivat[2] = tankeri;
        
        alus.setName("Titanic");    // asetetaan nimi oliosta RisteilyAlus
        tankeri.setName("Knock Nevis"); // asetetaan nimi oliosta Tankeri

        System.out.print(laiva); // tulosta olio metodilla ToString

        System.out.print(alus); // tulosta olio metodilla ToString

        System.out.print(tankeri); // tulosta olio metodilla ToString

        System.out.println("\n" + alus.getName()); // katsotaan aluksen nimi

        System.out.println("\n" + tankeri.getName()); // katsotaan tankerin nimi

        // tulostetaan lavaiden tiedot taulukosta
     for (int i = 0; i <= 2; i++) {
        System.out.println(laivat[i]);

    }
        
     


     // tulostetaan lavaiden tiedot taulukosta get- metodeilla
     for (int i = 0; i <= 2; i++) {
        System.out.println("Nimi on " + laivat[i].getName() + " rakennusvuosi on " + laivat[i].getYear());
            if (laivat[i].getClass() == tankeri.getClass()){
                System.out.println("joka lasti on " + tankeri.getCargo());}
                else if (laivat[i].getClass() == alus.getClass()){
                    System.out.println("joka maksimimatkustajamäärä on " + alus.getMaxnumpsngr());}
                else continue;
            }
         }        
    }