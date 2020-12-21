package TentiOlio;

public class KantaAsiakas extends Asiakas{
    public int vuosi;
    public String email;

	public KantaAsiakas(String nimi, int numero, String osoite, int vuosi, String email) {
        super(nimi, numero, osoite);
        this.vuosi=vuosi;
        this.email=email;
    }
    
    public int getVuosi() {
        return vuosi;
    }

    public void setNumero(int vuosi){
        this.vuosi=vuosi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }
    @Override
    public String toString(){
        return "\n \n" +
        "*********************************** \n" + 
        "Asiakas : " + nimi + "\n" + 
        "Numero : " + numero + "\n" + 
        "Osoite : " + osoite + "\n" +
        "Numero : " + vuosi + "\n" + 
        "Osoite : " + email + "\n" +
        "*********************************** \n" + 
        "Ostot : " + ostot + "\n";
    }    
}