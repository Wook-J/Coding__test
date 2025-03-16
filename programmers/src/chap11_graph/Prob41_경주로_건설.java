package chap11_graph;

import java.util.ArrayDeque;

public class Prob41_경주로_건설 {
	
	private class Node{
		int x, y, direction, cost;
		
		public Node(int x, int y, int direction, int cost) {
			this.x = x;
			this.y = y;
			this.direction = direction;
			this.cost = cost;
		}
	}
	
	// (0, -1), (-1, 0), (0, 1), (1, 0) 순서로 코너계산
	private static final int[] rx = {0, -1, 0, 1};
	private static final int[] ry = {-1, 0, 1, 0};
	
	private static int N;
	private static int[][][] visited;
	
	public boolean isValid(int x, int y) {
		return 0<=x && x<N && 0<=y && y<N;
	}
	
	// 벽에 막혀있는지 확인하는 메서드
	public boolean isBlocked(int[][] board, int x, int y) {
		return (x==0 && y==0) || !isValid(x, y) || board[x][y]==1;
	}
	
	public int calculateCost(int direction, int prevDirection, int cost) {
		if(prevDirection==-1 || (prevDirection-direction)%2==0) return cost+100;
		return cost+600;
	}
	
	public boolean shouldUpdate(int x, int y, int direction, int newCost) {
		return visited[x][y][direction]==0 || visited[x][y][direction]>newCost;
	}
	
	public int solution(int[][] board) {
		
		ArrayDeque<Node> queue = new ArrayDeque<Node>();
		queue.add(new Node(0, 0, -1, 0));
		N = board.length;
		visited = new int [N][N][4];
		
		int answer = Integer.MAX_VALUE;
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			for(int i=0; i<4; i++) {
				int newX = now.x + rx[i];
				int newY = now.y + ry[i];
				
				if(isBlocked(board, newX, newY)) continue;
				
				int newCost = calculateCost(i, now.direction, now.cost);
				
				if(newX==N-1 && newY==N-1) {
					answer = Math.min(answer, newCost);
					
				} else if(shouldUpdate(newX, newY, i, newCost)) {
					queue.add(new Node(newX, newY, i, newCost));
					visited[newX][newY][i] = newCost;
				}
			}
		}
		
		return answer;
	}
}
