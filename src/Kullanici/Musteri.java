package Kullanici;

import Urun.Urun;
import Sepet.Sepet;

public class Musteri extends Kullanici {
    public Musteri(String isim,int yas,String email){
        setIsim(isim);
        setEmail(email);
        setYas(yas);
    }
    Sepet sepetim = new Sepet();

    @Override
    public void uruneBak(Urun urun) {
        System.out.println("Müsteri " + getIsim() + ", " + urun.getName() + " urunune baktı.");
    }

  /*  @Override
    public void girisYap() {
        System.out.println("Musteri giriş yaptı.");
    }
    @Override
    public void cikisYap() {
        System.out.println("Musteri cikis yaptı.");
    }*/

    public void sepeteEkle(Urun urun){
        sepetim.sepeteUrunEkle(urun);
    }

    public Sepet getSepetim(){
        return sepetim;
    }

}
