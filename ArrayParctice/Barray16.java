package ArrayParctice;

public class Barray16 {

	static void rearrangeNaive(int arr[], int l)
    {
        int temp[] = new int[l];
        int i;
        for(i=0;i<l;i++)
        {
        	temp[arr[i]]=i;	
        }
        for(i=0;i<l;i++)
        {
        	arr[i]=temp[i];
        }
    }
 
    // A utility function to print contents of arr[0..n-1]
   static void printArray(int arr[], int n)
    {
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
        int arr[] = { 2, 0, 1, 4, 5, 3 };
        int n = arr.length;
 
        System.out.println("Given array is ");
        printArray(arr, n);
 
       rearrangeNaive(arr, n);
 
        System.out.println("Modified array is ");
       printArray(arr, n);
    }
}
