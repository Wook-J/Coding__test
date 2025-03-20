package chap15_dynamic_programming;

import java.util.Arrays;

public class Prob68_LIS_길이_계산하기 {
	
	public int solution(int[] nums) {
		int len = nums.length;
		
		int[] dp = new int[len];
		Arrays.fill(dp, 1);
		
		for(int i=1; i<len; i++) {
			for(int j=0; j<i; j++) {
				if(nums[i]> nums[j]) dp[i] = Math.max(dp[i], dp[j]+1);
			}
		}
		
		return Arrays.stream(dp).max().getAsInt();
	}
}
