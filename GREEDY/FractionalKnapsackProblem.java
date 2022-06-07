package GREEDY;

import java.util.*;

class DataItem{
	int profit;
	int weight;
	int index;
	double cost;
	
	DataItem(int p, int w, int i){
		this.profit = p;
		this.weight = w;
		this.index = i;
		
		cost = (double) profit / (double) weight;
	}
}
public class FractionalKnapsackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] profit = {60, 40, 100, 120};
		int[] weight = {10, 40, 20, 50};
		int capacity = 49;
		
		double ans = solveKnapsackProblem(profit, weight, capacity);
		System.out.print("Total : "+ans);
	}
	static double solveKnapsackProblem(int[] profit, int[] weight, int capacity) {
		
		DataItem[] item = new DataItem[weight.length];
		
		for(int i=0; i<weight.length; i++) {
			item[i] = new DataItem(profit[i], weight[i], i);
		}
		
		Arrays.sort(item, new Comparator<DataItem>() {

			@Override
			public int compare(DataItem o1, DataItem o2) {
				// TODO Auto-generated method stub
				if(o1.cost < o2.cost) { // for decreasing order
					return 1;
				}
				if(o1.cost > o2.cost) {
					return -1;
				}
				return 0;
			}
			
		});
		double total_profit = 0;
		for(DataItem curr : item) {
			 
			if(capacity - curr.weight >= 0) {
				total_profit += curr.profit;
				capacity -= curr.weight;
			}else {
				total_profit += (double) capacity*curr.cost;
				break;
			}
		}
		return total_profit;
	}
}
