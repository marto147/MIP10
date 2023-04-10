package Dovolenka;

public abstract class HorskaDovolenka extends Dovolenka {
    private int nadmorskaVyska;

    public HorskaDovolenka(String destinacia, int pocetDni, double cena, int nadmorskaVyska) {
        super(destinacia, pocetDni, cena);
        this.nadmorskaVyska = nadmorskaVyska;
    }

    public int getNadmorskaVyska() {
        return nadmorskaVyska;
    }

    public String getTypDovolenky() {
        return "Horská dovolenka";
    }


}
