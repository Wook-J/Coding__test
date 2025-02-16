package chap8_Hash;

import java.util.Arrays;

public class RunHash {

	public static void main(String[] args) {
		
		Prob24_메뉴_리뉴얼 prob24 = new Prob24_메뉴_리뉴얼();
		
		String[] orders1 = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course1 = {2, 3, 4};
		System.out.println(Arrays.toString(prob24.solution(orders1, course1)));
		
		String[] orders2 = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
		int[] course2 = {2, 3, 5};
		System.out.println(Arrays.toString(prob24.solution(orders2, course2)));
		
		String[] orders3 = {"XYZ", "XWY", "WXA"};
		int[] course3 = {2, 3, 4};
		System.out.println(Arrays.toString(prob24.solution(orders3, course3)));
		
//		Prob23_신고_결과_받기 prob23 = new Prob23_신고_결과_받기();
//		
//		String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
//		String[] report1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
//		System.out.println(Arrays.toString(prob23.solution(id_list1, report1, 2)));
//		
//		String[] id_list2 = {"con", "ryan"};
//		String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
//		System.out.println(Arrays.toString(prob23.solution(id_list2, report2, 3)));
		
//		Prob22_베스트앨범 prob22 = new Prob22_베스트앨범();
//		
//		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
//		int[] plays = {500, 600, 150, 800, 2500};
//		
//		System.out.println(Arrays.toString(prob22.solution(genres, plays)));
		
//		Prob21_오픈채팅방 prob21 = new Prob21_오픈채팅방();
//		
//		String[] record1 = {
//				"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
//				"Enter uid1234 Prodo", "Change uid4567 Ryan"};
//		
//		System.out.println(Arrays.toString(prob21.solution(record1)));
		
//		Prob20_할인_행사 prob20 = new Prob20_할인_행사();
//		
//		String[] want1 = {"banana", "apple", "rice", "pork", "pot"};
//		int[] number1 = {3, 2, 2, 2, 1};
//		String[] discount1 = {
//				"chicken", "apple", "apple", "banana", "rice",
//				"apple", "pork", "banana", "pork", "rice",
//				"pot", "banana", "apple", "banana"};
//		System.out.println(prob20.solution2(want1, number1, discount1));
//		
//		String[] want2 = {"apple"};
//		int[] number2 = {10};
//		String[] discount2 = {
//				"banana", "banana", "banana", "banana", "banana",
//				"banana", "banana", "banana", "banana", "banana"};
//		System.out.println(prob20.solution2(want2, number2, discount2));
		
//		Prob19_완주하지_못한_선수 prob19 = new Prob19_완주하지_못한_선수();
//		
//		String[] participant1 = {"leo", "kiki", "eden"};
//		String[] completion1 = {"eden", "kiki"};
//		System.out.println(prob19.solution(participant1, completion1));
//		
//		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
//		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
//		System.out.println(prob19.solution(participant2, completion2));
//		
//		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
//		String[] completion3 = {"stanko", "ana", "mislav"};
//		System.out.println(prob19.solution(participant3, completion3));
		
//		Prob18_두_개의_수로_특정값_만들기 prob18 = new Prob18_두_개의_수로_특정값_만들기();
//		
//		int[] arr1 = {1, 2, 3, 4, 8};
//		int[] arr2 = {2, 3, 5, 9};
//		
//		System.out.println(prob18.solution(arr1, 6));
//		System.out.println(prob18.solution(arr2, 10));
	}
}
