package chap10_set;

import java.util.Arrays;

public class Prob33_섬_연결하기 {
	
	private int[] parent;
	
	// x가 속한 집합의 루트노드 찾기
	public int find(int x) {		
		if(parent[x] == x) return x;
		return parent[x] = find(parent[x]);
	}
	
	// 두 집합을 하나의 집합으로 합치기
	public void union(int x, int y) {
		int root1 = find(x);
		int root2 = find(y);
		parent[root2] = root1;
	}
	
	public int solution(int n, int[][] costs) {
		
		parent = new int[n];
		for(int i=0; i<n; i++) parent[i] = i;
		
		// 인덱스 2번(비용) 기준으로 오름차순 정렬
		Arrays.sort(costs, (o1, o2) -> Integer.compare(o1[2], o2[2]));
		System.out.println(Arrays.deepToString(costs));
		
		int answer = 0;		// 최소 신장 트리(MST)의 총 비용
		int edges = 0;		// 연결된 다리의 수
		
		for(int[] edge : costs) {
			
			// 연결된 다리가 n-1 개인 경우 (모든 섬이 연결됨)
			if(edges == n-1) break;
			
			// 두 섬의 루트노드가 다른 경우
			if(find(edge[0]) != find(edge[1])) {
				union(edge[0], edge[1]);	// 루트노드 합치기
				answer += edge[2];			// 총 비용 추가
				edges++;					// 연결된 다리의 수 추가
			}
		}
		
		return answer;
	}
}
