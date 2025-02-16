package chap9_tree;

import java.util.HashMap;

public class Prob27_다단계_칫솔_판매 {
	
	public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
		
		// 로직
		// 10% 이익을 들고 추천인한테 감
		// 추천인이 "-"이 될때까지 반복
		// enroll(key)-referral(value) 해시맵 사용
		// enroll(key)-이익액(value) 해시맵 사용
		
		// enroll-referral HashMap 생성 및 초기화
		HashMap<String, String> enRefMap = new HashMap<String, String>();
		for(int i=0; i<enroll.length; i++) enRefMap.put(enroll[i], referral[i]);
		
		// enroll-Amount HashMap 생성 및 초기화
		HashMap<String, Integer> enAmountMap = new HashMap<String, Integer>();
		
		// enroll-Amount에 값 세팅
		for(int i=0; i<seller.length; i++) {
			
			String member = seller[i];			// 판매자
			int revenue = amount[i] * 100;		// 판매자의 수익
			
			// referral(추천인)이 없을 때까지 상위로 수익 분배
			while(revenue > 0 && !member.equals("-")) {
				
				// 판매자의 수익 배분
				enAmountMap.put(member, enAmountMap.getOrDefault(member, 0) + revenue - (revenue/10));
				
				member = enRefMap.get(member);	// 상위 판매자에 member 대입
				revenue /= 10;					// 상위 판매자에게는 10% 수익으로 계산
			}
		}
		
		int[] answer = new int[enroll.length];
		for(int i=0; i<answer.length; i++) answer[i] = enAmountMap.getOrDefault(enroll[i], 0);
		return answer;
	}
}
