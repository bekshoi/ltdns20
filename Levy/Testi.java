package Levy;

public class Testi {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Levy levy = new Levy();
        Levy levy1 = new Levy();

        catalog.addLevy(levy);
        catalog.addLevy(levy1);
        catalog.addLevy2(new Levy());        
        catalog.addLevy2(new Levy("Kino","Noch","1988"));
        catalog.addLevy2(new Levy("Beatles","Yelow submarine","1961"));
        System.out.println(catalog);
        catalog.removeLevy(1);
        System.out.println(catalog);        
        catalog.forEach();
    }
}