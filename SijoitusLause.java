import java.io.*;
public class SijoitusLause {
    public static void main(String[] args) {
        int Kaloja = 0;
        Kaloja = Kaloja + 8;
        Kaloja = Kaloja * 2;
        Kaloja = (Kaloja - 6) * 3;
        int Kissoja = Kaloja / 3;
        int Yhden_kissan_kalat = Kaloja / Kissoja;
        System.out.println("Kaloja on " + Kaloja + " " + "Kissoja on " + Kissoja + " " + "Yhden kissan kalat on " + Yhden_kissan_kalat);
    } 
}