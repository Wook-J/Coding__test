package chap14_simulation;

import java.util.Arrays;

public class RunSimulation {

	public static void main(String[] args) {
		
		Prob66_캐릭터의_좌표 prob66 = new Prob66_캐릭터의_좌표();
		
		String[] keyinput1 = {"left", "right", "up", "right", "right"};
		int[] board1 = {11, 11};
		System.out.println(Arrays.toString(prob66.solution(keyinput1, board1)));
		
		String[] keyinput2 = {"down", "down", "down", "down", "down"};
		int[] board2 = {7, 9};
		System.out.println(Arrays.toString(prob66.solution(keyinput2, board2)));		
		
//		Prob65_점프와_순간_이동 prob65 = new Prob65_점프와_순간_이동();
//		System.out.println(prob65.solution(5));
//		System.out.println(prob65.solution(6));
//		System.out.println(prob65.solution2(5000));
		
//		Prob64_카펫 prob64 = new Prob64_카펫();
//		System.out.println(Arrays.toString(prob64.solution(10, 2)));
//		System.out.println(Arrays.toString(prob64.solution(8, 1)));
//		System.out.println(Arrays.toString(prob64.solution(24, 24)));
		
//		Prob63_롤케이크_자르기 prob63 = new Prob63_롤케이크_자르기();
//		
//		int[] topping1 = {1, 2, 1, 3, 1, 4, 1, 2};
//		int[] topping2 = {1, 2, 3, 1, 4};
//		
//		System.out.println(prob63.solution(topping1));
//		System.out.println(prob63.solution(topping2));
		
//		Prob62_이진_변환_반복하기 prob62 = new Prob62_이진_변환_반복하기();
//		
//		String s1 = "110010101001";
//		String s2 = "01110";
//		String s3 = "1111111";
//		
//		System.out.println(Arrays.toString(prob62.solution(s1)));
//		System.out.println(Arrays.toString(prob62.solution(s2)));
//		System.out.println(Arrays.toString(prob62.solution(s3)));
		
//		Prob61_달팽이_수열_만들기 prob61 = new Prob61_달팽이_수열_만들기();
//		System.out.println(Arrays.deepToString(prob61.solution(3)));
//		System.out.println(Arrays.deepToString(prob61.solution(4)));
		
//		Prob60_행렬_곱한_후_전치 prob60 = new Prob60_행렬_곱한_후_전치();
//		
//		int[][] matrix11 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//		int[][] matrix12 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
//		System.out.println(Arrays.deepToString(prob60.solution(matrix11, matrix12)));
//		
//		int[][] matrix21 = {{2, 4, 6}, {1, 3, 5}, {7, 8, 9}};
//		int[][] matrix22 = {{9, 1, 2}, {4, 5, 6}, {7, 3, 8}};
//		System.out.println(Arrays.deepToString(prob60.solution(matrix21, matrix22)));
		
//		Prob59_배열_회전하기 prob59 = new Prob59_배열_회전하기();
//		int[][] arr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//		System.out.println(Arrays.deepToString(prob59.solution(arr1, 1)));
//		System.out.println(Arrays.deepToString(prob59.solution(arr1, 2)));

	}

}
