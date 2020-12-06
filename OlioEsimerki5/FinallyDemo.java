/**
 * @(#)FinallyDemo.java
 *
 *
 * @author
 * @version 1.00 2019/6/20
 */


public class FinallyDemo {

    public static void main (String [] args) {
    	java.io.PrintWriter output = null;

    	try {
    		// Luodaan tiedosto
    		output = new java.io.PrintWriter("text.txt");

    		// Kirjoitetaan tiedostoon
    		output.println("Tervetuloa Javaan");
    	}
    	catch (java.io.IOException ex) {
    		ex.printStackTrace();
    	}
    	finally {
    		// Suljetaan tiedosto
    		if (output != null)
    			output.close();
    	}

    	System.out.println("Ohjelman loppu");
    }


}