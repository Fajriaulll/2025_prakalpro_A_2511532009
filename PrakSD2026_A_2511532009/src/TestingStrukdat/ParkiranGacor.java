package TestingStrukdat;
import java.util.*;

public class ParkiranGacor {
	private String platNomor;
	private String jenisKendaraan;
	private String namaPemilik;
	
	//konstruktor
	public ParkiranGacor (String plat, String jenis, String nama) {
		this.platNomor = plat;
		this.jenisKendaraan = jenis;
		this.namaPemilik = nama;
	}
	//getter
	public String getplatNomor () {
		return platNomor;
	}
	public String getjenisKendaraan () {
		return jenisKendaraan;
	}
	public String getnamaPemilik () {
		return namaPemilik;
	}
	//setter
	public void setplatNomor (String plat) {
		this.platNomor = plat;
	}
	public void setjenisKendaraan (String jenis) {
		this.jenisKendaraan = jenis;
	}
	public void setnamaPemilik (String nama) {
		this.namaPemilik = nama;
	}
	
	@Override
	public String toString () {
		return "Parkiran [Plat " + platNomor + "Jenis " + jenisKendaraan + "Nama Pemilik " + namaPemilik ;
	}
	
	
	

}
