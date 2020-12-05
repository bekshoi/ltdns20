
public class testiPintaAla {
    public static void main(String[] args) {

        System.out.printf("Ympärään pinta-ala on: %,10.2f\n", PintaAla.getPintaAla(2.00)); // ympyrän pinta-ala
        System.out.printf("Suorakolmion pinta-ala on: %,10.2f\n",PintaAla.getPintaAla(5.00, 6.00)); // suorakolmion pinta-ala
        System.out.printf("Sylinterin sivupinta-ala on: %,10.2f\n",PintaAla.getPintaAla(PintaAla.a, 2.00, 5.00)); //sylinterin sivupinta-ala
    }
}