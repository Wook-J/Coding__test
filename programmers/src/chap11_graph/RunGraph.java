package chap11_graph;

import java.util.Arrays;

public class RunGraph {

	public static void main(String[] args) {
		
		Prob36_다익스트라_알고리즘 prob36 = new Prob36_다익스트라_알고리즘();
		
		int[][] graph1 = {{0, 1, 9}, {0, 2, 3}, {1, 0, 5}, {2, 1, 1}};
		int[][] graph2 = {{0, 1, 1}, {1, 2, 5}, {2, 3, 1}};
		
		System.out.println(Arrays.toString(prob36.solution(graph1, 0, 3)));
		System.out.println(Arrays.toString(prob36.solution(graph2, 0, 4)));
		
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
//		int start1 = 1;
//		System.out.println(Arrays.toString(prob34.solution(graph1, start1, 5)));
//		
//		int[][] graph2 = {{1, 2}, {1, 3}, {2, 4}, {2, 5} ,{3, 6}, {5, 6}};
//		int start2 = 1;
//		System.out.println(Arrays.toString(prob34.solution(graph2, start2, 6)));
	}

}
