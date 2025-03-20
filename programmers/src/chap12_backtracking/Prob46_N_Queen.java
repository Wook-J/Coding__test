package chap12_backtracking;

public class Prob46_N_Queen {
	
	private int chessLength;			// 체스판의 길이
	private boolean[] width;			// 특정 열에 퀸 중복체크
	private boolean[] diagonal1;		// 오른위 -> 왼아래의 대각선 뱡향 퀸 중복체크
	private boolean[] diagonal2;		// 왼위 -> 오른아래의 대각선 방향 퀸 중복체크
	
	public int getAns(int y) {
		int ans = 0;
		
		if(y == chessLength) ans++;		// 퀸을 n 개 놓는 경우만 ans 증가
		else {
			for (int i=0; i<chessLength; i++) {
				
				if(width[i] || diagonal1[i + y] || diagonal2[i - y + chessLength]) continue;
				
				width[i] = true;
				diagonal1[i + y] = true;
				diagonal2[i - y + chessLength] = true;
				
				ans += getAns(y + 1);
				
				width[i] = false;
				diagonal1[i + y] = false;
				diagonal2[i - y + chessLength] = false;
			}
		}
		
		return ans;
	}
	
	public int solution(int n) {
		chessLength = n;
		width = new boolean[n];
		diagonal1 = new boolean[n*2];
		diagonal2 = new boolean[n*2];
		
		return getAns(0);	// 첫번째행부터 퀸을 배치를 시작하는 함수 호출
	}
}
