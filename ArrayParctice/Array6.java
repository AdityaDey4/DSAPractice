package ArrayParctice;

public class Array6 {
	static void pairInSortedRotated(int[] arr, int l, int sum)
	{
		int flag=0;
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				if(i==j) {}
				else if(arr[i]+arr[j]==sum)
				{		
					flag=1;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.print("Array has two elements" + " with sum 16");
		}
		else
		{
			System.out.print("Array doesn't have two" + " elements with sum 16 ");
		}
	}
	public static void main (String[] args)
    {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 16;
        int n = arr.length;
        pairInSortedRotated(arr,n,sum);
    }
}
