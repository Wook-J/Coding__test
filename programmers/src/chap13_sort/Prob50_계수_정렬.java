package chap13_sort;

public class Prob50_계수_정렬 {
	
	public String solution(String s) {
		int[] counts = new int[26];
		for(char c : s.toCharArray()) counts[c-'a']++;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<26; i++) {
			for(int j=0; j<counts[i]; j++) sb.append((char)(i+'a'));
		}
		
		return sb.toString();
	}
}
