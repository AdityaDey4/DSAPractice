package RECURSION;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,3,8,2,1,5};
		Quick_Sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void Quick_Sort(int[] arr, int low, int high) {
		while(low<high) {
			int mid = partition(arr,low,high);
			Quick_Sort(arr,low,mid-1);
			Quick_Sort(arr,mid+1,high);
		}
	}
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(pivot>arr[j]) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
	static void swap(int[] a, int b, int c)
	{
		int temp=a[b];
		a[b]=a[c];
		a[c]=temp;
	}
}
