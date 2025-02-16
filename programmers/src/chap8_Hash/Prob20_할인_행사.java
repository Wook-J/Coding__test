package chap8_Hash;

import java.util.HashMap;
import java.util.Map.Entry;

public class Prob20_할인_행사 {

	// 추가 풀이
	public int solution(String[] want, int[] number, String[] discount) {
		
		HashMap<String, Integer> wantMap = new HashMap<>();
		for (int i=0; i<want.length; i++) wantMap.put(want[i], number[i]);
		
		int answer = 0;

		for (int i=0; i<discount.length-9; i++) {
			
			HashMap<String, Integer> discount10d = new HashMap<>();

			for (int j=i; j<i+10; j++) {
				if (wantMap.containsKey(discount[j])) {
					discount10d.put(discount[j], discount10d.getOrDefault(discount[j], 0) + 1);
				}
			}

			// map 내 모든 k-v 쌍이 같은 경우 answer++
			if (discount10d.equals(wantMap)) answer++;
		}

		return answer;
	}
	
	// 원래 풀이
	public int solution2(String[] want, int[] number, String[] discount) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<want.length; i++) map.put(want[i], number[i]);
		
		int answer = 0;
		
		A:for(int i=0; i<=discount.length-10; i++) {
			
			HashMap<String, Integer> clone = (HashMap<String, Integer>) map.clone();
			for(int j=i; j<i+10; j++) {
				clone.put(discount[j], clone.getOrDefault(discount[j], 0)-1);
			}
			
			for(Entry<String, Integer> entry : clone.entrySet()) {
				if(entry.getValue() < 0) continue A;
			}
			
			answer++;
		}

		return answer;
	}

}
