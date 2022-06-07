package DP;
// Q-> Count subsets with a given sum ? 
public class CountSubset {
	static int t[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,6,8,10};
		int sum =10;
		t = new int[arr.length+1][sum+1];
		check(arr, sum);
		System.out.println(t[arr.length][sum]);
	}
	static void check(int[] arr, int sum) {
		for(int i=0; i<=arr.length; i++) {
			for(int j=0; j<=sum; j++) {
				if(i==0) {
					t[i][j] = 0;
				}
				if(j==0) {
					t[i][j] = 1;
				}
			}
		}
		
		for(int i=1; i<=arr.length; i++) {
			for(int j=1; j<=sum; j++) {
				if(j>=arr[i-1]) {
					// if sum is greater than or equal to the number then we have two 
					// choices , pick and dont pick
					t[i][j] = t[i-1][j-arr[i-1]] +  t[i-1][j];
				}else {
					// if sum lesser than to the number then we have only one 
					// choice , don't pick it
					t[i][j] =  t[i-1][j];
				}
			}
		}
	}
}
