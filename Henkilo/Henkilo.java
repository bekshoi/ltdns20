import java.util.Comparator;

/**
 * Esimerkki Comparator, Comparable ja Cloneable liittymien toteutuksesta
 */
 public class Henkilo implements Comparable<Henkilo>, Cloneable {
	private String nimi;
	
	public Henkilo(String nimi) {
		this.nimi = nimi;
	}
 
	public String getNimi() {
		return nimi;
	}
	
	public void setNimi(String unimi) {
		nimi = unimi;
	}
	
	public String toString(){
		return nimi;
	}
	
	public boolean equals(Object o) {
		if( o == null )
			return false;
		if( o instanceof Henkilo )
			return nimi.equals( ((Henkilo)o).nimi);
		return false;
	}
	
	public int compareTo(Henkilo h) {
		return nimi.compareTo(h.nimi);
	}
	
	public int hashCode() {
		return nimi.hashCode();
	}
	
	public static final Comparator<Henkilo> NIMEN_MUKAAN 
		= new Comparator<>() {
			public int compare(Henkilo h1, Henkilo h2){
				return h1.nimi.compareTo(h2.nimi);
			}
		};
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}
 }