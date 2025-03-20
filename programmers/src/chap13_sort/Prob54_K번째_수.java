package chap13_sort;

import java.util.Arrays;

public class Prob54_K번째_수 {

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		int idx = 0;
		
		for(int[] command : commands) {
			
			int[] arr = new int[command[1]-command[0]+1];
			
			for(int i=0; i<command[1]-command[0]+1; i++) {
				arr[i] = array[i+command[0]-1]; 
			}
			
			Arrays.sort(arr);
			
			answer[idx++] = arr[command[2]-1];
		}
		
		return answer;
	}
	
	public int[] solution2(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int c=0; c<commands.length; c++) {
			int firstIdx = commands[c][0];
			int lastIdx = commands[c][1];
			int element = commands[c][2];
			
			int[] sliceArr = Arrays.copyOfRange(array, firstIdx-1, lastIdx);
			
			Arrays.sort(sliceArr);
			answer[c] = sliceArr[element-1];
		}
		
		return answer;
	}
}
