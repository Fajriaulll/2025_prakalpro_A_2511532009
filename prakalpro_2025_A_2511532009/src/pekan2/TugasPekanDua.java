package pekan2;

public class TugasPekanDua {

	public static void main(String[] args) {
		// inisiasi variabel
		String Merkhp = "Samsung Galaxy S25";
		char kelas = 'A'; // A = Flagship , B = Midrange , C = Entry level 
		int ram = 16;
		float ukuran = 6.2f;
		boolean kesediaanbarang = true;
		int Harga1 = 14000000;
		String Merktws = " Samsung Galaxy Buds 3 Pro ";
		int harga2 = 2300000;
		
		
		
		System.out.println("==============================================");
		System.out.println("====                 	                  ====");
		System.out.println("====  	 Toko Smartphone Pak Kabuik   	  ====");
		System.out.println("====       List Belanjaan & Spek          ====");
		System.out.println("====                                	  ====");
		System.out.println("==============================================");
		System.out.println("      Merek Hp : " + Merkhp);
		System.out.println("      Spesifikasi : ");
		System.out.println("      Kelas Hp : " + kelas);
		System.out.println("      Ram : " + ram);
		System.out.println("      Ukuran Resolusi : " + ukuran);
		System.out.println("      Tersedia : " + kesediaanbarang);
		System.out.println("      Harga : Rp" + String.format("%,d", Harga1));
		System.out.println("      \n");
		System.out.println("      Merk Tws : " + Merktws);
		System.out.println("      Harga : Rp " + String.format("%,d", harga2));
		System.out.println("      Tersedia : " + kesediaanbarang);
		
		System.out.println("\n");
		int total = Harga1 + harga2 ;
		System.out.println("      Harga Total : Rp " + String.format("%,d", total ));
	}

}
