import java.util.*;
public class T1 {
    public static void main(String[] args) {
        
        String[] list = {"qwe", "asd", "zxc"};

        // 2 vaihetta Ohjelma kysyy: "Anna haettava palvelu" , etsii 
        // haettavan arvon ja tulostaa monesko alkio se on taulukossa.
        Scanner rider = new Scanner(System.in);
        System.out.print("Anna haettava palvelu: ");
        String c = rider.nextLine();
        // String c = "zxc";
        System.out.print(lineaarinenHaku(list, c));
        System.out.println();}

    public static int lineaarinenHaku(String[] lista, String avain) {
        
        for (int i=0; i < lista.length; i++)
            if (avain.equals(lista[i]))
            return i;
        return -1;
        
        }
}
