import java.util.*;

public class Testi {
	public static void main(String[] args){
		Henkilot<Henkilo> lista = new Henkilot<Henkilo>();
		
		Henkilo a = new Henkilo("Heikki");
		Henkilo b = new Henkilo("Matti");
		Henkilo c = new Henkilo("Maija");
		Henkilo d = new Henkilo("Raija");
		Henkilo e = new Henkilo("Kaija");

		lista.lisaa(a);
		lista.lisaa(b);
		lista.lisaa(c);
		lista.lisaa(d);
		lista.lisaa(e);
		
		Iterator<Henkilo> it = lista.iter();
		
		while(it.hasNext())
			System.out.println(it.next());
			
		lista.poista(c);

		it = lista.iter();
		while(it.hasNext())
			System.out.println(it.next());
		
		lista.lajittelu();

		it = lista.iter();
		while(it.hasNext())
			System.out.println(it.next());

	}
}