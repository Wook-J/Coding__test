package chap12_backtracking;

import java.util.Arrays;

public class Prob48_외벽_점검 {
	
	private int circumference;
	private int answer;
	private int[] weak;
	private boolean[] used;
	
	public boolean check(int[] dist) {
		
		for(int i=0; i<circumference; i++) {
			
			int idx = i;
			
			for(int distance : dist) {
				int position = weak[idx++] + distance;
				while(idx < weak.length && weak[idx] <= position) idx++;
			}
			
			if(idx - i >= circumference) return true;
		}
		
		return false;
	}
	
	public void backtrack(int n, int[] dist, int[] org) {
		if (n == org.length) {
			if(check(dist)) answer = n;
			return;
		}
		
		for(int i=0; i<org.length; i++) {
			if(!used[i]) {
				
				used[i] = true;
				dist[n] = org[i];
				
				backtrack(n+1, dist, org);
				
				used[i] = false;
			}
		}
	}
	
	public int solution(int n, int[] weak, int[] dist) {
		
		// 전역변수 int circumference, int[] weak 세팅
		circumference = weak.length;
		this.weak = new int[2*circumference];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<circumference; j++) {
				this.weak[j+(i*circumference)] = weak[j] + (i*n);
			}
		}
		
		// 전역변수 int answer, boolean[] used 세팅
		answer = -1;
		used = new boolean[dist.length];
		
		// 친구들의 이동가능한 거리를 오름차순 정리
		Arrays.sort(dist);
		
		// 멀리이동할 수 있는 i명의 이동거리 배열(org) 복사 후 백트래킹 
		for(int i=1; i <= dist.length; i++) {
			int[] org = new int[i];
			System.arraycopy(dist, dist.length-i, org, 0, i);
			backtrack(0, new int[i], org);
			if(answer > 0) break;
		}
		
		return answer;
	}
}
