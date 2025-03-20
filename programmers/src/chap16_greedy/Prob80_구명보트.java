package chap16_greedy;

import java.util.Arrays;

public class Prob80_구명보트 {
	public int solution(int[] people, int limit) {
		int answer = 0;
		int minWeightIdx = 0;
		int maxWeightIdx = people.length - 1;
		Arrays.sort(people);
		
		while(minWeightIdx <= maxWeightIdx) {
			if(people[minWeightIdx] + people[maxWeightIdx] <= limit) minWeightIdx++;
			maxWeightIdx--;
			answer++;
		}
		
		return answer;
	}
}
