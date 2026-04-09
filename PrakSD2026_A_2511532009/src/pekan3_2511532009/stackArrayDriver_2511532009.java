package pekan3_2511532009;

public class stackArrayDriver_2511532009 {
	public static void main (String[] args ) {
		stackArray_2511532009 s = new stackArray_2511532009();
		s.push_2511532009 (10);
		s.push_2511532009 (20);
		s.push_2511532009 (30);
		System.out.println(s.pop_2511532009() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah :" + s.peek_2511532009());
		System.out.println("Element pada stack : ");
		s.print_2511532009();
	}

}
