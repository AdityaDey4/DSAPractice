package ArrayParctice;

import java.util.*;

class Quary
{
	int f;
	int l;
	Quary(int f,int l)
	{
		this.f=f;
		this.l=l;
	}
}
public class Darray1 {
	static public void quarySums(int[] a, int n, ArrayList<Quary> al, int l)
	{
		for(int i=0;i<l;i++)
		{
			int first = al.get(i).f;
			int last = al.get(i).l;
			int sum=0;
			for(int j = first;j<=last;j++)
			{
				sum=sum+a[j]; 
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = {1, 1, 2, 1, 3, 4, 5, 2, 8};
	     int n = a.length;
	     ArrayList<Quary> al = new ArrayList<Quary>();
	     al.add(new Quary(0,3));
	     al.add(new Quary(3,6));
	     al.add(new Quary(5,8));
	     int l = al.size();
	     quarySums(a,n,al,l);
	}

}
