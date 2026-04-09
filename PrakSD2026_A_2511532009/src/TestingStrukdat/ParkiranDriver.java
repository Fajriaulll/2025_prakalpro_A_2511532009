package TestingStrukdat;
import java.util.*;


public class ParkiranDriver {
	private LinkedList<ParkiranGacor> riwayatParkir = new LinkedList<>();
	private Queue<ParkiranGacor> Antreangerbang = new LinkedList<>();
	private Stack<ParkiranGacor> jalurSempit = new Stack<>();
	
	public void catatKendaraan(ParkiranGacor p) {
		riwayatParkir.add(p);
		System.out.println("pernah parkir" + p.getnamaPemilik());
	}
	public void masukAntrean (ParkiranGacor p) {
		Antreangerbang.add(p);
		System.out.println("antrian" + p.getnamaPemilik());
	}
	public void parkirMundur (ParkiranGacor p) {
		jalurSempit.push(p);
		System.out.println("Jenis kendaraan " + p.getjenisKendaraan());
	}
	
	public void tampilkanhasil () {
		System.out.println(Antreangerbang);
		System.out.println(riwayatParkir);
		System.out.println(jalurSempit);
	}
	
	public static void main (String[] args) {
		ParkiranDriver isi = new ParkiranDriver();
		
		ParkiranGacor p1 = new ParkiranGacor ("kemarin", "kelima", "banget");
		ParkiranGacor p2 = new ParkiranGacor ("testing", "testing", "testing");
		
		isi.catatKendaraan(p2);
		isi.masukAntrean(p2);
		isi.parkirMundur(p2);
		
	}

}
