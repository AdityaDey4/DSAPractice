package DP;
// Q -> MiniMum Subset Sum Difference
public class SumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,4,2,2,1};
		int n = arr.length;
		System.out.print(findSum(arr, n));
	}
	static int findSum(int arr[], int n) {
		int total = 0;
		for(int i=0; i<n; i++) {
			total+=arr[i];
		}
		return minSum(n-1, 0, total, arr);
	}
	static int minSum(int i, int sum, int total, int arr[]) {
		if(i==-1) {
			return Math.abs(total-(sum*2));
		}
		return Math.min(minSum(i-1, sum+arr[i], arr[i], arr), minSum(i-1, sum, total, arr));
	}
}
