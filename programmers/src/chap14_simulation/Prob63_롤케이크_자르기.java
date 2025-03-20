package chap14_simulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Prob63_롤케이크_자르기 {
	
	public int solution(int[] topping) {
		int answer = 0;
		
		HashMap<Integer, Integer> toppingMap = new HashMap<Integer, Integer>();
		for(int t : topping) toppingMap.put(t, toppingMap.getOrDefault(t, 0) + 1);
		
		HashSet<Integer> toppingSet = new HashSet<Integer>();
		
		for(int t : topping) {
			toppingSet.add(t);
			toppingMap.put(t, toppingMap.get(t) - 1);
			
			if(toppingMap.get(t) == 0) toppingMap.remove(t);
			
			if(toppingSet.size() == toppingMap.size()) answer++;
		}

		return answer;
	}
	
	// 폐기 - 시간초과
	public int solution2(int[] topping) {
		
		int answer = 0;
		
		for(int i=1; i<topping.length; i++) {
			int[] firstPart = Arrays.copyOfRange(topping, 0, i);
			int[] secondPart = Arrays.copyOfRange(topping, i, topping.length);
			
			HashSet<Integer> firstSet = new HashSet<Integer>();
			HashSet<Integer> secondSet = new HashSet<Integer>();
			
			for(int num : firstPart) firstSet.add(num);
			for(int num : secondPart) secondSet.add(num);
			
			if(firstSet.size() == secondSet.size()) answer++;
		}
		
		return answer;
	}
}
