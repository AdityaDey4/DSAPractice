package Searching_Sorting;

public class Merge_Sort {
	static void merging(int arr[], int low, int mid, int high) {
		int n1 = mid-low+1;
		int n2 = high-mid;
		
		int[] arr1 = new int[n1];
		int arr2[] = new int[n2];
		
		for(int i=0;i<n1; i++) {
			arr1[i] = arr[low+i];
		}
		for(int j=0; j<n2; j++) {
			arr2[j]=arr[mid+1+j];
		}
	
		int i=0, j=0 ;
		int k=low;
		while(i<n1 && j<n2) {
			if(arr1[i] <= arr2[j]) {
				arr[k]=arr1[i];
				i++;
			}else {
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}
		
		while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
	}
	static void mergeSort(int arr[], int low, int high) {
		if(low<high) {
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merging(arr, low, mid, high);
		}
	}
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 12, 1, 3, 13, 5, 6, 7 };
		 
	     printArray(arr);
	     mergeSort(arr, 0, arr.length-1);
	     System.out.println();
	     printArray(arr);
	}
}