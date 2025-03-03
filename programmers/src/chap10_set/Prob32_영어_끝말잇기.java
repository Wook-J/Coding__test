package chap10_set;

import java.util.HashSet;

public class Prob32_영어_끝말잇기 {
	
	public int[] solution(int n, String[] words) {
		
		int[] answer = new int[2];
		HashSet<String> wordSet = new HashSet<String>();
		
		wordSet.add(words[0]);
		
		for(int i=1; i<words.length; i++) {
			if(wordSet.contains(words[i]) || words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {			
				answer[0] = i%n + 1;
				answer[1] = i/n + 1;
				break;
			}
			
			wordSet.add(words[i]);
		}

		return answer;
    }
}
