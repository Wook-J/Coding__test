package chap5_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob04_모의고사 {

	public int[] sol(int[] answers) {
		
		int[][] pattern = {
			{1, 2, 3, 4, 5},
			{2, 1, 2, 3, 2, 4, 2, 5},
			{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
		};
		
		int[] scores = new int[3];
		
		for(int i=0; i<answers.length; i++) {
			for(int j=0; j<pattern.length; j++) {
				// 실제 답과 j번째 사람이 적은 답이 일치하면 j번째 사람의 점수 추가
				if(answers[i] == pattern[j][i%pattern[j].length]) scores[j]++;
			}
		}
		
		int maxScore = Arrays.stream(scores).max().getAsInt();
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<scores.length; i++) {
			if(scores[i] == maxScore) answer.add(i+1);
		}
		
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
	
}
