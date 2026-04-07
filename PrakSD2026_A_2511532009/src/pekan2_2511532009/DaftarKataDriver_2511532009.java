package pekan2_2511532009;

public class DaftarKataDriver_2511532009 {
	public static void main (String[] args) {
		DaftarKata_2511532009 a1 = new DaftarKata_2511532009();
		
		// menambah elemen (akhir)
		a1.tambah_2511532009("Kami");
		a1.tambah_2511532009("Informatika");
		
		// menyisipkan elemen pada indeks 1
		a1.tambahPada(1, "Mahasiswa");
		
		// Cetak isi awal
		System.out.println("Awal       : " + a1);
		
		// Mengubah elemen (index 1) 
		a1.ubahElemen_2511532009(1, "Departemen");
		System.out.println("Setelah Ubah: " + a1);
		
		// Menghapus elemen (hapus index 0)
		String terhapus = a1.hapusElemen(0);
		System.out.println("Terhapus  : " + terhapus);
		System.out.println("Setelah Hapus : " + a1);
		
		// Iterasi pada ArrayList (cetak setiap elemen)
		System.out.print("Iterasi : ");
		a1.iterasiCetak();
		System.out.println();
	}

}
