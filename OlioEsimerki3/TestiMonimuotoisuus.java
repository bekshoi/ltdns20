/**
 * @(#)TestiMonimuotoisuus.java
 *
 */


public class TestiMonimuotoisuus {

    public static void main(String [] args) {
    	// luodaan kaksi oliota
    	Object olio1 = new Ympyra(1);
    	Object olio2 = new Suorakulmio(1,1);

    	//Esitet‰‰n ympyr‰ ja suorakulmio
    	esitaOlio(olio1);
    	esitaOlio(olio2);

    }

    /** metodi olioiden esitt‰miseen */
    public static void esitaOlio(Object olio) { // parametrina Object-luokan olio(, josta Ympyra ja Suoraulmio periytyv‰t)
    	if (olio instanceof Ympyra) { // onko kyseess‰ Ympyr‰?
    		System.out.println("Ympyr‰n ala on " +
    			((Ympyra)olio).getAla()); // castataan Object Ympyra:ksi
    		System.out.println("Ympyr‰n halkaisija on " +
    			((Ympyra)olio).getHalkaisija());
    	}
    	else if (olio instanceof Suorakulmio) { // onko Suorakulmio?
    		System.out.println("Suorakulmion ala on " +
    			((Suorakulmio)olio).getAla()); // castataan
    	}
    }
}