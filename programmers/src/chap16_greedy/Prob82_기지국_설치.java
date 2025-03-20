package chap16_greedy;

public class Prob82_기지국_설치 {

	public int solution(int n, int[] stations, int w) {
		int cnt = 0;
		int stationIdx = 0;
		int location = 1;
		
		while(location <= n) {
			if(stationIdx < stations.length && location >= stations[stationIdx] - w) {
				location = stations[stationIdx] + w + 1;
				stationIdx++;
				
			} else {
				location += 2 * w +1;
				cnt++;
			}
		}
		
		return cnt;
    }
}
