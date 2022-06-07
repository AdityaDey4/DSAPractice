package DP;
//Q -> MiniMum Subset Sum Difference
// did this through dp tabuation
public class SumDifference_Tabuation {
	static boolean[][] t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,4,2,2,1};
		int n = arr.length;
		int total = 0;
		for(int i=0; i<n; i++) {
			total+=arr[i];
		}
		t = new boolean[n+1][total/2+1];
		findSum(arr, n, total/2);
		
		int ans = 0;
		for(int i=total/2; i>=0; i--) {
			if(t[n][i]) {
				ans = total-(i*2);
				break;
			}
		}
		
		System.out.print(ans);
	}
	static public void findSum(int arr[], int n, int sum) {
		
		for(int i=0; i< n+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(i==0) {
					t[i][j] = false;
				}
				if(j==0) {
					t[i][j] = true;
				}
			}
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sum; j++) {
				if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
				}
				else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		
	}
}
