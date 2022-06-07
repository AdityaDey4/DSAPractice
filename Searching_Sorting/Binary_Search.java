package Searching_Sorting;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "adityadey";
		char[] c1 = s.toCharArray();
        s = new String(c1);
		String s2 = "chu";
		
		System.out.print(s.indexOf('y'));
	}
	static int search(int[] arr, int start, int end, int data) {
		int mid = (start+end)/2;
		if(arr[mid] == data) {
			//System.out.print("Data is available");
			return mid;
		}
		if(arr[mid]>data) {
			return search(arr,0,mid-1,data);
		}
		else {
			return search(arr,mid+1,end,data);
		}
	}
}
