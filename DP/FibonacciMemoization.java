package DP;

import java.util.Arrays;

public class FibonacciMemoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int arr[] = new int[n+1];
		Arrays.fill(arr, -1);
		int ans = findNumber(n, arr);
		System.out.print(ans);
	}
	static int findNumber(int n, int arr[]){
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		if(arr[n] != -1) {
			return arr[n];
		}
		return arr[n] = findNumber(n-1, arr)+findNumber(n-2, arr);
	}
}
