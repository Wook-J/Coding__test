package chap9_tree;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob29_길_찾기_게임 {

	// Node 클래스 정의
	private static class Node {
		
		int x, y, num;		// 노드의 x, y 좌표, 번호
		Node left, right;	// 노드의 자식 노드(왼쪽, 오른쪽)
		
		// 매개변수 생성자(자식 노드는 별도 X -> 초기 상태 null)
		public Node(int num, int x, int y) {
			this.num = num;
			this.x = x;
			this.y = y;
		}
	}
	
	// 이진트리 생성 메서드(루트 노드 반환)
	public static Node makeBT(int[][] nodeinfo) {
		
		// 요소가 Node 객체인 배열 생성
		Node[] nodes = new Node[nodeinfo.length];
		
		// 각 노드에 대한 x, y 좌표, 번호를 저장
		for(int i=0; i<nodeinfo.length; i++) {
			nodes[i] = new Node(i+1, nodeinfo[i][0], nodeinfo[i][1]);
		}
		
		// y 좌표 기준 내림차순 정렬/ y 좌표 같으면 x 좌표 기준 오름차순 정렬
		Arrays.sort(nodes, (o1, o2) -> {
			if(o1.y == o2.y) return Integer.compare(o1.x, o2.x);
			return Integer.compare(o2.y, o1.y);
		});
		
		Node root = nodes[0];	// 루트 노드(nodes 이 정렬된 후)
		
		for(int i=1; i<nodes.length; i++) {
			
			Node parent = root;
			
			// 각 Node 객체의 left, right 노드 세팅
			while(true) {
				
				if(nodes[i].x < parent.x) {			// 자식노드의 x 좌표가 부모노드의 x 좌표보다 작은 경우
					if(parent.left == null) {		// 부모노드의 left 가 비어있다면 자식노드 채우고 break
						parent.left = nodes[i];
						break;
					} else parent = parent.left;	// 부모노드의 left 가 있다면 변경하고 다시 반복
					
				} else {							// 자식노드의 x 좌표가 부모노드의 x 좌표보다 큰 경우
					if(parent.right == null) {		// 부모노드의 right 가 비어있다면 자식노드 채우고 break
						parent.right = nodes[i];
						break;
					} else parent = parent.right;	// 부모노드의 right 가 있다면 변경하고 다시 반복
				}
			}
		}
		
		return nodes[0];							// 루트노드 반환
	}
	
	// 전위 순회 메서드(재귀)
	public static void preOrder(Node curNode, ArrayList<Integer> preOrderList) {
		
		if(curNode == null) return;
		
		preOrderList.add(curNode.num);
		preOrder(curNode.left, preOrderList);
		preOrder(curNode.right, preOrderList);
	}

	// 후위 순회 메서드(재귀)
	public static void postOrder(Node curNode, ArrayList<Integer> postOrderList) {
		
		if(curNode == null) return;
		
		postOrder(curNode.left, postOrderList);
		postOrder(curNode.right, postOrderList);
		postOrderList.add(curNode.num);		
	}

	// 주 메서드
	public int[][] solution(int[][] nodeinfo) {
		
		// 이진트리 생성(루트 노드 반환))
		Node root = makeBT(nodeinfo);
		
		// 전위 순회
		ArrayList<Integer> preOrderList = new ArrayList<Integer>();
		preOrder(root, preOrderList);
		
		// 후위 순회
		ArrayList<Integer> postOrderList = new ArrayList<Integer>();
		postOrder(root, postOrderList);
		
		int[][] answer = new int[2][nodeinfo.length];
		answer[0] = preOrderList.stream().mapToInt(Integer::intValue).toArray();
		answer[1] = postOrderList.stream().mapToInt(Integer::intValue).toArray();
		
		return answer;
	}
}
