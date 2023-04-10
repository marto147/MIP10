package Cestovatel;

public abstract class Jednotlivec {
    private String meno;
    private int vek;
    private double cenaDovolenky;

    public Jednotlivec(int vek) {
        this.meno = meno;
        this.vek = vek;
        this.cenaDovolenky = cenaDovolenky;
    }

    public double getCenaDovolenky() {
        return cenaDovolenky;
    }

    public void setCenaDovolenky(double cenaDovolenky) {
        this.cenaDovolenky = cenaDovolenky;
    }

    public abstract double getCena();


}