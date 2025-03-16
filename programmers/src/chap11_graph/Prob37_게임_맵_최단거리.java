package chap11_graph;

import java.util.ArrayDeque;

public class Prob37_게임_맵_최단거리 {
	
	private final int[] rx = {0, 0, 1, -1};
	private final int[] ry = {1, -1, 0, 0};
	
	private class Node{
		int row, col;
		
		public Node(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}
	
	public int solution(int[][] maps) {
		int N = maps.length;		// 행(row)의 개수
		int M = maps[0].length;		// 열(column)의 개수
		
		int[][] dist = new int[N][M];
		
		ArrayDeque<Node> queue = new ArrayDeque<Node>();
		queue.add(new Node(0, 0));
		dist[0][0] = 1;
		
		while(!queue.isEmpty()) {
			Node now = queue.pollFirst();						// LIFO 순으로 데이터 빼오기
			
			for(int i=0; i<4; i++) {
				int nr = now.row + rx[i];
				int nc = now.col + ry[i];
				
				if(nr<0 || nc<0 || nr>=N || nc>=M) continue;	// 맵 밖으로 나가는 경우
				if(maps[nr][nc] == 0) continue;					// 벽으로 가는 경우
				
				if(dist[nr][nc] == 0) {							// 처음 지나가는 경우
					queue.addLast(new Node(nr, nc));
					dist[nr][nc] = dist[now.row][now.col]+1;
				}
			}
		}
		
		return dist[N-1][M-1] == 0 ? -1 : dist[N-1][M-1];		// dist 의 마지막 값을 0과 비교
	}
}
