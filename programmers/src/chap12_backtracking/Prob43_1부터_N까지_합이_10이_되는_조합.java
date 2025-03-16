package chap12_backtracking;

import java.util.ArrayList;

public class Prob43_1부터_N까지_합이_10이_되는_조합 {
	
	private ArrayList<ArrayList<Integer>> result;
	private int n;
	
	public ArrayList<ArrayList<Integer>> solution(int N) {
		result = new ArrayList<ArrayList<Integer>>();
		n = N;
		backtrack(0, new ArrayList<Integer>(), 1);
		
		return result;
	}
	
	public void backtrack(int sum, ArrayList<Integer> selectedNums, int start) {
		if(sum == 10) {
			result.add(selectedNums);
			return;
		}
		
		for(int i = start; i <= n; i++) {
			if(sum + i <= 10) {
				ArrayList<Integer> list = new ArrayList<Integer>(selectedNums);
				list.add(i);
				backtrack(sum+i, list, i+1);
			}
		}
	}
}
