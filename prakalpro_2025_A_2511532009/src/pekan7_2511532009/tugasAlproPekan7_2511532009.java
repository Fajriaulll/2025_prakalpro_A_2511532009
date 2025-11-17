package pekan7_2511532009;

import java.util.Scanner;

public class tugasAlproPekan7_2511532009 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Akun a = new Akun();
		
		System.out.println("======== REGIST DULU IZIN ========");
		System.out.print("Masukkan Username : ");
		String username = scan.nextLine();
		System.out.print("Masukkan Password: ");
	    String pw = scan.nextLine();
	    System.out.print("Masukkan Email: ");
	    String email = scan.nextLine();
	    System.out.print("Masukkan PIN Angka ( 6 digit ) : ");
	    int pin = scan.nextInt();
	    
	    a.setNama(username);
	    a.setPw(pw);
	    a.setEmail(email);
	    a.setPin(pin);
	    
	    if (!a.ispwRil()) {
	    	System.out.println();
	    	System.out.println("----- Registrasi Gagal -----");
	        System.out.println("Password anda harus setidaknya 8 karakter");
	        System.out.println("Silahkan Coba Lagi");
	        return;
	    		}
	    
	    if (!a.isemailRil()) {
	    	System.out.println();
	    	System.out.println("----- Registrasi Gagal -----");
	        System.out.println("Email anda '" + a.getEmail() + "' tidak valid ( harus mengandung '@' dan '.' )");
	        System.out.println("Silahkan Coba Lagi");
	    	return;
	    }
	    
	    if (!a.ispinRil()) {
	    	System.out.println();
	    	System.out.println("----- Registrasi Gagal -----");
	        System.out.println("Pin tidak valid ( harus mengandung 6 digit )");
	        System.out.println("Silahkan Coba Lagi");
	    	return;
	    }
	    
	    
	    System.out.println();
	    System.out.println("--- Registrasi Berhasil ---");
	    System.out.println("Akun untuk " + "'" +  a.getNama() + "'" + "  berhasil dibuat.");
	    
	    System.out.println();
	    System.out.println("-------- Detail Account --------");
	    System.out.println("Username (Lowercase)    : " + a.getNama().toLowerCase());
	    System.out.println("Email (Uppercase)       : " + a.getEmail().toUpperCase());
	    System.out.println("ID Pengguna (Gabungan)  : " + a.getNama().concat(pw));
	    
	    System.out.println();
	    System.out.println("-------- Uji Tipe Data (Pin anda : " + a.getPin() + ") --------");
	    int jumlah = a.getPin() + 10;
	    System.out.println("PIN (int) + 10          : " + jumlah);
	    
	    String jmlah = a.getPin() + "10";
	    System.out.println("PIN (String) + '10'     : " + jmlah);
	    
	}

}
