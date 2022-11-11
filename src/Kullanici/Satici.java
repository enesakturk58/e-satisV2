package Kullanici;

import Urun.Urun;

import java.util.ArrayList;
import java.util.List;

public class Satici extends Kullanici {

    public Satici(String isim,int yas,String email){
        setIsim(isim);
        setEmail(email);
        setYas(yas);
    }

    List<Urun> urunler=new ArrayList<>();

    @Override
    public void uruneBak(Urun urun) {
        System.out.println("Satici " + getIsim() + ", " + urun.getName() + " urunune baktı.");
    }
    public void urunEkle(Urun urun){
        urunler.add(urun);
    }

   /* @Override
    public void girisYap() {
        System.out.println("Kullanici.Satici giriş yaptı.");
    }

    @Override
    public void cikisYap() {
        System.out.println("Kullanici.Musteri giriş yaptı.");
    }*/
}
