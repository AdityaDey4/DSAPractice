package RECURSION;

public class SortedArrayOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,2,1,0};
		if(arr.length < 1) {
			System.out.print("Sorted Array : true");
		}
		else {
			boolean ans = false;
			boolean acending = checkSortedAssending(arr,arr.length-1);
			boolean decending = checkSortedDecending(arr,arr.length-1);
			if(acending == true || decending == true) {
				ans = true;
			}
			System.out.print("Sorted Array : "+ans);
		}
	}
	static boolean checkSortedAssending(int[] arr, int l) {
		if(l==0) {
			return true;
		}
		if(! checkSortedAssending(arr,l-1)) {
			return false;
		}
		if(arr[l] >= arr[l-1]) {
			return true;
		}
		return false;
	}
	static boolean checkSortedDecending(int[] arr, int l) {
		if(l==0) {
			return true;
		}
		if(! checkSortedDecending(arr,l-1)) {
			return false;
		}
		if(arr[l] <= arr[l-1]) {
			return true;
		}
		return false;
	}
}
