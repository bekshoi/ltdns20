/**
 *
 * @author bekshoi
 * @version 1.00 2020/11/3
 */


public class TestiSuoraKulmio {

    public static void main (String [] args)  {
    	// Luodaan SuoranKulmio
    	SuoraKulmio kulmio1 = new SuoraKulmio(40, 4);
    	System.out.println("Suorakulmion korkeus on "
    		+ kulmio1.m_height + " ja sen leveys on "
				+ kulmio1.m_weight + " ja sen ala on "
				+ kulmio1.getAla() + " ja sen piiri on"
				+ kulmio1.getPiiri());

    }
}