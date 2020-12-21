package TentiOlio;

public class Asiakas implements Comparable <Asiakas> {
    public String nimi;
    public int numero;
    public String osoite;
    public Double ostot=0.00;

    public Asiakas (){

    }

    public Asiakas(String nimi, int numero, String osoite) {
        this.nimi=nimi;
        this.numero=numero;
        this.osoite=osoite;
    }
    
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi){
        this.nimi=nimi;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite){
        this.osoite=osoite;
    }

    public double getOstosSumma() {
        return ostot;
    }

    public void lisaaOstosSummaan(Double d) {
        ostot=ostot + d;
    }

    public String toString(){
        return "\n \n" +
        "*********************************** \n" + 
        "Asiakas : " + getNimi() + "\n" + 
        "Numero : " + getNumero() + "\n" + 
        "Osoite : " + getOsoite() + "\n" +
        "*********************************** \n" + 
        "Ostot : " + getOstosSumma() + "\n";
    }    

	@Override
    public int compareTo(Asiakas o) {
        int result = this.ostot.compareTo(o.ostot);
        return result;
    }
}