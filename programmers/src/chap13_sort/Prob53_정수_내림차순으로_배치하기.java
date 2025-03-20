package chap13_sort;

import java.util.Arrays;
import java.util.Collections;

public class Prob53_정수_내림차순으로_배치하기 {
	
	public long solution(long n) {
		String[] arr = String.valueOf(n).split("");
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		for(String number : arr) sb.append(number);
		
		return Long.parseLong(sb.toString());
	}
	
	public long solution2(long n) {
		int[] counts = new int[10];
		
		while(n > 0) {
			counts[(int) (n % 10)]++;
			n /= 10;
		}
		
		long answer = 0;
		for(int i=9; i>=0; i--){
			for(int j=0; j<counts[i]; j++) {
				answer += i;
				answer *= 10;
			}
		}
		
		return answer;
	}
}
