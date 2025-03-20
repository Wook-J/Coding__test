package chap12_backtracking;

public class Prob45_피로도 {
	
	private int answer;
	private int[][] dungeons;
	private boolean[] visited;
	
	public void backtrack(int k, int cnt) {
		
		for(int i=0; i<dungeons.length; i++) {
			
			if(!visited[i] && k>=dungeons[i][0]) {
				
				visited[i] = true;
				
				backtrack(k - dungeons[i][1], cnt +1);
				answer = Math.max(answer, cnt+1);
				
				visited[i] = false;
			}
		}
	}
	
	public int solution(int k, int[][] dungeons) {
		
		answer = 0;
		this.dungeons = dungeons;
		visited = new boolean[dungeons.length];
		
		backtrack(k, 0);
		
		return answer;
	}
}
