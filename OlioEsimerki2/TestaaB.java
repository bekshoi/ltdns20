/**
 * @(#)TestaaB.java
 *
 * Esimerkkiratkaisu tehtävään 3
 *
 * @author
 * @version 1.00 2019/06/14
 */
import java.util.Scanner;
public class TestaaB {
   
   public static void main(String [] args) {
      B eka = new B();
      eka.setm(5);
      eka.setn(6);
      System.out.println("eka: " + eka.m + " " + eka.n);
      System.out.println("eka: " + eka.getm() + " " + eka.getn());
   }
}