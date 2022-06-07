package ArrayParctice;

import java.util.Random;

public class Barray24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
		Random r = new Random();
		int temp;
		for(int i=arr.length-1;i>0;i--)
		{
			int j = r.nextInt(i+1);
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
