/**
 * @(#)LaakariLista.java
 *
 *
 * @author
 * @version 1.00 2011/1/31
 */
import java.io.Serializable;


public class LaakariLista implements Serializable
{
	// viittaus listan ensimm‰iseen alkioon
    private Laakari ekaListalla;

	/** Alustaja luo tyhj‰n listan eli viittaus  = null
	*/
    public LaakariLista()
    {
    	ekaListalla = null;
    }

	/** Palauttaa kaikki listan alkiot yhten‰ merkkijonona
	 */
    public String toString()
    {
    	String sTulostettava = "";
    	Laakari seuraava = ekaListalla;
    	while(seuraava != null)
    	{
    	   sTulostettava += seuraava + "\n";
    	   seuraava = seuraava.getSeuraava();
    	}
    	return sTulostettava;
    }

	/** Lis‰‰ uuden alkion listan alkuun
	 */
    public String lisaaLaakari(Laakari uusi)
    {
    	// Tyhj‰ viite
    	if(uusi == null)
    	   return "Tyhj‰ viite, lis‰ys ep‰onnistui!";

    	uusi.setSeuraava(ekaListalla);
    	ekaListalla = uusi;
      	return "Lis‰ys onnistui!";
    }

	/** Etsii poistettavan alkion l‰‰k‰rin numeron perusteella
	 *  ja sitten p‰ivitt‰‰ linkit kohdalleen (ohittaa poistettavan)
	 */
    public String poista(int iLaakariNro)
    {
    	// Tyhj‰st‰ on paha nyhj‰st‰
    	if(ekaListalla == null)
           return "Poisto ep‰onnistui, lista on tyhj‰!";

    	// Poistettava ekana listalla
       	if(ekaListalla.getLaakarinro() == iLaakariNro)
       	{
            ekaListalla = ekaListalla.getSeuraava();
            return "Poisto onnistui";
       	}

    	// Poistettava on muualla
    	Laakari hakuViite = ekaListalla;
    	while(hakuViite.getSeuraava() != null)
    	{
      	   if(hakuViite.getSeuraava().getLaakarinro() == iLaakariNro)
      	   {
      	   	  Laakari poistettava = hakuViite.getSeuraava();
      	   	  Laakari poistettavaaSeuraava = poistettava.getSeuraava();
      	   	  Laakari poistettavaaEdellinen = hakuViite;
      	   	  poistettavaaEdellinen.setSeuraava(poistettavaaSeuraava);


    	      //hakuViite.setSeuraava(hakuViite.getSeuraava().getSeuraava());
              return "Poisto onnistui";
      	   }
       	   hakuViite = hakuViite.getSeuraava();
    	}

        return "Poisto ep‰onnistui";
    }

	/** Etsit‰‰n l‰‰k‰ri "selaamalla" alusta listaa kunnes lˆytyy
	 */
    public Laakari hae(int iLaakariNro)
    {
    	Laakari hakuViite = ekaListalla;
    	while(hakuViite != null)
    	{
      	   if(hakuViite.getLaakarinro() == iLaakariNro)
    	      return hakuViite;
       	   hakuViite = hakuViite.getSeuraava();
    	}
        return null;
    }

	/** Etsit‰‰n l‰‰k‰rit "selaamalla" alusta lista l‰pi
	 */
    public String hae(String sOsasto)
    {
    	String sLaakarit = "";

    	Laakari hakuViite = ekaListalla;
    	while(hakuViite != null)
    	{
      	   if(hakuViite.getOsasto().equals(sOsasto))
    	      sLaakarit += hakuViite;
       	   hakuViite = hakuViite.getSeuraava();
    	}
        return sLaakarit;
    }
}