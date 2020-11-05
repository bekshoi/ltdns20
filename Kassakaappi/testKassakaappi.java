/**
 * 
 */

package turva.controller;

import turva.model.Kassakaappi;

public class testKassakaappi {
   public static void main(String[] args) {
       
   Kassakaappi k = new Kassakaappi ("1234", "Salainen viesti");
       System.out.println(k.getMsg("2222"));
       System.out.println(k.getMsg("1234"));

       System.out.println(k.setPin("1111", "4321"));
       System.out.println(k.setPin("1234", "4321"));

       System.out.println(k.getMsg("1234"));
       System.out.println(k.getMsg("4321"));

       System.out.println(k.setMsg("1234", "Uusi salasana"));
       System.out.println(k.setMsg("4321", "Uusi salasana"));
    
   } 
}
