import java.util.*;

public class Henkilot<E> {
	protected List<E> l = new LinkedList<>();
	private Comparator<? super E> NIMEN_MUKAAN;
	
	public void lisaa(E o) {
		l.add(o);
	}
	
	public boolean poista(E o){
		return l.remove(o);
	}
	
	public Iterator<E> iter() {
		return l.iterator();
	}
	
	public void lajittelu() {
		l.sort(NIMEN_MUKAAN);
	}
	
}