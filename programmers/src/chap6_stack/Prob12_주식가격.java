package chap6_stack;

import java.util.Stack;

public class Prob12_주식가격 {

	public int[] solution(int[] prices) {
		
		int[] answer = new int[prices.length];
		
		Stack<Integer> stack = new Stack<>();	// prices 의 index 저장할 stack
		stack.push(0);							// 0번 index 집어넣기
		
		for(int i=1; i<prices.length; i++) {	// 1번 index 부터 비교
			
			// stack 에 값 있고, 현재 가격 < 이전 가격(가격 떨어짐)인 경우
			while(!stack.isEmpty() && prices[i]<prices[stack.peek()]) {
				
				int j = stack.pop();			// 가장 최근 index 얻어오기
				answer[j] = i - j;				// answer 배열에 그 차이값 대입
			}
			
			stack.push(i);						// 위 while 문 빠져나오면 stack 에 i(index) push
		}
		
		while(!stack.isEmpty()) {				// stack 에 data 있는 경우 끝까지 가격 떨어지지 않은 상태
			int j = stack.pop();				// 가장 최근에 넣은 index 얻어오기
			answer[j] = prices.length - 1 - j;	// 그 기간동안 가격 떨어지지 않았으므로 전체 길이에서 빼기
		}
		
		return answer;
	}
}
