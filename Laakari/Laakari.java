package Laakari;
/**
 * @(#)Laakari.java
 *
 * T�m� luokka kuvaa yhden l��k�rin tiedot.
 * Luokasta on viite listalla seuraavaan l��k�riin (linkitetty lista)
 * @author Marko ja muut
 * @version 1.00 2011/1/23
 */
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.io.Serializable;

public class Laakari implements Serializable
{
	/** Muuttuja kuvaa l��k�rin numeron, numerot ovat v�lilt� 1000-2999 */
	private int iLaakarinro;
	/** Muuttuja kuvaa l��k�rin nimen, jos nime� ei ole, on oletusarvo "Ei tiedossa" */
	private String sNimi;
	/** Muuttuja kuvaa l��k�rin syntym�p�iv�n p�iv�yksen, jos syntym�p�iv�� ei ole, on oletusarvo 1.1.1900 */
	private Calendar cSyntymapaiva;
	/** Muuttuja kuvaa l��k�rin osaston jolla h�n ty�skentelee, jos nime� ei ole, on oletusarvo "Ei tiedossa"  */
	private String sOsasto;
	/** Muuttuja seuraava on linkki listalla olevaan seuraavaan l��k�riin. Jos kyseess� on listan viimeinen l��k�ri, viittaa muuttuja tyhj��n (null-arvo) */
	private Laakari seuraava;

	// Konstruktorit

	/**
	 * Tyhj� oletuskonstruktori
	 * L��k�rin arvot asetetaan oletusarvoihinsa
	 */
    public Laakari()
    {
    	iLaakarinro = 0;
		sNimi = "";
		cSyntymapaiva = Calendar.getInstance();
		cSyntymapaiva.clear();
		cSyntymapaiva.set(0000, 0, 1);
		sOsasto = "";
    }

	/**
	 * Konstruktori jossa asetetaan uuden l��k�rin tiedot.
	 * Tietojen asettamisessa k�ytet��n set-metodeja.
	 * @param iLaakarinro L��k�rin l��k�rinumero (v�lilt� 1000-2999)
	 * @param sNimi L��k�rin nimi
	 * @param cSyntymapaiva L��k�rin syntym�p�iv�
	 * @param sOsasto Osasto jolla l��k�ri ty�skentelee
	 */
    public Laakari(int iLaakarinro, String sNimi, Calendar cSyntymapaiva, String sOsasto)
    {
    	setLaakarinro(iLaakarinro);
    	setNimi(sNimi);
    	setSyntymapaiva(cSyntymapaiva);
    	setOsasto(sOsasto);
    }

    // P��symetodit eli aksessorit (set ja get)
    public void setLaakarinro(int iLaakarinro)
    {
    	if (iLaakarinro < 1000 | iLaakarinro > 2999)
    		this.iLaakarinro = 0;
    	else
    		this.iLaakarinro = iLaakarinro;
    }
    /**
     *  Metodi asettaa l��k�rin nimen.
     *  Jos parametri on tyhj�, asetetaan merkkijono "Ei tiedossa"
     *  @param sNimi L��k�rin nimi
     **/
    public void setNimi(String sNimi)
    {
    	if (sNimi == null)
    		this.sNimi = "Ei tiedossa";
    	else
    		this.sNimi = sNimi;
    }
    /**
     * Metodi asettaa parametrina tulleen Calendar -olion l��k�rin syntym�p�iv�ksi
     * Jos parametri on tyhj� viite (null-arvo), asetetaan syntym�p�iv�ksi 1.1.1900
     * @param cSyntymapaiva Ilmaisee l��k�rin syntym�p�iv�n (Calendar -olio)
     **/
    public void setSyntymapaiva(Calendar cSyntymapaiva)
    {
    	if (cSyntymapaiva == null)
    	{
    		this.cSyntymapaiva = Calendar.getInstance();
    		this.cSyntymapaiva.clear();
    		this.cSyntymapaiva.set(1900, 0, 1);
    	}
    	else
    		this.cSyntymapaiva = cSyntymapaiva;
    }

    public void setOsasto(String sOsasto)
    {
    	if (sOsasto == null)
    		this.sOsasto = "Ei tiedossa";
    	else
    		this.sOsasto = sOsasto;
    }

	// viittaus listan seuraavaan alkioon
    public void setSeuraava(Laakari seuraava)
    {
    	this.seuraava = seuraava;
    }

    public int getLaakarinro()
    {
    	return iLaakarinro;
    }

    /**
     * Metodi palauttaa l��k�rin nimen
     * @return L��k�rin nimi (sNimi)
     **/
    public String getNimi()
    {
    	return sNimi;
    }

    public Calendar getSyntymapaiva()
    {
    	return cSyntymapaiva;
    }

    public String getOsasto()
    {
    	return sOsasto;
    }

	// palauttaa viittauksen listan seuraavaan alkioon
    public Laakari getSeuraava()
    {
    	return seuraava;
    }

    // toString()tulostaa yhden alkion tiedot
    public String toString()
    {
    	String sLaakarituloste = "L��k�ri:";
    	sLaakarituloste += " " + iLaakarinro;
    	sLaakarituloste += " " + sNimi;
    	SimpleDateFormat muunnos = new SimpleDateFormat("dd.MM.yyyy");
    	sLaakarituloste += " " + muunnos.format(cSyntymapaiva.getTime());
    	sLaakarituloste += " " + sOsasto;
    	return sLaakarituloste;
    }


}