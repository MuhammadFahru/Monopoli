package Kelompok2_XIRPL2_MuhammadFahru_MuhammadHafidz_PujaRochmansyah;
import java.util.Scanner;
public class monopoli_main {
    public static void main (String[] args){        
		
		Scanner input = new Scanner(System.in);
		
		Pemain player1 = new Pemain();
		Pemain player2 = new Pemain();
                Pemain player3 = new Pemain();
		
		System.out.print((char)27+"[01;31mMasukan Nama Player 1 : "+(char)27+"[00;00m");
		String nama1 = input.nextLine();
		player1.setNamaPlayer((char)27+"[01;31m"+nama1+(char)27+"[00;00m");                

		System.out.print((char)27+"[01;33mMasukan Nama Player 2 : "+(char)27+"[00;00m");
		String nama2 = input.nextLine();
		player2.setNamaPlayer((char)27+"[01;33m"+nama2+(char)27+"[00;00m");		               		              
                
                System.out.print((char)27+"[01;34mMasukan Nama Player 3 : "+(char)27+"[00;00m");
		String nama3 = input.nextLine();
		player3.setNamaPlayer((char)27+"[01;34m"+nama3+(char)27+"[00;00m");
                
                
                
		Start mulai = new Start();
                mulai.setNamaPetak("Start");
                mulai.setPosisi(1);
        
                Negara id = new Negara();
		id.setNamaPetak("Indonesia");
		id.komplek.setNama_Komplek("A");
		id.tanah.setHarga_Tanah(6000);
		id.tanah.setHarga_Sewa(200);
		id.rumah.setHarga_Beli(5000);
		id.rumah.setHargaSewa1(1000);
		id.rumah.setHargaSewa2(3000);
		id.rumah.setHargaSewa3(9000);
		id.rumah.setHargaSewa4(16000);
		id.hotel.setHarga_Beli(25000);
		id.hotel.setHarga_Sewa(25000);
		id.setPosisi(2);
                
                Kartu_DanaUmum du = new Kartu_DanaUmum();
                du.setNamaPetak("Dana Umum");
                du.setPosisi(3);

                Negara malay = new Negara();
		malay.setNamaPetak("Malaysia");
		malay.komplek.setNama_Komplek("A");
		malay.tanah.setHarga_Tanah(6000);
		malay.tanah.setHarga_Sewa(400);
		malay.rumah.setHarga_Beli(5000);
		malay.rumah.setHargaSewa1(2000);
		malay.rumah.setHargaSewa2(6000);
		malay.rumah.setHargaSewa3(18000);
		malay.rumah.setHargaSewa4(32000);
		malay.hotel.setHarga_Beli(25000);
		malay.hotel.setHarga_Sewa(45000);
		malay.setPosisi(4);
        
                Pajak_Jalan pjk_jalan = new Pajak_Jalan();
		pjk_jalan.setNamaPetak("Pajak Jalan");
		pjk_jalan.setPosisi(5);
		
		Transportasi changi_airport = new Transportasi();
		changi_airport.setNamaPetak("Changi Airport");
		changi_airport.setHarga_Tanah(20000);
		changi_airport.setPosisi(6);
		
		Negara sg = new Negara();
		sg.setNamaPetak("Singapura");
                sg.komplek.setNama_Komplek("B");
		sg.tanah.setHarga_Tanah(10000);
		sg.tanah.setHarga_Sewa(600);
		sg.rumah.setHarga_Beli(5000);
		sg.rumah.setHargaSewa1(3000);
		sg.rumah.setHargaSewa2(9000);
		sg.rumah.setHargaSewa3(27000);
		sg.rumah.setHargaSewa4(40000);
		sg.hotel.setHarga_Beli(25000);
		sg.hotel.setHarga_Sewa(55000);
		sg.setPosisi(7);

		Kartu_Kesempatan ksmptn = new Kartu_Kesempatan();
		ksmptn.setNamaPetak("Kesempatan 1");
		ksmptn.setPosisi(8);
		
		Negara hk = new Negara();
		hk.setNamaPetak("HongKong");
                hk.komplek.setNama_Komplek("B");
		hk.tanah.setHarga_Tanah(12000);
		hk.tanah.setHarga_Sewa(600);
		hk.rumah.setHarga_Beli(5000);
		hk.rumah.setHargaSewa1(3000);
		hk.rumah.setHargaSewa2(9000);
		hk.rumah.setHargaSewa3(27000);
		hk.rumah.setHargaSewa4(40000);
		hk.hotel.setHarga_Beli(25000);
		hk.hotel.setHarga_Sewa(55000);
		hk.setPosisi(9);
		
		Negara tw = new Negara();
		tw.setNamaPetak("Taiwan");
                tw.komplek.setNama_Komplek("B");
		tw.tanah.setHarga_Tanah(12000);
		tw.tanah.setHarga_Sewa(800);
		tw.rumah.setHarga_Beli(5000);
		tw.rumah.setHargaSewa1(4000);
		tw.rumah.setHargaSewa2(10000);
		tw.rumah.setHargaSewa3(30000);
		tw.rumah.setHargaSewa4(45000);
		tw.hotel.setHarga_Beli(25000);
		tw.hotel.setHarga_Sewa(60000);
		tw.setPosisi(10);
		
		Penjara penjara = new Penjara();
		penjara.setNamaPetak("Penjara");
		penjara.setPosisi(11);
		
		Negara ph = new Negara();
		ph.setNamaPetak("Philipina");
                ph.komplek.setNama_Komplek("C");
		ph.tanah.setHarga_Tanah(14000);
		ph.tanah.setHarga_Sewa(1000);
		ph.rumah.setHarga_Beli(10000);
		ph.rumah.setHargaSewa1(5000);
		ph.rumah.setHargaSewa2(15000);
		ph.rumah.setHargaSewa3(45000);
		ph.rumah.setHargaSewa4(62500);
		ph.hotel.setHarga_Beli(50000);
		ph.hotel.setHarga_Sewa(75000);
		ph.setPosisi(12);
		
		Perusahaan listrik = new Perusahaan();
		listrik.setNamaPetak("Perusahaan Listrik");
		listrik.setHarga_Tanah(15000);
		listrik.setPosisi(13);
		
		Negara th = new Negara();
		th.setNamaPetak("Thailand");
                th.komplek.setNama_Komplek("C");
		th.tanah.setHarga_Tanah(14000);
		th.tanah.setHarga_Sewa(1200);
		th.rumah.setHarga_Beli(10000);
		th.rumah.setHargaSewa1(6000);
		th.rumah.setHargaSewa2(8000);
		th.rumah.setHargaSewa3(50000);
		th.rumah.setHargaSewa4(70000);
		th.hotel.setHarga_Beli(50000);
		th.hotel.setHarga_Sewa(90000);
		th.setPosisi(14);
		
		Negara vt = new Negara();
		vt.setNamaPetak("Vietnam");
                vt.komplek.setNama_Komplek("C");
		vt.tanah.setHarga_Tanah(16000);
		vt.tanah.setHarga_Sewa(1000);
		vt.rumah.setHarga_Beli(10000);
		vt.rumah.setHargaSewa1(5000);
		vt.rumah.setHargaSewa2(15000);
		vt.rumah.setHargaSewa3(45000);
		vt.rumah.setHargaSewa4(62500);
		vt.hotel.setHarga_Beli(50000);
		vt.hotel.setHarga_Sewa(75000);
		vt.setPosisi(15);
		
		Transportasi bus_tokyo = new Transportasi();
		bus_tokyo.setNamaPetak("Terminal Bus Tokyo");
		bus_tokyo.setHarga_Tanah(20000);
		bus_tokyo.setPosisi(16);
		
		Negara jp = new Negara();
		jp.setNamaPetak("Jepang");
                jp.komplek.setNama_Komplek("D");
		jp.tanah.setHarga_Tanah(18000);
		jp.tanah.setHarga_Sewa(1400);
		jp.rumah.setHarga_Beli(10000);
		jp.rumah.setHargaSewa1(7000);
		jp.rumah.setHargaSewa2(20000);
		jp.rumah.setHargaSewa3(55000);
		jp.rumah.setHargaSewa4(75000);
		jp.hotel.setHarga_Beli(50000);
		jp.hotel.setHarga_Sewa(95000);
		jp.setPosisi(17);
		
		Kartu_DanaUmum du2 = new Kartu_DanaUmum();
		du2.setNamaPetak("Dana Umum 2");
		du2.setPosisi(18);
		
		Negara korea = new Negara();
		korea.setNamaPetak("Korea");
                korea.komplek.setNama_Komplek("D");
		korea.tanah.setHarga_Tanah(18000);
		korea.tanah.setHarga_Sewa(1600);
		korea.rumah.setHarga_Beli(10000);
		korea.rumah.setHargaSewa1(8000);
		korea.rumah.setHargaSewa2(22000);
		korea.rumah.setHargaSewa3(60000);
		korea.rumah.setHargaSewa4(80000);
		korea.hotel.setHarga_Beli(50000);
		korea.hotel.setHarga_Sewa(100000);
		korea.setPosisi(19);
		
		Negara china = new Negara();
		china.setNamaPetak("China");
                china.komplek.setNama_Komplek("D");
		china.tanah.setHarga_Tanah(20000);
		china.tanah.setHarga_Sewa(1400);
		china.rumah.setHarga_Beli(10000);
		china.rumah.setHargaSewa1(7000);
		china.rumah.setHargaSewa2(20000);
		china.rumah.setHargaSewa3(55000);
		china.rumah.setHargaSewa4(75000);
		china.hotel.setHarga_Beli(50000);
		china.hotel.setHarga_Sewa(95000);
		china.setPosisi(20);
		
		Bebas_Parkir parkir = new Bebas_Parkir();
		parkir.setNamaPetak("Parkir Bebas");
		parkir.setPosisi(21);
		
		Negara swed = new Negara();
		swed.setNamaPetak("Swedia");
                swed.komplek.setNama_Komplek("E");
		swed.tanah.setHarga_Tanah(22000);
		swed.tanah.setHarga_Sewa(1800);
		swed.rumah.setHarga_Beli(15000);
		swed.rumah.setHargaSewa1(9000);
		swed.rumah.setHargaSewa2(25000);
		swed.rumah.setHargaSewa3(70000);
		swed.rumah.setHargaSewa4(87500);
		swed.hotel.setHarga_Beli(75000);
		swed.hotel.setHarga_Sewa(105000);
		swed.setPosisi(22);
		
		Kartu_Kesempatan ksmptn2 = new Kartu_Kesempatan();
		ksmptn2.setNamaPetak("Kesempatan 2");
		ksmptn2.setPosisi(23);
		
		Negara itali = new Negara();
		itali.setNamaPetak("Italia");
                itali.komplek.setNama_Komplek("E");
		itali.tanah.setHarga_Tanah(22000);
		itali.tanah.setHarga_Sewa(1800);
		itali.rumah.setHarga_Beli(15000);
		itali.rumah.setHargaSewa1(9000);
		itali.rumah.setHargaSewa2(25000);
		itali.rumah.setHargaSewa3(70000);
		itali.rumah.setHargaSewa4(87500);
		itali.hotel.setHarga_Beli(75000);
		itali.hotel.setHarga_Sewa(105000);
		itali.setPosisi(24);
		
		Negara jerman = new Negara();
		jerman.setNamaPetak("Jerman");
                jerman.komplek.setNama_Komplek("E");
		jerman.tanah.setHarga_Tanah(24000);
		jerman.tanah.setHarga_Sewa(2000);
		jerman.rumah.setHarga_Beli(15000);
		jerman.rumah.setHargaSewa1(10000);
		jerman.rumah.setHargaSewa2(30000);
		jerman.rumah.setHargaSewa3(75000);
		jerman.rumah.setHargaSewa4(92500);
		jerman.hotel.setHarga_Beli(75000);
		jerman.hotel.setHarga_Sewa(110000);
		jerman.setPosisi(25);
		
		Transportasi s_london = new Transportasi();
		s_london.setNamaPetak("Stasiun London");
		s_london.setHarga_Tanah(20000);
		s_london.setPosisi(26);

		Negara belanda = new Negara();
		belanda.setNamaPetak("Belanda");
                belanda.komplek.setNama_Komplek("F");
		belanda.tanah.setHarga_Tanah(26000);
		belanda.tanah.setHarga_Sewa(2200);
		belanda.rumah.setHarga_Beli(15000);
		belanda.rumah.setHargaSewa1(11000);
		belanda.rumah.setHargaSewa2(33000);
		belanda.rumah.setHargaSewa3(80000);
		belanda.rumah.setHargaSewa4(97500);
		belanda.hotel.setHarga_Beli(75000);
		belanda.hotel.setHarga_Sewa(115000);
		belanda.setPosisi(27);
		
		Negara inggris = new Negara();
		inggris.setNamaPetak("Inggris");
                inggris.komplek.setNama_Komplek("F");
		inggris.tanah.setHarga_Tanah(26000);
		inggris.tanah.setHarga_Sewa(2200);
		inggris.rumah.setHarga_Beli(15000);
		inggris.rumah.setHargaSewa1(11000);
		inggris.rumah.setHargaSewa2(33000);
		inggris.rumah.setHargaSewa3(80000);
		inggris.rumah.setHargaSewa4(97500);
		inggris.hotel.setHarga_Beli(75000);
		inggris.hotel.setHarga_Sewa(115000);
		inggris.setPosisi(28);
		
		Perusahaan air = new Perusahaan();
		air.setNamaPetak("Perusahaan Air");
		air.setHarga_Tanah(15000);
		air.setPosisi(29);
		
		Negara perancis = new Negara();
		perancis.setNamaPetak("Perancis");
                perancis.komplek.setNama_Komplek("F");
		perancis.tanah.setHarga_Tanah(28000);
		perancis.tanah.setHarga_Sewa(2400);
		perancis.rumah.setHarga_Beli(15000);
		perancis.rumah.setHargaSewa1(14000);
		perancis.rumah.setHargaSewa2(36000);
		perancis.rumah.setHargaSewa3(85000);
		perancis.rumah.setHargaSewa4(102500);
		perancis.hotel.setHarga_Beli(75000);
		perancis.hotel.setHarga_Sewa(120000);
		perancis.setPosisi(30);
		
		Penjara masuk_penjara = new Penjara();
		masuk_penjara.setNamaPetak("Penjara");
		masuk_penjara.setPosisi(31);
		
		Negara kanada = new Negara();
		kanada.setNamaPetak("Canada");
                kanada.komplek.setNama_Komplek("G");
		kanada.tanah.setHarga_Tanah(30000);
		kanada.tanah.setHarga_Sewa(2600);
		kanada.rumah.setHarga_Beli(20000);
		kanada.rumah.setHargaSewa1(13000);
		kanada.rumah.setHargaSewa2(39000);
		kanada.rumah.setHargaSewa3(90000);
		kanada.rumah.setHargaSewa4(110000);
		kanada.hotel.setHarga_Beli(100000);
		kanada.hotel.setHarga_Sewa(127500);
		kanada.setPosisi(32);
		
		Negara amerika = new Negara();
		amerika.setNamaPetak("Amerika Serikat");
                amerika.komplek.setNama_Komplek("G");
		amerika.tanah.setHarga_Tanah(30000);
		amerika.tanah.setHarga_Sewa(2800);
		amerika.rumah.setHarga_Beli(20000);
		amerika.rumah.setHargaSewa1(15000);
		amerika.rumah.setHargaSewa2(45000);
		amerika.rumah.setHargaSewa3(100000);
		amerika.rumah.setHargaSewa4(120000);
		amerika.hotel.setHarga_Beli(100000);
		amerika.hotel.setHarga_Sewa(140000);
		amerika.setPosisi(33);
		
		Kartu_DanaUmum du3 = new Kartu_DanaUmum();
		du3.setNamaPetak("Dana Umum 3");
		du3.setPosisi(34);
		
		Negara mexico = new Negara();
		mexico.setNamaPetak("Mexico");
                mexico.komplek.setNama_Komplek("G");
		mexico.tanah.setHarga_Tanah(32000);
		mexico.tanah.setHarga_Sewa(2600);
		mexico.rumah.setHarga_Beli(20000);
		mexico.rumah.setHargaSewa1(13000);
		mexico.rumah.setHargaSewa2(39000);
		mexico.rumah.setHargaSewa3(90000);
		mexico.rumah.setHargaSewa4(110000);
		mexico.hotel.setHarga_Beli(100000);
		mexico.hotel.setHarga_Sewa(127500);
		mexico.setPosisi(35);
		
		Transportasi p_sidney = new Transportasi();
		p_sidney.setNamaPetak("Pelabuhan Sydney");
		p_sidney.setHarga_Tanah(20000);
		p_sidney.setPosisi(36);
		
		Kartu_Kesempatan ksmptn3 = new Kartu_Kesempatan();
		ksmptn3.setNamaPetak("Kesempatan 3");
		ksmptn3.setPosisi(37);
		
		Negara australia = new Negara();
		australia.setNamaPetak("Australia");
                australia.komplek.setNama_Komplek("H");
		australia.tanah.setHarga_Tanah(35000);
		australia.tanah.setHarga_Sewa(3500);
		australia.rumah.setHarga_Beli(20000);
		australia.rumah.setHargaSewa1(17500);
		australia.rumah.setHargaSewa2(50000);
		australia.rumah.setHargaSewa3(110000);
		australia.rumah.setHargaSewa4(130000);
		australia.hotel.setHarga_Beli(100000);
		australia.hotel.setHarga_Sewa(150000);
		australia.setPosisi(38);
		
		Pajak_Istimewa p_istimewa = new Pajak_Istimewa();
		p_istimewa.setNamaPetak("Pajak Istimewa");
		p_istimewa.setPosisi(39);
		
		Negara afrika = new Negara();
		afrika.setNamaPetak("Afrika");
                afrika.komplek.setNama_Komplek("H");
		afrika.tanah.setHarga_Tanah(40000);
		afrika.tanah.setHarga_Sewa(5000);
		afrika.rumah.setHarga_Beli(20000);
		afrika.rumah.setHargaSewa1(20000);
		afrika.rumah.setHargaSewa2(60000);
		afrika.rumah.setHargaSewa3(140000);
		afrika.rumah.setHargaSewa4(170000);
		afrika.hotel.setHarga_Beli(100000);
		afrika.hotel.setHarga_Sewa(200000);
		afrika.setPosisi(40);
		
		Papan papan = new Papan();
                
		papan.tambah_petak(mulai);
		papan.tambah_petak(id);
		papan.tambah_petak(du);
		papan.tambah_petak(malay);
		papan.tambah_petak(pjk_jalan);
		papan.tambah_petak(changi_airport);
		papan.tambah_petak(sg);
		papan.tambah_petak(ksmptn);
		papan.tambah_petak(hk);
		papan.tambah_petak(tw);
		papan.tambah_petak(penjara);
		papan.tambah_petak(ph);
		papan.tambah_petak(listrik);
		papan.tambah_petak(th);
		papan.tambah_petak(vt);
		papan.tambah_petak(bus_tokyo);
		papan.tambah_petak(jp);
		papan.tambah_petak(du2);
		papan.tambah_petak(korea);
		papan.tambah_petak(china);
		papan.tambah_petak(parkir);
		papan.tambah_petak(swed);
		papan.tambah_petak(ksmptn2);
		papan.tambah_petak(itali);
		papan.tambah_petak(jerman);
		papan.tambah_petak(s_london);
		papan.tambah_petak(belanda);
		papan.tambah_petak(inggris);
		papan.tambah_petak(air);
		papan.tambah_petak(perancis);
		papan.tambah_petak(masuk_penjara);
		papan.tambah_petak(kanada);
		papan.tambah_petak(amerika);
		papan.tambah_petak(du3);
		papan.tambah_petak(mexico);
		papan.tambah_petak(p_sidney);
		papan.tambah_petak(ksmptn3);
		papan.tambah_petak(australia);
		papan.tambah_petak(p_istimewa);
		papan.tambah_petak(afrika);
                                

                String tanya = "y";
                do {
                    player1.lempar_dadu();
                    System.out.println((char)27+"[01;36mBerada di              : " +(char)27+"[00;00m" + papan.daftar_petak.get(player1.getPosisi_player()-1).getNamaPetak());
//                    player1.pilihan();
                    System.out.println((char)27+"[01;32m==============================================="+(char)27+"[00;00m");
                    System.out.println((char)27+"[01;32m----------------- Lanjut ? y/n ----------------"+(char)27+"[00;00m");
                    tanya = input.nextLine();                    
                    
                    
                    player2.lempar_dadu();
                    System.out.println((char)27+"[01;36mBerada di              : " +(char)27+"[00;00m" + papan.daftar_petak.get(player2.getPosisi_player()-1).getNamaPetak());
//                    player2.pilihan();
                    System.out.println((char)27+"[01;32m==============================================="+(char)27+"[00;00m");
                    System.out.println((char)27+"[01;32m----------------- Lanjut ? y/n ----------------"+(char)27+"[00;00m");
                    tanya = input.nextLine();
                    
                    player3.lempar_dadu();
                    System.out.println((char)27+"[01;36mBerada di              : " +(char)27+"[00;00m" + papan.daftar_petak.get(player3.getPosisi_player()-1).getNamaPetak());
//                    player3.pilihan();
                    System.out.println((char)27+"[01;32m==============================================="+(char)27+"[00;00m");
                    System.out.println((char)27+"[01;32m----------------- Lanjut ? y/n ----------------"+(char)27+"[00;00m");
                    tanya = input.nextLine();
                }
                while(tanya.equals("y"));		
    }
}
