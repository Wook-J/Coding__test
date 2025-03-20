package chap13_sort;

import java.util.ArrayList;

public class Prob55_가장_큰_수 {
	
	public String solution(int[] numbers) {
		
		ArrayList<String> list = new ArrayList<String>();
		for(int number : numbers) list.add(String.valueOf(number));
		
		list.sort((o1, o2) -> {
			int a = Integer.parseInt(o1+o2);
			int b = Integer.parseInt(o2+o1);
			return Integer.compare(b, a);
		});
		
		StringBuilder sb = new StringBuilder();
		for(String item : list) sb.append(item);
		
		if(sb.charAt(0) == '0') return "0";
		return sb.toString();
    }
}
