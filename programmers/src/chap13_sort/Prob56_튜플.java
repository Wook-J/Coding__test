package chap13_sort;

import java.util.Arrays;
import java.util.HashSet;

public class Prob56_튜플 {
	
	public int[] solution(String s) {
		
		s = s.substring(0, s.length()-2).replace("{", "");
		String[] arr= s.split("},");
		Arrays.sort(arr, (o1, o2) -> Integer.compare(o1.length() , o2.length()));
		
		HashSet<String> set = new HashSet<String>();
		int[] answer = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			String[] numbers = arr[i].split(",");
			
			for(String number : numbers) {
				if(!set.contains(number)) {
					answer[i] = Integer.parseInt(number);
					set.add(number);
				}
			}
		}
		
		return answer;
	}
}
