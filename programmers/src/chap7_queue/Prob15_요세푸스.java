package chap7_queue;

import java.util.ArrayDeque;

public class Prob15_요세푸스 {

	public int solution(int N, int K) {
		
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		for(int i=1; i<=N; i++) deque.add(i);
		
		while(deque.size() > 1) {
			for(int i=0; i<K-1; i++) deque.addLast(deque.pollFirst());
			deque.pollFirst();
		}
		
		return deque.pollFirst();
	}
}
