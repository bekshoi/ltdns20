import java.io.*;
 
public class Program {
 
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            String text = "Hello Gold!";
            writer.write(text);
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}