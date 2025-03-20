package chap13_sort;

public class Prob51_정렬된_두_배열_합치기 {

	public int[] solution(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		// 하나의 배열이 끝날 때까지 처리
		while(i<arr1.length && j<arr2.length) {
			merged[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
		}
		
		// 남은 원소 처리
		while(i<arr1.length) merged[k++] = arr1[i++];
		while(j<arr2.length) merged[k++] = arr2[j++];
		
		return merged;
	}
}
