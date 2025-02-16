package chap6_stack;

import java.util.Stack;

public class Prob13_크레인_인형뽑기_게임 {
	
	public int solution(int[][] board, int[] moves) {
		
		// 로직 순서
		// 1. moves 의 처음부터 마지막 데이터까지 돌면서 board 데이터 빼오기
		// 2. 빼온 데이터를 basket(stack)에 집어넣기
		// 3. 집어넣을 때 이전 요소와 같으면 pop하여 없애기
		// 3-1. 없어질 때마다 answer에 2 더하기
		// 4. 모든 요소 다 순회하고서 사라진 인형 개수 return
		
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {
				
				if(board[j][moves[i]-1] != 0) {		// board 의 데이터가 0이 아닐 때
					
					// stack 에 data 가 있고, stack 의 마지막 data 와 board 의 data 가 같을 때
					if(!stack.isEmpty() && stack.peek() == board[j][moves[i]-1]) {
						
						stack.pop();		// stack 의 마지막 data 빼오기
						answer += 2;		// 2개씩 사라지므로 2 증가
						
					// 위의 경우가 아닐 때
					} else stack.push(board[j][moves[i]-1]);	// stack 에 board 의 data push
					
					// 어느 경우든 data 뺴왔으므로 초기화
					board[j][moves[i]-1] = 0;					
					
					break;					// data 를 stack 에 넣었으므로 j for문 탈출
				}

			}
		}
		
		return answer;
    }
	
	public int solution2(int[][] board, int[] moves) {
		
		// board 의 각 열에 대한 stack 생성
		Stack<Integer>[] lanes = new Stack[board.length];
		for(int i=0; i<lanes.length; i++) lanes[i] = new Stack<Integer>();
		
		// 각 열의 인형을 lanes 에 추가
		for(int i=board.length-1; i>=0; i--) {
			for(int j=0; j<board[i].length; j++) {
				if(board[i][j]>0) lanes[j].push(board[i][j]);
			}
		}
		
		// 바구니 생성 및 answer 세팅
		Stack<Integer> bucket = new Stack<Integer>();
		int answer = 0;
		
		// moves 순회
		for(int move: moves) {
			if(!lanes[move-1].isEmpty()) {		// 비어있지 않으면 인형 뺴오기
				int doll = lanes[move-1].pop();
				
				if(!bucket.isEmpty() && bucket.peek()==doll) {	// 바구니 data 있고 이전 값과 같은 경우
					bucket.pop();
					answer += 2;
				} else bucket.push(doll);						// 다른 경우
			}
		}
		
		return answer;
	}

}
