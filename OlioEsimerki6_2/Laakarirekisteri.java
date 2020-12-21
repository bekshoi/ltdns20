/**
 * @(#)Laakarirekisteri.java
 *
 *
 * @author
 * @version 1.00 2011/2/16
 */

import java.util.Calendar;
import java.io.*;

public class Laakarirekisteri {

    static LaakariLista lista;
    /** Oikeassa työssä kysytään tiedoston nimi, tässä esimerkissä
     *  kompaktiuden vuoksi kiinnitetty arvo */
    static final String sTIEDOSTO = "laakarilista.dat";

    public static void main(String [] args)
    {
    	lista = aloitus();
    	int iValinta = -1;
    	do{
    	   iValinta = valikko();
           switch(iValinta)
           {
           	  case 0: lopetus(); break;
           	  case 1: tulosta(); break;
           	  case 2: lisaa(); break;
           	  case 3: poista(); break;
           	  case 4: hae(); break;
           	  default : System.out.println("Huono valinta!!!"); break;
           }
    	}while(iValinta != 0);
    }

    private static LaakariLista aloitus()
    {
       LaakariLista luettulista = null;
       try
       {
          File fTiedosto = new File(sTIEDOSTO);
          if(fTiedosto.exists())
          {
          	FileInputStream fosTiedosto = new FileInputStream(fTiedosto);
            ObjectInputStream osTiedosto = new ObjectInputStream(fosTiedosto);
            luettulista = (LaakariLista)osTiedosto.readObject();
          }
       }
       catch(Exception e)
       {
         System.out.println("Ongelmia tiedoston " + sTIEDOSTO +  " lukemisessa.");
       }

       if(luettulista == null)
       {
          luettulista = new LaakariLista();
       }

       return luettulista;
    }

    private static void lopetus()
    {
       System.out.println("Kiitos käytöstä");
       // Tiedostoon tallentaminen
       try
       {
          File fTiedosto = new File(sTIEDOSTO);
          FileOutputStream fosTiedosto = new FileOutputStream(fTiedosto);
          ObjectOutputStream osTiedosto = new ObjectOutputStream(fosTiedosto);
          osTiedosto.writeObject(lista);
          osTiedosto.close();
       	  fosTiedosto.close();
       }
       catch(Exception e)
       {
          System.out.println("Tiedostoon tallentaminen ei onnistu.");
       }
       //System.exit(0);
    }

    private static void tulosta()
    {
       int iValinta = 0;
       do
       {
          System.out.println("Tulostetaanko ");
          System.out.println("1. Näytölle");
          System.out.println("2. Tekstitiedostoon");
          iValinta = Kysy.kluku();
       }while(iValinta <1 || iValinta>2);

       if(iValinta ==1)
       {
          System.out.println(lista);
          return;
       }

       System.out.println("Annan tiedostonimi: ");
       String sTulostusTiedosto = Kysy.mjono();

       try
       {
          File fTiedosto = new File(sTulostusTiedosto);
          FileOutputStream fosTiedosto = new FileOutputStream(fTiedosto);
          PrintWriter pwTiedosto = new PrintWriter(fosTiedosto, true);
          pwTiedosto.println(lista);
          pwTiedosto.close();
       	  fosTiedosto.close();
       }
       catch(Exception e)
       {
          System.out.println("Tiedostoon tulostaminen ei onnistu.");
       }
    }

    private static void lisaa()
    {
      System.out.print("Syötä lääkärinumero:");
      int iLaakarinro = Kysy.kluku();
      System.out.print("Syötä lääkärin nimi:");
	  String sNimi = Kysy.mjono();
      Calendar cSyntymapaiva = null;
      int iVuosi = 0;
      int iKuukausi = 0;
      int iPaiva = 0;
      do
      {
   	     System.out.print("Syötä lääkärin syntymävuosi(vvvv):");
	     iVuosi = Kysy.kluku();
	     System.out.print("Syötä lääkärin syntymäkuukausi(kk):");
	     iKuukausi = Kysy.kluku();
	     System.out.print("Syötä lääkärin syntymäpäivä(pv):");
	     iPaiva = Kysy.kluku();
	     cSyntymapaiva = Calendar.getInstance();
	     cSyntymapaiva.clear();
	     cSyntymapaiva.set(iVuosi, iKuukausi-1, iPaiva);
      }while(!tarkastaPaivays(cSyntymapaiva,iPaiva,iKuukausi,iVuosi));


      System.out.print("Syötä lääkärin osasto:");
	  String sOsasto = Kysy.mjono();

	  Laakari lekuri = new Laakari(iLaakarinro, sNimi, cSyntymapaiva, sOsasto);
	  String sTulos = lista.lisaaLaakari(lekuri);
	  System.out.println(sTulos);
    }

    private static void poista()
    {
      System.out.print("Syötä lääkärinumero:");
      int iLaakarinro = Kysy.kluku();
	  String sTulos = lista.poista(iLaakarinro);
	  System.out.println(sTulos);
    }

    private static void hae()
    {
       int iValinta = 0;
       do
       {
          System.out.println("Haetaanko ");
          System.out.println("1. Osastolla");
          System.out.println("2. Lääkärinumerolla");
          iValinta = Kysy.kluku();
       }while(iValinta <1 || iValinta>2);

      if(iValinta == 1)
      {
          System.out.print("Syötä osasto:");
          String sOsasto = Kysy.mjono();
	      String sLaakarit = lista.hae(sOsasto);

   	      System.out.println(sLaakarit);
      	  return;
      }

      System.out.print("Syötä lääkärinumero:");
      int iLaakarinro = Kysy.kluku();
	  Laakari laakari = lista.hae(iLaakarinro);
	  if(laakari == null)
	     System.out.println("Valitsemallasi numerolla ei löydy lääkäriä.");
	  else
   	     System.out.println(laakari);
    }

    private static int valikko()
    {
      	System.out.println("Lääkärirekisteri v.0.1");
    	System.out.println("Valitse toiminto:");
    	System.out.println("0. Lopeta");
    	System.out.println("1. Tulosta lääkärit");
    	System.out.println("2. Lisää lääkäri");
    	System.out.println("3. Poista lääkäri");
    	System.out.println("4. Hae lääkäri");
    	System.out.println("");
    	return Kysy.kluku();
    }

    /** <p>Metodi päiväyksen tarkistamista varten. </p>
     *
     *  <p>Calendar muuntaa automaattisesti virheellisen päiväyksen "oikeelliseksi". Esimerkiksi 30.2.2012 muunnettaisi arvoon
     *     1.3.2012 (päiväys on yhden päivän väärin, siirretään siis päivä eteenpäin). Virheellisen päiväyksen voi siis
     *     tarkistaa siten, että verrataan käyttäjän antamia arvoja Calendarin arvoihin. Jos arvot ovat muuttuneet, on päiväyskin
     *     virheellinen.</p>
     *
     *  @param paivays Päiväys Calendar-muotoisena.
     *  @param paiva Käyttäjän antama päivä
     *  @param kk Käyttäjän antama kuukausi
     *  @param vuosi Käyttäjän antama vuosi
     */
    public static boolean tarkastaPaivays(Calendar cPaivays, int iPV, int iKK, int iV)
    {
    	int iPaiva = cPaivays.get(Calendar.DAY_OF_MONTH);
    	int iKk = cPaivays.get(Calendar.MONTH)+1; // kuukaudet alkoivat Calendarissa nollasta!!
    	int iVuosi = cPaivays.get(Calendar.YEAR);

    	if (iPaiva == iPV && iKk == iKK && iVuosi == iV)
    		return true;

    	return false;

    }

}