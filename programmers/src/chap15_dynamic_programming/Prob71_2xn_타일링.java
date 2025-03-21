package chap15_dynamic_programming;

public class Prob71_2xn_타일링 {
	
	public int solution(int n) {
		
		int[] tile = new int[n+1];
		
		tile[1] = 1;
		tile[2] = 2;
		for(int i=3; i<=n; i++) tile[i] = (tile[i-1] + tile[i-2]) % 1000000007;
		
		return tile[n];
	}
}
