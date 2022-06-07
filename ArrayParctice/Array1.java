package ArrayParctice;
import java.util.*;
public class Array1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t,n,d,i,j;
		int a[];
		t=sc.nextInt();
		
    	for(int k=0;k<t;k++)
    	{
    	    n=sc.nextInt();
    		d=sc.nextInt();
    		a=new int[n];
    		
    		for(i=0;i<n;i++)
    		{
    		    a[i]=sc.nextInt();
    		}
    		for(i=d;i<n;i++)
    		{
    		    System.out.print(a[i]+" ");
    		}
    		
    		for(i=0;i<d;i++)
    		{
    		    System.out.print(a[i]+" ");
    		}
    		System.out.println();
    	}
	}
}
