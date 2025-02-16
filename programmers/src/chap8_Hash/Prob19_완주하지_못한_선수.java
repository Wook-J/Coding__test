package chap8_Hash;

import java.util.Arrays;
import java.util.HashMap;

public class Prob19_완주하지_못한_선수 {

	// 해시를 통한 풀이
	public String solution(String[] participant, String[] completion) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// 완주한 사람 세팅
		for(String s : completion) map.put(s, map.getOrDefault(s, 0) + 1);
		
		// 완주하지 못한 사람 찾기
		for(String notComplete : participant) {
			if(map.getOrDefault(notComplete, 0) == 0) return notComplete;	// value 가 0인 이름 반환
			map.put(notComplete, map.get(notComplete)-1);					// key 에 (기존 숫자 -1) 대입
		}
		
		return null;	// 실제로 오진 않음
	}
	
	// 원래 풀이
	public String solution2(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) return participant[i];
		}
		
		return participant[participant.length - 1];
    }
}
