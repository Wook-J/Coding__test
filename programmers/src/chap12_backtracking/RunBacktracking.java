package chap12_backtracking;

import java.util.Arrays;

public class RunBacktracking {

	public static void main(String[] args) {
		
		Prob48_외벽_점검 prob48 = new Prob48_외벽_점검();
		
		int[] weak1 = {1, 5, 6, 10};
		int[] dist1 = {1, 2, 3, 4};
		System.out.println(prob48.solution(12, weak1, dist1));
		
		int[] weak2 = {1, 3, 4, 9, 10};
		int[] dist2 = {3, 5, 7};
		System.out.println(prob48.solution(12, weak2, dist2));
		
//		Prob47_양궁대회 prob47 = new Prob47_양궁대회();
//		
//		int[] info1 = {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
//		int[] info2 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//		int[] info3 = {0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1};
//		
//		System.out.println(Arrays.toString(prob47.solution(5, info1)));
//		System.out.println(Arrays.toString(prob47.solution(1, info2)));
//		System.out.println(Arrays.toString(prob47.solution(9, info3)));
		
//		Prob46_N_Queen prob46 = new Prob46_N_Queen();
//		System.out.println(prob46.solution(4));
//		System.out.println(prob46.solution(10));
		
//		Prob45_피로도 prob45 = new Prob45_피로도();
//		int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
//		System.out.println(prob45.solution(80, dungeons));
		
//		Prob44_스도쿠_퍼즐 prob44 = new Prob44_스도쿠_퍼즐();
//		
//		int[][] board1 =
//			{
//				{5, 3, 0, 0, 7, 0, 0, 0, 0},
//				{6, 0, 0, 1, 9, 5, 0, 0, 0},
//				{0, 9, 8, 0, 0, 0, 0, 6, 0},
//				{8, 0, 0, 0, 6, 0, 0, 0, 3},
//				{4, 0, 0, 8, 0, 3, 0, 0, 1},
//				{7, 0, 0, 0, 2, 0, 0, 0, 6},
//				{0, 6, 0, 0, 0, 0, 2, 8, 0},
//				{0, 0, 0, 4, 1, 9 ,0, 0, 5},
//				{0, 0, 0, 0, 8, 0, 0, 7, 9}
//			};
//		System.out.println(Arrays.deepToString(prob44.solution(board1)));
//		
//		int[][] board2 =
//			{
//				{0, 0, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0 ,0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0}
//			};
//		System.out.println(Arrays.deepToString(prob44.solution(board2)));
		
//		Prob43_1부터_N까지_합이_10이_되는_조합 prob43 = new Prob43_1부터_N까지_합이_10이_되는_조합();
//		
//		System.out.println(prob43.solution(5));
//		System.out.println(prob43.solution(2));
//		System.out.println(prob43.solution(7));
	}
}
