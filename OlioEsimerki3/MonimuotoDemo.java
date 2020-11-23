/**
 * @(#)MonimuotoDemo.java
 *
 */


public class MonimuotoDemo {

    public static void main(String [] args) {
		JatkoOpiskelija jo = new JatkoOpiskelija(); // luodaan JatkoOpiskelija-luokan olio
		Henkilo hlo = new Henkilo ();// luodaan Henkilo-luokan olio
		tulosta(jo); // kutsutaan tulosta-metodia, v‰litet‰‰n sille edel‰ luotu JatkoOpiskelija-olio
		tulosta(new Opiskelija());// kutsutaan tulosta-metodia, v‰litett‰v‰ Opiskelija-olio luodaan kutsun parametrissa
		tulosta(hlo);
		tulosta(new Object());
    }
    public static void tulosta (Object obj) { // Object-luokka on kaikkien t‰nne tulevien olioiden (iso)vanhempi
		System.out.println(obj.toString());
	}
}
class JatkoOpiskelija extends Opiskelija { // ei ylikirjoitettua toString-metodia->k‰ytt‰‰ vanhemman/"esi-is‰n" metodia
}

class Opiskelija extends Henkilo {
    public String toString() {
		return "Opiskelija";
	}
}
class Henkilo extends Object {
    public String toString() {
		return "Henkilo";
	}
}
