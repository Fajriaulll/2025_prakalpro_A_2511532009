package pekan4;

import java.util.Scanner;



public class tugasAlproPekan4_2511532009 {

	public static void main(String[] args) {
		String nama, waktunya = "", tipes="";
		int jumlah, hari, studio, waktu;
		double hargaawal=0, bhari=0, bwaktu=0, diskon, tiket=0, total, subtotal;
		
		Scanner data = new Scanner (System.in);
		
		System.out.println("===============================");
		System.out.println("=== Pembelian Tiket Bioskop ===");
		System.out.println("===============================");
		System.out.println("Silahkan Masukan Nama Pembeli    : ");
		nama=data.nextLine();
		System.out.println("Berapa Jumlah Tiket Yang dibeli   : ");
		jumlah=data.nextInt();
		System.out.println("Hari Penayangan ( 1 = Senin-Kamis, 2 = Jumat,  3 = Sabtu-Minggu) : ");
		hari=data.nextInt();
		System.out.println("Waktu Penayangan (1=Pagi 10:00-12:00, 2=Siang 12:00-17:00, 3=Malam 17:00-22:00) : ");
		waktu=data.nextInt();
		System.out.println("Jenis Studio Yang Dipilih ( 1 = Regular, 2 = Deluxe, 3 = Premium ) : ");
		studio=data.nextInt();
		
		// pengatur harga awal per studio
		if (studio == 1) {
			hargaawal = 50000;
			tipes = "Regular";
		} else if (studio == 2) {
			hargaawal = 65000;
			tipes = "Deluxe";
		} else if (studio == 3) {
			hargaawal = 75000;
			tipes = "Premium";
		} else {
			System.out.println("Data Tidak Valid");
		}

		// pengatur harga per hari
		switch (hari) {
		case 1 :
			bhari = 0.15;
			waktunya = "Pagi";
			break;
		case 2 :
			bhari = 0.20;
			waktunya = "Siang";
			break;
		case 3 :
			bhari = 0.30;
			waktunya = "Malam";
			break;
		}
		
		// pengatur biaya waktu
		if (waktu == 1) {
			bwaktu = 0.05;
		} else if (waktu == 2) {
			bwaktu = 0.1;
		} else if (waktu == 3) {
			bwaktu = 0.15;
		} else {
			System.out.println("Data Tidak Valid");
		}
		
		// penentu harga harga
		tiket = hargaawal + (hargaawal*bhari) + (hargaawal*bwaktu);
		subtotal = tiket*jumlah;
		diskon = 0.2 * subtotal;
		total = subtotal - diskon;
		
		// Eksekusi :3
		
		System.out.println("\n===============================");
		System.out.println("=== Pembelian Tiket Bioskop ===");
		System.out.println("===============================");
		System.out.println("Nama Pembeli     = " + nama);
		System.out.println("Jumlah tiket     = " + jumlah);
		System.out.println("Hari             = " + hari);
		System.out.println("Waktu tayang     = " + waktunya);
		System.out.println("Jenis Studio     = " + tipes);
		System.out.println("------------------------------");
		System.out.println("Harga Dasar      = Rp. " + (int)hargaawal +"/tiket");
		System.out.println("Biaya Hari       = +" + (int)(bhari * 100) + "%" );
		System.out.println("Biaya Waktu      = +" + (int)(bwaktu * 100) + "%");
		System.out.println("Harga per tiket  = Rp. " + (int)tiket);
		System.out.println("Subtotal         = Rp. " + (int)subtotal);
		System.out.println("Diskon (20%)     = Rp. " + (int)diskon);
		System.out.println("------------------------------");
		System.out.println("Total Bayar      = Rp. " + (int)total);
	}

}
