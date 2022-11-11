package Kullanici;

import Urun.Urun;

public abstract class Kullanici {

    private String isim;
    private int yas=0;
    private String email;
   // private final int id;

    public abstract void uruneBak(Urun urun);
    /*public abstract void girisYap();
    public abstract void cikisYap();*/

    public String getIsim(){
        return isim;
    }
    public void setIsim(String isim){
        this.isim = isim;
    }

    public int getYas(){
        return yas;
    }
    public void setYas(int yas){
        this.yas=yas;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
