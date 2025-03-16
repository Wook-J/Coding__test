package chap11_graph;

import java.util.Arrays;

public class RunGraph {

	public static void main(String[] args) {
		
		Prob41_경주로_건설 prob41 = new Prob41_경주로_건설();
		
		int[][] board1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
		int[][] board2 = {{0, 0, 1, 0}, {0, 0, 0, 0}, {0, 1, 0, 1}, {1, 0, 0, 0}};
		
		System.out.println(prob41.solution(board1));
		System.out.println(prob41.solution(board2));
		
//		Prob40_배달 prob40 = new Prob40_배달();
//		
//		int[][] road1 = {{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}};
//		int[][] road2 = {{1, 2, 1}, {1, 3, 2}, {2, 3, 2}, {3, 4, 3}, {3, 5, 2}, {3, 5, 3}, {5, 6, 1}};
//		
//		System.out.println(prob40.solution(5, road1, 3));
//		System.out.println(prob40.solution(6, road2, 4));
		
//		Prob39_미로탈출 prob39 = new Prob39_미로탈출();
//		
//		String[] maps1 = {"SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE"};
//		String[] maps2 = {"LOOXS", "OOOOX", "OOOOO", "OOOOO", "EOOOO"};
//		
//		System.out.println(prob39.solution(maps1));
//		System.out.println(prob39.solution(maps2));
		
		
//		Prob38_네트워크 prob38 = new Prob38_네트워크();
//		
//		int[][] computers1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
//		int[][] computers2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
//		
//		System.out.println(prob38.solution(3, computers1));
//		System.out.println(prob38.solution(3, computers2));
		
//		Prob37_게임_맵_최단거리 prob37 = new Prob37_게임_맵_최단거리();
//		
//		int[][] maps1 = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
//		int[][] maps2 = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
//		
//		System.out.println(prob37.solution(maps1));
//		System.out.println(prob37.solution(maps2));
		
//		Prob36_다익스트라_알고리즘 prob36 = new Prob36_다익스트라_알고리즘();
//		
//		int[][] graph1 = {{0, 1, 9}, {0, 2, 3}, {1, 0, 5}, {2, 1, 1}};
//		int[][] graph2 = {{0, 1, 1}, {1, 2, 5}, {2, 3, 1}};
//		
//		System.out.println(Arrays.toString(prob36.solution(graph1, 0, 3)));
//		System.out.println(Arrays.toString(prob36.solution(graph2, 0, 4)));
		
//		Prob35_너비_우선_탐색_순회 prob35 = new Prob35_너비_우선_탐색_순회();
//		
//		int[][] graph1 = {{1, 2}, {1, 3} ,{2, 4}, {2, 5}, {3, 6}, {3, 7}, {4, 8}, {5, 8}, {6, 9}, {7, 9}};
//		int[][] graph2 = {{1, 3}, {3, 4}, {3, 5}, {5, 2}};
//		
//		System.out.println(Arrays.toString(prob35.solution(graph1, 1, 9)));
//		System.out.println(Arrays.toString(prob35.solution(graph2, 1, 5)));
		
//		Prob34_깊이_우선_탐색_순회 prob34 = new Prob34_깊이_우선_탐색_순회();
//		
//		int[][] graph1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
//		int[][] graph2 = {{1, 2}, {1, 3}, {2, 4}, {2, 5} ,{3, 6}, {5, 6}};
//
//		System.out.println(Arrays.toString(prob34.solution(graph1, 1, 5)));
//		System.out.println(Arrays.toString(prob34.solution(graph2, 1, 6)));
	}

}
