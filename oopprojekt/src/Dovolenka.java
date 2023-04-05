public abstract class Dovolenka {
    private String destinacia;
    private int pocetDni;
    private double cena;

    public Dovolenka(String destinacia, int pocetDni, double cena) {
        this.destinacia = destinacia;
        this.pocetDni = pocetDni;
        this.cena = cena;
    }

    public String getDestinacia() {
        return destinacia;
    }

    public int getPocetDni() {
        return pocetDni;
    }

    public double getCena() {
        return cena;
    }

    public abstract String getTypDovolenky();
}

public class PlazovaDovolenka extends Dovolenka {


    public PlazovaDovolenka(String destinacia, int pocetDni, double cena, boolean allInclusive) {
        super(destinacia, pocetDni, cena);
        this.allInclusive = allInclusive;
    }

    public boolean isAllInclusive() {
        return allInclusive;
    }

    public String getTypDovolenky() {
        return "Plážová dovolenka";
    }
}

public class HorskaDovolenka extends Dovolenka {
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
}

