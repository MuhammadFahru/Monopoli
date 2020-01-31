package Kelompok2_XIRPL2_MuhammadFahru_MuhammadHafidz_PujaRochmansyah;

import java.util.HashMap;
import java.util.Map;

public class Petak{
    private String nama_pemilik;
    boolean dimiliki;
    private String nama_petak;
    private int posisi;
    
    HashMap<Integer, String> kepemilikan = new HashMap<Integer, String>();
    
    public void setNamaPemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }
    
    public String getNamaPemilikk(){
        return nama_pemilik;
    }
            
    public void setNamaPetak(String nama_petak) {
        this.nama_petak = nama_petak;
    }
    
    public String getNamaPetak(){
        return nama_petak;
    }
    
    public void setPosisi(int posisi) {
        this.posisi = posisi;
    }
    
    public int getPosisi(){
        return posisi;
    }
}
