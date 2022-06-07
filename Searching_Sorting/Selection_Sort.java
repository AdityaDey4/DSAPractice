package Searching_Sorting;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5 ,3 ,7 ,6 ,1 ,8, 2};
		int l = a.length;

		for(int i=0;i<l-1;i++)
		{
			int min = i;
			for(int j=i+1;j<l;j++)
			{
				if(a[min]>a[j])
				{
					min = j;
				}
			}
			int temp = a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
