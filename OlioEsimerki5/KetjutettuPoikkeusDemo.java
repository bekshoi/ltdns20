/**
 * @(#)KetjutettuPoikkeusDemo.java
 *
 *
 * @author
 * @version 1.00 2019/6/20
 */


public class KetjutettuPoikkeusDemo {

    public static void main (String [] args) {
    	try {
    		metodi1();
    	}
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}
    }

    public static void metodi1() throws Exception {
    	try {
    		metodi2();
    	}
    	catch (Exception ex) {
    		throw new Exception("Uutta tietoa metodista 1", ex);
    	}
    }

    public static void metodi2() throws Exception {
    	throw new Exception("Uusi info metodista2");
    }


}