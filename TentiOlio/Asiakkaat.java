package TentiOlio;

import java.util.*;

public class Asiakkaat {

    public ArrayList<Asiakas> lista = new ArrayList<Asiakas>();

    public Asiakkaat (){
    }

    @Override
    public String toString() {
        String str = "";
        for (Asiakas asiakas: lista) {
            str = str + "\n" + asiakas.toString();
        }
        return str;
    }

    public void lisaaAsiakas(Asiakas asiakas) {
        if (asiakas instanceof Asiakas) {
            lista.add(asiakas);}
            else if (asiakas instanceof KantaAsiakas) {
                lista.add(asiakas);}
                else System.out.println("Jotain meni pieleen");    
        }

   
    public int getCountSize() {
        return lista.size();
    }

    public int getAsiakas(String text) {
        int rez = 0;
        String nameAsiakas;
        for (int i = 0; i < getCountSize(); i++) {
            Asiakas asiakas = lista.get(i);
            nameAsiakas = asiakas.nimi.toLowerCase();
            if (nameAsiakas.contains(text.toLowerCase())) {
                System.out.println(asiakas.toString());
                rez++;
            }
        }
        return rez;
    }
}