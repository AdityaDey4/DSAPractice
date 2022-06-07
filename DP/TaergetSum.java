package DP;
// Q -> find out the target sum where target is given 
// Q -> No of subsets with a given difference
/*
 * Formula :
 * 			sum1+sum2=total
 * 			sum1-sum2=dif/sum
 * 			2sum1 = total +dif
 * 			sum1 = (total+dif)/2
 * 			then, find out no. of subset with a given sum.......
 */
public class TaergetSum {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,1,1};
		int n = arr.length;
		int dif = 3; // given sum
		int total = 0;
		for(int i=0; i<n; i++) {
			total += arr[i];
		}
		total = (total+dif)/2;
		findSum(n-1, 0, dif, total, arr);
		System.out.print(count);
	}

	private static void findSum(int n, int sum, int dif, int total, int[] arr) {
		if(n==-1) {
			if(total-sum == 0) {
				count++;
			}
			return;
		}
		
		findSum(n-1, sum+arr[n], dif, total, arr);
		findSum(n-1, sum, dif, total, arr);
	}

}
