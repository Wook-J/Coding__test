package chap9_tree;

import java.util.Arrays;

public class RunTree {

	public static void main(String[] args) {
		
		Prob27_다단계_칫솔_판매 prob27 = new Prob27_다단계_칫솔_판매();
		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
		String[] seller = {"young", "john", "tod", "emily", "mary"};
		int[] amount = {12, 4, 2, 5, 10};
		
		System.out.println(Arrays.toString(prob27.solution(enroll, referral, seller, amount)));
		
//		Prob26_예상_대진표 prob26 = new Prob26_예상_대진표();
//		System.out.println(prob26.solution(8, 4, 7));
		
//		Prob25_트리_순회 prob25 = new Prob25_트리_순회();
//		
//		int[] nodes = {1, 2, 3, 4, 5, 6, 7};
//		System.out.println(Arrays.toString(prob25.solution(nodes)));

	}

}
