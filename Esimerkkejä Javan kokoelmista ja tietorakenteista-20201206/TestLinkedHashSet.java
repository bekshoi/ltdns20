

import java.util.*;

public class TestLinkedHashSet {
  public static void main(String[] args) {
    // Create a hash set
    Set<String> joukko = new LinkedHashSet<String>();

    // Add strings to the set
    joukko.add("London");
    joukko.add("Paris");
    joukko.add("New York");
    joukko.add("San Francisco");
    joukko.add("Beijing");
    joukko.add("New York");

    System.out.println(joukko);

    // Display the elements in the hash set
    for (Object element: joukko)
      System.out.print(element.toString().toLowerCase() + " ");
  }
}

