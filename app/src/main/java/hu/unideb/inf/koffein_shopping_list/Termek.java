package hu.unideb.inf.koffein_shopping_list;

public class Termek {
    private String termekNev;
    private String mennyiseg;
    private String mertekegyseg;

    public Termek(String termek){
        String[] darabok = termek.split(",");
        this.termekNev=darabok[0];
        this.mennyiseg=darabok[1];
        this.mertekegyseg=darabok[2];
    }

    public String getTermekNev() {
        return termekNev;
    }

    public String getMennyiseg() {
        return mennyiseg;
    }

    public String getMertekegyseg() {
        return mertekegyseg;
    }

    @Override
    public String toString(){
        return termekNev+","+mennyiseg+","+mertekegyseg;
    }
}
