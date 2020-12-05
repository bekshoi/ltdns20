package Animal2;

/**
 * Luokka testiAnimal2
 * 
 * @author bekshoi
 * @version 3.00 2020/11/28
 * @ltdns20 http://github.com/bekshoi/ltdns20
 * 
*/

public class testiAnimal2 {
    public static void main(String[] args) {

        Papukaija2 papukaija = new Papukaija2("Papukaija", 1, "John Silver"); //luoda olio papukaija
        Kissa2 kissa = new Kissa2("Kissa",1, 9);   // luoda olio kissa    
        Lammas2 lammas = new Lammas2("Lammas",1, "valkoinen"); // luoda olio lammas parametriton
        System.out.print(kissa);
        kissa.setName("Barsik");
        kissa.setStatus(0);
        System.out.print(kissa);

        System.out.println("Eläin <" + kissa.getName() + "> joka " + kissa.getStatus() + " ja jolla on " + kissa.getLives() + " elämijä");        
        int l = 6; // muutaja kissan elämijä varten - testi
        kissa.setLives(l);
        System.out.println("Eläin <" + kissa.getName() + "> joka " + kissa.getStatus() + " ja jolla on " + kissa.getLives() + " elämijä");
        kissa.LaskeLives(l);
        System.out.println("Eläin <" + kissa.getName() + "> joka " + kissa.getStatus() + " ja jolla on " + kissa.getLives() + " elämijä");
        System.out.print(kissa);

        System.out.print(papukaija);
        papukaija.setMerirosvoisanta("Jack_Sparrow");
        System.out.println("Uusi merirosvoisäntä on " + papukaija.getMerirosvoisantaNimi());

        System.out.println("Lampaan vari on " + lammas.getVari());
        lammas.setVari("musta");
        System.out.println("Lampaan vari on " + lammas.getVari());


        Animal2 animal[] = new Animal2[3]; // luoda laivaseen taulukkoon
		animal[0] = kissa;
		animal[1] = lammas;
        animal[2] = papukaija;

        for (int i = 0; i <= 2; i++) {
            System.out.println("Eläin <" + animal[i].getName() + ">, joka " + animal[i].getStatus());
                if (animal[i].getClass() == kissa.getClass()){
                    System.out.println("jolla on " + kissa.getLives() + " elämää");}
                    else if (animal[i].getClass() == papukaija.getClass()){
                        System.out.println("jolla on merirosvoisäntä " + papukaija.getMerirosvoisantaNimi());}
                        else if (animal[i].getClass() == lammas.getClass()){
                            System.out.println("jolla on turkiväri " + lammas.getVari());}
                    else continue;
                    System.out.print("sanoi ");
                    animal[i].Talk();
        }        
    }    
}