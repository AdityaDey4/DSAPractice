package RECURSION;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int ans = summation(arr, arr.length-1);
		System.out.print("Sum : "+ans);
	}
	static int  summation(int[] arr, int l) {
		if(l==-1) {
			return (Integer)null;
		}
		if(l==0) {
			return arr[l];
		}
		int prev = summation(arr,l-1);
		prev = prev+arr[l];
		return prev;
	}
}
