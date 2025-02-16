package chap9_tree;

public class Prob26_예상_대진표 {

	public int solution(int n, int a, int b) {
		
		int answer = 0;
		
		// a 와 b 가 같아질 때까지 반복
		while(a != b) {
			a = (a+1) / 2;
			b = (b+1) / 2;
			answer++;
		}
		
		return answer;
	}
}
