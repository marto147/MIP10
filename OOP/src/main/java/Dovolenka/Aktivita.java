package Dovolenka;

public class Aktivita extends Dovolenka {
    private String typAktivity;

    public Aktivita(String destinacia, int pocetDni, String typAktivity, int cena) {
        super(destinacia, pocetDni, cena);
        this.typAktivity = typAktivity;
    }

    @Override
    public void info() {
        System.out.println("Aktivita v destinácii " + destinacia + " pre " + pocetDni + " dní - " + typAktivity);
    }
}
