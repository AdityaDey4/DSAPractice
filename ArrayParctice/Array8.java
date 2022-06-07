package ArrayParctice;
import java.util.*;
public class Array8 {
	 static int arr[] = new int[]{1,20,2,10};
	 static int res=0;
	 static void rotation()
	    {
		 	int sum=0;
	    	int value = arr[0];
	    	for(int i=0;i<arr.length-1;i++)
	    	{
	    		arr[i]=arr[i+1];
	    	}
	    	arr[arr.length-1]=value;
	    	for(int j=0;j<arr.length;j++)
	    	{
	    		sum=sum+(j*arr[j]);
	    	}
	    	res = Math.max(res, sum);
	    }
	public static void main(String[] args) {
		
		for(int i=0;i<arr.length;i++)
		{
			rotation();
		}
		System.out.println("Max sum : "+res);
	}

}
