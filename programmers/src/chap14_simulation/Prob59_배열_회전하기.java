package chap14_simulation;

public class Prob59_배열_회전하기 {
	
	public int[][] rotateCw90(int[][] arr){
		
		int len = arr.length;
		int[][] rotatedArr = new int[len][len];
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				rotatedArr[j][len-1-i] = arr[i][j];
			}
		}
		
		return rotatedArr;
	}
	
	public int[][] solution(int[][] arr, int n) {
		for(int i=0; i<n; i++) arr = rotateCw90(arr);
		return arr;
	}
}
