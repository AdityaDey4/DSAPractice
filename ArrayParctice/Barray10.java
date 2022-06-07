package ArrayParctice;

public class Barray10 {
	static void moveZerosToEnd(int arr[], int n) {
		 for(int i=1;i<n;i++) {
	    	if(i%2==0)
	    	{
			    if ((arr[i] > arr[i-1])) {
			    	 int temp=arr[i];
			    	arr[i]=  arr[i-1];
			     	arr[i-1]=temp;
			    }
	    	}
	    	else
	    	{
	    		if ((arr[i] < arr[i-1])) {
	    			 int temp=arr[i];
			    	arr[i]=  arr[i-1];
			     	arr[i-1]=temp;
			    }
	    	}
	    }
	    for (int j = 0; j < n; j++) {
		    System.out.print(arr[j] + " ");
		}
	}
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, -5, 8, -4, 9,6};
		    int n = arr.length;
		    moveZerosToEnd(arr, n);
	}

}
