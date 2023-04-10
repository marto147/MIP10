package Použivatel;

public class Zakaznik {
    private String meno;
    private String adresa;
    private String email;
    private String telefon;

    public Zakaznik(String meno, String adresa, String email, String telefon) {
        this.meno = meno;
        this.adresa = adresa;
        this.email = email;
        this.telefon = telefon;
    }

    public Zakaznik(int vek) {
    }

    public String getMeno() {
        return meno;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }
}
