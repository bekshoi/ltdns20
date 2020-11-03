public class T {
  public static void main( String args[] ) {
    String[] list = {"m", "e", "y"};

    int index = -1;

    for (int i = 0; (i < list.length) && (index == -1); i++) {
        if (list[i] == "e") {
            index = i;
        }
    }

    System.out.println(index);
  }
}