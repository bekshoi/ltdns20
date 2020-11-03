import java.util.*;

public class SaatkoSelvaa {

  public static void main(String[] args) {
	  
	Scanner l = new Scanner (System.in);
	int a, b, c, d;
	a = 0;
	b = l.nextInt();
	c = b;

	while ( c>0 ) {
		d = l.nextInt();
		a = a + d;
		c = c - 1;
	}
	if (b==0) 
		System.out.println ("heissulivei");
	else
		System.out.println (a/b);
  }
}  