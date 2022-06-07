package ArrayParctice;

import java.util.*;

public class Carray16 {
	static int k=3;
	static void checkSize(PriorityQueue p)
	{
		if(p.size()>k)
		{
			p.remove();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5 ,7 ,-9 ,2 ,6};
		int n = a.length;
		PriorityQueue <Integer> pq = new PriorityQueue<Integer>();
		int sum,check;
		int res=0;
		for(int i=0;i<n-1;i++)
		{
			res=a[i];
			sum=a[i];
			for(int j =i+1;j<n;j++)
			{
				sum=sum+a[j];
				if(sum>res)
				{
					res=sum;
				}
				else
				{
					break;
				}
			}
			res=Math.max(res, a[i]);
			pq.add(res);
			checkSize(pq);
		}
		pq.add(a[n-1]);
		checkSize(pq);
		while(pq.size()>0)
		{
			System.out.print(pq.element()+" ");
			pq.remove();
		}
	}
}
