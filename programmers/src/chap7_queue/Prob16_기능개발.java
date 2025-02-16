package chap7_queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Prob16_기능개발 {

	public int[] solution(int[] progresses, int[] speeds) {
		
		// 로직
		// complete 선언 및 초기화
		// 각 progress 의 완료일수 구하고 deque에 삽입
		// pollFirst 하면서 그 이하숫자 전부 poll 하고 complete++
		// 초과하는 숫자나오면 그 떄 complete 추가하고 complete 초기화
		// deque에 데이터 없을 때까지 반복
		
		List<Integer> answerList = new ArrayList<Integer>();
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		
		for(int i=0; i<progresses.length; i++) {
			queue.add((int) Math.ceil((100.0-progresses[i]) / speeds[i]));
		}
		
		int complete = 1;
		while(!queue.isEmpty()) {
			
			int days = queue.pollFirst();	// 7 얻어오기, [3, 9]
			
			if(queue.isEmpty()) {			// 마지막 days 인 경우
				answerList.add(1);			// answer List 에 1 추가
				break;						// 데이터 없으면 탈출
			}
			
			while (!queue.isEmpty() && days >= queue.peekFirst()) {
				queue.pollFirst();
				complete++;
			}
				
			answerList.add(complete);
			complete = 1;
		}
		
		return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
