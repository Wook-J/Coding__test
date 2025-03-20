package chap14_simulation;

public class Prob65_점프와_순간_이동 {
	public int solution(int n) {
		int ans = 1;
		
		while(n > 1) {
			if(n % 2 == 0) n /= 2;
			else {
				ans++;
				n -= 1;
			}
		}
		return ans;
	}
	
	public int solution2(int n) {
//		return Integer.toBinaryString(n).replace("0", "").length();
		return Integer.bitCount(n);
	}
}
