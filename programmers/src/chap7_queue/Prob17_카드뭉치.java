package chap7_queue;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Prob17_카드뭉치 {
	
	// 큐를 이용한 풀이
	public String solution1(String[] cards1, String[] cards2, String[] goal) {
		
		ArrayDeque<String> deque1 = new ArrayDeque<String>(Arrays.asList(cards1));
		ArrayDeque<String> deque2 = new ArrayDeque<String>(Arrays.asList(cards2));
		ArrayDeque<String> goalDeque = new ArrayDeque<String>(Arrays.asList(goal));
		
		while(!goalDeque.isEmpty()) {
			
			if(!deque1.isEmpty() && deque1.peekFirst().equals(goalDeque.peekFirst())) {
				deque1.pollFirst();
				goalDeque.pollFirst();
				
			} else if(!deque2.isEmpty() && deque2.peekFirst().equals(goalDeque.peekFirst())) {
				deque2.pollFirst();
				goalDeque.pollFirst();
				
			} else break;
		}
		
		return goalDeque.isEmpty() ? "Yes" : "No";
	}
	
	// 원래 풀이방법
    public String solution2(String[] cards1, String[] cards2, String[] goal) {
    	
        int card1_index = 0;
		int card2_index = 0;
		
		for (String str : goal) {
			
			// cards1 안에 String 다 쓴 경우
			if(card1_index == cards1.length) {				
				if (str.equals(cards2[card2_index])) card2_index++;
			
			// cards2 안에 String 다 쓴 경우
			} else if (card2_index == cards2.length) {		
				if(str.equals(cards1[card1_index])) card1_index++;
			
			// cards1, cards2 둘다 String 다 안 쓴경우
			}else {											
				if(str.equals(cards1[card1_index])) card1_index++;
				else if (str.equals(cards2[card2_index])) card2_index++;
			}
		}
		
		return card1_index+card2_index == goal.length ? "Yes" : "No";
    }
}
