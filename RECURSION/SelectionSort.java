package RECURSION;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,3,8,2,1,0};
		sortArray(arr, arr.length-1,1,0);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void sortArray(int[] arr, int l, int index, int max) {
		if(l<=0) {
			return;
		}
		if(index<=l) {
			if(arr[index] > arr[max]) {
				max=index;
			}
			sortArray(arr,l,index+1,max);
		}
		else {
			int temp = arr[max];
			arr[max]=arr[l];
			arr[l]=temp;
			sortArray(arr,l-1,1,0);
		}
	}
}
