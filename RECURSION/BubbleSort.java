package RECURSION;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,3,8,2,1};
		sortArray(arr,arr.length-1,0);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void sortArray(int[] arr, int l, int index) {
		if(l<=0) {
			return;
		}
		if(index < l) {
			if(arr[index] > arr[index+1]) {
				int temp = arr[index];
				arr[index]=arr[index+1];
				arr[index+1]=temp;
			}
			sortArray(arr,l,index+1);
		}
		else {
			sortArray(arr,l-1,0);
		}
	}
}
