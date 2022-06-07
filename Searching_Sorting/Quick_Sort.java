package Searching_Sorting;
public class Quick_Sort {
	static void quickSort(int[] a, int l, int h)
	{
		int m;
		if(l<h)
		{
			m = partition(a,l,h);
			quickSort(a,l,m-1);
			quickSort(a,m+1,h);
		}	
	}
	static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++) //2,7,6 ,1 ,8, 5,3
		{
			if(pivot>arr[j])
			{
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,7,6 ,1 ,8, 5,3};
		int length = a.length;
		quickSort(a,0,length-1);
		for(int i=0;i<length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
