package chap6_stack;

import java.util.Arrays;

public class RunStack {

	public static void main(String[] args) {
		
		Prob14_표_편집 prob14 = new Prob14_표_편집();
		
		String[] cmd1 = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
		String[] cmd2 = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
		
		System.out.println(prob14.solution(8, 2, cmd1));
		System.out.println(prob14.solution(8, 2, cmd2));
		
//		Prob13_크레인_인형뽑기_게임 prob13 = new Prob13_크레인_인형뽑기_게임();
//		
//		int[][] board = {
//				{0, 0, 0, 0, 0},
//				{0, 0, 1, 0, 3},
//				{0, 2, 5, 0, 1},
//				{4, 2, 4, 4, 2},
//				{3, 5, 1, 3, 1}};
//		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
//		
//		System.out.println(prob13.solution(board, moves));
		
//		Prob12_주식가격 prob12 = new Prob12_주식가격();
//		
//		int[] prices = {1, 2, 3, 2, 3};
//		
//		System.out.println(Arrays.toString(prob12.solution(prices)));
		
//		Prob11_짝지어_제거하기 prob11 = new Prob11_짝지어_제거하기();
//		
//		String s1 = "baabaa";
//		String s2 = "cdcd";
//		
//		System.out.println(prob11.solution(s1));
//		System.out.println(prob11.solution(s2));
		
//		Prob10_괄호_회전하기 prob10 = new Prob10_괄호_회전하기();
//		
//		String s1 = "[](){}";
//		String s2 = "}]()[{";
//		String s3 = "[)(]";
//		String s4 = "}}}";
//		
//		System.out.println(prob10.solution(s1));
//		System.out.println(prob10.solution(s2));
//		System.out.println(prob10.solution(s3));
//		System.out.println(prob10.solution(s4));
		
//		Prob09_10진수를_2진수로_변환 prob9 = new Prob09_10진수를_2진수로_변환();
//		
//		int n1 = 123456;
//		int n2 = 13;
//		int n3 = 234;
//		
//		System.out.println(prob9.solution(n1));
//		System.out.println(prob9.solution(n2));
//		System.out.println(prob9.solution(n3));
		
		
//		Prob08_올바른_괄호 prob8 = new Prob08_올바른_괄호();
//		
//		String s1 = "()()";
//		String s2 = "(())()";
//		String s3 = ")()(";
//		String s4 = "(()(";
//		
//		System.out.println(prob8.solution(s1));
//		System.out.println(prob8.solution(s2));
//		System.out.println(prob8.solution(s3));
//		System.out.println(prob8.solution(s4));
	}

}
