package pekan3_2511532009;
import java.util.*;

public class NilaiMaksimum_2511532009 {
	public static int max_2009 (Stack<Integer> s_2009) {
		Stack<Integer> backup = new Stack<Integer>();
		int maxValue_2009 = s_2009.pop ();
		backup.push(maxValue_2009);
		while (!s_2009.isEmpty() ) {
			int next = s_2009.pop ();
			backup.push(next);
			maxValue_2009 = Math.max(maxValue_2009, next);
		}
		while (!backup.isEmpty()) {
			s_2009.push (backup.pop());
		}
		return maxValue_2009;
	}
	public static void main(String[] args) {
		Stack<Integer> s_2009 = new Stack<Integer> ();
		s_2009.push(70);
		s_2009.push(12);
		s_2009.push(20);
		System.out.println("isi stack " + s_2009);
		System.out.println("Stack Teratas " + s_2009.peek ());
		System.out.println("Nilai maksimum " + max_2009(s_2009));
		

	}

}
