/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok2_XIRPL2_MuhammadFahru_MuhammadHafidz_PujaRochmansyah;

/**
 *
 * @author Muhammad Fahru Rozi
 */
public class Uang {
    private int nilai;
    
    public void setNilaiUang(int nilai){
        this.nilai = nilai;
    }
    
    public int getNilaiUang(){
        return nilai;
    }
    
    public void kurangUang(int duit) {
        nilai -= duit;
    }
}
