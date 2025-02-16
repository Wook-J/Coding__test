package chap6_stack;

import java.util.ArrayDeque;

public class Prob08_올바른_괄호 {
	
	boolean solution(String s) {
		
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		char[] charArray = s.toCharArray();
		
		for(char c : charArray) {
			
			if(c == '(') {	// char 자료형이 열린 괄호인 경우
				stack.push(c);
				
			} else {		// char 자료형이 닫힌 괄호인 경우 
				if(stack.isEmpty() || stack.pop() == c) return false;
			}
		}
		
		return stack.isEmpty();
    }
}
