package chap6_stack;

import java.util.Stack;

public class Prob11_짝지어_제거하기 {

	public int solution(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(!stack.isEmpty() && stack.peek()==c) stack.pop();
			else stack.push(c);
		}
		
		return stack.isEmpty() ? 1 : 0;
    }
}
