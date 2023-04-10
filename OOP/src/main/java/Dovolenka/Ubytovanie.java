package Dovolenka;

public class Ubytovanie extends Dovolenka {
    private String typUbytovania;

    public Ubytovanie(String destinacia, int pocetDni, String typUbytovania, int cena) {
        super(destinacia, pocetDni, cena);
        this.typUbytovania = typUbytovania;
    }

    @Override
    public void info() {
        System.out.println("Ubytovanie v destinácii " + destinacia + " pre " + pocetDni + " dní v " + typUbytovania);
    }
}
