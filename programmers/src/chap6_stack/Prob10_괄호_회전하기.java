package chap6_stack;

import java.util.ArrayDeque;
import java.util.HashMap;

public class Prob10_괄호_회전하기 {
	
	public int solution(String s) {
		
		HashMap<Character, Character> map = new HashMap<>();
		map.put(')', '(');		// key : ), value : (
		map.put('}', '{');		// key : }, value : {
		map.put(']', '[');		// key : ], value : [
		
		int n = s.length();		// s의 길이
		s += s;					// s 붙이기 (j에 대한 for문 용)
		
		int answer = 0;
		
		A:for(int i=0; i<n; i++) {
			
			ArrayDeque<Character> stack = new ArrayDeque<>();
			
			for(int j=i; j<i+n; j++) {					// i 번째부터 반복시작
				
				char c = s.charAt(j);					// c 에 s 의 j 번째 요소 대입
				
				if(!map.containsKey(c)) stack.push(c);	// c 가 열린 괄호인 경우, stack 에 push
				else {									// c 가 닫힌 괄호인 경우
					if(stack.isEmpty() || !stack.pop().equals(map.get(c))) continue A;
				}
			}
			
			if(stack.isEmpty()) answer++;
		}
		
		return answer;
	}
}
