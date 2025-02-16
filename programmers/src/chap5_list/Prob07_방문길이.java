package chap5_list;

import java.util.HashMap;
import java.util.HashSet;

public class Prob07_방문길이 {
	
	// static 필드
	private static HashMap<Character, int[]> location = new HashMap<>();
	
	// 초기값을 설정하는 static 메서드 (HashMap에 K-V로 저장)
	public static void initLocation() {
		location.put('U', new int[] {0, 1});
		location.put('D', new int[] {0, -1});
		location.put('L', new int[] {1, 0});
		location.put('R', new int[] {-1, 0});
	}
	
	// 주어진 좌표평면 이내인지 확인하는 static 메서드(조건 충족시 true 반환)
	public static boolean isVaildMove(int nx, int ny) {
		return 0<=nx && nx<11 && 0<=ny && ny<11; 
	}
	
	// 실제 구현되는 메서드
	public int solution(String dirs) {
		
		initLocation();
		
		int x = 5;
		int y = 5;
		
		HashSet<String> answer = new HashSet<>();
		
		for(int i=0; i<dirs.length(); i++) {
			
			int[] offset = location.get(dirs.charAt(i));
			int nx = x + offset[0];
			int ny = y + offset[1];
			
			if(!isVaildMove(nx, ny)) continue;	// 조건 미충족 시 아래코드 패스
			
			answer.add(x + " " + y + " "+ nx + " " + ny);	// a -> b 방향
			answer.add(nx + " " + ny + " "+ x + " " + y);	// b -> a 방향(Set 이므로 한번에 둘 다 넣기)
			x = nx;
			y = ny;
		}
		
		return answer.size()/2;
    }
	
}
