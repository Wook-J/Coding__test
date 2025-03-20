package chap15_dynamic_programming;

public class Prob73_땅따먹기 {
	
	int solution(int[][] land) {
		int len = land.length;
		int[][] dp = new int[len][4];

		for(int i=0; i<4; i++) dp[0][i] = land[0][i];

		for(int j=1; j<len; j++) {
			dp[j][0] = land[j][0] + Math.max(dp[j-1][1], Math.max(dp[j-1][2], dp[j-1][3]));
			dp[j][1] = land[j][1] + Math.max(dp[j-1][0], Math.max(dp[j-1][2], dp[j-1][3]));
			dp[j][2] = land[j][2] + Math.max(dp[j-1][0], Math.max(dp[j-1][1], dp[j-1][3]));
			dp[j][3] = land[j][3] + Math.max(dp[j-1][0], Math.max(dp[j-1][1], dp[j-1][2]));
		}

		return Math.max(Math.max(dp[len-1][0], dp[len-1][1]), Math.max(dp[len-1][2], dp[len-1][3]));
	}
}
