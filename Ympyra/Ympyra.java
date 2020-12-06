package Ympyra;

/**
 * 
 *
 */


import java.io.Serializable;

public class Ympyra implements java.io.Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private double sade;

   public Ympyra(double r) {
      setSade(r);
   }

   public double getAla() {
      return Math.PI * sade * sade;
   }

   public double getSade() {
      return sade;
   }

   public void setSade(double r) {
       sade=r;
   }

   public String toString() {
      return "Ympyran sade on " + sade + " ja pinta-ala on " + getAla();
   }

   public boolean equals(Ympyra y) {
      if (this.sade == y.getSade())
         return true;
      else
         return false;
    }

    public boolean suurempiKuin(Ympyra y) {
      if (this.getAla() > y.getAla())
         return true;
      else
         return false;    
    }
}