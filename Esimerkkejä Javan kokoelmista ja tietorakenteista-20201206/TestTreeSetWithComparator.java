

import java.util.*;

public class TestTreeSetWithComparator {
  public static void main(String[] args) {
    // Luodaan tree set geometrisille olioille comparator:n avulla
    Set<GeometricObject> set =
      new TreeSet<GeometricObject>(new GeometricObjectComparator());
    set.add(new Rectangle(4, 5));
    set.add(new Circle(40));
    set.add(new Circle(40));
    set.add(new Rectangle(4, 1));

    // N‰ytet‰‰n tree set:n oliot
    System.out.println("Lajiteltu joukko geometrisia olioita");
    for (GeometricObject element: set)
      System.out.println("area = " + element.getArea());
  }
}

