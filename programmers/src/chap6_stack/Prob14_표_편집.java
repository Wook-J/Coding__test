package chap6_stack;

import java.util.Arrays;
import java.util.Stack;

public class Prob14_표_편집 {
	
	public String solution(int n, int k, String[] cmd) {
		
		// n : 전체 이름 개수, k : 인덱스(0부터)
		Stack<Integer> deleted = new Stack<Integer>();
		int[] up = new int[n+2];
		int[] down = new int[n+2];
		
		for(int i=0; i<n+2; i++) {
			up[i] = i-1;		// 원래 인덱스에서 1 당김(-1, 0, 1, ..., n+1)
			down[i] = i+1;		// 원래 인덱스에서 1 밈(1, 2, 3, ..., n+3)
		}
		
		k++;					// 인덱스 조정용(가상공간 고려)
		
		for(String c : cmd) {
			
			// 삭제하는 경우
			if(c.startsWith("C")) {
				
				deleted.push(k);					// 삭제된 인덱스 push(이하 k 가 4인 경우)
				up[down[k]] = up[k];				// ex) up[5]이 4에서 3으로 변경(4 관련 데이터 제거)
				down[up[k]] = down[k];				// ex) down[3]이 4에서 5로 변경(4 관련 데이터 제거)
				k = n<down[k] ? up[k] : down[k];	// 마지막 행인 경우 인덱스 up(1 증가), 아니면 down(1 감소)
			
			// 이전 행동 취소하는 경우(복구), k는 변경없음!
			} else if(c.startsWith("Z")) {
				
				int restore = deleted.pop();		// 삭제된 인덱스 pop(만약 복구된 인덱스 3인 경우)
				down[up[restore]] = restore;		// ex) down[2] 에 3 대입(3 관련 데이터 추가)
				up[down[restore]] = restore;		// ex) up[4]에 3 대입(3 관련 데이터 추가)
			
			// 위치 찾기(U : 위로, D : 아래로)
			} else {
				
				String[] s = c.split(" ");			// space 기준으로 String 분리
				int x = Integer.parseInt(s[1]);		// 이동횟수
				for(int i=0; i<x; i++) {			// 현재 위치(k) 이동
					k = s[0].equals("U") ? up[k] : down[k];
				}
			}
		}
		
		char[] answer = new char[n];				// 필요한 크기만큼만 char[] 생성
		Arrays.fill(answer, 'O');					// 초기값 'O'로 채우기
		
		for(int i : deleted) answer[i-1] = 'X';		// deleted Stack 에 있는 인덱스만 'X'로 변경
		
		return new String(answer);					// String 형으로 반환
	}

}
