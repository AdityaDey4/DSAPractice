package DP;

public class Knapsack_01_Memoization {
	static int arr[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int profit[] = {120,60,100};
		int weight[] = {40,10,20};
		int n = profit.length;
		int capacity = 50;
		arr = new int[n+1][capacity+1];
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<capacity+1; j++) {
				arr[i][j]=0;
			}
		}
		findProfit(profit, weight, capacity, n);
		System.out.print(arr[n][capacity]);
	}
	static int findProfit(int[] profit, int[] weight, int capacity, int n) {
		if(n==0) {
			return 0;
		}
		if(arr[n-1][capacity] != 0) {
			return arr[n-1][capacity];
		}
		if(weight[n-1]<=capacity) {
			return arr[n][capacity] = Math.max(profit[n-1]+findProfit(profit, weight, capacity-weight[n-1], n-1), 
					findProfit(profit, weight, capacity, n-1));
		}
		else if(weight[n-1]>capacity) {
			return arr[n][capacity] = findProfit(profit, weight, capacity, n-1);
		}
		else return arr[n][capacity] = 0; 
	}
}
