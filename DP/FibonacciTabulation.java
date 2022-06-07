package DP;

public class FibonacciTabulation {
	// Space complexity will reduce which is occuring for recursion //
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int arr[] = new int[n+1];
	
		int ans = findNumber(n, arr);
		System.out.print(ans);
	}
	static int findNumber(int n, int arr[]){
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
}
