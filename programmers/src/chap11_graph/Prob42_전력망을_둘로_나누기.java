package chap11_graph;

import java.util.ArrayList;

public class Prob42_전력망을_둘로_나누기 {

	private boolean[] visited;
	private ArrayList<Integer>[] adjList;
	private int N, answer;

	public int solution(int n, int[][] wires) {
		
		N = n;
		answer = n-1;
		
		adjList = new ArrayList[n+1];
		for(int i=1; i<=n ; i++) adjList[i] = new ArrayList<Integer>();
		
		for(int[] wire : wires) {
			adjList[wire[0]].add(wire[1]);
			adjList[wire[1]].add(wire[0]);
		}
		
		visited = new boolean[n+1];
		dfs(1);
		
		return answer;
	}
	
	public int dfs(int now) {
		
		visited[now] = true;
		int sum = 0;
		
		for(int next: adjList[now]) {
			if(!visited[next]) {
				int cnt = dfs(next);
				answer = Math.min(answer, Math.abs(N- cnt * 2));
				sum+= cnt;
			}
		}
		
		return sum + 1;
	}
	
}
