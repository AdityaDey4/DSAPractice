package DP;

public class UNboundedTabulation2 {
	static int[][] t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = 10;
		int val[] = {10,30,20};
		int wt[] = {2,4,3};
		int n = wt.length;
		
		t = new int[n+1][w+1];
		int ans = unboundedKnapsack(val, wt, w, n);
		System.out.print(ans);
	}

	private static int unboundedKnapsack(int[] val, int[] wt, int w, int n) {
		
		for(int i=0; i<=n;i++) {
			for(int j=0; j<=w; j++) {
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=w; j++) {
				if(wt[i-1] <= j) {
					t[i][j] = Math.max(val[i-1]+t[i][j-wt[i-1]], t[i-1][j]);
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		return t[n][w];
	}

}
