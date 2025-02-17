package chap9_tree;

import java.util.Arrays;

public class RunTree {

	public static void main(String[] args) {
		
		Prob29_길_찾기_게임 prob29 = new Prob29_길_찾기_게임();
		
		int[][] nodeinfo = {{5,3}, {11,5}, {13,3}, {3,5}, {6,1}, {1,3}, {8,6}, {7,2}, {2,2}};
		System.out.println(Arrays.deepToString(prob29.solution(nodeinfo)));
		
//		Prob28_양과_늑대 prob28 = new Prob28_양과_늑대();
//				
//		int[] info1 = {0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1};
//		int[][] edges1 = {{0,1},{1,2},{1,4},{0,8},{8,7},{9,10},{9,11},{4,3},{6,5},{4,6},{8,9}};
//		System.out.println(prob28.solution(info1, edges1));
//		
//		int[] info2 = {0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0};
//		int[][] edges2 = {{0,1},{0,2},{1,3},{1,4},{2,5},{2,6},{3,7},{4,8},{6,9},{9,10}};
//		System.out.println(prob28.solution(info2, edges2));
		
//		Prob27_다단계_칫솔_판매 prob27 = new Prob27_다단계_칫솔_판매();
//		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
//		String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
//		String[] seller = {"young", "john", "tod", "emily", "mary"};
//		int[] amount = {12, 4, 2, 5, 10};
//		
//		System.out.println(Arrays.toString(prob27.solution(enroll, referral, seller, amount)));
		
//		Prob26_예상_대진표 prob26 = new Prob26_예상_대진표();
//		System.out.println(prob26.solution(8, 4, 7));
		
//		Prob25_트리_순회 prob25 = new Prob25_트리_순회();
//		
//		int[] nodes = {1, 2, 3, 4, 5, 6, 7};
//		System.out.println(Arrays.toString(prob25.solution(nodes)));

	}

}
