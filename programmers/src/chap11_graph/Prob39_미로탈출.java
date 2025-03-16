package chap11_graph;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Prob39_미로탈출 {
	
	private int[] dx = {0, 0, -1, 1};
	private int[] dy = {-1, 1, 0, 0};
	
	private class Point{
		int nx, ny;
		public Point(int nx, int ny) {
			this.nx = nx;
			this.ny = ny;
		}
	}
	
	private char[][] map;
	private int N;
	private int M;

	public int solution(String[] maps) {
		N = maps.length;			// Y축 방향, 행(row)의 개수
		M = maps[0].length();		// X축 방향, 열(column)의 개수
		
		map = new char[N][M];
		for(int i=0; i<N; i++) map[i] = maps[i].toCharArray();
		
		Point start = null;
		Point end = null;
		Point lever = null;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 'S') start = new Point(j, i);
				else if(map[i][j] == 'E') end = new Point(j, i);
				else if(map[i][j] == 'L') lever = new Point(j, i);
			}
		}
		
		int startToLever = bfs(start, lever);
		int leverToEnd = bfs(lever, end);
		
		if(startToLever==-1 || leverToEnd ==-1) return -1;
		else return startToLever + leverToEnd;
	}
	
	// 너비우선탐색 메서드
	public int bfs(Point start, Point end) {
		
		int[][] dist = new int[N][M];
		ArrayDeque<Point> queue = new ArrayDeque<Point>();
		
		dist[start.ny][start.nx] = 1;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			Point now = queue.pollFirst();
			
			for(int i=0; i<4; i++) {
				int nextX = now.nx + dx[i];
				int nextY = now.ny + dy[i];
				
				if(nextX<0 || nextX >=M || nextY<0 || nextY>=N) continue;
				if(dist[nextY][nextX] > 0) continue;
				if(map[nextY][nextX] == 'X') continue;
				
				dist[nextY][nextX] = dist[now.ny][now.nx] + 1;
				queue.add(new Point(nextX, nextY));
				
				if(nextX == end.nx && nextY == end.ny) return dist[end.ny][end.nx] - 1;
			}
		}
		
		return -1;
	}
}
