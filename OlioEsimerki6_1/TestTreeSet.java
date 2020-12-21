

import java.util.*;
/** Testataan luokkaa TreeSet
 *  joka toteuttaa rajapinnat SortedSet ja NavigableSet
 */
public class TestTreeSet {
  public static void main(String[] args) {
    // Luodaan ensin hash set
    Set<String> joukko = new HashSet<String>();

    // Lis‰t‰‰n joukkoon merkkijonot
    joukko.add("London");
    joukko.add("Paris");
    joukko.add("New York");
    joukko.add("San Francisco");
    joukko.add("Beijing");
    joukko.add("New York");

	// luodaan TreeSet luokan Set oliosta joukko
    TreeSet<String> puuJoukko = new TreeSet<String>(joukko);
    System.out.println("Sorted tree set: " + puuJoukko);

    // K‰ytet‰‰n metodeja SortedSet rajapinnasta
    System.out.println("first(): " + puuJoukko.first());
    System.out.println("last(): " + puuJoukko.last());
    System.out.println("headSet(): " + puuJoukko.headSet("New York"));
    System.out.println("tailSet(): " + puuJoukko.tailSet("New York"));

    // K‰ytet‰‰n metodeja NavigableSet rajapinnasta
    System.out.println("lower(\"P\"): " + puuJoukko.lower("P"));
    System.out.println("higher(\"P\"): " + puuJoukko.higher("P"));
    System.out.println("floor(\"P\"): " + puuJoukko.floor("P"));
    System.out.println("ceiling(\"P\"): " + puuJoukko.ceiling("P"));
    System.out.println("pollFirst(): " + puuJoukko.pollFirst()); // palauttaa ja poistaa ekan
    System.out.println("pollLast(): " + puuJoukko.pollLast()); // palauttaa ja poistaa viimeisen
    System.out.println("Uusi puujoukko: " + puuJoukko);
  }
}

