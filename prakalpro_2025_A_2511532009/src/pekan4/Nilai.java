package pekan4;

import java.util.Scanner;

public class Nilai {

	public static void main(String[] args) {
		int Nilai;
		Scanner input=new Scanner(System.in);
		System.out.println("Inputkan nilai angka = ");
		Nilai=input.nextInt();
		input.close();
		
		if(Nilai >= 81) {
			System.out.println("A");
		} else if (Nilai >= 70) {
			System.out.println("B");
		} else if (Nilai >= 60) {
			System.out.println("C");
		} else if (Nilai >= 50) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

	}

}
