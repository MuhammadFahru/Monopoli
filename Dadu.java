package Kelompok2_XIRPL2_MuhammadFahru_MuhammadHafidz_PujaRochmansyah;
import java.util.Random;
public class Dadu {
    private int dadu1;
    private int dadu2;
    private int hasil_dadu;
    public static Random random = new Random();

    public void kocok() {
        dadu1 = random.nextInt(6)+1;
        dadu2 = random.nextInt(6)+1;
        setDadu(dadu1, dadu2);
    }

    public void setDadu(int dadu1, int dadu2){
        this.dadu1 = dadu1;
        this.dadu2 = dadu2;
        hasil_dadu = dadu1 + dadu2;
    }

    public int getDadu(){
        return hasil_dadu;
    }

    public int getDadu1(){
        return dadu1;
    }

    public int getDadu2(){
        return dadu2;
    }
    
}
