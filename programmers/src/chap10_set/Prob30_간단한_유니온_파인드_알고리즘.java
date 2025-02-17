package chap10_set;

import java.util.ArrayList;

public class Prob30_간단한_유니온_파인드_알고리즘 {

	private static int[] parent;
	
	// 루트노드를 찾는 메서드
	public static int find(int x) {
		
		// early return. 자신이 루트노드인 경우
		if(parent[x] == x) return x;
		
		// 자신이 루트노드가 아닌 경우
		parent[x] = find(parent[x]);
		return parent[x];
	}
	
	// 유니온 메서드
	public static void union(int x, int y) {
		int root1 = find(x);	// x 가 속한 집합의 루트노드 찾기
		int root2 = find(y);	// y 가 속한 집합의 루트노드 찾기
		parent[root2] = root1;	// y 가 속한 집합을 x 가 속한 집합에 합침
	}
	
	// 주 메서드
	public Boolean[] solution(int k, int[][] operations) {
		
		parent = new int[k];					// 노드 수 만큼 배열 생성
		for(int i=0; i<k; i++) parent[i] = i;	// 자기 자신이 루트노드로 초기화
		
		ArrayList<Boolean> answer = new ArrayList<Boolean>();
		
		// 문제 조건 : op[0]이 0이면 union, 1이면 find 
		for(int[] op : operations) {
			if(op[0] == 0) union(op[1], op[2]);
			else answer.add(find(op[1]) == find(op[2]));
		}
		
		return answer.toArray(new Boolean[0]);
	}
}
