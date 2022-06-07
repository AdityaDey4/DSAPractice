package ArrayParctice;

public class Barray21 {
	static void rotrate(int[] arr, int l)
	{
		int temp;
		for(int i=0;i<l-1;i++)
		{
			if(i%2==0)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			else
			{
				if(arr[i]<arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = { 2, 0, 1, 4, 5, 3 };
	      int n = arr.length;
	      rotrate(arr,n);
	      for(int i=0;i<n;i++)
	      {
	    	  System.out.print(arr[i]+" ");
	      }
	      
	}

}
