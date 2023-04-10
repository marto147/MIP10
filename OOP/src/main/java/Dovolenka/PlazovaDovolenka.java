package Dovolenka;

public class PlazovaDovolenka extends Dovolenka {


    public PlazovaDovolenka(String destinacia, int pocetDni, double cena) {
        super(destinacia, pocetDni, cena);

    }

    @Override
    public void info() {

    }

    public String getTypDovolenky() {
        return "Plážová dovolenka";
    }
}
