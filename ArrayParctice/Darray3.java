package ArrayParctice;

import java.util.ArrayList;
class Quary1
{
	int f;
	int l;
	Quary1(int f,int l)
	{
		this.f=f;
		this.l=l;
	}
}
public class Darray3 {
	static public void quarySums(int[] a, int n, ArrayList<Quary1> al, int l)
	{
		for(int i=0;i<l;i++)
		{
			int first = al.get(i).f;
			int last = al.get(i).l;
			int min=a[first];
			for(int j = first+1;j<=last;j++)
			{
				min = Math.min(min, a[j]);
			}
			System.out.println(min);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = {7, 2, 3, 0, 5, 10, 3, 12, 18};
	     int n = a.length;
	     ArrayList<Quary1> al = new ArrayList<Quary1>();
	     al.add(new Quary1(0,4));
	     al.add(new Quary1(4,7));
	     al.add(new Quary1(7,8));
	     int l = al.size();
	     quarySums(a,n,al,l);
	}
}
