package Typubyt;

public class Hotel {
    private String nazov;
    private String adresa;
    private String telefon;
    private int pocetIzieb;
    private String typIzby;

    public Hotel(String nazov, String adresa, String telefon, int pocetIzieb, String typIzby) {
        this.nazov = nazov;
        this.adresa = adresa;
        this.telefon = telefon;
        this.pocetIzieb = pocetIzieb;
        this.typIzby = typIzby;
    }

    public String getNazov() {
        return nazov;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public int getPocetIzieb() {
        return pocetIzieb;
    }

    public String getTypIzby() {
        return typIzby;
    }
}