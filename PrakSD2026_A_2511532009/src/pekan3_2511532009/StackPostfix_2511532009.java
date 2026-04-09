package pekan3_2511532009;
import java.util.*;
public class StackPostfix_2511532009 {
	public static int postfixEvaluate_2511532009(String expression) {
		Stack<Integer> s_2511532009 = new Stack<Integer>();
		Scanner input = new Scanner(expression);
		while (input.hasNext()) {
			if (input.hasNextInt()) { 	// an operand (integer)
				s_2511532009.push(input.nextInt());
			} else {
				String operator = input.next();
				int operand2 = s_2511532009.pop();
				int operand1 = s_2511532009.pop();
				if (operator.equals("+")) {
					s_2511532009.push(operand1 + operand2);
				} else if (operator.equals("-")) {
					s_2511532009.push(operand1 - operand2);
				} else if (operator.equals("*")) {
					s_2511532009.push(operand1 * operand2);
				} else {
					s_2511532009.push(operand1 / operand2);
				}
			}
		}
		input.close();
		return s_2511532009.pop();
	}
	public static void main (String[] args) {
		System.out.println("Hasil postfix= " + postfixEvaluate_2511532009("5 2 4 * + 7 -"));
	}
	

}
