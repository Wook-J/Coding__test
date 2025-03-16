package chap11_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Prob40_배달 {
	
	private class Node{
		int destination, cost;
		
		public Node(int destination, int cost) {
			this.destination = destination;
			this.cost = cost;
		}
	}
	
	public int solution(int N, int[][] road, int K) {
		
		ArrayList<Node>[] adjList = new ArrayList[N+1];
		for(int i=1; i<=N; i++) adjList[i] = new ArrayList<Node>();

		// 방향성 없으므로 양방향으로 추가
		for(int[] edge : road) {
			adjList[edge[0]].add(new Node(edge[1], edge[2]));
			adjList[edge[1]].add(new Node(edge[0], edge[2]));
		}
		
		int[] costArr = new int[N+1];
		Arrays.fill(costArr, 987654321);
		
		PriorityQueue<Node> pq = new PriorityQueue<Node>((o1, o2) -> Integer.compare(o1.cost, o2.cost));
		pq.add(new Node(1, 0));
		costArr[1] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(costArr[now.destination] < now.cost) continue;
			
			for(Node next : adjList[now.destination]) {
				if(costArr[next.destination] > now.cost + next.cost) {
					costArr[next.destination] = now.cost + next.cost;
					pq.add(new Node(next.destination, costArr[next.destination]));
				}
			}
		}
		
		int answer = 0;
		for(int i=1; i<=N; i++) {
			if(costArr[i] <= K) answer++;
		}
		
		return answer;
	}
}
