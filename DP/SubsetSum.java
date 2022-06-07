package DP;

public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,2,3,1,5,8,10};
		int sum =11;
		System.out.print(check(arr, 0, sum));
	}
	static boolean check(int[] arr, int n, int sum) {
		if(sum==0) {
			return true;
		}
		if(n == arr.length) {
			return false;
		}
		if(sum>=arr[n]) {
			// if sum is greater than or equal to the number then we have two 
			// choices , pick and dont pick
			return check(arr, n+1, sum-arr[n]) || check(arr, n+1, sum);
		}else {
			// if sum lesser than to the number then we have only one 
			// choice , don't pick it
			return check(arr, n+1, sum);
		}
	}
}
