/**
 * @(#)TestaaPoikkeus.java
 *
 *
 * @author
 * @version 1.00 2019/6/20
 */


public class TestaaPoikkeus {

    public static void main(String [] args) {
    	try {
    		System.out.println(summa(new int[] {1, 2, 3, 4, 5}));
    	}
    	catch (Exception ex) {
    		ex.printStackTrace();
    		System.out.println("\n" + ex.getMessage());
    		System.out.println("\n" + ex.toString());

    		System.out.println("\nTrace info joka saadaan getStackTrace:sta");
    		StackTraceElement[] traceAlkiot = ex.getStackTrace();
    		for (int i = 0; i < traceAlkiot.length; i++) {
    			System.out.print("metodi "+ traceAlkiot[i].getMethodName());
    			System.out.print("(" + traceAlkiot[i].getClassName() + ":");
    			System.out.println(traceAlkiot[i].getLineNumber() + ")");
    		}
    	}
    }

    private static int summa(int[] lista) {
    	int tulos = 0;
    	for (int i = 0; i <= lista.length; i++)
    		tulos += lista[i];
    	return tulos;
    }

}