package DP;

public class UnBounded_Tabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = 10;
		int val[] = {10,30,20};
		int wt[] = {2,4,3};
		
		int n = wt.length;
		int ans = unboundedKnapsack(val, wt, w, n);
		System.out.print(ans);
	}

	private static int unboundedKnapsack(int[] val, int[] wt, int w, int n) {
		
		int dp[] = new int[w+1];
		for(int i=1; i<=w; i++) {
			for(int j=0; j<n; j++) {
				if(wt[j] <= i) {
					dp[i] = Math.max(val[j]+dp[i-wt[j]], dp[i]);
				}
			}
		}
		return dp[w];
	}

}
