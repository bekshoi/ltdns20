/**
 * @(#)SyntAika.java
 *
 *
 * @author
 * @version 1.00 2019/6/12
 */


public class SyntAika {
	private int vv;
	private int kk;
	private int pv;

    public SyntAika(int v, int k, int p) {
    	vv = v;
    	kk = k;
    	pv = p;
    }

    public void asetaVuosi( int v){
    	vv = v;
    }

    public String toString(){
    	return "Päiväys " +vv+kk+pv;
    }


}