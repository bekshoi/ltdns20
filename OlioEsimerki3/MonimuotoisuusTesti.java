/**
 * @(#)MonimuotoisuusTesti.java
 *
 */


public class MonimuotoisuusTesti {

    public static void main(String [] args) {
    	// luodaan nelj‰ oliota
    	Object olio1 = new Ympyra(1.0);
    	Object olio2 = new Suorakulmio(1.0,1.0);
		Object olio3 = new Ympyra(6.0, "keltainen", true);
		Object olio4 = new Suorakulmio(11.6, 6.0, "vihrulainen", false);

		// luodaan taulukko
		Object [] oli_jot = new Object [4];
		// vied‰‰n kuviot taulukkoon
		oli_jot [0] = olio1;
		oli_jot [1] = olio2;
		oli_jot [2] = olio3;
		oli_jot [3] = olio4;
		
    	//K‰yd‰‰n taulukko l‰pi
    	for (int i = 0; i < 4; i++) {
			System.out.println(oli_jot[i].toString()); // castataan Object GeometrinenOlio:ksi
		}

    }

   
}