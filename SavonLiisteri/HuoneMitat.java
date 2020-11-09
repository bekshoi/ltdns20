/** Tapetointiyhtiö Savon Liisteri tarvitsee ohjelman, 
 * jolla se voi laskea tapetointitarjoustensa kustannuksia. 
 * Aluksi riittää, että ohjelma on yksinkertainen ja laskee vain suorakulmion muotoisia tapetointialueita. 
 * Tapetin hinta saadaan kertomalla pinta-ala neliömetreinä tapetin neliöhinnalla. 
 * Tee ensin luokka HuoneMitat, jossa on kaksi kenttää: huoneen leveys ja korkeus. 
 * Kertomalla nämä keskenään saadaan huoneen pinta-ala, jota tässä käytetään tapetoinnin pinta-alana. 
 * 
 * Tee luokka HuoneTapetti, jonka kenttänä on HuoneMitat olio ja toisena kenttänä tapetin neliöhinta. 
 * Luokassa on metodi, joka palauttaa tapetin hinnan olion ilmentymän tietoihin perustuen 
 * (pinta-ala ja neliöhinta). Tee pääohjelma, joka kysyy huoneen mitat ja tapetin neliöhinnan, 
 * ja sitten kertoo HuoneTapetti olion avulla tapetoinnin hinnan. (YDINASIAA)
 * 
 * Компании по покраске обоев Savon Liisteri нужна программа, с помощью которой она может рассчитать стоимость
 *  своих предложений по поклейке обоев. На первых порах достаточно того, что программа проста и рассчитывает
 *  только прямоугольные области оклейки обоев. Цена обоев получается умножением площади в квадратных метрах 
 * на цену квадратного метра обоев. Сначала создайте категорию «Размеры комнаты» 
 * с двумя полями: «Ширина комнаты» и «Высота». умножение дает площадь комнаты, 
 * которая используется здесь как площадь обоев. 
 * 
 * Сделайте категорию RoomWallpaper 
 * с полем RoomDimensions object и вторым полем, указав цену за квадратный метр обоев. 
 * В классе есть метод, который возвращает цену обоев на основе данных экземпляра объекта 
 * (площадь и цена за квадратный метр). 
 * 
 * Сделайте основную программу, которая спрашивает 
 * о размерах комнаты и цене квадратного метра обоев, а затем сообщает объекту Price of the Wallpaper 
 * стоимость обоев. (CORE)
 * 
 */

public class HuoneMitat {
    private double m_leveys;
    private double m_korkeus;
    
    public HuoneMitat (double leveys, double korkeus){
        m_leveys = leveys;
        m_korkeus = korkeus;
    }

    /** Lasketaan ja palautetaan huone ala */
    public double getAla() {
        return m_leveys * m_korkeus;
    }
}