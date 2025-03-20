package chap12_backtracking;

public class Prob47_양궁대회 {
	
	private int max;
	private int[] answer;
	private int[] apeach;
	
	public int getScore(int[] ryan) {
		int score = 0;
		
		for(int i=0; i<11; i++) {
			if(ryan[i] + apeach[i] > 0) score += ryan[i] > apeach[i] ? (10 - i) : -(10 - i);
		}
		
		return score;
	}
	
	public void calculateDiff(int[] ryan) {
		int score = getScore(ryan);
		
		if(max < score) {
			
			max = score;
			answer = ryan.clone();
			
		} else if(max > 0 && max == score) {
			
			for(int i=10; i>=0; i--) {
				
				if(answer[i] != ryan[i]) {
					if(answer[i] < ryan[i]) answer = ryan.clone();
					break;
				}
			}
		}
	}
	
	public void backtrack(int remain, int idx, int[] ryan) {
		
		if(remain == 0) {
			calculateDiff(ryan);
			return;
		}
		
		for(int i=idx; i<11; i++) {
			int cnt = Math.min(remain, apeach[i]+1);
			
			ryan[i] = cnt;
			
			backtrack(remain - cnt, i + 1, ryan);
			
			ryan[i] = 0;
		}
	}
	
	public int[] solution(int n, int[] info) {
		apeach = info;
		max = 0;
		backtrack(n, 0, new int[11]);
		
		return max == 0 ? new int[] {-1} : answer;
	}
}
