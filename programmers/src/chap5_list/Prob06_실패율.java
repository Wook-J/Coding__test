package chap5_list;

import java.util.Arrays;
import java.util.HashMap;

public class Prob06_실패율 {
	
	public int[] solution(int N, int[] stages) {
		
		// 스테이지별 도전자 수
		int[] challenger = new int[N+2];
		for(int i=0; i<stages.length; i++) challenger[stages[i]] += 1;
		
		System.out.println("challenger : " + Arrays.toString(challenger));
		
		HashMap<Integer, Double> fails = new HashMap<>();
		double total = stages.length;					// 총 사용자 수
		
		for(int i=1; i<=N ; i++) {						// 1단계부터 N단계까지 실패율 계산
			
			if(challenger[i] == 0) fails.put(i, 0.);	// 도전하고 있는 사람 없는 경우
			else {										// 도전하고 있는 사람 있는 경우
				fails.put(i, challenger[i]/total);		// 실패율 대입
				total -= challenger[i];					// 다음 단계 시 인원 수 감소
			}
		}
		
		return fails.entrySet().stream()
				.sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
				.mapToInt(HashMap.Entry::getKey).toArray();
    }
}
