/**
 * @(#)TestaaYmpyraSadePoikkeus.java
 *
 *
 * @author
 * @version 1.00 2019/6/20
 */


public class TestaaYmpyraSadePoikkeus {

    public static void main (String [] args) {
    	try {
    		YmpyraSadePoikkeus y1 = new YmpyraSadePoikkeus(5);
    		y1.setSade(-5);
    		YmpyraSadePoikkeus y3 = new YmpyraSadePoikkeus(0);
    	}
    	catch (HuonoSadePoikkeus ex) {
    		System.out.println(ex);
    	}

    	System.out.println("Luotujen olioiden m‰‰r‰ on: " +
    		YmpyraSadePoikkeus.getOlioidenMaara());
    }


}