package ArrayParctice;

import java.util.*;

class Quary3
{
	int f;
	int l;
	int num;
	Quary3(int f,int l,int num)
	{
		this.f=f;
		this.l=l;
		this.num=num;
	}
}
public class Darray19 {
	static String findResult(ArrayList<Quary3>al,int[] a,int n,int index)
	{
		int f = al.get(index).f-1;
		int l = al.get(index).l-1;
		int num = al.get(index).num;
		int flag =0;
		String res="";
		for(int i=f;i<=l;i++)
		{
			if(a[i]==num)
			{
				flag+=1;
				break;
			}
		}
		if(flag==1)
		{
			res="yes";
		}
		else
		{
			res="no";
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 1, 5, 4, 5};
		int n = a.length;
		ArrayList<Quary3> al = new ArrayList<Quary3>();
		al.add(new Quary3(1, 3, 2));
		al.add(new Quary3(2, 5, 1));
		al.add(new Quary3(3, 3, 5));
		for(int i=0;i<al.size();i++)
		{
			System.out.println(findResult(al,a,n,i));
		}
	}

}
