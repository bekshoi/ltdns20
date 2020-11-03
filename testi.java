

import java.util.Scanner;
import java.io.*;

public class testi {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.print("Anna asiakkaan ID: ");
        String ID = input.next();
        readFromFile(ID);

        input.close();
    }

    public static void readFromFile(String searchID) throws IOException {
     LineNumberReader lnr = new LineNumberReader(new BufferedReader(new FileReader("hnkti40.txt")));
        String line;
        while (true) 
        // ((line = lnr.readLine()) != null)
        {
               line = lnr.readLine();
               if(line == null)
                 break;
                         
               if(line.contains(searchID))
               //(line.indexOf(searchID) != -1)  
               {
                 int i = lnr.getLineNumber();
                 System.out.println(line);
                   while (lnr.getLineNumber() < i+3)
                   System.out.println(lnr.readLine());
               }

    }
    lnr.close(); 
}
}