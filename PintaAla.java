
public class PintaAla {
//    private static double sade;
//    private static double leveys;
//    private static double korkeus;

public static final int a = 2;

//    public PintaAla (double sade) {    }

    // ympyrän pinta-ala
    public static double getPintaAla(double sade) {
        return Math.PI*(sade*sade);
    }
    // suorakolmio pinta-ala
    public static double getPintaAla(double leveys, double korkeus) {
        return leveys * korkeus;
    }
    // sylinterin sivupinta-ala
    public static double getPintaAla(int a, double sade, double korkeus) {
        return a*Math.PI*sade*korkeus;
    }
}