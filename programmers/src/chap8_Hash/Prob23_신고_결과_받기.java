package chap8_Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class Prob23_신고_결과_받기 {

	public int[] solution(String[] id_list, String[] report, int k) {
		
		// 로직
		// Map1 : {유저ID, id_list의 인덱스}
		// Map2 : {유저ID, 신고한ID Set} -> report 배열로 해결 가능할수도..?
		// Map3 : {신고당한 ID, 신고한 유저 ID Set}
		// List1 : 정지된 ID(Map3의 value(set)의 개수 >= k)
		// List1의 ID가 Map2의 신고한 ID에 있으면 Map1의 id_list의 인덱스를 얻어와 answer[idx]++
		
		HashMap<String, Integer> idIdxMap = new HashMap<String, Integer>();
		HashMap<String, HashSet<String>> idReportMap = new HashMap<String, HashSet<String>>();
		HashMap<String, HashSet<String>> reportedMap = new HashMap<String, HashSet<String>>();
		ArrayList<String> stoppedId = new ArrayList<String>();
		
		// idIdxMap 세팅
		for(int i=0; i<id_list.length; i++) idIdxMap.put(id_list[i], i);
		
		for(String s : report) {
			String[] arr = s.split(" ");
			
			// idReportMap 세팅
			if(!idReportMap.containsKey(arr[0])) idReportMap.put(arr[0], new HashSet<String>());
			
			HashSet<String> list = idReportMap.get(arr[0]);
			list.add(arr[1]);
			idReportMap.put(arr[0], list);
			
			// reportedMap 세팅
			if(!reportedMap.containsKey(arr[1])) reportedMap.put(arr[1], new HashSet<String>());
			
			HashSet<String> set = reportedMap.get(arr[1]);
			set.add(arr[0]);
			reportedMap.put(arr[1], set);
		}
		
		// stoppedId 세팅
		for(Entry<String, HashSet<String>> entry : reportedMap.entrySet()) {
			if(entry.getValue().size() >= k) stoppedId.add(entry.getKey());
		}
		
		int[] answer = new int [id_list.length];
		
		// 주로직1 idReortMap의 value 에 stoppedId의 data 가 포함되어 있으면
		//		   idReortMap의 key 의 index 구해서 answer[index]++;
		for(String stop : stoppedId) {
			for(Entry<String, HashSet<String>> entry : idReportMap.entrySet()) {
				if(entry.getValue().contains(stop)) {
					answer[idIdxMap.get(entry.getKey())]++;
				}
			}
		}
		
		// 주로직2 reportedMap의 key 에 stoppedId의 data 가 포함되어 있으면
		// 		   reportedMap의 value(set)의 각 data 의 index 구해서 answer[index]++;

		return answer;
	}
	
	// 책 풀이
    public int[] solution2(String[] id_list, String[] report, int k) {
    	
        // 신고당한 유저 - 신고 유저 집합을 저장할 해시맵
        HashMap<String, HashSet<String>> reportedUser = new HashMap<>();
        
        // 처리 결과 메일을 받은 유저 - 받은 횟수를 저장할 해시맵
        HashMap<String, Integer> count = new HashMap<>();

        // ❶ 신고 기록 순회
        for (String r : report) {
            String[] s = r.split(" ");
            String userId = s[0];
            String reportedId = s[1];

            if (!reportedUser.containsKey(reportedId)) { // ❷ 신고당한 기록이 없다면
                reportedUser.put(reportedId, new HashSet<>());
            }
            // ❸ 신고한 사람의 아이디를 해시맵의 value인 해시셋에 추가
            reportedUser.get(reportedId).add(userId);
        }

        for (Map.Entry<String, HashSet<String>> entry : reportedUser.entrySet()) {
            if (entry.getValue().size() >= k) { // ❹ 정지 기준에 만족하는지 확인
                for (String uid : entry.getValue()) { // ❺ 해시셋을 순회하며 count 계산
                    count.put(uid, count.getOrDefault(uid, 0) + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];

        // ❻ 각 아이디별 메일을 받은 횟수를 순서대로 정리
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = count.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
	
	
	
}
