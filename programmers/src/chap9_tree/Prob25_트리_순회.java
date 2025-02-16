package chap9_tree;

public class Prob25_트리_순회 {

	public String[] solution(int[] nodes) {
		
		String[] answer = new String[3];
		
		// .trim() : 앞뒤의 빈문자열 제거
		answer[0] = preorder(nodes, 0).trim();
		answer[1] = inorder(nodes, 0).trim();
		answer[2] = postorder(nodes, 0).trim();
		
		return answer;
	}
	
	// 전위 순회
	public String preorder(int[] nodes, int idx) {
		
		if(idx >= nodes.length) return "";	// 길이를 초과할 경우 빈 문자열 반환
		
		// 부모노드, 왼쪽 자식노드, 오른쪽 자식노드 순으로 순회
		return nodes[idx] + " " + preorder(nodes, 2*idx+1) + preorder(nodes, 2*idx+2);
	}
	
	// 중위 순회
	public String inorder(int[] nodes, int idx) {
		
		if(idx >= nodes.length) return "";	// 길이를 초과할 경우 빈 문자열 반환
		
		// 왼쪽 자식노드, 부모노드, 오른쪽 자식노드 순으로 순회
		return inorder(nodes, 2*idx+1) + nodes[idx] + " " + inorder(nodes, 2*idx+2);
	}
	
	// 후위 순회
	public String postorder(int[] nodes, int idx) {
		
		if(idx >= nodes.length) return "";	// 길이를 초과할 경우 빈 문자열 반환
		
		// 왼쪽 자식노드, 오른쪽 자식노드, 부모노드 순으로 순회
		return postorder(nodes, 2*idx+1) + postorder(nodes, 2*idx+2) + nodes[idx] + " ";
		
	}
}
