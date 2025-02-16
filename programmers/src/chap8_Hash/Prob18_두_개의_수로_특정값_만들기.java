package chap8_Hash;

import java.util.HashSet;

public class Prob18_두_개의_수로_특정값_만들기 {

	public boolean solution(int[] arr, int target) {
		
		HashSet<Integer> numSet = new HashSet<Integer>();
		
		// arr 배열 순회
		for(int num : arr) {	
			if(numSet.contains(target - num)) return true;	// numSet에서 두 수의 합 찾을 수 있으면 true 반환
			numSet.add(num);								// 위의 경우 외에 arr 배열 내 num 추가
		}
		
		return false;										// if 문 통과못하고 for 문 끝나면 false 반환
	}
}
