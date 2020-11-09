/**
 * @(#)Ympyra1.java
 *
 *
 * @author
 * @version 1.00 2019/6/12
 */


    // M‰‰ritell‰‰n luokka, jolla on kaksi konstruktoria
    class Ympyra1 {
    	double sade;

    	/** Konstruktori ympyr‰lle, jonka s‰de on 1 */
    	Ympyra1() {
    		sade = 1.0;
    	}

    	/** Konstruktori ympyr‰lle, jolla on tietty s‰de */
    	Ympyra1(double uusiSade) {
    		sade = uusiSade;
    	}

    	/** Palautetaan t‰m‰n ympyr‰n s‰de */
    	double palautaAla() {
    		return sade * sade * Math.PI;
    	}
    }

