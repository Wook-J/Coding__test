package chap14_simulation;

public class Prob61_달팽이_수열_만들기 {
	
	public int[][] solution(int n){
		int[][] answer = new int[n][n];
		int cellNum = 1;
		
		int startRow = 0;
		int endRow = n-1;
		int startCol = 0;
		int endCol = n-1;
		
		while(startRow <= endRow && startCol <= endCol) {
			
			// 위쪽행에서 왼쪽 -> 오른쪽 으로 채워지는 경우
			for(int i=startCol; i<=endCol; i++) answer[startRow][i] = cellNum++;
			startRow++;
			
			// 오른쪽행에서 위쪽 -> 아래쪽 으로 채워지는 경우
			for(int i=startRow; i<=endRow; i++) answer[i][endCol] = cellNum++;
			endCol--;
			
			// 아래쪽행에서 오른쪽 -> 왼쪽 으로 채워지는 경우
			if(startRow <= endRow) {
				for(int i=endCol; i>=startCol; i--) answer[endRow][i] = cellNum++;
				endRow--;
			}
			
			// 왼쪽행에서 아래쪽 -> 위쪽 으로 채워지는 경우
			if(startCol <= endCol) {
				for(int i=endRow; i>=startRow; i--) answer[i][startCol] = cellNum++;
				startCol++;
			}
		}
		return answer;
	}

}
