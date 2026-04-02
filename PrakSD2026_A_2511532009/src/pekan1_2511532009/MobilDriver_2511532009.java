package pekan1_2511532009;

public class MobilDriver_2511532009 {
	 public static void main(String[] args) {
	     Mobil_2511532009 daftar = new Mobil_2511532009();

	     Mobil_2511532009 m1 = new Mobil_2511532009("GTR", 2020, 1300, 150000000, "Supra");
	     Mobil_2511532009 m2 = new Mobil_2511532009("Evolution3", 2021, 1200, 180000000, "Mitsubishi");
	     Mobil_2511532009 m3 = new Mobil_2511532009("Karimun", 2022, 1500, 250000000, "Suzuki");

	     daftar.tambahMobil(m1);
	     daftar.tambahMobil(m2);
	     daftar.tambahMobil(m3);

	     daftar.tampilkanSemua();

	     System.out.println("\nNama mobil pertama: " + m1.getNama());
	     System.out.println("Harga: Rp" + (long) m1.getHarga());

	     m1.setHarga(155000000);
	     System.out.println("Harga setelah update: Rp" + (long) m1.getHarga());

	     daftar.hapusMobil("Brio");

	     daftar.tampilkanSemua();
	 }
	
}
