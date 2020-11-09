public class TestaaSuoraKulmio {
  public static void main(String[] args) {
    SuoraKulmio ekaKulmio = new SuoraKulmio(4, 40);
    System.out.println("Suorakulmion leveys on " +
      ekaKulmio.m_leveys + " ja korkeus " +
      ekaKulmio.m_korkeus + ", jolloin suorakulmion ala on " +
      ekaKulmio.getAla());
    System.out.println("Suorakulmion piiri on " + ekaKulmio.getPiiri());

    SuoraKulmio tokaKulmio = new SuoraKulmio(3.5, 35.9);
    System.out.println("Suorakulmion leveys on " +
      tokaKulmio.m_leveys + " ja korkeus " +
      tokaKulmio.m_korkeus + ", jolloin suorakulmion ala on " +
      tokaKulmio.getAla());
    System.out.println("Suorakulmion piiri on " + tokaKulmio.getPiiri());
  }
}
