package chap14_simulation;

public class Prob64_카펫 {
	public int[] solution(int brown, int yellow) {

		for(int i=1; i<=Math.sqrt(yellow); i++) {
			if(yellow % i == 0) {
				if((i + (yellow / i)) * 2 + 4 == brown) return new int[] {(yellow / i) + 2, i + 2};
			}
		}
		
		return new int[2];
	}
}
