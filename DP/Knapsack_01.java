package DP;

public class Knapsack_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int profit[] = {120,60,100};
		int weight[] = {40,10,20};
		int n = profit.length;
		int capacity = 50;
		
		System.out.print(findProfit(profit, weight, capacity, n));
		
	}
	static int findProfit(int[] profit, int[] weight, int capacity, int n) {
		if(n==0) {
			return 0;
		}
		if(weight[n-1]<=capacity) {
			return Math.max(profit[n-1]+findProfit(profit, weight, capacity-weight[n-1], n-1), 
					findProfit(profit, weight, capacity, n-1));
		}
		else if(weight[n-1]>capacity) {
			return findProfit(profit, weight, capacity, n-1);
		}
		else return 0; // that means capacity = 0, we can't put anything else
	}
}
