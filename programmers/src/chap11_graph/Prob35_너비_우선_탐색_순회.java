package chap11_graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Prob35_너비_우선_탐색_순회 {
	
	private ArrayList<Integer>[] adjList;	// 인접 리스트
	
	private boolean[] visited;				// 방문 여부
	private ArrayList<Integer> answer;		// 너비우선탐색 순서
	
	public int[] solution(int[][] graph, int start, int n) {
		
		adjList = new ArrayList[n+1];
		for(int i=0; i<adjList.length; i++) adjList[i] = new ArrayList<Integer>();
		
		for(int[] edge : graph) adjList[edge[0]].add(edge[1]);
		
		visited = new boolean[n+1];
		answer = new ArrayList<Integer>();
		bfs(start);

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
	
	// 너비 우선 탐색
	public void bfs(int start) {
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			answer.add(now);
			
			for(int next : adjList[now]) {
				if(!visited[next]) {
					queue.add(next);
					visited[next] = true;
				}
			}
		}
	}

}
