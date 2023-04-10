package Doprava;

public class Let {
    private String nazovAerolinky;
    private String casOdletu;
    private String casPriletu;
    private int dlzkaLetu;
    private double cenaLetenky;

    public Let(String nazovAerolinky, String casOdletu, String casPriletu, int dlzkaLetu, double cenaLetenky) {
        this.nazovAerolinky = nazovAerolinky;
        this.casOdletu = casOdletu;
        this.casPriletu = casPriletu;
        this.dlzkaLetu = dlzkaLetu;
        this.cenaLetenky = cenaLetenky;
    }

    public String getNazovAerolinky() {
        return nazovAerolinky;
    }

    public String getCasOdletu() {
        return casOdletu;
    }

    public String getCasPriletu() {
        return casPriletu;
    }

    public int getDlzkaLetu() {
        return dlzkaLetu;
    }

    public double getCenaLetenky() {
        return cenaLetenky;
    }
}