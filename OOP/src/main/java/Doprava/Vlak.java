package Doprava;

public class Vlak {
    private String nazovSpolocnosti;
    private String casOdchodu;
    private String casPrichodu;
    private int dlzkaJazdy;
    private double cenaListka;

    public Vlak(String nazovSpolocnosti, String casOdchodu, String casPrichodu, int dlzkaJazdy, double cenaListka) {
        this.nazovSpolocnosti = nazovSpolocnosti;
        this.casOdchodu = casOdchodu;
        this.casPrichodu = casPrichodu;
        this.dlzkaJazdy = dlzkaJazdy;
        this.cenaListka = cenaListka;
    }

    public String getNazovSpolocnosti() {
        return nazovSpolocnosti;
    }

    public String getCasOdchodu() {
        return casOdchodu;
    }

    public String getCasPrichodu() {
        return casPrichodu;
    }

    public int getDlzkaJazdy() {
        return dlzkaJazdy;
    }

    public double getCenaListka() {
        return cenaListka;
    }
}