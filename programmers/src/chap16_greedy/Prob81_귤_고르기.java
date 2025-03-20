package chap16_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Prob81_귤_고르기 {
	public int solution(int k, int[] tangerine) {
		HashMap<Integer, Integer> cntMap = new HashMap<Integer, Integer>();
		for(int item : tangerine) cntMap.put(item, cntMap.getOrDefault(item, 0) + 1);

		ArrayList<Integer> cntList = new ArrayList<Integer>(cntMap.values());
		cntList.sort(Collections.reverseOrder());
		
		int types = 0;
		int sum = 0;
		
		for(int cnt : cntList) {
			sum += cnt;
			types++;
			
			if(sum >= k) break;
		}
		return types;
	}
}
