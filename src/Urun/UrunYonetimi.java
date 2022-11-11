package Urun;

public class UrunYonetimi {

    public void urunEklendiBiligisi(Urun urun){
        System.out.println(urun.getAdet()+" adet "+urun.getName()+" eklendi."+" Adet fiyatı : "+urun.getFiyat());
    }

    public void urunStokGuncellendi(Urun urun){
        System.out.println(urun.getName() + " için güncel stok güncellendi :" + urun.getStok());
    }

    public void guncelStok(Urun urun){
        System.out.println(urun.getName() + " urunu güncel stok sayısı :" + urun.getStok());
    }
}
