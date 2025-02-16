package chap5_list;

import java.util.HashSet;
import java.util.Set;

public class Prob03_두_개_뽑아서_더하기 {

	public int[] sol(int[] arr) {
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				set.add(arr[i] + arr[j]);
			}
		}
		
		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
		
	}
}
