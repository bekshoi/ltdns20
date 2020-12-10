

import java.util.*;

public class TestHashSet {
  public static void main(String[] args) {
    // Luodaan hash joukko
    Set<String> joukko = new HashSet<String>();

    // Lis‰t‰‰n merkkijonot joukkoon
    joukko.add("London");
    joukko.add("Paris");
    joukko.add("New York");
    joukko.add("San Francisco");
    joukko.add("Beijing");
    joukko.add("New York");

    System.out.println(joukko);

    // Luodaan Iterator-olio joukolle hash joukko (Luokan Collection metodilla)
    Iterator<String> iterator = joukko.iterator();

    // N‰ytet‰‰n joukon hash joukko alkiot
    while (iterator.hasNext()) {
      System.out.print(iterator.next().toUpperCase() + " ");
    }
	// n‰in, jolloin ei tarvitse m‰‰ritell‰ Iterator-oliota vaikka sit‰ k‰ytet‰‰nkin
    for (String alkio: joukko) {
    	System.out.print(alkio.toUpperCase() + " ");
    }
  }
}

