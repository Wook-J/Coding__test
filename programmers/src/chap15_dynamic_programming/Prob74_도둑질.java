package chap15_dynamic_programming;

public class Prob74_도둑질 {
	public int solution(int[] money) {
		int len = money.length;
				
		int[] dp1 = new int[len];
		int[] dp2 = new int[len];
		
		// 첫번째 집 도둑질하는 경우
		dp1[0] = money[0];
		dp1[1] = money[0];
		for(int i=2; i<len-1; i++) dp1[i] = Math.max(dp1[i-1], dp1[i-2] + money[i]);
		
		// 첫번째 집 도둑질하지 않는 경우
		dp2[1] = money[1];
		for(int i=2; i<len; i++) dp2[i] = Math.max(dp2[i-1], dp2[i-2] + money[i]);
		
		return Math.max(dp1[len-2], dp2[len-1]);
	}
}
