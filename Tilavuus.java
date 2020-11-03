import java.io.*;
 
public class Tilavuus {
 
    public static void main(String[] args) {
        // lieriön tilavuuden V = pi * r^2 * h
        double pi = 3.14;
        double r = 2.0; 
        double h = 5.0;
        double v = pi * r * r * h;
        System.out.println(v);
    } 
}