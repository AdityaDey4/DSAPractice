package RECURSION;

public class CountZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,3,0,5};
		int ans = count(arr, arr.length-1);
		System.out.print("No. of 0's present in the array : "+ans);
	}
	static int count(int[] arr, int l) {
		if(l==-1) {
			return 0;
		}
		int c = count(arr, l-1);
		if(arr[l]==0) {
			c++;
		}
		return c;
	}
}
