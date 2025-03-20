package chap14_simulation;

import java.util.HashMap;

public class Prob66_캐릭터의_좌표 {
	
	private int width;
	private int height;
	
	public boolean isValid(int x, int y, int dx, int dy) {
		return Math.abs(x+dx) <= width && Math.abs(y+dy) <= height;
	}
	
	public int[] solution(String[] keyinput, int[] board) {
		width = board[0] / 2;
		height = board[1] / 2;
		
		int x = 0;
		int y = 0;
		
		HashMap<String, int[]> map = new HashMap<String, int[]>();
		map.put("up", new int[] {0, 1}); 
		map.put("down", new int[] {0, -1}); 
		map.put("left", new int[] {-1, 0}); 
		map.put("right", new int[] {1, 0});
		
		for(String key : keyinput) {
			int dx = map.get(key)[0];
			int dy = map.get(key)[1];
			
			if(isValid(x, y, dx, dy)) {
				x += dx;
				y += dy;
			}
		}
		
		return new int[] {x, y};
	}
}
