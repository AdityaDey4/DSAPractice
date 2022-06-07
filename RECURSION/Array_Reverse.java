package RECURSION;

public class Array_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int len = arr.length-1;
		reverseArray(arr,0,len);
	}
	static void reverseArray(int[] arr, int start, int end) {
		if(start > end) {
			return ;
		}
		reverseArray(arr,start+1,end);
		System.out.print(arr[start]+" ");
	}
}
