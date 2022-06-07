package DP;

public class Unbounded_Knapsack {
	static int t[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int profit[] = {6,18};
		int weight[] = {2,3};
		int n = profit.length;
		int capacity = 4;
		
		t= new int[n+1][capacity+1];
		System.out.print(unBound(n, capacity, profit, weight));
	}

	static int unBound(int n, int capacity, int[] profit, int[] weight) {
		if(n==0) {
			return 0;
		}
		if(t[n][capacity] != 0) {
			return t[n][capacity];
		}
		if(capacity >= weight[n-1]) {
			return t[n][capacity] = Math.max(profit[n-1]+unBound(n, capacity-weight[n-1], profit, weight),
					unBound(n-1, capacity, profit, weight));
		}else {
			 return t[n][capacity] = unBound(n-1, capacity, profit, weight);
		}
	}

}
