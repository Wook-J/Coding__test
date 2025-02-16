package chap5_list;

import java.util.Arrays;

public class Prob01_배열_정렬하기 {

	public int[] sol(int[] arr) {
		int[] clone = arr.clone();
		Arrays.sort(clone);
		return clone;
	}
}
