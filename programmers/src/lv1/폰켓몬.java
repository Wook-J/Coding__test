package lv1;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
	
	public int solution(int[] nums) {
		
		int answer = 0;
		int length = nums.length/2;
		Set<Integer> numSet = new HashSet<Integer>();
		
		for(int num : nums) numSet.add(num);
		
		int setSize = numSet.size();
		
		if(setSize >= length) answer = length;
		else answer = setSize;
		
		return answer;
    }
}
