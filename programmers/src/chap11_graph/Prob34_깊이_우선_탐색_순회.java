package chap11_graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob34_깊이_우선_탐색_순회 {

	private ArrayList<Integer>[] adjList;	// 인접리스트
	
	private boolean[] visited;				// 방문여부
	private ArrayList<Integer> answer;		// 깊이우선탐색 순서
	
	public int[] solution(int[][] graph, int start, int n) {

		adjList = new ArrayList[n+1];		// 0번 인덱스 안 씀
		for(int i=0; i<adjList.length; i++) adjList[i] = new ArrayList<Integer>();
		
		// graph 를 인접리스트로 변환(인덱스 자체가 시작노드 임)
		for(int[] edge : graph) adjList[edge[0]].add(edge[1]);
		
		visited = new boolean[n+1];
		answer = new ArrayList<Integer>();
		dfs(start);
		
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
	
	// 깊이 우선 탐색
	public void dfs(int now) {
		visited[now] = true;
		answer.add(now);
		
		for(int next : adjList[now]) {
			if(!visited[next]) dfs(next);
		}
	}
	
}
