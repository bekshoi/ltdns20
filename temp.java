import java.util.*;

public class temp {
    
    public static void main(String args[]) {
    Scanner lukija = new Scanner(System.in);
    String ClientInfo = "oleg;beksh;46;k;y;";
    
    String ClientInfo2 = ClientInfo; 
    int count = ClientInfo.replaceAll("[^;]","").length(); // laske ";"
    int index = ClientInfo2.indexOf(';');
    ClientInfoClass[] words = new ClientInfoClass[count];
    int x = 0;

    for (int i = 0; i < count; i++)
		{ 
            String v = ClientInfo2.substring(0,index);
            // System.out.println(v); // Debag
            words[x]  = new ClientInfoClass(v);
            // System.out.println("\n" + words[x].title); // Debag
            x=x+1;
            ClientInfo2 = ClientInfo2.replace(v+";", "");
            //System.out.println(ClientInfo2);
            //a = index;
            //System.out.println(a);
            index = ClientInfo2.indexOf(';');
            //System.out.println(index);
        }

    // System.out.println("\n" + ClientInfo);
    System.out.println("\n" + words[0].title + words[1].title + words[2].title + words[3].title + words[4].title);
    lukija.close();

    }
}

class ClientInfoClass {
    String title;
    ClientInfoClass(String title) {
        this.title = title;
    }
}