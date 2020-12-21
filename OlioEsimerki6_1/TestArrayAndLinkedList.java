

import java.util.*;

public class TestArrayAndLinkedList {
  public static void main(String[] args) {
  	// m‰‰ritell‰‰n ArrayList kokonaisluku olioille
    List<Integer> arrayList = new ArrayList<Integer>();
    // lis‰t‰‰n alkioita
    arrayList.add(1); // 1 muuntuu automaagisesti new Integer(1)
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(1);
    arrayList.add(4);
    arrayList.add(0, 10); // lis‰t‰‰n paikkaan 0 luku 10
    arrayList.add(3, 30); // lis‰t‰‰n paikkaan 3 luku 30

    System.out.println("ArrayList:ss‰ olevan kokonaisluvut:");
    System.out.println(arrayList);

	// luodaan ArrayList oliosta LinkedList olio jossa Object olioita
    LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
    // lis‰t‰‰n alkio
    linkedList.add(1, "red");
    // poistetaan viimeine
    linkedList.removeLast();
    // lis‰t‰‰n alkuun
    linkedList.addFirst("green");

    System.out.println("N‰ytet‰‰n LinkedList alusta loppuun:");
    // luodaan listIterator
    ListIterator<Object> listIterator = linkedList.listIterator();
    while (listIterator.hasNext()) {
      System.out.print(listIterator.next() + " ");
    }
    System.out.println();

    System.out.println("N‰ytet‰‰n LinkedList lopusta alkuun:");
    // asetaan listIterator osoittamaan viimeiseen alkioon
    listIterator = linkedList.listIterator(linkedList.size());
    // selataan lopusta alkuun
    while (listIterator.hasPrevious()) {
      System.out.print(listIterator.previous() + " ");
    }
  }
}

