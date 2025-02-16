package chap8_Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Prob24_메뉴_리뉴얼 {
	
	// 메뉴개수, (개수에 따른 메뉴종류, 주문횟수) 저장할 필드
	private HashMap<Integer, HashMap<String, Integer>> courseMap;
	
	// 조합법 메서드 (재귀함수 이용)
	public void combinations(int idx, char[] order, String result) {
		
		// courseMap에 요리개수에 해당하는 key 가 있는 경우
		if(courseMap.containsKey(result.length())) {
			HashMap<String, Integer> map = courseMap.get(result.length());	// 그 길이에 해당하는 map 얻어오기
			map.put(result, map.getOrDefault(result, 0) + 1);				// 같은 요리의 주문횟수 1 추가
		}
		
		// 개수가 0인 경우부터 재귀함수 반복
		for(int i=idx; i<order.length; i++) {
			combinations(i+1, order, result + order[i]);
		}
	}
	
	// 주 메서드
	public String[] solution(String[] orders, int[] course) {
		
		// 기본 세팅(초기화)
		courseMap = new HashMap<Integer, HashMap<String,Integer>>();
		for(int i : course) courseMap.put(i, new HashMap<String, Integer>());
		
		// 주문한 메뉴를 오름차순 정리 후 조합법 메서드 이용하여 세팅
		for(String order : orders) {
			char[] orderArr = order.toCharArray();
			Arrays.sort(orderArr);
			combinations(0, orderArr, "");
		}
		
		ArrayList<String> answerList = new ArrayList<String>();
		
		// 모든 조합 메서드에 대해 순회
		for(HashMap<String, Integer> count : courseMap.values()) {
			
			// 각 메뉴의 주문 수에 대해 스트림 만든 후
			// 가장 빈도수가 높은 코스를 찾고
			// 위 코스가 있을 경우에만 count 의 entrySet에 대해 스트림 만든 후
			//     count 의 entrySet 중 주문횟수가 같고 2명이상 주문한 경우에
			//	   그 코스메뉴(entrySet의 key)를 answerList에 추가
			count.values().stream()
			.max(Comparator.comparingInt(o -> o))
			.ifPresent(cnt -> count.entrySet().stream()
					.filter(entry -> cnt.equals(entry.getValue()) && cnt>1)
					.forEach(entry -> answerList.add(entry.getKey())));
		}
		
		// answerList(String 모아놓은 리스트)를 오름차순 정렬
		Collections.sort(answerList);
		
		return answerList.toArray(new String[0]);
	}

}
