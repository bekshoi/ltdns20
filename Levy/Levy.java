package Levy;

import java.util.Scanner;

public class Levy {
    public String artist;
    public String title;
    public String year;

    public Levy() {
        artist="";
        title="";
        year="";
    }

    public Levy(String artist, String title, String year){
        setArtist(artist);
        setTitle(title);
        setYear(year);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist){
        this.artist=artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public String getYear() {
        return year;
    }

    public void setYear(String year){
        this.year=year;
    }
    
    public String toString(){
        return "\nCD-levy \n" +
        "*********************************** \n" + 
        "Luoja : " + artist + "\n" + 
        "Nimi : " + title + "\n" + 
        "Vuosi : " + year + "\n" +
        "*********************************** \n";
    }

    public void Kysy() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Syötä luoja: ");
        artist = scan.nextLine();
        setArtist(artist);
        System.out.println("Syötä albuumin nimi: ");
        title = scan.nextLine();
        setTitle(title);
        System.out.println("Syötä albumin vuosi: ");
        year = scan.nextLine();
        setYear(year);
    }
}