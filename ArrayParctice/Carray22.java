package ArrayParctice;

import java.util.PriorityQueue;

public class Carray22 {
	static void checkSize(PriorityQueue p)
	{
		if(p.size()>2)
		{
			p.remove();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5 ,7 ,-9 ,2 ,6};
		int n = a.length;
		PriorityQueue <Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<n;i++)
		{
			pq.add(a[i]);
			checkSize(pq);
		}
		System.out.println("SecondLast : "+pq.element()+" ");
		pq.remove();
		System.out.print("Last : "+pq.element()+" ");
	}
}
