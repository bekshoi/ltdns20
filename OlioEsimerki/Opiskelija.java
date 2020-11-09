/**
 * @(#)Opiskelija.java
 *
 *
 * @author
 * @version 1.00 2019/06/12
 */


public class Opiskelija {
	private int tunnus;
	private SyntAika syntAika;


    public Opiskelija(int nro, int vv, int kk, int pv) {
    	tunnus = nro;
    	syntAika = new SyntAika(vv,kk,pv);
    }

    public int palautaTunnus(){
    	return tunnus;
    }

    public SyntAika palautaSyntAika(){
    	return syntAika;
    }


}