package chap11_graph;

public class Prob38_네트워크 {
	
	private boolean[] visit;
	private int[][] computer;
	
	public void dfs(int now) {
		visit[now] = true;
		for(int i=0; i<computer[now].length; i++) {
			if(computer[now][i]==1 && !visit[i]) dfs(i);
		}
	}
	
	public int solution(int n, int[][] computers) {
		computer = computers;
		visit = new boolean[n];
		
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			if(!visit[i]) {
				dfs(i);
				answer++;
			}
		}
		return answer;
	}
}
