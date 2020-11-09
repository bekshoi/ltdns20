/**
 * @(#)TestiYmpyra1.java
 *
 *
 * @author
 * @version 1.00 2019/6/12
 */


    // M‰‰ritell‰‰n luokka, jolla on kaksi konstruktoria
    class Ympyra2 {
    	/** Ympyr‰n s‰de */
    	double sade;

    	/** Luotujen olioiden m‰‰r‰ */
    	static int olioidenMaara = 0;

    	/** Konstruktori ympyr‰lle, jonka s‰de on 1 */
    	Ympyra2() {
    		sade = 1.0;
    		olioidenMaara++;
    	}

    	/** Konstruktori ympyr‰lle, jolla on tietty s‰de */
    	Ympyra2(double uusiSade) {
    		sade = uusiSade;
    		olioidenMaara++;
    	}

    	/** Palautetaan t‰m‰n ympyr‰n s‰de */
    	double palautaAla() {
    		return sade * sade * Math.PI;
    	}

    	/** Palautetaan olioiden m‰‰r‰ */
    	static int palautaOlioidenMaara() {
    		return olioidenMaara;
    	}

    	/** Main methodi */
  public static void main(String[] args) {
    System.out.println("Ennen olioiden luomista");
    System.out.println("Olioiden m‰‰r‰ on  " +
      Ympyra2.olioidenMaara);

    // Luodaan c1
    Ympyra2 c1 = new Ympyra2();

    // N‰ytet‰‰n c1 ennen c2:den luontia
    System.out.println("\nc1:den luomisen j‰lkeen");
    System.out.println("c1: sade (" + c1.sade +
      ") ja olioiden m‰‰r‰ on  (" +
      c1.olioidenMaara + ")");

    // Luodaan c2
    Ympyra2 c2 = new Ympyra2(5);

    // Muokataan c1:ta
    c1.sade = 9;

    // Esitet‰‰n c1 ja c2 molempien luomisen j‰lkeen
    System.out.println("\nc1 ja c2");
    System.out.println("c1: sade (" + c1.sade +
      ") olioiden m‰‰r‰ on (" +
      c1.olioidenMaara + ")");
    System.out.println("c2: sade (" + c2.sade +
      ") ja olioiden m‰‰r‰ (" +
      c2.olioidenMaara + ")");
  }

    }

