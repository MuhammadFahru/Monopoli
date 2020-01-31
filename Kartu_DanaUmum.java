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
public class Kartu_DanaUmum extends Petak{
     private String[] danaumum = {
        "Bayar biaya Internet $20.000",
        "Mabuk di Muka Umum kena denda $1500",
        "Melanggar Lalu Lintas denda $5000",
        "Dapat Hadiah Pertama Teka Teki Silang $20000",
        "Bank Melakukan Kesalahan dapat Uang $5000",
        "Bayar Biaya Asuransi $10000",
        "Bayar Biaya Salon Sebesar $8000",
        "Bayar Tagihan Kartu Kredit sebesar $10000",
        "Terima Komisi $20000",
        "Dapat Sisa Uang Pajak Sebesar 15000"
    };
        Random rdm = new Random();
        int ngacak = rdm.nextInt(10);
    
    public void kocok_kartu(){
        String random_kartu = danaumum[ngacak];
        System.out.println((char)27+"[01;36mHasil Kartu Dana Umum  : " +(char)27+ "[00;00m" + random_kartu);        
    }
}

