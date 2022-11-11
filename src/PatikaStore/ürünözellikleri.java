package PatikaStore;

public abstract class ürünözellikleri extends brand {

    int ürünid;

    String ürünadı;

    int ürünbirimfiyat;

    int ürünindirimoranı;

    int ürünstokmiktarı;


    public ürünözellikleri(String Markaİsmi, int Markaid, int ürünid, String ürünadı, int ürünbirimfiyat, int ürünindirimoranı, int ürünstokmiktarı){
        super(Markaİsmi,Markaid);
        this.ürünid=ürünid;
        this.ürünadı=ürünadı;
        this.ürünbirimfiyat=ürünbirimfiyat;
        this.ürünindirimoranı=ürünindirimoranı;
        this.ürünstokmiktarı=ürünstokmiktarı;
    }

    public ürünözellikleri(){

    }

    public abstract void menu();
    public abstract void addProduct();

    public abstract void delete();
    public abstract void search();
    public int getÜrünid() {
        return ürünid;
    }

    public void setÜrünid(int ürünid) {
        this.ürünid = ürünid;
    }

    public String getÜrünadı() {
        return ürünadı;
    }

    public void setÜrünadı(String ürünadı) {
        this.ürünadı = ürünadı;
    }

    public int getÜrünbirimfiyat() {
        return ürünbirimfiyat;
    }

    public void setÜrünbirimfiyat(int ürünbirimfiyat) {
        this.ürünbirimfiyat = ürünbirimfiyat;
    }

    public int getÜrünindirimoranı() {
        return ürünindirimoranı;
    }

    public void setÜrünindirimoranı(int ürünindirimoranı) {
        this.ürünindirimoranı = ürünindirimoranı;
    }

    public int getÜrünstokmiktarı() {
        return ürünstokmiktarı;
    }

    public void setÜrünstokmiktarı(int ürünstokmiktarı) {
        this.ürünstokmiktarı = ürünstokmiktarı;
    }
}

