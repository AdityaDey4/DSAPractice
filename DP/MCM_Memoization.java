package DP;

import java.util.Arrays;

public class MCM_Memoization {
	static int[][] t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t = new int[101][101];
		for(int[] it : t) {
			Arrays.fill(it, -1);
		}
		int arr[] = {40,20,30,10,30};
		int j = arr.length-1;
		System.out.print(solve(1,j,arr));
	}
	static int solve(int i, int j, int[] arr) {
		if(i>=j) {
			return t[i][j] = 0;
		}
		if(t[i][j] != -1) {
			return t[i][j];
		}
		int ans = Integer.MAX_VALUE;
		for(int k=i; k<j; k++) {
			int temp = solve(i,k,arr)+solve(k+1,j,arr)
						+arr[i-1]*arr[k]*arr[j];
			
			ans = Math.min(ans, temp);
		}
		return t[i][j] = ans;
	}
}
