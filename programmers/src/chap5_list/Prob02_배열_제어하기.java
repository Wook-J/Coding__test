package chap5_list;

import java.util.Arrays;
import java.util.Collections;

public class Prob02_배열_제어하기 {

	public int[] sol(int[] arr) {
		Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);	// 중복 제거
		Arrays.sort(result, Collections.reverseOrder());									// 내림차순
		return Arrays.stream(result).mapToInt(Integer::intValue).toArray();					// int형 변환
	}
}
