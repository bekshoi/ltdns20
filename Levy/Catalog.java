package Levy;

import java.util.*;

public class Catalog {
    
    public ArrayList<Levy> catalog = new ArrayList<Levy>();

    public Catalog (){
    }

    @Override
    public String toString() {
        String str = "";
        for (Levy levy: catalog) {
            str = str + "\n" + levy.toString();
        }
        return str;
    }

    public void addLevy(Levy levy) {
        levy.Kysy();
        catalog.add(levy);
        }

        public void addLevy2(Levy levy) {

            catalog.add(levy);
            }
    
    
    public void removeLevy(int id){
            catalog.remove(id);
    }

	public void forEach () {
        System.out.println(catalog);
	}
}