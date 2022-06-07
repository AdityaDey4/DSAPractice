package Searching_Sorting;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5 ,3 ,9 ,6 ,1 ,8, 2};
		int l = a.length;
		for(int i=1;i<l;i++)
		{
			int pivot = a[i];
			int j=i-1;
			while(j>=0 && pivot<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=pivot;
		}
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
