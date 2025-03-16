package chap12_backtracking;

import java.util.Arrays;

public class RunBacktracking {

	public static void main(String[] args) {
		
		Prob44_스도쿠_퍼즐 prob44 = new Prob44_스도쿠_퍼즐();
		
		int[][] board1 =
			{
				{5, 3, 0, 0, 7, 0, 0, 0, 0},
				{6, 0, 0, 1, 9, 5, 0, 0, 0},
				{0, 9, 8, 0, 0, 0, 0, 6, 0},
				{8, 0, 0, 0, 6, 0, 0, 0, 3},
				{4, 0, 0, 8, 0, 3, 0, 0, 1},
				{7, 0, 0, 0, 2, 0, 0, 0, 6},
				{0, 6, 0, 0, 0, 0, 2, 8, 0},
				{0, 0, 0, 4, 1, 9 ,0, 0, 5},
				{0, 0, 0, 0, 8, 0, 0, 7, 9}
			};
		System.out.println(Arrays.deepToString(prob44.solution(board1)));
		
		int[][] board2 =
			{
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0 ,0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0}
			};
		System.out.println(Arrays.deepToString(prob44.solution(board2)));
		
//		Prob43_1부터_N까지_합이_10이_되는_조합 prob43 = new Prob43_1부터_N까지_합이_10이_되는_조합();
//		
//		System.out.println(prob43.solution(5));
//		System.out.println(prob43.solution(2));
//		System.out.println(prob43.solution(7));
	}
}
