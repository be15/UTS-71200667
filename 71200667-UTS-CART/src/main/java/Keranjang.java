import java.util.ArrayList;
import java.util.List;

public class Keranjang {
    private List<Buah>keranjangItems = new ArrayList<Buah>();

    public void tambahProduk(Buah){
        keranjangItems.add(Buah);
    }

    public void hapusProduk(Buah){
        keranjangItems.remove(Buah);
    }

    public void getKeranjang(){
        for (Buah : keranjangItems){
            System.out.println(Buah.getNama());
        }
    }
}
