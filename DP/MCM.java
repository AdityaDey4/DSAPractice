package DP;

public class MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {40,20,30,10,30};
		int j = arr.length-1;
		System.out.print(solve(1,j,arr));
	}
	static int solve(int i, int j, int[] arr) {
		if(i>=j) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for(int k=i; k<j; k++) {
			int temp = solve(i,k,arr)+solve(k+1,j,arr)
						+arr[i-1]*arr[k]*arr[j];
			
			ans = Math.min(ans, temp);
		}
		return ans;
	}
}
