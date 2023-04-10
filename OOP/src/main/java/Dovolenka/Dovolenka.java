package Dovolenka;

public abstract class Dovolenka {
    protected String destinacia;
    protected int pocetDni;
    protected int cena;

    protected int dlzkapobytu;

    public Dovolenka(String destinacia, int pocetDni, double cena) {
        this.destinacia = destinacia;
        this.pocetDni = pocetDni;
    }

    public abstract void info();

    public String getDestinacia() {
        return destinacia;
    }

    public int getPocetDni() {
        return pocetDni;
    }
}



