package Kelompok2_XIRPL2_MuhammadFahru_MuhammadHafidz_PujaRochmansyah;
import java.util.ArrayList;
/**@author Muhammad Fahru Rozi*/
public class Papan {
    ArrayList<Petak> daftar_petak;
    
    public Papan(){
        daftar_petak = new ArrayList<Petak>();
    }
    
    public void tambah_petak(Petak ptk){
        daftar_petak.add(ptk);
    }
}
