package Urun;

public class Urun {
    private String name;
    private double fiyat;
    private int adet;
    private int stok;

    UrunYonetimi urunYonetimi;
   public Urun(String name, double fiyat, int adet) {
       this.name = name;
       this.fiyat = fiyat;
       this.adet = adet;
       stok = adet;
   }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getAdet() {
        return getStok();
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok=getStok()+stok;
    }
    public void stokYenile(int yeniStok){
       setStok(yeniStok);
    }
}
