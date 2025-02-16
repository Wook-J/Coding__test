package chap8_Hash;

import java.util.ArrayList;
import java.util.HashMap;

public class Prob21_오픈채팅방 {
	
	public String[] solution(String[] record) {
		
		ArrayList<String[]> behaviorIdList =  new ArrayList<String[]>();
		HashMap<String, String> idNicknameMap = new HashMap<String, String>();
		
		for(String a : record) {
			
			String[] arr = a.split(" ");

			if(arr[0].equals("Enter")) {
				behaviorIdList.add(new String[] {arr[0], arr[1]});
				idNicknameMap.put(arr[1], arr[2]);
				
			} else if(arr[0].equals("Leave")) {
				behaviorIdList.add(new String[] {arr[0], arr[1]});
				
			} else {
				idNicknameMap.put(arr[1], arr[2]);
			}
		}
		
		ArrayList<String> answerList = new ArrayList<String>();
		
		for(String[] behaviorId : behaviorIdList) {
			
			if(behaviorId[0].equals("Enter")) {
				answerList.add(idNicknameMap.get(behaviorId[1]) + "님이 들어왔습니다.");
				
			} else if(behaviorId[0].equals("Leave")) {
				answerList.add(idNicknameMap.get(behaviorId[1]) + "님이 나갔습니다.");
			}
		}
		
		return answerList.toArray(new String[0]);	// Stirng[0] : ArrayList 크기 기반으로 자동 생성
	}
}
