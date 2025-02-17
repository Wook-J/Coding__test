package chap9_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class Prob28_양과_늑대 {
	
	public static class Info {
		
		int node, sheep, wolf;
		HashSet<Integer> visited;
		
		// 매개변수 생성자
		public Info(int node, int sheep, int wolf, HashSet<Integer> visited) {
			this.node = node;
			this.sheep = sheep;
			this.wolf = wolf;
			this.visited = visited;
		}
	}
	
	private static ArrayList<Integer>[] tree;
	
	public static void buildTree(int[] info, int[][] edges) {
		
		// info 의 길이 : 노드의 개수
		tree = new ArrayList[info.length];
		
		// tree[i]에 ArrayList 생성
		for(int i=0; i<tree.length; i++) tree[i] = new ArrayList<Integer>();
		
		// edge[0] : 부모노드, edge[1] : 자식노드
		// (0 : 1, 8), (1 : 2, 4), (4 : 3, 6), (6 : 5), (8 : 7, 9), (9 : 10, 11)
		for(int[] edge : edges) tree[edge[0]].add(edge[1]);
	}

	public int solution(int[] info, int[][] edges) {
		
		buildTree(info, edges);		// 트리 생성
		int answer = 0;				// 양의 수를 저정할 변수
		
		// 너비우선탐색(Breadth First Search)를 위한 큐(제네릭 : Info 객체) 생성 및 초기 세팅
		// Info 구성 : node, 양의 수, 늑대의 수, 방문한 노드의 집합(초기 상태)
		ArrayDeque<Info> queue = new ArrayDeque<>();
		queue.add(new Info(0, 1, 0, new HashSet<Integer>()));
		
		// BFS 시작
		while(!queue.isEmpty()) {
			
			Info now = queue.pollFirst();			// queue 에서 현재 상태(Info 객체) 꺼내기
			answer = Math.max(answer, now.sheep);	// 최대 양의 수 업데이트
			
			// (★) 맨 처음 answer : 0, now.sheep : 1 -> answer 가 1로 업데이트
			
			// 방문한 노드 집합에 현재 노드의 이웃 노드 추가
			// tree[now.node] : 부모노드가 now.node 일 때 탐색할 수 있는 자식 노드를 원소로 갖는 리스트
			// addAll() : 자바 컬렉션(set, map, list 등)에 담겨 있는 요소들을 한 번에 추가하는 경우
			now.visited.addAll(tree[now.node]);
			
			// (★) now.visited 에 tree[0] 즉, {1, 8} 추가
			// -> now(Info 객체) : (현재 node 0, 양의 1, 늑대의 수 0, 추가된 이웃노드 {1, 8}) 
			
			// 인접한 노드들 탐색
			// (★) 0번 노드와 인접한 {1, 8} 탐색
			for(int next : now.visited) {
				
				// 기존 HashSet의 데이터를 복사하고, 현재 방문한 정점을 HashSet에서 제거
				// HashSet의 생성자에 매개변수로 컬렉션 넘기는 경우, 해당 컬렉션의 데이터를 초기값으로 가짐
				// 다음 노드를 가기전 방문 목록을 미리 정리하여 방문한 노드를 다시 방문하지 않음
				HashSet<Integer> set = new HashSet<Integer>(now.visited);
				set.remove(next);
				// (★) {1, 8}인 HashSet 생성
				// (★) 1을 먼저 순회하는 경우 1을 위 set에서 삭제
				
				if(info[next] == 1) {	// 늑대인 경우, 방문하는 순간 (양의 수> 늑대의 수) 확인되면 추가
				// (★) info[1] 가 늑대인지 확인( -> 아님), 다음 순서인 info[8]은 늑대임!
					
					if(now.sheep != now.wolf + 1) {
						queue.add(new Info(next, now.sheep, now.wolf+1, set));
						// 다음 노드, 현재 양의 수, 추가한 늑대의 수, 방금 방문한 노드 삭제한 HashSet
					}

				} else {				// 양인 경우 무조건 추가
					queue.add(new Info(next, now.sheep+1, now.wolf, set));
				}
			}
		}
		
		return answer;
	}
}
