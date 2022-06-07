package DP;
//Q-> Coin Change Problem (Minimum Number of Coins) :
public class CoinChange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,2};
		int n = arr.length;
		int sum = 5;
		
		int t[][] = new int[n+1][sum+1];
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=sum; j++) {
				if(j==0) {
					t[i][j]=0;
				}
				if(i==0) {
					t[i][j] = Integer.MAX_VALUE-1;// for safety -1;
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sum; j++) {
				if(arr[i-1] <= j) {
					t[i][j] = Math.min(1+t[i][j-arr[i-1]], t[i-1][j]);
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		
		System.out.print(t[n][sum]);
	}

}
