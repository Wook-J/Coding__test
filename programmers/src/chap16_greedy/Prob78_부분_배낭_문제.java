package chap16_greedy;

import java.util.Arrays;

public class Prob78_부분_배낭_문제 {
	
	private class Item{
		int value;
		int weight;
		double valuePerWeight;
		
		public Item(int value, int weight, double valuePerWeight) {
			this.value = value;
			this.weight = weight;
			this.valuePerWeight = valuePerWeight;
		}
	}

	public double solution(int[][] items, int weight_limit) {
		
		Item[] itemArr = new Item[items.length];
		for(int i=0; i<items.length; i++) {
			itemArr[i] = new Item(items[i][1], items[i][0], (double)items[i][1] / items[i][0]);
		}
				
		double totalValue = 0;
		int remainWeight = weight_limit;
		
		Arrays.sort(itemArr, (o1, o2) -> Double.compare(o2.valuePerWeight, o1.valuePerWeight));
		
		for(Item i : itemArr) {
			if(i.weight <= remainWeight) {
				totalValue += i.value;
				remainWeight -= i.weight;
				
			} else {
				double some = (double) remainWeight / i.weight;
				totalValue += i.value * some;
				break;
			}
		}
		return totalValue;
	}
}
