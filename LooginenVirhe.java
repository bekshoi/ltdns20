import java.util.*;
// Etsi looginen virhe

public class LooginenVirhe {
// Nimetty vakio
final static double RATE = 25.0; // ALVprosentti

public static void main(String[] args) {
// Luodaan lukija
Scanner lukija = new Scanner(System.in);
// määritellään muuttujat
double cost = 0; // tavaran nettohinta
double tax = 0; // ALV euroina
double totalCost = 0; // tavaran bruttohinta
// INPUT
System.out.print("Anna tavaran nettohinta "); // kehoite käyttäjälle
cost = lukija.nextDouble(); // luetaan tieto
// PROCESS 
// Laske ALV.
tax = RATE / 100.0 * cost;

// Laske kokonaishinta.
totalCost = cost + tax;

// Näytä tulos käyttäjälle.
System.out.println("Tavaran bruttohinta on " + totalCost);
}
}