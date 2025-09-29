package pekan3;

import java.util.Scanner;

public class hitungvolume {

	public static void main(String[] args) {
		int jari;
		int tinggi;
		double phi = 3.14;
		double hasil;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println("---Penghitung Volume Tabung---");
		System.out.println("------------------------------");
		
		System.out.println("Untuk menghitung volume sebuah tabung, silahkan inputkan beberapa data berikut !\n");
		System.out.println("Masukan Jari jari tabung : ");
		jari = keyboard.nextInt();
		System.out.println("Masukan Tinggi Tabung");
		tinggi = keyboard.nextInt();
		keyboard.close();
		
		hasil = (phi * jari * jari * tinggi);
		System.out.println("\nVolume Tabung berdasarkan data yang diinputkan adalah : " + hasil );
		System.out.println("Terimakasih sudah menggunakan program ini XD  ");
	}

}
