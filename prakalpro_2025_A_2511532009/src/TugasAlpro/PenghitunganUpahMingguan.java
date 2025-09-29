package TugasAlpro;

import java.util.Scanner;

public class PenghitunganUpahMingguan {

	public static void main(String[] args) {
		
		String Nama;
		char gol;
		int jumlahjam;
		int upahJam = 0;
		int upahMinggu = 0;
		int upahLembur;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("----   Penghitungan Upah Pekerja  ----");
		System.out.println("----       Selama Seminggu        ----");
		System.out.println("--------------------------------------\n\n");
		System.out.println("Silahkan masukkan nama karyawan : ");
		Nama = keyboard.nextLine();
		System.out.println("Karyawan tersebut berada di golongan (A/B/C/D) : ");
		gol = keyboard.next().charAt(0);
		System.out.println("Total jam kerja selama seminggu : ");
		jumlahjam = keyboard.nextInt();
		keyboard.close();
		
		if (gol == 'A') {
			upahJam = 1000;
			System.out.println("\nUpah " + Nama + " perjam adalah          : " + upahJam );
		} else if (gol == 'B') {
			upahJam = 2000;
			System.out.println("\nUpah " + Nama + " perjam adalah          : " + upahJam );
		} else if (gol == 'C') {
			upahJam = 3000;
			System.out.println("\nUpah " + Nama + " perjam adalah          : " + upahJam );
		} else if (gol == 'D') {
			upahJam = 4000;
			System.out.println("\nUpah " + Nama + " perjam adalah          : " + upahJam );
		} else {
			System.out.println("\nGolongan tidak valid");
		}
		
		if (jumlahjam > 60 ) {
			upahLembur = (jumlahjam - 60)*5000;
		} else {
			upahLembur = 0;
		}
		
		upahMinggu = (60 * upahJam) + upahLembur;
		
		
		System.out.println("Upah Lembur " + Nama + " adalah : " + upahLembur);
		System.out.println("Upah " + Nama + " Selama seminggu adalah : " + upahMinggu + "\n");
		System.out.println("Makacih XD");
		System.out.println("--------------------------------------");
		
		
	}

}