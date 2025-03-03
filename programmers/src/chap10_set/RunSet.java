package chap10_set;

import java.util.Arrays;

public class RunSet {

	public static void main(String[] args) {
		
		Prob33_섬_연결하기 prob33 = new Prob33_섬_연결하기();
		
		int[][] costs = {{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}};
		
		System.out.println(prob33.solution(4, costs));
		
//		Prob32_영어_끝말잇기 prob32 = new Prob32_영어_끝말잇기();
//		
//		String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//		String[] words2 = {
//				"hello", "observe", "effect", "take", "either",
//				"recognize", "encourage", "ensure", "establish", "hang",
//				"gather", "refer", "reference", "estimate", "executive"};
//		String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
//		
//		System.out.println(Arrays.toString(prob32.solution(3, words1)));
//		System.out.println(Arrays.toString(prob32.solution(5, words2)));
//		System.out.println(Arrays.toString(prob32.solution(2, words3)));
		
//		Prob31_폰켓몬 prob31 = new Prob31_폰켓몬();
//		
//		int[] nums1 = {3, 1, 2, 3};
//		int[] nums2 = {3, 3, 3, 2, 2, 4};
//		int[] nums3 = {3, 3, 3, 2, 2, 2};
//		
//		System.out.println(prob31.solution(nums1));
//		System.out.println(prob31.solution(nums2));
//		System.out.println(prob31.solution(nums3));
		
//		Prob30_간단한_유니온_파인드_알고리즘 prob30 = new Prob30_간단한_유니온_파인드_알고리즘();
//		
//		int[][] operations1 = {{0,0,1}, {0,1,2}, {1,1,2}};
//		System.out.println(Arrays.toString(prob30.solution(3, operations1)));
//		
//		int[][] operations2 = {{0,0,1}, {1,1,2}, {0,1,2}, {1,0,2}};
//		System.out.println(Arrays.toString(prob30.solution(4, operations2)));

	}

}
