package Typubyt;

public class Apartman {
    private String nazov;
    private String adresa;
    private String telefon;
    private int pocetIzieb;
    private String typIzby;
    private String vybavenie;

    public Apartman(String nazov, String adresa, String telefon, int pocetIzieb, String typIzby, String vybavenie) {
        this.nazov = nazov;
        this.adresa = adresa;
        this.telefon = telefon;
        this.pocetIzieb = pocetIzieb;
        this.typIzby = typIzby;
        this.vybavenie = vybavenie;
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

    public String getVybavenie() {
        return vybavenie;
    }
}
