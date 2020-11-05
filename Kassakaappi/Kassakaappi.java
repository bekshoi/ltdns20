/**
 * Kassakaappi luokka sisältää attribuutit pin ja viesti
 * Oikealla pin-koodilla kassakaappi
 * a)palauttaa viestin
 * b)vaihta pin-koodin uudeksi
 * c)vaihtaa viestin
 */
package turva.model;

public class Kassakaappi {
    //attributit
    private String pin;
    private String msg;

    public Kassakaappi(String p, String v) {
        pin = p;
        msg = v;
    }
    //setterit
    public String setPin(String p, String newp) {
        if(p.equals(pin)) {
            pin = newp;
            return "New pin is " + pin;
        }
        return "Access denied: cannot change the pin";
    }

    public String setMsg(String p, String newmsg) {
        if(p.equals(pin)) {
            msg = newmsg;
            return "New secured message is " + msg;
        }
        return "Access denied: cannot change the message";
    }
    //getterit
    public String getMsg(String p) {
        if(!p.equals(pin))
            return "Error: Access denied";
        return msg;
    }
}