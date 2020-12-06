/**
 * 
 *
 */

import java.util.Scanner;
import java.io.*;

public class Ympyra10 implements java.io.Serializable {
    /**
    *
    */
   private static final long serialVersionUID = 1L;

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      Ympyra [] ympyrat = {
         new Ympyra(1),
         new Ympyra(2),
         new Ympyra(3),
         new Ympyra(4),
         new Ympyra(5),
         new Ympyra(6),
         new Ympyra(7),
         new Ympyra(8),
         new Ympyra(9),
         new Ympyra(10)};

         String FileName = "Ymparyt.dat";
         ObjectOutputStream wFile = null;

         try {
            wFile=new ObjectOutputStream(new FileOutputStream(FileName));
            wFile.writeObject(ympyrat);
         }
         catch (Exception e) {
            e.printStackTrace();
         }

         ObjectInputStream rFile = null;
         Ympyra [] rYmpyrat = new Ympyra[ympyrat.length];

         try {
            rFile=new ObjectInputStream(new FileInputStream(FileName));
            rYmpyrat = (Ympyra []) rFile.readObject();
            }
         catch (IOException e){
            e.printStackTrace();
         }
         catch (ClassNotFoundException e) {
            e.printStackTrace();
         }
         finally{
            try {
               if (wFile != null) wFile.close();
            }
            catch (IOException e){
               e.printStackTrace();
            }
            try {
               if (rFile != null) rFile.close();
            } 
            catch (IOException e){
               e.printStackTrace();
            }
         }

         for (Ympyra ympyra : rYmpyrat) {
            System.out.println(ympyra);
         }
      input.close();
    }
}