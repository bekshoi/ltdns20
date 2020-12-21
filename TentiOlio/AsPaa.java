package TentiOlio;
/*
* Tämä koodi liittyy tentin tehtävään 3, mutta saat tästä vinkkiä myös tehtävien 1 ja 2 metodeihin
*/
public class AsPaa {
    public static void main(String[] args) {
    // luodaan uusi Asiakkaat-luokan ilmentymä l. olio
    Asiakkaat kaikki_asiakkaat = new Asiakkaat();
    // luodaan asiakas Maija
    Asiakas eka = new Asiakas("Maija Meri", 112, "Leilitie 12, 80100 Joensuu");
    // Kasvatetaan Maijan ostosten summaa
    eka.lisaaOstosSummaan(423.45);
    eka.lisaaOstosSummaan(423.44);
    // lisätään Maijan tiedot Asiakkaat-luokan kokoelmaan
    kaikki_asiakkaat.lisaaAsiakas(eka);
    
    // luodaan kanta-asiakas Ville
    KantaAsiakas toka = new KantaAsiakas("Ville Vaara", 123, "Mutalalantie 4, 80100 Joensuu", 1980, "vaarala@gmail.com");
    // kasvatetaan Villen ostosten summaa
    toka.lisaaOstosSummaan((double) 100);
    toka.lisaaOstosSummaan(220.95);
    // lisätään Villen tiedot kokoelmaan
    kaikki_asiakkaat.lisaaAsiakas(toka);
    
    System.out.println(kaikki_asiakkaat.getAsiakas("Ville Vaara"));
    System.out.println(kaikki_asiakkaat);

    
    int i = eka.compareTo(toka);
    if (i>0) {
        System.out.println("Asiakas " + eka.getNimi() + " tehnyt ostoksia suurella summalla " + eka.getOstosSumma());
        }
    else if (i<0){
        System.out.println("Asiakas " + eka.getNimi() + " tehnyt ostoksia suurella summalla " + toka.getOstosSumma());
        }
    else if (i==0){
        System.out.print("Ostosummat ovat samat");
        }                    
    }
}