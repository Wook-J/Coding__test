package chap8_Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Prob22_베스트앨범 {

	public int[] solution(String[] genres, int[] plays) {
		
		// 장르별 전체 재생횟수 모아놓은 Map
		HashMap<String, Integer> genreTotalMap = new HashMap<String, Integer>();
		
		// 장르에 따른 {고유번호, 재생횟수} 모아놓은 List 저장하는 Map
		HashMap<String, ArrayList<int[]>> genreIdxPlayMap = new HashMap<String, ArrayList<int[]>>();
		
		for(int i=0; i<genres.length; i++) {
			
			String genre = genres[i];
			int play = plays[i];
			
			// genre 처음 생성 시 에러 방지 구문
			if(!genreIdxPlayMap.containsKey(genre)) {
				genreTotalMap.put(genre, 0);
				genreIdxPlayMap.put(genre, new ArrayList<int[]>());
			}
			
			genreTotalMap.put(genre, genreTotalMap.get(genre) + play);	// 장르별 전체 재생횟수 구하기
			genreIdxPlayMap.get(genre).add(new int[] {i, play});		// 장르별 {고유번호, 재생횟수} 추가
		}
		
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		
		// genreTotalMap을 전체횟수 기준 내림차순 정리(entrySet를 data 로 Stream 화하여 진행)
		Stream<Map.Entry<String, Integer>> sortedGenre = genreTotalMap.entrySet().stream()
				.sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));

		// 장르별 전체 재생횟수 기준으로 내림차순 정렬된 스트림에서 forEach구문 수행 
		sortedGenre.forEach(entry -> {
			
			// entry에서 key(장르)를 얻고 그 키를 기준으로 genreIdxPlayMap에서 value(ArrayList<int[]>) 얻기
			// 인덱스 1번(재생횟수)를 기준으로 data(ArrayList<int[]>) 내림차순 정리
			// 최대 2개만 얻어오기
			Stream<int[]> sortedSongs = genreIdxPlayMap.get(entry.getKey()).stream()
					.sorted((o1, o2) -> Integer.compare(o2[1], o1[1]))
					.limit(2);
			
			// 위에서 얻어오는 스트림 기준으로 answerList에 고유번호 추가
			sortedSongs.forEach(song -> answerList.add(song[0]));
		});
		
		return answerList.stream().mapToInt(Integer::intValue).toArray();
	}
	
}
