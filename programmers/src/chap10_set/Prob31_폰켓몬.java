package chap10_set;

import java.util.HashSet;

public class Prob31_폰켓몬 {
	public int solution(int[] nums) {

		HashSet<Integer> numSet = new HashSet<Integer>();
		for(int num : nums) numSet.add(num);
		
		int setSize = numSet.size();
		int length = nums.length/2;
		
		return setSize >= length ? length : setSize;
    }
}
