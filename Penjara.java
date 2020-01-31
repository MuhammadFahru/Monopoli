/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok2_XIRPL2_MuhammadFahru_MuhammadHafidz_PujaRochmansyah;
import java.util.Scanner;

/**
 *
 * @author Muhammad Fahru Rozi
 */
public class Penjara extends Petak{
    Scanner in = new Scanner(System.in);
    private boolean dipenjara;
    private boolean bayar;
    private int pilihan;
    private Dadu dadu;
    private Pemain player;
    private int kesempatan = 0;
    public boolean tahan = dipenjara;
    
    public void penjara(boolean dipenjara){
        this.dipenjara = dipenjara;
        if(this.dipenjara == true && kesempatan <= 4){
            keluar_penjara();
        }
    }
    
    public void setDipenjara(boolean dipenjara){
        this.dipenjara = dipenjara;
    }
    
    public boolean getDipenjara(){
        return dipenjara;
    }
    public boolean getBayar(){
        return bayar;
    }
        
    
    public void keluar_penjara(){
        do{
            System.out.println("================================");
            System.out.println("Pilih cara buat keluar penjara!");
            System.out.println("1. Kocok Dadu");
            System.out.println("2. Bayar");
            System.out.println("================================");
            System.out.print("Masukan pilihan : ");
            pilihan = in.nextInt();
            
        }
        while(pilihan != 2 && pilihan != 1);
        
        if(pilihan == 1){
            while(kesempatan < 3 && dipenjara == true){
                dadu = new Dadu();
                dadu.kocok();
                System.out.println("===============================");
                System.out.println("Dadu 1 : " + dadu.getDadu1());
                System.out.println("Dadu 2 : " + dadu.getDadu2());
                if(dadu.getDadu1() == dadu.getDadu2()){
                    dipenjara = false;
                    System.out.println("Anda keluar penjara!!!");
                    System.out.println("===============================");
                }
                kesempatan++;
                if(kesempatan == 3 && dipenjara == true){
                    System.out.println("===============================");
                    System.out.println("Anda tidak berhasil keluar penjara!!");
                    System.out.println("===============================");
                }
            }
           
        }
        if(pilihan == 2){
            dipenjara = false;
            bayar = true;
            System.out.println("===============================");
            System.out.println("Anda berhasil keluar penjara!!");
            System.out.println("===============================");
        }
    }  
}
