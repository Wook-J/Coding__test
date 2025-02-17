package chap10_set;

import java.util.Arrays;

public class RunSet {

	public static void main(String[] args) {
		
		Prob31_폰켓몬 prob31 = new Prob31_폰켓몬();
		
		int[] nums1 = {3, 1, 2, 3};
		int[] nums2 = {3, 3, 3, 2, 2, 4};
		int[] nums3 = {3, 3, 3, 2, 2, 2};
		
		System.out.println(prob31.solution(nums1));
		System.out.println(prob31.solution(nums2));
		System.out.println(prob31.solution(nums3));
		
//		Prob30_간단한_유니온_파인드_알고리즘 prob30 = new Prob30_간단한_유니온_파인드_알고리즘();
//		
//		int[][] operations1 = {{0,0,1}, {0,1,2}, {1,1,2}};
//		System.out.println(Arrays.toString(prob30.solution(3, operations1)));
//		
//		int[][] operations2 = {{0,0,1}, {1,1,2}, {0,1,2}, {1,0,2}};
//		System.out.println(Arrays.toString(prob30.solution(4, operations2)));

	}

}
