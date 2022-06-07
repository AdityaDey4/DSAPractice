package DP;

public class RodCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,8,9,10,17,17,20};
		int n = arr.length;
		
		int[][] t = new int[n+1][n+1];
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(i==0||j==0) {
					t[i][j] = 0;
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i <= j) {
					t[i][j] = Math.max(arr[i-1]+t[i][j-i], t[i-1][j]);
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		System.out.print(t[n][n]);
	}

}
