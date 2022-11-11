package Sepet;

import Urun.Urun;
import Sepet.Sepet;

import java.util.ArrayList;
import java.util.List;

public class Sepet {

    List<Urun> urunler=new ArrayList<Urun>();
    public double sepetHesapla(){
        int toplamTutar=0;
        for (Urun urun : urunler){
            toplamTutar+=urun.getFiyat();
        }
        return toplamTutar;
    }
    public void sepeteUrunEkle(Urun urun){
        urunler.add(urun);
    }

}
