package DP;
//Q -> find out the target sum where target is given 
//Q -> No of subsets with a given difference
/*
* Formula :
* 			sum1+sum2=total
* 			sum1-sum2=dif/sum
* 			2sum1 = total +dif
* 			sum1 = (total+dif)/2
* 			then, find out no. of subset with a given sum.......
*/
public class TargetSum_Tabuation {
	static int t[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,1,1};
		int n = arr.length;
		int dif = 3;
		int total = 0;
		for(int i=0; i<n; i++) {
			total += arr[i];
		}
		total = (total+dif)/2;
		t = new int[n+1][total+1];
		findSum(arr, n, total);
		System.out.print(t[n][total]);
	}
	static void findSum(int[] arr, int n, int sum) {
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(i==0) {
					t[i][j] = 0;
				}
				if(j==0) {
					t[i][j] = 1;
				}
			}
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
				if(arr[i-1]<=j) {
					t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
	}

}
