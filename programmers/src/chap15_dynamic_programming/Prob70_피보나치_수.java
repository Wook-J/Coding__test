package chap15_dynamic_programming;

public class Prob70_피보나치_수 {
	public int solution(int n) {
		
		int[] fibo = new int[n+1];
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2; i<=n; i++) fibo[i] = (fibo[i-2] + fibo[i-1]) % 1234567;
		return fibo[n];
	}
}
