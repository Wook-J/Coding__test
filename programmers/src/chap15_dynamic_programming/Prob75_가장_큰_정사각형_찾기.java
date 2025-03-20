package chap15_dynamic_programming;

public class Prob75_가장_큰_정사각형_찾기 {
	
	public int solution(int [][] board) {
		int row = board.length;
		int col = board[0].length;
		
		for(int i=1; i<row; i++) {
			for(int j=1; j<col; j++) {
				if(board[i][j] == 1) {
					int up = board[i-1][j];
					int left = board[i][j-1];
					int upLeft = board[i-1][j-1];
					
					if(up > 0 && left > 0 && upLeft > 0) {
						board[i][j] = Math.min(up, Math.min(left, upLeft)) + 1;
					}
				}
			}
		}
		
		int answer = 0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) answer = Math.max(answer, board[i][j]);
		}
		
		return answer * answer;
    }
}
