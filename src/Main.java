import Kullanici.Musteri;
import Kullanici.Satici;
import Urun.Urun;
import Urun.UrunYonetimi;


public class Main {
    public static void main(String[] args) {

        UrunYonetimi urunYonetimi = new UrunYonetimi();
        Satici satici1 = new Satici("Sevgi",24,"sevgisancaktutan@gmail.com");
        Musteri musteri1 = new Musteri("Enes",25,"enesakturk97@gmail.com");

        Urun urun1 = new Urun("Macbook Pro M1",29000.00,10);
        Urun urun2 = new Urun("Macbook Air M1",24999.99,15);

        urunYonetimi.urunEklendiBiligisi(urun1);
        urunYonetimi.guncelStok(urun1);

        urunYonetimi.urunEklendiBiligisi(urun2);
        urunYonetimi.guncelStok(urun2);

        urun2.setStok(9);
        urunYonetimi.guncelStok(urun2);
        
        urun2.stokYenile(50);
        urunYonetimi.urunStokGuncellendi(urun2);

       // urunYonetimi.guncelStok(urun2);
        urun2.setStok(5);
        urunYonetimi.urunStokGuncellendi(urun2);

        musteri1.uruneBak(urun1);
        satici1.uruneBak(urun2);
      //  satici1.urunEkle(urun2); ??????

    }
}