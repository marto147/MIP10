package Použivatel;

public class Administrator {
    private String meno;
    private String prihlasovacieMeno;
    private String heslo;


    public Administrator(String meno, String prihlasovacieMeno, String heslo) {
        this.meno = meno;
        this.prihlasovacieMeno = prihlasovacieMeno;
        this.heslo = heslo;

    }

    public String getMeno() {
        return meno;
    }

    public String getPrihlasovacieMeno() {
        return prihlasovacieMeno;
    }

    public String getHeslo() {
        return heslo;
    }


}
