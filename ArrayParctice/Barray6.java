package ArrayParctice;

public class Barray6 {
	static void moveZerosToEnd(int arr[], int n) {
	    int count =0;
	    for (int i = 0; i < n; i++) {
	    if ((arr[i] != 0)) {
	     arr[count]=  arr[i];
	       count=count+1;
	    	}
	    }
	    while(count<n)
	    {
	    	arr[count]=0;
	    	count++;
	    }
	}
	static void printArray(int arr[], int n) {
	    for (int i = 0; i < n; i++)
	    System.out.print(arr[i] + " ");
	}
	public static void main(String args[]) {
	    int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
	    int n = arr.length;
	    System.out.print("Original array: ");
	    printArray(arr, n);
	 
	    moveZerosToEnd(arr, n);
	 
	    System.out.print("\nModified array: ");
	    printArray(arr, n);
	}
}
