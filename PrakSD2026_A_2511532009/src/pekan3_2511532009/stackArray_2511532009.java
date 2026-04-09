package pekan3_2511532009;
import java.util.*;

public class stackArray_2511532009 {
		static final int MAX_2009 = 1000;
		int top_2009;
		int a[] = new int [MAX_2009];
		boolean isEmpty_2009()
		{
			return (top_2009 < 0);
		}
		stackArray_2511532009()
		{
			top_2009 = -1;
		}
		boolean push_2511532009 (int x)
		{
			if (top_2009 >= (MAX_2009 - 1)) {
				System.out.println("Stack Overflow");
				return false;
			}
			else {
				a[++top_2009] = x;
				System.out.println(x + " dimasukkan dalam stack");
				return true;
			}
		}
		int pop_2511532009()
		{
			if (top_2009 < 0) {
				System.out.println("Stack Underflow");
				return 0;
			}
			else {
				int x = a [top_2009--];
				return x;
			}
}
		int peek_2511532009 ()
		{
			if (top_2009 < 0) {
				System.out.println("Stack Underflow");
				return 0;
			}
			else {
				int x = a[top_2009];
				return x;
			}
		}
		void print_2511532009 () {
			for(int i = top_2009;i>-1;i--) {
				System.out.println(" " + a[i]);
			}
		}
		
}
