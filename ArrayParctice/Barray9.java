package ArrayParctice;

public class Barray9 {
	static void moveZerosToEnd(int arr[], int n) {
	    int count =0;
	    int temp;
	    for (int i = 0; i < n; i++) {
	    if ((arr[i] < 0)) {
	    	temp=arr[count];
	    	arr[count]=  arr[i];
	     	arr[i]=temp;
	     	count=count+1;
	    	}
	    }
	}
	static void printArray(int arr[], int n) {
	    for (int i = 0; i < n; i++)
	    System.out.print(arr[i] + " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, -5, 8, -4, 9};
		    int n = arr.length;
		    System.out.print("Original array: ");
		    printArray(arr, n);
		 
		    moveZerosToEnd(arr, n);
		 
		    System.out.print("\nModified array: ");
		    printArray(arr, n);
	}

}
