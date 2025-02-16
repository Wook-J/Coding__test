package chap6_stack;

import java.util.Stack;

public class Prob09_10진수를_2진수로_변환 {

	public String solution (int decimal) {
		
		Stack<Integer> stack = new Stack<>();
		
		while(decimal > 0) {
			int remain = decimal % 2;
			decimal = decimal / 2;
			
			stack.push(remain);
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) sb.append(stack.pop());
		
		return sb.toString();
	}
}
