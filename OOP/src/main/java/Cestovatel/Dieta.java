package Cestovatel;

public class Dieta extends Jednotlivec {

    private int vek;

    public Dieta(int vek) {
        super(vek);
        this.vek = vek;
    }

    @Override
    public double getCena() {
        return super.getCenaDovolenky() / 2.0;
    }

}
