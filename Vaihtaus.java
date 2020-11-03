import java.io.*;
public class Vaihtaus {
    public static void main(String[] args) {
        int M1 = 5;
        int M2 = 17;
        System.out.println("Ennen vaihto M1 on " + M1 + " " + "M2 on " + M2 + ", mutta vaihdon jalkeen");
        int APU = M2;
        M2 = M1;
        M1 = APU;
        System.out.println("M1 on " + M1 + " " + "ja M2 on " + M2);
    } 
}