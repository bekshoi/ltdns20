public class HuoneTapeti {
    private double t_hinta;
    HuoneMitat HuoneMitat;

    public HuoneTapeti (double hinta, double m_leveys, double m_korkeus){
        t_hinta = hinta;
        HuoneMitat = new HuoneMitat(m_leveys, m_korkeus);
    }
    /** Lasketaan ja palautetaan hinta */
    public double getHinta() {
        return t_hinta * HuoneMitat.getAla();
    }
}