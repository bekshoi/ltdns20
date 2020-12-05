/**
 * TestiYmpyraSuorakulmio.java ohjelmassa kokeillaan
 * luokkien Ympyra.java ja Suorakulmio.java olioiden
 * käyttää.
 *
 */
public class TestiYmpyraSuorakulmio {

    public static void main(String [] args) {
    	
    	Suorakulmio suorakulmio = new Suorakulmio(2, 4);
    	System.out.println("\n Suorakulmio " + suorakulmio.toString());
    	System.out.println("Ala on " + suorakulmio.getAla()); // 8
    	System.out.println("Keha on " + suorakulmio.getKeha()); // 12
		
		//GeometrinenOlio golio = new GeometrinenOlio (); // virhe, abstractista ei voi luoda oliota
		
		Ympyra ymp1 = new Ympyra ();
		System.out.println(ymp1.toString());
		Ympyra ymp2 = new Ympyra (6.0, "keltainen", true);
		System.out.println(ymp2.toString());
		System.out.println("Halkaisija on " + ymp2.getHalkaisija()); 
    	System.out.println("Ala on " + ymp2.getAla()); 
    	System.out.println("Keha on " + ymp2.getKeha()); 
		
		GeometrinenOlio [] got = new GeometrinenOlio [4];
		got [0] = ymp1;
		got [1] = suorakulmio;
		got [2] = new Kolmio (5.0,6.0);
		got [3] = new Nelio (5.0);
		for (int i = 0; i < 4; i++) {
			System.out.println( got[i].toString () + " " + got[i].getKeha () + " " + got[i].getAla ());
			
		}
		
    }


}