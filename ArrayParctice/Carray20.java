package ArrayParctice;

import java.util.*;

public class Carray20 {
	static int k=2;
	static void checkSize(PriorityQueue p)
	{
		if(p.size()>k)
		{
			p.remove();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5 ,7 ,9 ,2 ,6};
		int n = a.length;
		PriorityQueue <Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<n;i++)
		{
			pq.add(a[i]);
			checkSize(pq);
		}
		System.out.print(pq.element());
	}
}
