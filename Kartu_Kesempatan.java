/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok2_XIRPL2_MuhammadFahru_MuhammadHafidz_PujaRochmansyah;

import java.util.Random;

/**
 *
 * @author Muhammad Fahru Rozi
 */
public class Kartu_Kesempatan extends Petak{
     private String[] kesempatan = {
        "Dikenakan Biaya Listrik Bayar $20.000",
        "Mabuk di Muka Umum kena denda $1500",
        "Melanggar Lalu Lintas denda $5000",
        "Dapat Hadiah Ulang Tahun sebesar $10000",
        "Isi Bensin Sebesar $10000",
        "Jual Saham Menerima $15000",
        "Menang Kontes Dangdut menerima $5000",
        "Mendapatkan $20000 Karena Menolong Teman",
        "Terima Cashback $10000",
        "Beramal $25000"
    };
        Random rdm = new Random();
        int ngacak = rdm.nextInt(10);
    
    public void kocok_kartu(){
        String random_kartu = kesempatan[ngacak];
        System.out.println((char)27+"[01;36mHasil Kartu Kesempatan : " +(char)27+"[00;00m" + random_kartu);        
    }
}

