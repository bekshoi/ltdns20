/**
@author bekshoi
@version 1.0

*/

public class MyMetodi {
    public static void main(String [] args) {
        TulostaPylvas("Joni",5);


    }
        public static void TulostaPylvas (String nimi, int pituus){
            System.out.print(nimi + "\t");
                for (int i=0; i < pituus; i++)
                    System.out.print("*");
                    System.out.println();
        }
}


