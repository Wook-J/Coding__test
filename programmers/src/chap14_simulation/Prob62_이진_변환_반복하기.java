package chap14_simulation;

public class Prob62_이진_변환_반복하기 {
	
	public int[] solution(String s) {
		int transformCnt = 0;
		int zeroCnt = 0;
		
		while(!s.equals("1")) {
			transformCnt++;
			
			int zeroLen = s.replace("1", "").length();
			zeroCnt += zeroLen;
			
			s = Integer.toBinaryString(s.length() - zeroLen);
		}
		
		return new int[] {transformCnt, zeroCnt};
	}
}
