/**
 * @(#)TestaaGeom.java
 *
 Kirjoita testiohjelma TestaaGeometriset.java, jossa
a) luot haluamillasi arvoilla erilaisia kuvio-olioita ainakin yksi jokaista tyyppi‰ (Ympyra, Kolmio, Nelio,
Suorakulmio)
b) luot ArrayList ñtyyppisen kokoelman, johon lis‰‰t oliot.
c) tulostat for-silmukassa taulukon olioiden kuvauksen.
==== TESTAA ====
4. Muuta GeometrinenOlio luokka niin, ett‰ se toteuttaa Comparable-rajapinnan. Kuvioiden 
keskin‰inen vertailu tehd‰‰n kuvion pinta-alan perusteella.
5. Muuta testiohjelma TestaaGeometriset.java niin, ett‰
(3a) b) c) muuttumaton)
d) lajittelet ArrayList -kokoelman
e) tulostat taulukon olioiden kuvauksen uudelleen toistorakenteessa jossa hyˆdynn‰t iteraattoria
(ListIterator<GeometrinenOlio>).
 */
import java.util.*;

public class TestaaGeom {

    public static void main(String [] args) {
		
		
		List <GeometrinenOlio> geo_kuviot = new ArrayList <GeometrinenOlio>();
		

    	// luodaan nelj‰ oliota
    	Ympyra olio1 = new Ympyra(7.4);
    	Suorakulmio olio2 = new Suorakulmio(4.4,1.5);
		Nelio olio3 = new Nelio(6.0);
		Kolmio olio4 = new Kolmio(11.6, 16.0, "punainen", false);

		// luodaan taulukko
		GeometrinenOlio [] oli_jot = new GeometrinenOlio [4];
		// vied‰‰n kuviot taulukkoon
		oli_jot [0] = olio1;
		oli_jot [1] = olio2;
		oli_jot [2] = olio3;
		oli_jot [3] = olio4;
		//K‰yd‰‰n taulukko l‰pi
    	for (int i = 0; i < 4; i++) {
			System.out.println(oli_jot[i].getAla()); // castataan Object GeometrinenOlio:ksi
		}
		Arrays.sort (oli_jot);
		System.out.println("taulukko lajiteltuna");
		for (int i = 0; i < 4; i++) {
			System.out.println(oli_jot[i].getAla()); // castataan Object GeometrinenOlio:ksi
		}
		
		geo_kuviot.add (olio4);
		geo_kuviot.add (olio3);
		geo_kuviot.add (olio2);
		geo_kuviot.add (olio1);
		
		int listankoko = geo_kuviot.size ();
    	//K‰yd‰‰n lista l‰pi
    	for (int i = 0; i < listankoko; i++) {
			String vari = geo_kuviot.get(i).getVari (); // haetaan olion v‰ri
			System.out.println(vari);
			System.out.println(geo_kuviot.get(i).getAla()); // 
		}

		// lajitellaan lista
		
		Collections.sort (geo_kuviot); // tapa 1
		
		for (int i = 0; i < listankoko; i++) { 
			System.out.println(geo_kuviot.get(i).getAla()); // 
		}
    }

   
}