package Kelompok2_XIRPL2_MuhammadFahru_MuhammadHafidz_PujaRochmansyah;
import java.util.Scanner;
/**
 *
 * @author Muhammad Fahru Rozi
 */
public class Pemain{
    private String nama_player;
    private int jumlah_pemain;
    private int posisi_player;
    private int posisi_awal;
    private int posisi_akhir;
    private int uang = 150000;
    Assets kepunyaan = new Assets();
    Dadu dadu = new Dadu();
    Scanner input = new Scanner (System.in);            

    public void setJumlahPemain(int jumlah_pemain){
        this.jumlah_pemain = jumlah_pemain;
    }

    public int getJumlahPemain(){
        return jumlah_pemain;
    }
    
    public void setNamaPlayer(String wp){
        nama_player = wp;
    }
    
    public String getNamaPlayer(){
        return nama_player;
    }
    
    public void setPosisi_player(int posisi_player){
        this.posisi_player = posisi_player;
    }
    
    public int getPosisi_player(){
        return posisi_player;
    }                

    public void lempar_dadu(){        
        dadu.kocok();
        posisi_awal = posisi_akhir;
        posisi_akhir = dadu.getDadu()+ posisi_awal;
        if (posisi_akhir > 40){
            posisi_akhir -= 40;
        }                                
        setPosisi_player(posisi_akhir);
        movement();
    }

    public void movement(){   
        Uang duit = new Uang();
        duit.setNilaiUang(uang);
        System.out.println((char)27+"[01;32m---------------- Game Monopoly ----------------"+(char)27+"[00;00m");
        System.out.println((char)27+"[01;32m==============================================="+(char)27+"[00;00m");
        System.out.println((char)27+"[01;36mGiliran                : " +(char)27+"[00;00m" + getNamaPlayer());
        System.out.println((char)27+"[01;36mDadu 1                 : " +(char)27+"[00;00m" + dadu.getDadu1());
        System.out.println((char)27+"[01;36mDadu 2                 : " +(char)27+"[00;00m" + dadu.getDadu2());
        System.out.println((char)27+"[01;36mHasil Dadu             : " +(char)27+"[00;00m" + dadu.getDadu());        
        System.out.println((char)27+"[01;36mMaju                   : " +(char)27+"[00;00m" + dadu.getDadu() + " Langkah");
        System.out.println((char)27+"[01;36mPosisi Awal            : " +(char)27+"[00;00m" + posisi_awal);
        System.out.println((char)27+"[01;36mPosisi Terakhir        : " +(char)27+"[00;00m" + posisi_akhir);
        posisi_akhir = dadu.getDadu() + posisi_awal;
        if(posisi_akhir > 40) {
           posisi_akhir -= 40;
           if (posisi_akhir != 1) {
               uang += 20000;
           }
        } 
        if (posisi_akhir == 5) {
            System.out.println("Anda Terkena Pajak Jalan Uang Anda dikurangi 20.000 ");
            uang -= 20000;            
        } 
        if (posisi_akhir == 39) {
            System.out.println("Selamat Anda mendapatkan Pajak Istimewa Uang Anda ditambah 10.000 ");
            uang += 10000;            
        } 
        if (posisi_akhir == 3 || posisi_akhir == 18 || posisi_akhir == 34) {            
            Kartu_DanaUmum kdu = new Kartu_DanaUmum();
            kdu.kocok_kartu();
            if (kdu.ngacak == 0) {
                uang -= 20000;
            }  
            if (kdu.ngacak == 1) {
                uang -= 1500;
            } 
            if (kdu.ngacak == 2) {
                uang -= 5000;
            } 
            if (kdu.ngacak == 3) {
                uang += 20000;
            } 
            if (kdu.ngacak == 4) {
                uang += 5000;
            } 
            if (kdu.ngacak == 5) {
                uang -= 10000;
            }
            if (kdu.ngacak == 6) {
                uang -= 8000;
            }
            if (kdu.ngacak == 7) {
                uang -= 10000;
            }
            if (kdu.ngacak == 8) {
                uang += 20000;
            }
            if (kdu.ngacak == 9) {
                uang += 15000;
            }
        } 
        if (posisi_akhir == 8 || posisi_akhir == 23 || posisi_akhir == 37) {
            Kartu_Kesempatan kp = new Kartu_Kesempatan();
            kp.kocok_kartu();
            if (kp.ngacak == 0) {
                uang -= 20000;
            } 
            if (kp.ngacak == 1) {
                uang -= 1500;
            }
            if (kp.ngacak == 2) {
                uang -= 5000;
            }
            if (kp.ngacak == 3) {
                uang += 10000;
            }
            if (kp.ngacak == 4) {
                uang -= 1000;
            }
            if (kp.ngacak == 5) {
                uang += 15000;
            }
            if (kp.ngacak == 6) {
                uang += 5000;
            }
            if (kp.ngacak == 7) {
                uang += 20000;
            }
            if (kp.ngacak == 8) {
                uang += 10000;
            }
            if (kp.ngacak == 9) {
                uang += 25000;
            }
        }    
        if (posisi_awal < 11 && posisi_akhir >= 11) {
            posisi_akhir += 1 ;
        }
        if(posisi_akhir == 31){
            Penjara penjara = new Penjara();
            posisi_akhir = 11;
            penjara.setDipenjara(true);
            if(penjara.getBayar() == true && penjara.getDipenjara()== false){
                uang -= 10000;
            } 
            if (penjara.getDipenjara()== true) {
                penjara.keluar_penjara();
            }
        }
        System.out.println((char)27+"[01;36mUang Anda Sekarang     : " +(char)27+"[00;00m" + uang);
    }
    
    
    // Masih Error Untuk Beli
//    public void beli() {
//        Pemain pemain = new Pemain();
//        Petak petak = new Petak();
//        posisi_akhir = dadu.getDadu() + posisi_awal;
//        if(petak.getNamaPemilikk(pemain.getPosisi_player() ==  null)) {
//            petak.setNamaPemilik(pemain.getPosisi_player(),pemain.getNamaPlayer());
//            uang -= (getHargaPetak());            
//        }
//    }

    public void pilihan(){
        System.out.println("1. Beli");
        System.out.println("2. Jual");
        System.out.println("3. Lihat Asset");
        int pilih = input.nextInt(); 
        if (pilih == 1) {
            
        }
    }


}
