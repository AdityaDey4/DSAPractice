package ArrayParctice;

import java.util.Arrays;

public class Barray11 {
	static int[] a= {5,8,4,10,1,3,6,9};
	static void checking()
	{
		Arrays.sort(a);
		int l = a.length,index=0;
		int[] arr= new int[l];
		int i,j;
		for(i=0,j=l-1;i<=l/2||j>l/2;i++,j--)
		{
			if(index<l)
			{
				arr[index]=a[i];
				index++;
			}
			if(index<l)
			{
				arr[index]=a[j];
				index++;
			}
		}
		for(int k=0;k<l;k++)
		{
			a[k]=arr[k];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checking();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
