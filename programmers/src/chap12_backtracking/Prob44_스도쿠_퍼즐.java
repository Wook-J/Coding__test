package chap12_backtracking;

import java.util.Arrays;

public class Prob44_스도쿠_퍼즐 {
	
	private class Block{
		int i, j;
		
		public Block(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}
	
	private int[][] result;
	
	public int[][] solution(int[][] board){
		
		result = board;
		findSolution();
		
		return result;
	}
	
	public boolean findSolution() {
		Block emptyPos = findEmptyPosition();
		
		// 빈칸이 없으면 스도쿠가 해결된 것으로 간주
		if(emptyPos == null) return true;
		
		int row = emptyPos.i;
		int col = emptyPos.j;
		
		for(int num = 1; num <= 9; num++) {
			if(isValid(num, row, col)) {
				result[row][col] = num;
				
				if(findSolution()) return true;
				
				result[row][col] = 0;
			}
		}
		return false;
	}
	
	public Block findEmptyPosition() {
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(result[i][j] == 0) return new Block(i, j);
			}
		}
		
		return null;
	}
	
	public boolean isValid(int num, int row, int col) {
		return !(inRow(num, row) || inCol(num, col) || inBox(num, row, col));
	}
	
	// 해당 row(행)에 num 이 있는지 확인
	public boolean inRow(int num, int row) {
		return Arrays.stream(result[row]).anyMatch(n -> n == num);
	}
	
	// 해당 col(열)에 num 이 있는지 확인
	public boolean inCol(int num, int col) {
		for(int i=0; i<9; i++) {
			if(result[i][col] == num) return true;
		}
		
		return false;
	}

	// 현재 위치의 3x3 박스에 num이 있는지 확인
	public boolean inBox(int num, int row, int col) {
		int boxRow = (row/3) * 3;
		int boxCol = (col/3) * 3;
		
		for(int i=boxRow; i<boxRow+3; i++) {
			for(int j=boxCol; j<boxCol+3; j++) {
				if(result[i][j] == num) return true;
			}
		}
		
		return false;
	}

}
