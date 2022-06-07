package ArrayParctice;

import java.util.*;

class Quary2
{
	int f;
	int l;
	int add;
	Quary2(int f,int l,int add)
	{
		this.f=f;
		this.l=l;
		this.add=add;
	}
}
public class Darray7 {
	static void create(ArrayList<Quary2> al, int[] a)
	{
		for(int i = 0;i<al.size();i++)
		{
			int f = al.get(i).f;
			int l = al.get(i).l;
			int ele = al.get(i).add;
			for(int j=f;j<=l;j++)
			{
				a[j]=a[j]+ele;
			}
		}
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int le = 6;
		int[] a = new int[le];
		ArrayList<Quary2> al = new ArrayList<Quary2>();
		al.add(new Quary2(0,2,100));
		al.add(new Quary2(1,5,100));
		al.add(new Quary2(2,3,100));
		create(al,a);
	}
}
