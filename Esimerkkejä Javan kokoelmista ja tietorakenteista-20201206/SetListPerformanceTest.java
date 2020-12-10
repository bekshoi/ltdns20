

import java.util.*;

public class SetListPerformanceTest {
  public static void main(String[] args) {
    // Luodaan hash set, and testataan sen käyttöä
    Collection<Integer> set1 = new HashSet<Integer>();
    System.out.println("Time for hash set is " +
      getTestTime(set1, 500000) + " milliseconds");

    // Luodaan linked hash set, and testataan sen käyttöä
    Collection<Integer> set2 = new LinkedHashSet<Integer>();
    System.out.println("Time for linked hash set is " +
      getTestTime(set2, 500000) + " milliseconds");

    // Luodaan tree set, and testataan sen käyttöä
    Collection<Integer> set3 = new TreeSet<Integer>();
    System.out.println("Time for tree set is " +
      getTestTime(set3, 500000) + " milliseconds");

    // Luodaan array list, and testataan sen käyttöä
    Collection<Integer> list1 = new ArrayList<Integer>();
    System.out.println("Time for array list is " +
      getTestTime(list1, 60000) + " milliseconds");

    // Luodaan linked list, and testataan sen käyttöä
    Collection<Integer> list2 = new LinkedList<Integer>();
    System.out.println("Time for linked list is " +
      getTestTime(list2, 60000) + " milliseconds");
  }

  public static long getTestTime(Collection<Integer> c, int size) {
    long startTime = System.currentTimeMillis();

    // Lisätään luvut 0, 1, 2, ..., size - 1  array list
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < size; i++)
      list.add(i);

    Collections.shuffle(list); // Sekoitetaan array list

    // Lisätään alkiot containeriin
    for (int element: list)
      c.add(element);

    Collections.shuffle(list); // Sekoitetaan array list

    // Poistetaan alkiot containersta
    for (int element: list)
      c.remove(element);

    long endTime = System.currentTimeMillis();
    return endTime - startTime; // Palautetaan suoritusaika
  }
}

