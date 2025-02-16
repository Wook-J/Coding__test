package chap7_queue;

import java.util.Arrays;

public class RunQueue {

	public static void main(String[] args) {
		
		Prob17_카드뭉치 prob17 = new Prob17_카드뭉치();
		
		String[] cards11 = {"i", "drink", "water"};
		String[] cards21 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		System.out.println(prob17.solution1(cards11, cards21, goal));
		
		String[] cards12 = {"i", "water", "drink"};
		String[] cards22 = {"want", "to"};
		System.out.println(prob17.solution1(cards12, cards22, goal));

//		Prob16_기능개발 prob16 = new Prob16_기능개발();
//		
//		int[] progresses1 = {93, 30, 55};
//		int[] speeds1 = {1, 30, 5};		
//		System.out.println(Arrays.toString(prob16.solution(progresses1, speeds1)));
//		
//		int[] progresses2 = {95, 90, 99, 99, 80, 99};
//		int[] speeds2 = {1, 1, 1, 1, 1, 1};
//		System.out.println(Arrays.toString(prob16.solution(progresses2, speeds2)));
		
		
//		Prob15_요세푸스 prob15 = new Prob15_요세푸스();
//		
//		System.out.println(prob15.solution(5, 2));
//		System.out.println(prob15.solution(5, 3));
	}
}
