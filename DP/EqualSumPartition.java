package DP;

public class EqualSumPartition {
	static boolean t[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,11,5};
		// OUTPUT : true , because we can partitiate the array by the equal sum
		// total sum = 22, mid = 11, {1,5,5} , {11}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		if(sum%2 == 1) {
			System.out.print(false);
		}else {
			t = new boolean[arr.length+1][(sum/2)+1];
			check(arr, sum/2);
			if(t[arr.length][sum/2]) {
				System.out.print(true);
			}else {
				System.out.print(false);
			}
		}
	}

	static void check(int[] arr, int sum) {
		for(int i=0; i<arr.length+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(i==0) {
					t[i][j]=false;
				}
				if(j==0) {
					t[i][j] = true;
				}
			}
		}
		
		for(int i=1; i<arr.length+1; i++) {
			for(int j=1; j<=sum; j++) {
				if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
	}

}
