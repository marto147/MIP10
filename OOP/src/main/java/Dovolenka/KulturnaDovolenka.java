package Dovolenka;

public class KulturnaDovolenka extends Dovolenka {
    private boolean vstupenkyVKomplexe;

    public KulturnaDovolenka(String destinacia, int pocetDni, double cena, boolean vstupenkyVKomplexe) {
        super(destinacia, pocetDni, cena);
        this.vstupenkyVKomplexe = vstupenkyVKomplexe;
    }

    public boolean isVstupenkyVKomplexe() {
        return vstupenkyVKomplexe;
    }

    public String getTypDovolenky() {
        return "Kultúrna dovolenka";
    }

    @Override
    public void info() {

    }
}
