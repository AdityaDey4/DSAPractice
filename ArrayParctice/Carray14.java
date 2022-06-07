package ArrayParctice;

import java.util.*;

public class Carray14 {
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
		int a1[] = {4, 2, 5, 1};
        int a2[] = {8, 0, 3, 5};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int n1 = a1.length;
		int n2 = a2.length;
		int sum;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				sum=a1[i]+a2[j];
				pq.add(sum);
				checkSize(pq);
			}
		}
		while(pq.size()>0)
		{
			System.out.print(pq.peek()+" ");
			pq.poll();
		}
	}
}
