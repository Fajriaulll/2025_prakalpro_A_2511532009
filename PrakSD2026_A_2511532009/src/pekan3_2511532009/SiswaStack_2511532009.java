package pekan3_2511532009;
import java.util.*;
class Siswa_2009 {
	String nama_2009;
	int nim_2009;
	
	public Siswa_2009(String nama_2009, int nim_2009) {
		this.nama_2009 = nama_2009;
		this.nim_2009 = nim_2009;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim_2009 + ", Nama: " + nama_2009;
	}
}

public class SiswaStack_2511532009 {
	private ArrayList<Siswa_2009> stack_2009;
	
	public SiswaStack_2511532009() {
		stack_2009 = new ArrayList<>();
	}
	
	public void push_2009(Siswa_2009 mhs) {
		stack_2009.add(mhs);
	}
	public Siswa_2009 pop () {
		if (!isEmpty() ) {
			return stack_2009.remove(stack_2009.size() - 1);
		}
		return null;
	}
	public Siswa_2009 peek() {
		if (!isEmpty()) {
			return stack_2009.get(stack_2009.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack_2009.isEmpty();
	}
	
	public void tampilkanSiswa_2009() {
		for (int i = stack_2009.size() - 1; i >= 0; i--) {
			System.out.println(stack_2009.get(i));
		}
	}
	public static void main (String[] args) {
		SiswaStack_2511532009 studentStack_2009 = new SiswaStack_2511532009();
		
		Siswa_2009 mhs1_2009 = new Siswa_2009("Ali", 1);
		Siswa_2009 mhs2_2009 = new Siswa_2009("Boby", 2);
		Siswa_2009 mhs3_2009 = new Siswa_2009("Charles", 3);
		studentStack_2009.push_2009(mhs1_2009);
		studentStack_2009.push_2009(mhs2_2009);
		studentStack_2009.push_2009(mhs3_2009);
		
		System.out.println("Siswa di dalam staack:");
		studentStack_2009.tampilkanSiswa_2009();
		
		System.out.println("siswa teratas " + studentStack_2009.peek());
		studentStack_2009.tampilkanSiswa_2009();
		
		System.out.println("siswa teratas " + studentStack_2009.peek());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack_2009.pop());
		System.out.println("daftar siswa setelah di pop : ");
		studentStack_2009.tampilkanSiswa_2009();
	}

}
