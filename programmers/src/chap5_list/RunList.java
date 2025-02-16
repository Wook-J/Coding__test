package chap5_list;

import java.util.Arrays;

public class RunList {

	public static void main(String[] args) {
		
		Prob07_방문길이 prob7 = new Prob07_방문길이();
		String dirs1 = "ULURRDLLU";
		String dirs2 = "LULLLLLLU";
		
		System.out.println(prob7.solution(dirs1));
		System.out.println(prob7.solution(dirs2));
		
//		Prob06_실패율 prob6 = new Prob06_실패율();
//		int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
//		int[] stages2 = {4, 4, 4, 4, 4};
//		
//		System.out.println(Arrays.toString(prob6.solution(5, stages1)));
//		System.out.println(Arrays.toString(prob6.solution(4, stages2)));
		
//		Prob05_행렬의_곱셈 prob5 = new Prob05_행렬의_곱셈();
//		int[][] arr11 = {{1, 4}, {3, 2}, {4, 1}};
//		int[][] arr21 = {{3, 3}, {3, 3}};
//		int[][] arr12 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
//		int[][] arr22 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
//		
//		System.out.println(Arrays.deepToString(prob5.solution(arr11, arr21)));
//		System.out.println(Arrays.deepToString(prob5.solution(arr12, arr22)));
		
//		Prob04_모의고사 prob4 = new Prob04_모의고사();
//		int[] arr1 = {1, 2, 3, 4, 5};
//		int[] arr2 = {1, 3, 3, 4, 2};
//		
//		System.out.println(Arrays.toString(prob4.sol(arr1)));
//		System.out.println(Arrays.toString(prob4.sol(arr2)));
		
//		Prob03_두_개_뽑아서_더하기 prob3 = new Prob03_두_개_뽑아서_더하기();
//		int[] arr1 = {2, 1, 3, 4, 1};
//		int[] arr2 = {5, 0, 2, 7};
//		
//		System.out.println(Arrays.toString(prob3.sol(arr1)));
//		System.out.println(Arrays.toString(prob3.sol(arr2)));

//		Prob02_배열_제어하기 prob2 = new Prob02_배열_제어하기();
//		int[] arr1 = {4, 2, 2, 1, 3, 4};
//		int[] arr2 = {2, 1, 1, 3, 2, 5, 4};
//		
//		System.out.println(Arrays.toString(prob2.sol(arr1)));
//		System.out.println(Arrays.toString(prob2.sol(arr2)));
		
//		Prob01_배열_정렬하기 prob1 = new Prob01_배열_정렬하기();
//		int[] arr1 = {1, -5, 2, 4, 3};
//		int[] arr2 = {2, 1, 1, 3, 2, 5, 4};
//		int[] arr3 = {6, 1, 7};
//		
//		System.out.println(Arrays.toString(prob1.sol(arr1)));
//		System.out.println(Arrays.toString(prob1.sol(arr2)));
//		System.out.println(Arrays.toString(prob1.sol(arr3)));
	}

}
