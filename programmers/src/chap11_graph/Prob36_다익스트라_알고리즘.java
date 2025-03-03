package chap11_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Prob36_다익스트라_알고리즘 {

	private class Node {
		int dest, cost;
		
		public Node(int dest, int cost) {
			this.dest = dest;
			this.cost = cost;
		}
	}
	
	public int[] solution(int[][] graph, int start, int n) {
		
		// 인접리스트 세팅
		ArrayList<Node>[] adjList = new ArrayList[n];
		for(int i=0; i<adjList.length; i++) adjList[i] = new ArrayList<Node>();
		
		// graph 정보를 인접리스트로 저장
		for(int[] edge : graph) adjList[edge[0]].add(new Node(edge[1], edge[2]));
		
		// 방문여부, 최적경로 세팅
		boolean[] visited = new boolean[n];
		int[] answer = new int[n];
		Arrays.fill(answer, Integer.MAX_VALUE);
		
		// 시작 노드의 거리값은 0으로 초기화
		answer[start] = 0;
		
		// 우선순위 큐 세팅
		PriorityQueue<Node> pq = new PriorityQueue<Node>((o1, o2) -> Integer.compare(o1.cost, o2.cost));
		pq.add(new Node(start, 0));
		
		while(!pq.isEmpty()) {
			
			// 현재 거리값이 가장 짧은 노드 가져오기
			Node now = pq.poll();

			// 이미 방문한 노드인 경우 처리
			if(visited[now.dest]) continue;
			
			visited[now.dest] = true;
			
			// 현재 노드에 연결된 간선들 전부 확인
			for(Node next : adjList[now.dest]) {
				
				// 세팅한 거리값보다 짧은 거리값을 발견하면 갱신하고 큐에 대입
				if(answer[next.dest] > now.cost + next.cost) {

					answer[next.dest] = now.cost + next.cost;
					pq.add(new Node(next.dest, answer[next.dest]));
				}
			}
		}
		
		return answer;
	}
}
