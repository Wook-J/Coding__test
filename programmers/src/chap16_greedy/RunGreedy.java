package chap16_greedy;

import java.util.Arrays;

public class RunGreedy {

	public static void main(String[] args) {
		
		Prob82_기지국_설치 prob82 = new Prob82_기지국_설치();
		
		int[] stations1 = {4, 11};
		int[] stations2 = {9};
		
		System.out.println(prob82.solution(11, stations1, 1));
		System.out.println(prob82.solution(16, stations2, 2));
		
//		Prob81_귤_고르기 prob81 = new Prob81_귤_고르기();
//		
//		int[] tangerine1 = {1, 3, 2 ,5, 4, 5, 2, 3};
//		int[] tangerine2 = {1, 3, 2 ,5, 4, 5, 2, 3};
//		int[] tangerine3 = {1, 1, 1, 1, 2, 2, 2, 3};
//		
//		System.out.println(prob81.solution(6, tangerine1));
//		System.out.println(prob81.solution(4, tangerine2));
//		System.out.println(prob81.solution(2, tangerine3));
		
//		Prob80_구명보트 prob80 = new Prob80_구명보트();
//		
//		int[] people1 = {70, 50, 80, 50};
//		int[] people2 = {70, 80, 50};
//		
//		System.out.println(prob80.solution(people1, 100));
//		System.out.println(prob80.solution(people2, 100));
		
//		Prob79_예산 prob79 = new Prob79_예산();
//		
//		int[] d1 = {1, 3, 2, 5, 4};
//		int budget1 = 9;
//		System.out.println(prob79.solution(d1, budget1));
//		
//		int[] d2 = {2, 2, 3, 3};
//		int budget2 = 10;
//		System.out.println(prob79.solution(d2, budget2));
		
//		Prob78_부분_배낭_문제 prob78 = new Prob78_부분_배낭_문제();
//		
//		int[][] items1 = {{10, 19}, {7, 10}, {6, 10}};
//		int weight_limit1 = 15;
//		System.out.println(prob78.solution(items1, weight_limit1));
//
//		int[][] items2 = {{10, 60}, {20, 100}, {30, 120}};
//		int weight_limit2 = 50;
//		System.out.println(prob78.solution(items2, weight_limit2));
		
//		Prob77_거스름돈_주기 prob77 = new Prob77_거스름돈_주기();
//		System.out.println(Arrays.toString(prob77.solution(123)));
//		System.out.println(Arrays.toString(prob77.solution(350)));
	}
}
