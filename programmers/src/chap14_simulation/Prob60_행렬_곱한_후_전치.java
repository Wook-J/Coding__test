package chap14_simulation;

public class Prob60_행렬_곱한_후_전치 {
	
	public int[][] multipliMatrix(int[][] arr1, int[][] arr2){
		int[][] result = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) result[i][j] += arr1[i][k] * arr2[k][j];
			}
		}
		
		return result;
	}
	
	public int[][] transposeMatrix(int[][] arr){
		int[][] result = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) result[j][i] = arr[i][j];
		}
		
		return result;
	}
	
	public int[][] solution(int[][] arr1, int[][] arr2){
		int[][] answer = multipliMatrix(arr1, arr2);
		answer = transposeMatrix(answer);
		return answer;
	}
}
