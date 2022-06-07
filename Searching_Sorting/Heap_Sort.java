package Searching_Sorting;

public class Heap_Sort {
	int N = 5;
	int heap_ele = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap_Sort ob = new Heap_Sort();
		int[] arr = {40, 35, 30, 10, 25, 20}; // already a max Heap
		System.out.print("Before Sorted : ");
		ob.printArray(arr);
		
		ob.delete(arr);
		System.out.print("After Sorted : ");
		ob.printArray(arr);
	}
	void delete(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int prev = arr[0];
			arr[0] = arr[N];
			
			heapify(arr, 0);
			
			arr[N]=prev;
			N = N-1;
			heap_ele +=1;	
		}
	}
	void heapify(int[] arr, int index) {
		
		int l = index*2+1;
		int r = index*2+2;	
		int max_index = -1;
		
		if(l<=N && r<=N) {
			max_index = arr[l]>=arr[r] ? l : r;
		}
		else if(l<=N) {
			max_index = l;
		}
		else if(r<=N) {
			max_index = r;
		}
		
		if(max_index != -1 && arr[max_index] > arr[index]) {
			swap(arr, max_index, index);
			heapify(arr, max_index);
		}
	}
	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
	}
	void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
