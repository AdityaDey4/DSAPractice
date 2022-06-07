package Searching_Sorting;

// Time Complexcity - O(n2) //

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5 ,3 ,9 ,6 ,1 ,8, 2};
		int l = a.length;
		for(int i=0;i<l-1;i++)
		{
			for(int j=0;j<l-1;j++)
			{
				int temp;
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
