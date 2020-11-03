/**
 * 
 * @author
 * @version 1.00 2019/6/14
 * 
 */
class SuoraKulmio {
    double m_height;
    double m_weight;

    SuoraKulmio () {
m_height = 1.0;
m_weight = 1.0;
    }

    SuoraKulmio (double height, double weight) {
        this.m_height = height;
        this.m_weight = weight;
            }

            double getAla () {// getAla Palautetan ala
                return m_height * m_weight;
            }

            double getPiiri () {// getAla Palautetan piiri
                return 2 * (m_height + m_weight);
            }
}