package OlioEsimerki5;

public static <E> lue (String tiedostonimi) {
    try {
    FileInputStream tiedosto = new FileInputStream(tiedostonimi);
    ObjectInputStream input = new ObjectInputStream(tiedosto);
    <E> luettava = (<E>)input.readObject();
    input.close();
    return luettava;
    } catch(Exception ex) {
    System.out.println("Ei saatu luettua " + tiedostonimi);
    return null;
    }
    }
    
    
    public static boolean kirjoita (<E> olio, String tiedostonimi) {
    try {
    FileOutputStream tiedosto = new FileOutputStream(tiedostonimi);
    ObjectOutputStream output = new ObjectOutputStream(tiedosto);
    output.writeObject(olio);
    output.close();
    return true;
    } catch (Exception ex) {
    return false;
    }
    }
    
    <E> = Luokan tyyppi jonka oliota haluat tallettaa tiedostoon.
    
    HUOM: Luokan <E> ja kaikkien sen alaluokkien on toteutettava Serializable-rajapinta.
    
    Esittele (ylä)luokka näin:
    
    public class <E> implements java.io.Seriazable {}
    
    Serializable-rajapintaan ei kuulu mitään metodeja, joten luokkaan ei tarvitse lisätä
    muuta kuin luokalle yksilöllinen serialVersionUID-attribuutti jota käytetään varmistamaan
    että serialisoitu olio saadaan luettua onnistuneesti tiedostosta. Lisää siis luokan <E>
    attribuutteihin esim. seuraava:
    
    private static final long serialVersionUID = -7213041548529459567L;
    
    