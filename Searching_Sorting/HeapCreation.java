package Searching_Sorting;
//insert & delete procedure of elements in heap
public class HeapCreation {
	int N;
	int heap_length=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,10,40,25,35,30};

		HeapCreation ob = new HeapCreation();
		
		System.out.print("Normal Array : ");
		ob.printArray(arr);
		
		System.out.print("Max Heap : ");		
		ob.insertProcedure(arr);
		
		System.out.print("After removing th max element : ");
		ob.delete(arr);
		
	}
	void delete(int[] arr) {
		//We have to delete the highest element which is at 0 index
		int temp = arr[this.N];
		arr[0]=arr[this.N];
		arr[this.N]=temp;
		this.N = this.N-1;
		this.heap_length = this.heap_length+1;
		
		heapify(arr, 0);
		printArray(arr);
	}
	void heapify(int[] arr, int index) {
		
		int l = index*2+1;
		int r = index*2+2;
		int max = -1;
		if(l<=this.N && r<=this.N) {
			if(arr[l]>arr[r]) {
				max = l;
			}else {
				max = r;
			}
		}
		else if(l<=this.N) {
			max = l;
		}
		else if(r<this.N) {
			max = r;
		}
		
		if(max != -1 && arr[max]>arr[index]) { // acts as a base condition
			swap(arr, max, index);
			heapify(arr, max);
		}
	}
	void insertProcedure(int[] arr) {
		int N = 0;
		for(int i=1; i< arr.length; i++) {
			insert(arr, i);
			N +=1;
		}
		printArray(arr);
		this.N = N;
		System.out.println("Total No. of element inserted : "+(this.N+1));
		//Time Complexity : For Swaping logn(height) & for N elements it is O(nlogn)
	}
	void insert(int[] arr, int index) {
	
		int par =  index%2==0 ? (index/2)-1 : index/2; //find parent
		while(par >= 0) {
			if(arr[index] > arr[par]) {
				swap(arr,index,par);
				index = par;
				par = index%2==0 ? (index/2)-1 : index/2;
			}else {
				return;
			}
		}
	}
	void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	void printArray(int[] arr) {
		for(int i=0; i<arr.length-this.heap_length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
