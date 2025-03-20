package chap16_greedy;

import java.util.ArrayList;

public class Prob77_거스름돈_주기 {

	public int[] solution(int amount) {
		int[] changeArr = {100, 50, 10, 1};
		ArrayList<Integer> changeList = new ArrayList<Integer>();
		
		for(int change : changeArr) {
			while(amount >= change) {
				changeList.add(change);
				amount -= change;
			}
		}
		return changeList.stream().mapToInt(Integer::intValue).toArray();
	}
}
