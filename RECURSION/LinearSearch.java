package RECURSION;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,3,0,5};
		int data = 0;
		boolean ans = checkData(arr, arr.length-1, data);
		System.out.print("Is "+data+" available in the array : "+ans);
	}
	static boolean checkData(int[] arr, int l ,int data) {
		if(l==-1) {
			return false;
		}
		if(arr[l]==data) {
			return true;
		}
		if(checkData(arr,l-1,data)==true) {
			return true;
		}
		return false;
	}

}
