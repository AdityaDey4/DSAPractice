package DP;

public class Knapsack_01_Tabulation {
	static int arr[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int profit[] = {120,60,100};
		int weight[] = {4,1,2};
		int n = profit.length;
		int capacity = 5;
		
		arr = new int[n+1][capacity+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<capacity+1; j++) {
				if(i==0 || j==0) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<capacity+1; j++) {
				
				if(weight[i-1] <= j) {
					arr[i][j] = Math.max(profit[i-1]+arr[i-1][j-weight[i-1]], arr[i-1][j]);
				}else {
					arr[i][j] = arr[i-1][j];
				}
			}
		}
		System.out.print(arr[n][capacity]);
	}

}
