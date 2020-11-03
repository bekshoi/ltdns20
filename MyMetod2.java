import java.util.*;

public class MyMetod2 {
    public static void main(String[]args) {
     

       Scanner input = new Scanner(System.in);
        System.out.print ("Anna luku1 : ");
        int luku1 = input.nextInt();
        System.out.print ("Anna luku2 : ");
        int luku2 = input.nextInt();
        // summa = luku1 + luku2;
        System.out.print("Summa on" + summa(luku1,luku2));
        System.out.print("Summa on" + erotus(luku1,luku2));
        System.out.print("Summa on" + tulo(luku1,luku2));
        System.out.print("Summa on" + osamaara(luku1,luku2));
        input.close();
    
        }

    public static int summa(int a, int b){
        return a+b;
    }
    public static int erotus(int a, int b){
        return a-b;
    }
    public static int tulo(int a, int b){
        return a*b;
    }
    public static int osamaara(int a, int b){
        return a/b;
    }

}
