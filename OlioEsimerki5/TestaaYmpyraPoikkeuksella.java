/**
 * @(#)TestaaYmpyraPoikkeuksella.java
 *
 *
 * @author
 * @version 1.00 2019/6/20
 */


public class TestaaYmpyraPoikkeuksella {

    public static void main(String[] args) {
    	try {
    		YmpyraPoikkeuksella y1 = new YmpyraPoikkeuksella(5);
    		YmpyraPoikkeuksella y2 = new YmpyraPoikkeuksella(-5);
    		YmpyraPoikkeuksella y3 = new YmpyraPoikkeuksella(0);
    	}
    	catch (IllegalArgumentException ex) {
    		System.out.println(ex);
    	}

    	System.out.println("Luotujen olioiden m‰‰r‰ on: " +
    		YmpyraPoikkeuksella.getOlioidenMaara());
    }


}